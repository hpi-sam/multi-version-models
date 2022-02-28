package de.mdelab.migmm.history.modisco.java.experiments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.emf.util.EMFUtil;
import de.mdelab.migmm.history.EdgeWithHistory;
import de.mdelab.migmm.history.History;
import de.mdelab.migmm.history.HistoryPackage;
import de.mdelab.migmm.history.NodeWithHistory;
import de.mdelab.migmm.history.TimingUnit;
import de.mdelab.migmm.history.modisco.java.experiments.util.ConflictDescription;
import de.mdelab.migmm.history.modisco.java.experiments.util.ExperimentsUtil;
import de.mdelab.migmm.history.timing.DAGInterval;
import de.mdelab.migmm.history.timing.DAGVersion;
import de.mdelab.migmm.history.timing.TimingPackage;
import de.mdelab.mlsdm.interpreter.searchModel.patternMatcher.MLSDMReferenceIndex;
import de.mdelab.sdm.interpreter.core.SDMException;

public class ExecuteConflictCheckMergeAdapted {

	public static void main(String[] args) throws SDMException {
		if(args.length < 1) {
			System.out.println("1 argument: modelFile");
			return;
		}
		
		String modelFile = args[0];

		ExperimentsUtil.initializeEPackages();
		
		warmup(modelFile);

		History model = (History) EMFUtil.loadMDELabModel(modelFile).get(0);

		MLSDMReferenceIndex referenceIndex = new MLSDMReferenceIndex();
		referenceIndex.registerEObject(model);
		int conflictNumber = 0;
		
		long totalTime = 0;
		long totalGC = 0;
		
		long startGC = ExperimentsUtil.getGarbageCollectionTime();
		long start = System.nanoTime();
		Map<TimingUnit, Collection<TimingUnit>> predecessors = new HashMap<TimingUnit, Collection<TimingUnit>>();
		for(TimingUnit t:model.getOwnedTimingUnits()) {
			Collection<TimingUnit> p = ExperimentsUtil.collectPredecessors((DAGVersion) t);
			predecessors.put(t, p);
		}
		Map<TimingUnit, Map<TimingUnit, Collection<TimingUnit>>> commonPredecessors = ExperimentsUtil.computeCommonPredecessors(model.getOwnedTimingUnits());
		long end = System.nanoTime();
		long endGC = ExperimentsUtil.getGarbageCollectionTime();
		totalTime += (end - start);
		totalGC += (endGC - startGC);

		System.out.println("PRE TIME\t" + totalTime);
		System.out.println("PRE GC\t" + totalGC);

		startGC = ExperimentsUtil.getGarbageCollectionTime();
		start = System.nanoTime();
		Collection<ConflictDescription> conflicts = getMergeConflicts(model, referenceIndex, commonPredecessors, predecessors);
		conflictNumber += conflicts.size();
		end = System.nanoTime();
		endGC = ExperimentsUtil.getGarbageCollectionTime();
		totalTime += (end - start);
		totalGC += (endGC - startGC);
		
		System.out.println("TIME\t" + totalTime);
		System.out.println("GC\t" + totalGC);
		System.out.println("CONFLICTS\t" + conflictNumber);
	}

	@SuppressWarnings("unchecked")
	public static Collection<ConflictDescription> getMergeConflicts(History h, MLSDMReferenceIndex referenceIndex,
			Map<TimingUnit, Map<TimingUnit, Collection<TimingUnit>>> commonPredecessors, Map<TimingUnit, Collection<TimingUnit>> predecessors) {
		Collection<ConflictDescription> conflicts = new ArrayList<ConflictDescription>();
		Collection<EdgeWithHistory> createdEdges = collectCreatedEdges(referenceIndex);
		Map<NodeWithHistory, Set<TimingUnit>> nodePresences = new HashMap<NodeWithHistory, Set<TimingUnit>>();
		Map<NodeWithHistory, Set<TimingUnit>> nodeDeletions = new HashMap<NodeWithHistory, Set<TimingUnit>>();
		
		for(EdgeWithHistory e:createdEdges) {
			Set<TimingUnit> p = new LinkedHashSet<TimingUnit>((Collection<TimingUnit>) e.getValidIn().getPresentTiming());

			
			NodeWithHistory s = e.getEdgeSource();
			if(!identicalLifespans(e, s)) {
				//check source
				if(!nodePresences.containsKey(s)) {
					nodePresences.put(s, new LinkedHashSet<TimingUnit>((Collection<TimingUnit>) s.getValidIn().getPresentTiming()));
					nodeDeletions.put(s, new LinkedHashSet<TimingUnit>((Collection<TimingUnit>) s.getValidIn().getDeletedTiming()));
				}

				Set<TimingUnit> pS = nodePresences.get(s);
				Set<TimingUnit> dS = nodeDeletions.get(s);

				for(TimingUnit i:p) {
					for(TimingUnit j:dS) {
						for(TimingUnit c:commonPredecessors.get(i).get(j)) {
							if(pS.contains(c) && !p.contains(c)) {
								conflicts.add(new ConflictDescription(i, j, c));
							}
						}
					}
				}
			}
			
			NodeWithHistory t = e.getEdgeTarget();
			if(!identicalLifespans(e, t)) {
				if(!nodePresences.containsKey(t)) {
					nodePresences.put(t, new LinkedHashSet<TimingUnit>((Collection<TimingUnit>) t.getValidIn().getPresentTiming()));
					nodeDeletions.put(t, new LinkedHashSet<TimingUnit>((Collection<TimingUnit>) t.getValidIn().getDeletedTiming()));
				}

				Set<TimingUnit> pT = nodePresences.get(t);
				Set<TimingUnit> dT = nodeDeletions.get(t);
				
				for(TimingUnit i:p) {
					for(TimingUnit j:dT) {
						for(TimingUnit c:commonPredecessors.get(i).get(j)) {
							if(pT.contains(c) && !p.contains(c)) {
								conflicts.add(new ConflictDescription(i, j, c));
							}
						}
					}
				}
			}
		}
		return conflicts;
	}

	private static boolean identicalLifespans(EdgeWithHistory e, NodeWithHistory s) {
		return equals((DAGInterval) e.getValidIn(), (DAGInterval) s.getValidIn());
	}

	private static boolean equals(DAGInterval i1, DAGInterval i2) {
		return i1.getCts().equals(i2.getCts()) && i1.getDts().equals(i2.getDts());
	}

	private static Collection<EdgeWithHistory> collectCreatedEdges(MLSDMReferenceIndex referenceIndex) {
		Set<EdgeWithHistory> createEdges = new LinkedHashSet<EdgeWithHistory>();
		for(EObject v:referenceIndex.getDomain(TimingPackage.Literals.DAG_VERSION)) {
			DAGVersion version = (DAGVersion) v;
			if(version.getPredecessors().isEmpty()) {
				continue;
			}
			
			Collection<EObject> createIntervals = referenceIndex.getInverseReferences(version, TimingPackage.Literals.DAG_INTERVAL__CTS);
			for(EObject i:createIntervals) {
				DAGInterval interval = (DAGInterval) i;
				
				Collection<EObject> createElements = referenceIndex.getInverseReferences(interval, HistoryPackage.Literals.ELEMENT_WITH_HISTORY__VALID_IN);
				for(EObject createElement:createElements) {
					if(createElement instanceof EdgeWithHistory) {
						createEdges.add((EdgeWithHistory) createElement);
					}
				}
			}
		}
		return createEdges;
	}

	private static void warmup(String modelFile) throws SDMException {
		MLSDMReferenceIndex referenceIndex = new MLSDMReferenceIndex();
		History model = (History) EMFUtil.loadMDELabModel(modelFile).get(0);
		referenceIndex.registerEObject(model);
	}

}

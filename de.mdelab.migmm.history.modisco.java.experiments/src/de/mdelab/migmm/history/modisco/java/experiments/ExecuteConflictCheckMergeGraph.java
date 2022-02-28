package de.mdelab.migmm.history.modisco.java.experiments;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import de.mdelab.emf.util.EMFUtil;
import de.mdelab.migmm.history.AttributeWithHistory;
import de.mdelab.migmm.history.EdgeWithHistory;
import de.mdelab.migmm.history.ElementWithHistory;
import de.mdelab.migmm.history.History;
import de.mdelab.migmm.history.NodeWithHistory;
import de.mdelab.migmm.history.TimingUnit;
import de.mdelab.migmm.history.modisco.java.experiments.util.ExperimentsUtil;
import de.mdelab.mlsdm.interpreter.searchModel.patternMatcher.MLSDMReferenceIndex;
import de.mdelab.sdm.interpreter.core.SDMException;

public class ExecuteConflictCheckMergeGraph {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws SDMException {
		if(args.length < 1) {
			System.out.println("1 argument: modelFile");
			return;
		}
		
		String modelFile = args[0];

		ExperimentsUtil.initializeEPackages();
		
		warmup(modelFile);

		History model = (History) EMFUtil.loadMDELabModel(modelFile).get(0);

		int conflictNumber = 0;

		Map<TimingUnit, Set<NodeWithHistory>> nodeSets = new HashMap<TimingUnit, Set<NodeWithHistory>>();
		Map<TimingUnit, Set<EdgeWithHistory>> edgeSets = new HashMap<TimingUnit, Set<EdgeWithHistory>>();
		for(TimingUnit t:model.getOwnedTimingUnits()) {
			nodeSets.put(t, new LinkedHashSet<NodeWithHistory>());
			edgeSets.put(t, new LinkedHashSet<EdgeWithHistory>());
		}
		
		for(ElementWithHistory e:model.getOwnedElements()) {
			if(e instanceof AttributeWithHistory) {
				continue;
			}
			
			Collection<TimingUnit> p = (Collection<TimingUnit>) e.getValidIn().getPresentTiming();
			for(TimingUnit t:p) {
				if(e instanceof NodeWithHistory) {
					nodeSets.get(t).add((NodeWithHistory) e);
				}
				else if(e instanceof EdgeWithHistory) {
					edgeSets.get(t).add((EdgeWithHistory) e);
				}
			}
		}

		long maxSize = 0;
		for(TimingUnit t:model.getOwnedTimingUnits()) {
			long size = edgeSets.get(t).size();
			maxSize = Math.max(maxSize, size);
		}
		System.out.println("MAX EDGES\t" + maxSize);
		
		long totalTime = 0;
		long totalGC = 0;
		
		long startGC = ExperimentsUtil.getGarbageCollectionTime();
		long start = System.nanoTime();
		Map<TimingUnit, Map<TimingUnit, Collection<TimingUnit>>> commonPredecessors = ExperimentsUtil.computeCommonPredecessors(model.getOwnedTimingUnits());
		long end = System.nanoTime();
		long endGC = ExperimentsUtil.getGarbageCollectionTime();
		totalTime += (end - start);
		totalGC += (endGC - startGC);
		System.out.println("PRE TIME\t" + totalTime);
		System.out.println("PRE GC\t" + totalGC);
		

		startGC = ExperimentsUtil.getGarbageCollectionTime();
		start = System.nanoTime();
		for(int index1 = 0; index1 < model.getOwnedTimingUnits().size() - 1; index1++) {
			TimingUnit i = model.getOwnedTimingUnits().get(index1);
			for(int index2 = index1 + 1; index2 < model.getOwnedTimingUnits().size(); index2++) {
				TimingUnit j = model.getOwnedTimingUnits().get(index2);
				for(TimingUnit c:commonPredecessors.get(i).get(j)) {
					Set<EdgeWithHistory> edgesI = edgeSets.get(i);
					Set<EdgeWithHistory> edgesJ = edgeSets.get(j);
					Set<EdgeWithHistory> edgesC = edgeSets.get(c);

					Set<NodeWithHistory> nodesI = nodeSets.get(i);
					Set<NodeWithHistory> nodesJ = nodeSets.get(j);
					Set<NodeWithHistory> nodesC = nodeSets.get(c);
					
					for(EdgeWithHistory edgeI:edgesI) {
						if(!edgesC.contains(edgeI)) {
							NodeWithHistory s = edgeI.getEdgeSource();
							NodeWithHistory t = edgeI.getEdgeTarget();
							if(nodesC.contains(s) && !nodesJ.contains(edgeI.getEdgeSource())) {
								conflictNumber++;
							}
							if(nodesC.contains(t) && !nodesJ.contains(edgeI.getEdgeTarget())) {
								conflictNumber++;
							}
						}
					}
					

					for(EdgeWithHistory edgeJ:edgesJ) {
						if(!edgesC.contains(edgeJ)) {
							NodeWithHistory s = edgeJ.getEdgeSource();
							NodeWithHistory t = edgeJ.getEdgeTarget();
							if(nodesC.contains(s) && !nodesI.contains(edgeJ.getEdgeSource())) {
								conflictNumber++;
							}
							if(nodesC.contains(t) && !nodesI.contains(edgeJ.getEdgeTarget())) {
								conflictNumber++;
							}
						}
					}

				}
			}
		}
		end = System.nanoTime();
		endGC = ExperimentsUtil.getGarbageCollectionTime();
		totalTime += (end - start);
		totalGC += (endGC - startGC);

		System.out.println("TIME\t" + totalTime);
		System.out.println("GC\t" + totalGC);
		System.out.println("CONFLICTS\t" + conflictNumber);
	}

	private static void warmup(String modelFile) throws SDMException {
		History model = (History) EMFUtil.loadMDELabModel(modelFile).get(0);
		
		ExperimentsUtil.computeCommonPredecessors(model.getOwnedTimingUnits());
		MLSDMReferenceIndex index = new MLSDMReferenceIndex();
		index.registerEObject(model);
	}

}

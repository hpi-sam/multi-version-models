package de.mdelab.migmm.history.modisco.java.experiments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.mdelab.emf.util.EMFUtil;
import de.mdelab.migmm.history.ElementWithHistory;
import de.mdelab.migmm.history.History;
import de.mdelab.migmm.history.TimingUnit;
import de.mdelab.migmm.history.modisco.java.experiments.util.ConflictDescription;
import de.mdelab.migmm.history.modisco.java.experiments.util.ExperimentsUtil;
import de.mdelab.mlexpressions.MLExpression;
import de.mdelab.mlsdm.Activity;
import de.mdelab.mlsdm.ActivityEdge;
import de.mdelab.mlsdm.ActivityNode;
import de.mdelab.mlsdm.interpreter.MLSDMExpressionInterpreterManager;
import de.mdelab.mlsdm.interpreter.facade.MLSDMMetamodelFacadeFactory;
import de.mdelab.mlsdm.interpreter.notifications.MLSDMNotificationEmitter;
import de.mdelab.mlsdm.interpreter.searchModel.patternMatcher.MLSDMSearchModelBasedMatcher;
import de.mdelab.mlstorypatterns.AbstractStoryPatternLink;
import de.mdelab.mlstorypatterns.AbstractStoryPatternObject;
import de.mdelab.mlstorypatterns.StoryPattern;
import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.patternmatcher.StoryPatternMatcher;
import de.mdelab.sdm.interpreter.core.patternmatcher.searchModelBased.expressions.ExpressionAnalyzerManager;
import de.mdelab.sdm.interpreter.core.variables.NotifierVariablesScope;

public class ExecutePatternCheckMergeAdapted {

	public static void main(String[] args) throws SDMException {
		if(args.length < 2) {
			System.out.println("2 arguments: modelFile, rule");
			return;
		}
		
		String modelFile = args[0];
		String ruleFile = args[1];
		
		ExperimentsUtil.initializeEPackages();
		
		warmup(modelFile, ruleFile);

		History model = (History) EMFUtil.loadMDELabModel(modelFile).get(0);
		StoryPattern pattern = (StoryPattern) EMFUtil.loadXmi(ruleFile);
		
		StoryPatternMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> matcher = createMatcher(pattern);
		Collection<EObject> roots = findRoots(pattern, model);

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
		int conflictNumber = 0;
		for(EObject root:roots) {
			matcher.getVariablesScope().createVariable("root", root.eClass(), root);
			while(matcher.findNextMatch()) {
				Collection<ConflictDescription> conflicts = getPatternConflicts(matcher.getVariablesScope(), pattern, commonPredecessors);
				conflictNumber += conflicts.size();
			}
			matcher.reset();
		}
		end = System.nanoTime();
		endGC = ExperimentsUtil.getGarbageCollectionTime();
		totalTime += (end - start);
		totalGC += (endGC - startGC);
		
		System.out.println("TIME\t" + totalTime);
		System.out.println("GC\t" + totalGC);
		System.out.println("CONFLICTS\t" + conflictNumber);
	}
	
	@SuppressWarnings("unchecked")
	public static Collection<ConflictDescription> getPatternConflicts(
			NotifierVariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> variablesScope,
			StoryPattern pattern, Map<TimingUnit, Map<TimingUnit, Collection<TimingUnit>>> bestCommonPredecessors) {
		AbstractStoryPatternObject minSpo = null;
		Map<AbstractStoryPatternObject, Collection<TimingUnit>> presentIn = new HashMap<AbstractStoryPatternObject, Collection<TimingUnit>>();
		Collection<TimingUnit> allPresentVersions = new LinkedHashSet<TimingUnit>();
		for(AbstractStoryPatternObject spo:pattern.getStoryPatternObjects()) {
			ElementWithHistory element = (ElementWithHistory) variablesScope.getVariable(spo.getName()).getValue();
			Collection<TimingUnit> p = new LinkedHashSet<TimingUnit>((Collection<TimingUnit>) element.getValidIn().getPresentTiming());
			presentIn.put(spo, p);
			allPresentVersions.addAll(p);
			
			if(minSpo == null || presentIn.get(minSpo).size() > p.size()) {
				minSpo = spo;
			}
		}
		
		Collection<TimingUnit[]> handledPairs = new LinkedHashSet<TimingUnit[]>();
		
		Collection<ConflictDescription> conflicts = new ArrayList<ConflictDescription>();
		for(TimingUnit i:presentIn.get(minSpo)) {
			for(TimingUnit j:allPresentVersions) {
				//skip reflexive and redundant pairs
				if(i == j) {
					continue;
				}
				TimingUnit[] pair = {i, j};
				TimingUnit[] reversePair = {j, i};
				if(handledPairs.contains(reversePair)) {
					continue;
				}
				handledPairs.add(pair);
				
				Collection<TimingUnit> cs = bestCommonPredecessors.get(i).get(j);
				for(TimingUnit c:cs) {
					//check if all spos are covered by version pair for predecessor c
					boolean isConflict = true;
					for(AbstractStoryPatternObject spo:pattern.getStoryPatternObjects()) {
						Collection<TimingUnit> spoPresentIn = presentIn.get(spo);
						boolean inC = spoPresentIn.contains(c);
						boolean inI = spoPresentIn.contains(i);
						boolean inJ = spoPresentIn.contains(j);
						boolean deleted = inC && (!inI || !inJ);
						if(deleted || (!inI && !inJ)) {
							isConflict = false;
							break;
						}
					}
					
					if(isConflict) {
						conflicts.add(new ConflictDescription(i, j, c));
					}
				}
			}
		}
		
		return conflicts;
	}
	
	private static void warmup(String modelFile, String ruleFile) throws SDMException {
		StoryPattern pattern = (StoryPattern) EMFUtil.loadXmi(ruleFile);
		StoryPatternMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> matcher = createMatcher(pattern);
		matcher.findNextMatch();
	}

	private static StoryPatternMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> createMatcher(
			StoryPattern pattern) throws SDMException {
		MLSDMExpressionInterpreterManager interpreterManager = new MLSDMExpressionInterpreterManager(ExecutePatternCheckMergeGraph.class.getClassLoader());
		ExpressionAnalyzerManager<EClassifier, EStructuralFeature, MLExpression> analyzerManager = new ExpressionAnalyzerManager<EClassifier, EStructuralFeature, MLExpression>(MLSDMMetamodelFacadeFactory.INSTANCE.getExpressionFacade());
		NotifierVariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> vs =
				new NotifierVariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression>(interpreterManager.getNotificationEmitter());
		return new MLSDMSearchModelBasedMatcher(pattern,
				vs,
				interpreterManager,
				analyzerManager,
				null,
				(MLSDMNotificationEmitter) interpreterManager.getNotificationEmitter());
	}

	private static Collection<EObject> findRoots(StoryPattern pattern, History history) {
		AbstractStoryPatternObject rootSPO = null;
		for(AbstractStoryPatternObject spo:pattern.getStoryPatternObjects()) {
			if(spo.getName().equals("root")) {
				rootSPO = spo;
				break;
			}
		}
		
		Collection<EObject> roots = new ArrayList<EObject>();
		for(ElementWithHistory e:history.getOwnedElements()) {
			if(e.eClass() == rootSPO.getType() || e.eClass().getEAllSuperTypes().contains(rootSPO.getType())) {
				roots.add(e);
			}
		}
		return roots;
	}

}

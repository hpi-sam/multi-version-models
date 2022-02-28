package de.mdelab.migmm.history.modisco.java.experiments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import java_graph.Java_graphPackage;
import mapping.MappingRoot;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.mdelab.emf.util.EMFUtil;
import de.mdelab.migmm.history.ElementWithHistory;
import de.mdelab.migmm.history.History;
import de.mdelab.migmm.history.TimingUnit;
import de.mdelab.migmm.history.modisco.java.experiments.graph.MoDiscoMerger;
import de.mdelab.migmm.history.modisco.java.experiments.util.ExperimentsUtil;
import de.mdelab.migmm.history.timing.DAGVersion;
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

public class ExecutePatternCheckGraph {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws SDMException {
		if(args.length < 3) {
			System.out.println("3 arguments: modelFile, ruleFile, mappingFile");
			return;
		}
		
		String modelFile = args[0];
		String ruleFile = args[1];
		String mappingFile = args[2];

		ExperimentsUtil.initializeEPackages();
		
		warmup(modelFile, ruleFile, mappingFile);

		History model = (History) EMFUtil.loadMDELabModel(modelFile).get(0);
		StoryPattern pattern = (StoryPattern) EMFUtil.loadXmi(ruleFile);
		MappingRoot mapping = (MappingRoot) EMFUtil.loadXmi(mappingFile);
		
		long totalTime = 0;
		long totalGC = 0;
		
		int violationNumber = 0;
		
		Map<TimingUnit, Set<ElementWithHistory>> presentSets = new HashMap<TimingUnit, Set<ElementWithHistory>>();
		for(TimingUnit t:model.getOwnedTimingUnits()) {
			presentSets.put(t, new LinkedHashSet<ElementWithHistory>());
		}
		
		for(ElementWithHistory e:model.getOwnedElements()) {
			Collection<TimingUnit> p = (Collection<TimingUnit>) e.getValidIn().getPresentTiming();
			for(TimingUnit t:p) {
				presentSets.get(t).add(e);
			}
		}
		
		MoDiscoMerger merger = new MoDiscoMerger(mapping, Java_graphPackage.eINSTANCE);
		for(TimingUnit v:model.getOwnedTimingUnits()) {
			Collection<EObject> projection = merger.translateToGraphModel(presentSets.get(v));
			StoryPatternMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> matcher = createMatcher(pattern);
			Collection<EObject> roots = findRoots(pattern, projection);
			
			long startGC = ExperimentsUtil.getGarbageCollectionTime();
			long start = System.nanoTime();
			for(EObject root:roots) {
				matcher.getVariablesScope().createVariable("root", root.eClass(), root);
				while(matcher.findNextMatch()) {
					violationNumber++;
				}
				matcher.reset();
			}
			long end = System.nanoTime();
			long endGC = ExperimentsUtil.getGarbageCollectionTime();
			totalTime += (end - start);
			totalGC = (endGC - startGC);
		}

		System.out.println("TIME\t" + totalTime);
		System.out.println("GC\t" + totalGC);
		System.out.println("VIOLATIONS\t" + violationNumber);
	}

	private static void warmup(String modelFile, String ruleFile, String mappingFile) throws SDMException {
		History model = (History) EMFUtil.loadMDELabModel(modelFile).get(0);
		StoryPattern pattern = (StoryPattern) EMFUtil.loadXmi(ruleFile);
		MappingRoot mapping = (MappingRoot) EMFUtil.loadXmi(mappingFile);
		Map<TimingUnit, Map<TimingUnit, Collection<TimingUnit>>> commonPredecessors = ExperimentsUtil.computeCommonPredecessors(model.getOwnedTimingUnits());
		
		MoDiscoMerger merger = new MoDiscoMerger(mapping, Java_graphPackage.eINSTANCE);
		for(int index1 = 0; index1 < model.getOwnedTimingUnits().size() - 1; index1++) {
			TimingUnit i = model.getOwnedTimingUnits().get(index1);
			for(int index2 = index1 + 1; index2 < model.getOwnedTimingUnits().size(); index2++) {
				TimingUnit j = model.getOwnedTimingUnits().get(index2);
				for(TimingUnit c:commonPredecessors.get(i).get(j)) {
					merger.computeMerge(model, (DAGVersion) i, (DAGVersion) j, (DAGVersion) c);
					StoryPatternMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> matcher = createMatcher(pattern);

					matcher.findNextMatch();
					return;
				}
			}
		}
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

	private static Collection<EObject> findRoots(StoryPattern pattern, Collection<EObject> objects) {
		AbstractStoryPatternObject rootSPO = null;
		for(AbstractStoryPatternObject spo:pattern.getStoryPatternObjects()) {
			if(spo.getName().equals("root")) {
				rootSPO = spo;
				break;
			}
		}
		
		Collection<EObject> roots = new ArrayList<EObject>();
		for(EObject e:objects) {
			if(e.eClass() == rootSPO.getType() || e.eClass().getEAllSuperTypes().contains(rootSPO.getType())) {
				roots.add(e);
			}
		}
		return roots;
	}

}

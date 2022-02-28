package de.mdelab.migmm.history.modisco.java.experiments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.mdelab.emf.util.EMFUtil;
import de.mdelab.migmm.history.ElementWithHistory;
import de.mdelab.migmm.history.History;
import de.mdelab.migmm.history.TimingUnit;
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

public class ExecutePatternCheckAdapted {

	public static void main(String[] args) throws SDMException {
		if(args.length < 2) {
			System.out.println("2 arguments: modelFile, rule");
			return;
		}
		
		String modelFile = args[0];
		String ruleFile = args[1];

		ExperimentsUtil.initializeEPackages();
		
		warmup(ruleFile, modelFile);

		History model = (History) EMFUtil.loadMDELabModel(modelFile).get(0);
		StoryPattern pattern = (StoryPattern) EMFUtil.loadXmi(ruleFile);
		
		StoryPatternMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> matcher = createMatcher(pattern);
		Collection<EObject> roots = findRoots(pattern, model);
		
		long startGC = ExperimentsUtil.getGarbageCollectionTime();
		long start = System.nanoTime();		
		int violationNumber = 0;
		for(EObject root:roots) {
			matcher.getVariablesScope().createVariable("root", root.eClass(), root);
			while(matcher.findNextMatch()) {
				Collection<TimingUnit> violations = getMatchVersions(matcher.getVariablesScope(), pattern);
				violationNumber += violations.size();
			}
			matcher.reset();
		}
		long end = System.nanoTime();
		long endGC = ExperimentsUtil.getGarbageCollectionTime();
		System.out.println("TIME\t" + (end - start));
		System.out.println("GC\t" + (endGC - startGC));
		System.out.println("VIOLATIONS\t" + violationNumber);
	}

	@SuppressWarnings("unchecked")
	public static Collection<TimingUnit> getMatchVersions(
			NotifierVariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> variablesScope,
			StoryPattern pattern) {
		Set<TimingUnit> presentIn = null;
		for(AbstractStoryPatternObject spo:pattern.getStoryPatternObjects()) {
			ElementWithHistory element = (ElementWithHistory) variablesScope.getVariable(spo.getName()).getValue();
			Set<TimingUnit> p = new LinkedHashSet<TimingUnit>((Collection<TimingUnit>) element.getValidIn().getPresentTiming());
			if(presentIn == null) {
				presentIn = p;
			}
			else {
				presentIn.retainAll(p);
			}
			
			if(presentIn.isEmpty()) {
				return presentIn;
			}
		}
		return presentIn;
	}
	
	private static void warmup(String ruleFile, String modelFile) throws SDMException {
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

package de.mdelab.migmm.history.modisco.java.experiments.graph;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.modisco.java.emf.JavaPackage;
import de.mdelab.emf.util.EMFUtil;

public class MoDiscoGraphModelCreator {

	public static void main(String[] args) {
		EPackage graphPkg = createGraphModel(JavaPackage.eINSTANCE);
		EMFUtil.writeXMI(graphPkg, "java_graph.ecore");
	}
	
	public static EPackage createGraphModel(EPackage pkg) {
		EPackage graphPkg = EcoreUtil.copy(pkg);
		String newName = graphPkg.getName() + "_graph";
		graphPkg.setName(newName);
		
		for(EClassifier classifier:graphPkg.getEClassifiers()) {
			if(classifier.eClass() != EcorePackage.Literals.ECLASS) {
				continue;
			}
			
			EClass c = (EClass) classifier;
			
			for(EStructuralFeature f:c.getEStructuralFeatures()) {
				f.setUpperBound(ETypedElement.UNBOUNDED_MULTIPLICITY);
				
				if(f.eClass() == EcorePackage.Literals.EREFERENCE) {
					((EReference) f).setContainment(false);
				}
			}
		}
		return graphPkg;
	}
	
}

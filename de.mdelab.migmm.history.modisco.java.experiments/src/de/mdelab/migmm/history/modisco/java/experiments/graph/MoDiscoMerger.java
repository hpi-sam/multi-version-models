package de.mdelab.migmm.history.modisco.java.experiments.graph;

import de.mdelab.migmm.history.AttributeWithHistory;
import de.mdelab.migmm.history.EdgeWithHistory;
import de.mdelab.migmm.history.ElementWithHistory;
import de.mdelab.migmm.history.History;
import de.mdelab.migmm.history.NodeWithHistory;
import de.mdelab.migmm.history.TimingUnit;
import de.mdelab.migmm.history.timing.DAGVersion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import mapping.Mapping;
import mapping.MappingRoot;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

public class MoDiscoMerger {

	private final EFactory graphFactory;
	private final Map<EClass, EModelElement> adapted2Graph;
	
	public MoDiscoMerger(MappingRoot mapping, EPackage graphPkg) {
		this.graphFactory = graphPkg.getEFactoryInstance();
		this.adapted2Graph = createGraphMapping(mapping, graphPkg);
	}
	
	private Map<EClass, EModelElement> createGraphMapping(MappingRoot mapping, EPackage graphPkg) {
		//reverse mapping
		Map<EClass, EModelElement> map = new LinkedHashMap<EClass, EModelElement>();
		for(Mapping m:mapping.getMappings()) {
			EModelElement source = (EModelElement) m.getSource();
			map.put(getRuntimeEClass((EClass) m.getTarget()), getGraphElement(source, graphPkg));
		}
		return map;
	}
	
	private EClass getRuntimeEClass(EClass target) {
		EPackage runtimePackage = EPackage.Registry.INSTANCE.getEPackage(target.getEPackage().getNsURI());
		return (EClass) runtimePackage.getEClassifier(target.getName());
	}

	public Collection<EObject> computeProjection(History h, DAGVersion v) {
		Set<ElementWithHistory> vElements = collectPresentElements(h, v);
		Collection<EObject> result = translateToGraphModel(vElements);
		return result;
	}

	public Collection<EObject> computeMerge(History h, DAGVersion v, DAGVersion w, DAGVersion predecessor) {
		Set<ElementWithHistory> vElements = collectPresentElements(h, v);
		Set<ElementWithHistory> wElements = collectPresentElements(h, w);
		Set<ElementWithHistory> predecessorElements = collectPresentElements(h, predecessor);
		
		return computeMerge(vElements, wElements, predecessorElements);
	}

	public Collection<EObject> computeMerge(Set<ElementWithHistory> vElements, Set<ElementWithHistory> wElements,
			Set<ElementWithHistory> predecessorElements) {

		Collection<ElementWithHistory> mergeElements = new LinkedHashSet<ElementWithHistory>();
		for(ElementWithHistory xV:vElements) {
			if(predecessorElements.contains(xV) && !wElements.contains(xV)) {
				//xV is deleted in w
				continue;
			}
			
			mergeElements.add(xV);
		}
		
		//create tentative merge
		for(ElementWithHistory xW:wElements) {
			if(mergeElements.contains(xW)) {
				//xW is already handled
				continue;
			}
			else if(predecessorElements.contains(xW) && !vElements.contains(xW)) {
				//xW is deleted in v
				continue;
			}
			
			mergeElements.add(xW);
		}
		
		//resolve conflicts (priority: deletion)
		for(Iterator<ElementWithHistory> it = mergeElements.iterator(); it.hasNext();) {
			ElementWithHistory x = it.next();
			if(x instanceof EdgeWithHistory) {
				EdgeWithHistory e = (EdgeWithHistory) x;
				NodeWithHistory s = e.getEdgeSource();
				NodeWithHistory t = e.getEdgeTarget();
				if(!(mergeElements.contains(s) && mergeElements.contains(t))) {
					//e is dangling in merge, remove
					it.remove();
				}
			}
			else if(x instanceof AttributeWithHistory) {
				AttributeWithHistory a = (AttributeWithHistory) x;
				NodeWithHistory o = a.getContainingNode();
				if(!mergeElements.contains(o)) {
					//a is dangling in merge, remove
					it.remove();
				}
			}
		}
		
		Collection<EObject> result = translateToGraphModel(mergeElements);
		
		return result;
	}

	@SuppressWarnings("unchecked")
	public Collection<EObject> translateToGraphModel(Collection<ElementWithHistory> mergeElements) {		
		//translate nodes
		Map<ElementWithHistory, EObject> nodes = new LinkedHashMap<ElementWithHistory, EObject>();
		for(ElementWithHistory e:mergeElements) {
			if(e instanceof NodeWithHistory) {
				EClass graphClass = (EClass) adapted2Graph.get(e.eClass());
				EObject node = graphFactory.create(graphClass);
				nodes.put(e, node);
			}
		}
		
		//link nodes
		for(ElementWithHistory e:mergeElements) {
			if(e instanceof EdgeWithHistory) {
				EReference graphReference = (EReference) adapted2Graph.get(e.eClass());
				EObject source = nodes.get(((EdgeWithHistory) e).getEdgeSource());
				EObject target = nodes.get(((EdgeWithHistory) e).getEdgeTarget());
				if(source != null && target != null) {
					((Collection<EObject>) source.eGet(graphReference)).add(target);
				}
			}
		}
		
		//add attributes
		for(ElementWithHistory e:mergeElements) {
			if(e instanceof AttributeWithHistory) {
				EAttribute graphAttribute = (EAttribute) adapted2Graph.get(e.eClass());
				EObject object = nodes.get(((AttributeWithHistory) e).getContainingNode());
				if(object != null) {
					((Collection<Object>) object.eGet(graphAttribute)).add(getAttributeValue((AttributeWithHistory) e));
				}
			}
		}
		
		return new ArrayList<EObject>(nodes.values());
	}

	private Object getAttributeValue(AttributeWithHistory e) {
		Object o = e.eGet(e.eClass().getEStructuralFeature("value"));
		if(o instanceof Enumerator) {
			EEnum enu = (EEnum) e.eClass().getEStructuralFeature("value").getEType();
			EEnum graphEnum = (EEnum) graphFactory.getEPackage().getEClassifier(enu.getName());
			o = graphEnum.getEEnumLiteral(((Enumerator) o).getName()).getInstance();
		}
		return o;
	}

	private static EModelElement getGraphElement(EModelElement source, EPackage graphPkg) {
		if(source.eClass() == EcorePackage.Literals.ECLASS) {
			return graphPkg.getEClassifier(((EClass) source).getName());
		}
		else if(source.eClass() == EcorePackage.Literals.EATTRIBUTE) {
			EAttribute a = ((EAttribute) source);
			EClass c = (EClass) graphPkg.getEClassifier(a.getEContainingClass().getName());
			return c.getEStructuralFeature(a.getName());
		}
		else if(source.eClass() == EcorePackage.Literals.EREFERENCE) {
			EReference r = ((EReference) source);
			EClass c = (EClass) graphPkg.getEClassifier(r.getEContainingClass().getName());
			return c.getEStructuralFeature(r.getName());
		}
		else {
			return null;
		}
	}

	public Set<ElementWithHistory> collectPresentElements(History h, TimingUnit v) {
		Set<ElementWithHistory> presentElements = new LinkedHashSet<ElementWithHistory>();
		for(ElementWithHistory e:h.getOwnedElements()) {
			if(e.getValidIn().contains(v)) {
				presentElements.add(e);
			}
		}
		return presentElements;
	}

	public Set<NodeWithHistory> collectPresentNodes(History h, TimingUnit v) {
		Set<NodeWithHistory> presentElements = new LinkedHashSet<NodeWithHistory>();
		for(ElementWithHistory e:h.getOwnedElements()) {
			if((e instanceof NodeWithHistory) && e.getValidIn().contains(v)) {
				presentElements.add((NodeWithHistory) e);
			}
		}
		return presentElements;
	}
	
	public Set<EdgeWithHistory> collectPresentEdges(History h, TimingUnit v) {
		Set<EdgeWithHistory> presentElements = new LinkedHashSet<EdgeWithHistory>();
		for(ElementWithHistory e:h.getOwnedElements()) {
			if((e instanceof EdgeWithHistory) && e.getValidIn().contains(v)) {
				presentElements.add((EdgeWithHistory) e);
			}
		}
		return presentElements;
	}

}

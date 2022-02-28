package de.mdelab.migmm.history.modisco.java.experiments.util;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.mdelab.migmm.history.HistoryPackage;
import de.mdelab.migmm.history.TimingUnit;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.timing.DAGVersion;
import de.mdelab.migmm.history.timing.TimingPackage;
import de.mdelab.mlstorypatterns.MlstorypatternsPackage;
import java_graph.Java_graphPackage;
import mapping.MappingPackage;

public class ExperimentsUtil {

	public static long getGarbageCollectionTime() {
	    long collectionTime = 0;
	    for (GarbageCollectorMXBean garbageCollectorMXBean : ManagementFactory.getGarbageCollectorMXBeans()) {
	        collectionTime += garbageCollectorMXBean.getCollectionTime();
	    }
	    return collectionTime;
	}

	public static Map<TimingUnit, Map<TimingUnit, Collection<TimingUnit>>> computeCommonPredecessors(List<TimingUnit> timingUnits) {
		Map<TimingUnit, Collection<TimingUnit>> predecessors = new HashMap<TimingUnit, Collection<TimingUnit>>();
		
		for(TimingUnit t:timingUnits) {
			Collection<TimingUnit> p = collectPredecessors((DAGVersion) t);
			predecessors.put(t, p);
		}
		
		return computeCommonPredecessors(timingUnits, predecessors);
	}
	
	public static Map<TimingUnit, Map<TimingUnit, Collection<TimingUnit>>> computeCommonPredecessors(List<TimingUnit> timingUnits, Map<TimingUnit, Collection<TimingUnit>> predecessors) {
		Map<TimingUnit, Map<TimingUnit, Collection<TimingUnit>>> commonPredecessors = new HashMap<TimingUnit, Map<TimingUnit, Collection<TimingUnit>>>();
		
		for(int index1 = 0; index1 < timingUnits.size() - 1; index1++) {
			TimingUnit i = timingUnits.get(index1);
			for(int index2 = index1 + 1; index2 < timingUnits.size(); index2++) {
				TimingUnit j = timingUnits.get(index2);
				Collection<TimingUnit> predecessors1 = predecessors.get(i);
				Collection<TimingUnit> predecessors2 = predecessors.get(j);
				
				if(!commonPredecessors.containsKey(i)) {
					commonPredecessors.put(i, new HashMap<TimingUnit, Collection<TimingUnit>>());
				}
				if(!commonPredecessors.containsKey(j)) {
					commonPredecessors.put(j, new HashMap<TimingUnit, Collection<TimingUnit>>());
				}
				
				if(predecessors1.contains(j) || predecessors2.contains(i)) {
					commonPredecessors.get(i).put(j, Collections.emptySet());
					commonPredecessors.get(j).put(i, Collections.emptySet());
				}
				else {
					Collection<TimingUnit> common = new LinkedHashSet<TimingUnit>(predecessors1);
					common.retainAll(predecessors2);
					
					Collection<TimingUnit> cs = new LinkedHashSet<TimingUnit>();
					for(TimingUnit c:common) {
						boolean isBest = true;
						for(TimingUnit x:common) {
							Collection<TimingUnit> predecessorsX = predecessors.get(x);
							if(predecessorsX.contains(c)) {
								isBest = false;
								break;
							}
						}
						if(isBest) {
							cs.add(c);
						}
					}

					commonPredecessors.get(i).put(j, cs);
					commonPredecessors.get(j).put(i, cs);
				}
			}
		}
		
		return commonPredecessors;
	}

	public static Collection<TimingUnit> collectPredecessors(DAGVersion t) {
		Set<TimingUnit> predecessors = new LinkedHashSet<TimingUnit>();
		Deque<DAGVersion> queue = new LinkedList<DAGVersion>();
		queue.add(t);
		while(!queue.isEmpty()) {
			DAGVersion current = queue.poll();
			for(DAGVersion predecessor:current.getPredecessors()) {
				if(!predecessors.contains(predecessor)) {
					predecessors.add(predecessor);
					queue.add(predecessor);
				}
			}
		}
		return predecessors;
	}

	public static void initializeEPackages() {
		Java_graphPackage.eINSTANCE.getName();
		Java_adaptedPackage.eINSTANCE.getName();
		MlstorypatternsPackage.eINSTANCE.getName();
		MappingPackage.eINSTANCE.getName();
		HistoryPackage.eINSTANCE.getName();
		TimingPackage.eINSTANCE.getName();
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
	}

}

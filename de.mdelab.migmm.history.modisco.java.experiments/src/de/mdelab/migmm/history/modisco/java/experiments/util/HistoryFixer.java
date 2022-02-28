package de.mdelab.migmm.history.modisco.java.experiments.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import de.mdelab.emf.util.EMFUtil;
import de.mdelab.migmm.history.ElementWithHistory;
import de.mdelab.migmm.history.History;
import de.mdelab.migmm.history.TimingUnit;
import de.mdelab.migmm.history.timing.DAGInterval;
import de.mdelab.migmm.history.timing.DAGVersion;

public class HistoryFixer {

	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("1 argument: historyFile");
			return;
		}
		String historyFile = args[0];
		
		ExperimentsUtil.initializeEPackages();
		
		History h = (History) EMFUtil.loadMDELabModel(historyFile).get(0);
		fixHistory(h);
		EMFUtil.writeMDELabModel(h, historyFile.substring(0, historyFile.indexOf(".")) + "_fixed.history");
	}

	@SuppressWarnings("unchecked")
	private static void fixHistory(History h) {
		int count = 0;
		for(ElementWithHistory e:h.getOwnedElements()) {
			Collection<TimingUnit> d = (Collection<TimingUnit>) e.getValidIn().getDeletedTiming();
			Collection<TimingUnit> p = (Collection<TimingUnit>) e.getValidIn().getPresentTiming();
			Collection<TimingUnit> falseD = new HashSet<TimingUnit>(d);
			falseD.retainAll(p);
			
			while(!falseD.isEmpty()) {
				addRedundantCreation(e, d);
				d = (Collection<TimingUnit>) e.getValidIn().getDeletedTiming();
				falseD = new HashSet<TimingUnit>(d);
				falseD.retainAll(p);
			}
			count++;
			if(count % 10000 == 0) {
				System.out.println((count) + "/" + h.getOwnedElements().size());
			}
		}
	}

	private static void addRedundantCreation(ElementWithHistory e, Collection<TimingUnit> d) {
		LinkedList<DAGVersion> queue = new LinkedList<DAGVersion>();
		queue.addAll(((DAGInterval) e.getValidIn()).getCts());
		Set<DAGVersion> visited = new HashSet<DAGVersion>(queue);
		while(!queue.isEmpty()) {
			for(DAGVersion current:queue.poll().getSuccessors()) {
				if(!((DAGInterval) e.getValidIn()).getDts().contains(current) && !visited.contains(current)) {
					if(d.contains(current)) {
						((DAGInterval) e.getValidIn()).getCts().add(current);
						return;
					}
					else {
						visited.add(current);
						queue.addAll(current.getSuccessors());
					}
				}
			}
		}
		System.out.println("unable to fix???");
	}
	
}

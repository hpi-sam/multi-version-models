package de.mdelab.migmm.history.modisco.java.experiments.util;

import de.mdelab.migmm.history.TimingUnit;

public class ConflictDescription {

	public TimingUnit i;
	public TimingUnit j;
	public TimingUnit c;
	
	public ConflictDescription(TimingUnit i, TimingUnit j, TimingUnit c) {
		this.i = i;
		this.j = j;
		this.c = c;
	}
}

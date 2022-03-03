Installation:
- download and install Eclipse Modeling Tools (e.g. via the Eclipse installer from https://www.eclipse.org/downloads/)
- add the Eclipse Neon update-site (http://download.eclipse.org/releases/neon/) to the list of registered update-sites
- from the eclipse release update site, install the "MoDisco SDK" feature under the "Modeling" category
- install SDM-related Eclipse-Plugins (required for reading query specifications , i.e., .mlsp-files) from our update-site: https://www.hpi.uni-potsdam.de/giese/update-site/ ("SDM Metamodels, Editors, and Interpreters" category)

Experiments:
- experiments can be run via the main methods of the classes in the package de.mdelab.migmm.history.modisco.java.experiments (in the project with the same name)
- data used for our experiments is available under de.mdelab.migmm.history.modisco.java.experiments/instances
	- note that, due to GitHub's file size limit, the larger dataset is split into three parts and has to be unified before it can be read
/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manifest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.Manifest#getMainAttributes <em>Main Attributes</em>}</li>
 *   <li>{@link java_graph.Manifest#getEntryAttributes <em>Entry Attributes</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getManifest()
 * @model
 * @generated
 */
public interface Manifest extends EObject {
	/**
	 * Returns the value of the '<em><b>Main Attributes</b></em>' reference list.
	 * The list contents are of type {@link java_graph.ManifestAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Attributes</em>' reference list.
	 * @see java_graph.Java_graphPackage#getManifest_MainAttributes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ManifestAttribute> getMainAttributes();

	/**
	 * Returns the value of the '<em><b>Entry Attributes</b></em>' reference list.
	 * The list contents are of type {@link java_graph.ManifestEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Attributes</em>' reference list.
	 * @see java_graph.Java_graphPackage#getManifest_EntryAttributes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ManifestEntry> getEntryAttributes();

} // Manifest

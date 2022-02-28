/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manifest Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.ManifestEntry#getName <em>Name</em>}</li>
 *   <li>{@link java_graph.ManifestEntry#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getManifestEntry()
 * @model
 * @generated
 */
public interface ManifestEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getManifestEntry_Name()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<String> getName();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link java_graph.ManifestAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see java_graph.Java_graphPackage#getManifestEntry_Attributes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ManifestAttribute> getAttributes();

} // ManifestEntry

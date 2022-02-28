/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manifest Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.ManifestAttribute#getKey <em>Key</em>}</li>
 *   <li>{@link java_graph.ManifestAttribute#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getManifestAttribute()
 * @model
 * @generated
 */
public interface ManifestAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getManifestAttribute_Key()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getKey();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getManifestAttribute_Value()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getValue();

} // ManifestAttribute

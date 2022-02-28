/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.TypeParameter#getBounds <em>Bounds</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getTypeParameter()
 * @model
 * @generated
 */
public interface TypeParameter extends Type {
	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' reference list.
	 * The list contents are of type {@link java_graph.TypeAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounds</em>' reference list.
	 * @see java_graph.Java_graphPackage#getTypeParameter_Bounds()
	 * @model
	 * @generated
	 */
	EList<TypeAccess> getBounds();

} // TypeParameter

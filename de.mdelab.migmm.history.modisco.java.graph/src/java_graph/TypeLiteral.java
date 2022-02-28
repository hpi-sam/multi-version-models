/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.TypeLiteral#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getTypeLiteral()
 * @model
 * @generated
 */
public interface TypeLiteral extends Expression {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link java_graph.TypeAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see java_graph.Java_graphPackage#getTypeLiteral_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<TypeAccess> getType();

} // TypeLiteral

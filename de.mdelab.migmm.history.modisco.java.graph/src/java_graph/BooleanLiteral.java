/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.BooleanLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getBooleanLiteral()
 * @model
 * @generated
 */
public interface BooleanLiteral extends Expression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getBooleanLiteral_Value()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<Boolean> getValue();

} // BooleanLiteral

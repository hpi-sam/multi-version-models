/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.NumberLiteral#getTokenValue <em>Token Value</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getNumberLiteral()
 * @model
 * @generated
 */
public interface NumberLiteral extends Expression {
	/**
	 * Returns the value of the '<em><b>Token Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Value</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getNumberLiteral_TokenValue()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getTokenValue();

} // NumberLiteral

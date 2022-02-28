/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prefix Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.PrefixExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link java_graph.PrefixExpression#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getPrefixExpression()
 * @model
 * @generated
 */
public interface PrefixExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute list.
	 * The list contents are of type {@link java_graph.PrefixExpressionKind}.
	 * The literals are from the enumeration {@link java_graph.PrefixExpressionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute list.
	 * @see java_graph.PrefixExpressionKind
	 * @see java_graph.Java_graphPackage#getPrefixExpression_Operator()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<PrefixExpressionKind> getOperator();

	/**
	 * Returns the value of the '<em><b>Operand</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' reference list.
	 * @see java_graph.Java_graphPackage#getPrefixExpression_Operand()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Expression> getOperand();

} // PrefixExpression

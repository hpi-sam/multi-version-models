/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postfix Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.PostfixExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link java_graph.PostfixExpression#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getPostfixExpression()
 * @model
 * @generated
 */
public interface PostfixExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute list.
	 * The list contents are of type {@link java_graph.PostfixExpressionKind}.
	 * The literals are from the enumeration {@link java_graph.PostfixExpressionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute list.
	 * @see java_graph.PostfixExpressionKind
	 * @see java_graph.Java_graphPackage#getPostfixExpression_Operator()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<PostfixExpressionKind> getOperator();

	/**
	 * Returns the value of the '<em><b>Operand</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' reference list.
	 * @see java_graph.Java_graphPackage#getPostfixExpression_Operand()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Expression> getOperand();

} // PostfixExpression

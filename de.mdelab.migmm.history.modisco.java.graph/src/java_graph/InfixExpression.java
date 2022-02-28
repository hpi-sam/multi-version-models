/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infix Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.InfixExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link java_graph.InfixExpression#getRightOperand <em>Right Operand</em>}</li>
 *   <li>{@link java_graph.InfixExpression#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link java_graph.InfixExpression#getExtendedOperands <em>Extended Operands</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getInfixExpression()
 * @model
 * @generated
 */
public interface InfixExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute list.
	 * The list contents are of type {@link java_graph.InfixExpressionKind}.
	 * The literals are from the enumeration {@link java_graph.InfixExpressionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute list.
	 * @see java_graph.InfixExpressionKind
	 * @see java_graph.Java_graphPackage#getInfixExpression_Operator()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<InfixExpressionKind> getOperator();

	/**
	 * Returns the value of the '<em><b>Right Operand</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Operand</em>' reference list.
	 * @see java_graph.Java_graphPackage#getInfixExpression_RightOperand()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Expression> getRightOperand();

	/**
	 * Returns the value of the '<em><b>Left Operand</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Operand</em>' reference list.
	 * @see java_graph.Java_graphPackage#getInfixExpression_LeftOperand()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Expression> getLeftOperand();

	/**
	 * Returns the value of the '<em><b>Extended Operands</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Operands</em>' reference list.
	 * @see java_graph.Java_graphPackage#getInfixExpression_ExtendedOperands()
	 * @model
	 * @generated
	 */
	EList<Expression> getExtendedOperands();

} // InfixExpression

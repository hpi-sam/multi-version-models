/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instanceof Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.InstanceofExpression#getRightOperand <em>Right Operand</em>}</li>
 *   <li>{@link java_graph.InstanceofExpression#getLeftOperand <em>Left Operand</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getInstanceofExpression()
 * @model
 * @generated
 */
public interface InstanceofExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Right Operand</b></em>' reference list.
	 * The list contents are of type {@link java_graph.TypeAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Operand</em>' reference list.
	 * @see java_graph.Java_graphPackage#getInstanceofExpression_RightOperand()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<TypeAccess> getRightOperand();

	/**
	 * Returns the value of the '<em><b>Left Operand</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Operand</em>' reference list.
	 * @see java_graph.Java_graphPackage#getInstanceofExpression_LeftOperand()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Expression> getLeftOperand();

} // InstanceofExpression

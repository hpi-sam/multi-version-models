/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.ConditionalExpression#getElseExpression <em>Else Expression</em>}</li>
 *   <li>{@link java_graph.ConditionalExpression#getExpression <em>Expression</em>}</li>
 *   <li>{@link java_graph.ConditionalExpression#getThenExpression <em>Then Expression</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getConditionalExpression()
 * @model
 * @generated
 */
public interface ConditionalExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Else Expression</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Expression</em>' reference list.
	 * @see java_graph.Java_graphPackage#getConditionalExpression_ElseExpression()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Expression> getElseExpression();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference list.
	 * @see java_graph.Java_graphPackage#getConditionalExpression_Expression()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Expression> getExpression();

	/**
	 * Returns the value of the '<em><b>Then Expression</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Expression</em>' reference list.
	 * @see java_graph.Java_graphPackage#getConditionalExpression_ThenExpression()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Expression> getThenExpression();

} // ConditionalExpression

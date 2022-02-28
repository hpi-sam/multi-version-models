/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assert Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.AssertStatement#getMessage <em>Message</em>}</li>
 *   <li>{@link java_graph.AssertStatement#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getAssertStatement()
 * @model
 * @generated
 */
public interface AssertStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' reference list.
	 * @see java_graph.Java_graphPackage#getAssertStatement_Message()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Expression> getMessage();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference list.
	 * @see java_graph.Java_graphPackage#getAssertStatement_Expression()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Expression> getExpression();

} // AssertStatement

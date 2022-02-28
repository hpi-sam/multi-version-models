/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.IfStatement#getExpression <em>Expression</em>}</li>
 *   <li>{@link java_graph.IfStatement#getThenStatement <em>Then Statement</em>}</li>
 *   <li>{@link java_graph.IfStatement#getElseStatement <em>Else Statement</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getIfStatement()
 * @model
 * @generated
 */
public interface IfStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference list.
	 * @see java_graph.Java_graphPackage#getIfStatement_Expression()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Expression> getExpression();

	/**
	 * Returns the value of the '<em><b>Then Statement</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Statement</em>' reference list.
	 * @see java_graph.Java_graphPackage#getIfStatement_ThenStatement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Statement> getThenStatement();

	/**
	 * Returns the value of the '<em><b>Else Statement</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Statement</em>' reference list.
	 * @see java_graph.Java_graphPackage#getIfStatement_ElseStatement()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Statement> getElseStatement();

} // IfStatement

/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.ForStatement#getExpression <em>Expression</em>}</li>
 *   <li>{@link java_graph.ForStatement#getUpdaters <em>Updaters</em>}</li>
 *   <li>{@link java_graph.ForStatement#getInitializers <em>Initializers</em>}</li>
 *   <li>{@link java_graph.ForStatement#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getForStatement()
 * @model
 * @generated
 */
public interface ForStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference list.
	 * @see java_graph.Java_graphPackage#getForStatement_Expression()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Expression> getExpression();

	/**
	 * Returns the value of the '<em><b>Updaters</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updaters</em>' reference list.
	 * @see java_graph.Java_graphPackage#getForStatement_Updaters()
	 * @model
	 * @generated
	 */
	EList<Expression> getUpdaters();

	/**
	 * Returns the value of the '<em><b>Initializers</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializers</em>' reference list.
	 * @see java_graph.Java_graphPackage#getForStatement_Initializers()
	 * @model
	 * @generated
	 */
	EList<Expression> getInitializers();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference list.
	 * @see java_graph.Java_graphPackage#getForStatement_Body()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Statement> getBody();

} // ForStatement

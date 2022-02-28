/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enhanced For Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.EnhancedForStatement#getBody <em>Body</em>}</li>
 *   <li>{@link java_graph.EnhancedForStatement#getExpression <em>Expression</em>}</li>
 *   <li>{@link java_graph.EnhancedForStatement#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getEnhancedForStatement()
 * @model
 * @generated
 */
public interface EnhancedForStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference list.
	 * @see java_graph.Java_graphPackage#getEnhancedForStatement_Body()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Statement> getBody();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference list.
	 * @see java_graph.Java_graphPackage#getEnhancedForStatement_Expression()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Expression> getExpression();

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference list.
	 * The list contents are of type {@link java_graph.SingleVariableDeclaration}.
	 * It is bidirectional and its opposite is '{@link java_graph.SingleVariableDeclaration#getEnhancedForStatement <em>Enhanced For Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference list.
	 * @see java_graph.Java_graphPackage#getEnhancedForStatement_Parameter()
	 * @see java_graph.SingleVariableDeclaration#getEnhancedForStatement
	 * @model opposite="enhancedForStatement" required="true" ordered="false"
	 * @generated
	 */
	EList<SingleVariableDeclaration> getParameter();

} // EnhancedForStatement

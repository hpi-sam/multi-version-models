/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catch Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.CatchClause#getException <em>Exception</em>}</li>
 *   <li>{@link java_graph.CatchClause#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getCatchClause()
 * @model
 * @generated
 */
public interface CatchClause extends Statement {
	/**
	 * Returns the value of the '<em><b>Exception</b></em>' reference list.
	 * The list contents are of type {@link java_graph.SingleVariableDeclaration}.
	 * It is bidirectional and its opposite is '{@link java_graph.SingleVariableDeclaration#getCatchClause <em>Catch Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' reference list.
	 * @see java_graph.Java_graphPackage#getCatchClause_Exception()
	 * @see java_graph.SingleVariableDeclaration#getCatchClause
	 * @model opposite="catchClause" required="true" ordered="false"
	 * @generated
	 */
	EList<SingleVariableDeclaration> getException();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Block}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference list.
	 * @see java_graph.Java_graphPackage#getCatchClause_Body()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Block> getBody();

} // CatchClause

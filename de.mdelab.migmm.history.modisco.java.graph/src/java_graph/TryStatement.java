/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Try Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.TryStatement#getBody <em>Body</em>}</li>
 *   <li>{@link java_graph.TryStatement#getFinally <em>Finally</em>}</li>
 *   <li>{@link java_graph.TryStatement#getCatchClauses <em>Catch Clauses</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getTryStatement()
 * @model
 * @generated
 */
public interface TryStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Block}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference list.
	 * @see java_graph.Java_graphPackage#getTryStatement_Body()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Block> getBody();

	/**
	 * Returns the value of the '<em><b>Finally</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Block}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finally</em>' reference list.
	 * @see java_graph.Java_graphPackage#getTryStatement_Finally()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Block> getFinally();

	/**
	 * Returns the value of the '<em><b>Catch Clauses</b></em>' reference list.
	 * The list contents are of type {@link java_graph.CatchClause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catch Clauses</em>' reference list.
	 * @see java_graph.Java_graphPackage#getTryStatement_CatchClauses()
	 * @model
	 * @generated
	 */
	EList<CatchClause> getCatchClauses();

} // TryStatement

/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.LabeledStatement#getBody <em>Body</em>}</li>
 *   <li>{@link java_graph.LabeledStatement#getUsagesInBreakStatements <em>Usages In Break Statements</em>}</li>
 *   <li>{@link java_graph.LabeledStatement#getUsagesInContinueStatements <em>Usages In Continue Statements</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getLabeledStatement()
 * @model
 * @generated
 */
public interface LabeledStatement extends NamedElement, Statement {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference list.
	 * @see java_graph.Java_graphPackage#getLabeledStatement_Body()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Statement> getBody();

	/**
	 * Returns the value of the '<em><b>Usages In Break Statements</b></em>' reference list.
	 * The list contents are of type {@link java_graph.BreakStatement}.
	 * It is bidirectional and its opposite is '{@link java_graph.BreakStatement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usages In Break Statements</em>' reference list.
	 * @see java_graph.Java_graphPackage#getLabeledStatement_UsagesInBreakStatements()
	 * @see java_graph.BreakStatement#getLabel
	 * @model opposite="label" ordered="false"
	 * @generated
	 */
	EList<BreakStatement> getUsagesInBreakStatements();

	/**
	 * Returns the value of the '<em><b>Usages In Continue Statements</b></em>' reference list.
	 * The list contents are of type {@link java_graph.ContinueStatement}.
	 * It is bidirectional and its opposite is '{@link java_graph.ContinueStatement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usages In Continue Statements</em>' reference list.
	 * @see java_graph.Java_graphPackage#getLabeledStatement_UsagesInContinueStatements()
	 * @see java_graph.ContinueStatement#getLabel
	 * @model opposite="label" ordered="false"
	 * @generated
	 */
	EList<ContinueStatement> getUsagesInContinueStatements();

} // LabeledStatement

/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Continue Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.ContinueStatement#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getContinueStatement()
 * @model
 * @generated
 */
public interface ContinueStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' reference list.
	 * The list contents are of type {@link java_graph.LabeledStatement}.
	 * It is bidirectional and its opposite is '{@link java_graph.LabeledStatement#getUsagesInContinueStatements <em>Usages In Continue Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' reference list.
	 * @see java_graph.Java_graphPackage#getContinueStatement_Label()
	 * @see java_graph.LabeledStatement#getUsagesInContinueStatements
	 * @model opposite="usagesInContinueStatements" ordered="false"
	 * @generated
	 */
	EList<LabeledStatement> getLabel();

} // ContinueStatement

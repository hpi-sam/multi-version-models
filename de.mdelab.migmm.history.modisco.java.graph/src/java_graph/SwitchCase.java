/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.SwitchCase#getDefault <em>Default</em>}</li>
 *   <li>{@link java_graph.SwitchCase#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getSwitchCase()
 * @model
 * @generated
 */
public interface SwitchCase extends Statement {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getSwitchCase_Default()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<Boolean> getDefault();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference list.
	 * @see java_graph.Java_graphPackage#getSwitchCase_Expression()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Expression> getExpression();

} // SwitchCase

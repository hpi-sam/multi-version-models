/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.FieldAccess#getField <em>Field</em>}</li>
 *   <li>{@link java_graph.FieldAccess#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getFieldAccess()
 * @model
 * @generated
 */
public interface FieldAccess extends Expression {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference list.
	 * The list contents are of type {@link java_graph.SingleVariableAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference list.
	 * @see java_graph.Java_graphPackage#getFieldAccess_Field()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<SingleVariableAccess> getField();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference list.
	 * @see java_graph.Java_graphPackage#getFieldAccess_Expression()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Expression> getExpression();

} // FieldAccess

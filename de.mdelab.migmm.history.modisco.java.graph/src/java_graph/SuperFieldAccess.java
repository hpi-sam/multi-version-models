/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Field Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.SuperFieldAccess#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getSuperFieldAccess()
 * @model
 * @generated
 */
public interface SuperFieldAccess extends AbstractTypeQualifiedExpression {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference list.
	 * The list contents are of type {@link java_graph.SingleVariableAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference list.
	 * @see java_graph.Java_graphPackage#getSuperFieldAccess_Field()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<SingleVariableAccess> getField();

} // SuperFieldAccess

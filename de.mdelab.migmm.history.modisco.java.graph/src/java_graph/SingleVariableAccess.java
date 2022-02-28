/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Variable Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.SingleVariableAccess#getVariable <em>Variable</em>}</li>
 *   <li>{@link java_graph.SingleVariableAccess#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getSingleVariableAccess()
 * @model
 * @generated
 */
public interface SingleVariableAccess extends Expression {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference list.
	 * The list contents are of type {@link java_graph.VariableDeclaration}.
	 * It is bidirectional and its opposite is '{@link java_graph.VariableDeclaration#getUsageInVariableAccess <em>Usage In Variable Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference list.
	 * @see java_graph.Java_graphPackage#getSingleVariableAccess_Variable()
	 * @see java_graph.VariableDeclaration#getUsageInVariableAccess
	 * @model opposite="usageInVariableAccess" required="true" ordered="false"
	 * @generated
	 */
	EList<VariableDeclaration> getVariable();

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' reference list.
	 * @see java_graph.Java_graphPackage#getSingleVariableAccess_Qualifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Expression> getQualifier();

} // SingleVariableAccess

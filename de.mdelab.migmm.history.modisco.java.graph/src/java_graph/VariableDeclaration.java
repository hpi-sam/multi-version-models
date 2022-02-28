/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.VariableDeclaration#getExtraArrayDimensions <em>Extra Array Dimensions</em>}</li>
 *   <li>{@link java_graph.VariableDeclaration#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link java_graph.VariableDeclaration#getUsageInVariableAccess <em>Usage In Variable Access</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getVariableDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface VariableDeclaration extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Extra Array Dimensions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Array Dimensions</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getVariableDeclaration_ExtraArrayDimensions()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<Integer> getExtraArrayDimensions();

	/**
	 * Returns the value of the '<em><b>Initializer</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializer</em>' reference list.
	 * @see java_graph.Java_graphPackage#getVariableDeclaration_Initializer()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Expression> getInitializer();

	/**
	 * Returns the value of the '<em><b>Usage In Variable Access</b></em>' reference list.
	 * The list contents are of type {@link java_graph.SingleVariableAccess}.
	 * It is bidirectional and its opposite is '{@link java_graph.SingleVariableAccess#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage In Variable Access</em>' reference list.
	 * @see java_graph.Java_graphPackage#getVariableDeclaration_UsageInVariableAccess()
	 * @see java_graph.SingleVariableAccess#getVariable
	 * @model opposite="variable" ordered="false"
	 * @generated
	 */
	EList<SingleVariableAccess> getUsageInVariableAccess();

} // VariableDeclaration

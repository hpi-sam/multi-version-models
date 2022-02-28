/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Variables Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.AbstractVariablesContainer#getType <em>Type</em>}</li>
 *   <li>{@link java_graph.AbstractVariablesContainer#getFragments <em>Fragments</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getAbstractVariablesContainer()
 * @model abstract="true"
 * @generated
 */
public interface AbstractVariablesContainer extends ASTNode {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link java_graph.TypeAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see java_graph.Java_graphPackage#getAbstractVariablesContainer_Type()
	 * @model ordered="false"
	 * @generated
	 */
	EList<TypeAccess> getType();

	/**
	 * Returns the value of the '<em><b>Fragments</b></em>' reference list.
	 * The list contents are of type {@link java_graph.VariableDeclarationFragment}.
	 * It is bidirectional and its opposite is '{@link java_graph.VariableDeclarationFragment#getVariablesContainer <em>Variables Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragments</em>' reference list.
	 * @see java_graph.Java_graphPackage#getAbstractVariablesContainer_Fragments()
	 * @see java_graph.VariableDeclarationFragment#getVariablesContainer
	 * @model opposite="variablesContainer"
	 * @generated
	 */
	EList<VariableDeclarationFragment> getFragments();

} // AbstractVariablesContainer

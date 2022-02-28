/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.VariableDeclarationFragment#getVariablesContainer <em>Variables Container</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getVariableDeclarationFragment()
 * @model
 * @generated
 */
public interface VariableDeclarationFragment extends VariableDeclaration {
	/**
	 * Returns the value of the '<em><b>Variables Container</b></em>' reference list.
	 * The list contents are of type {@link java_graph.AbstractVariablesContainer}.
	 * It is bidirectional and its opposite is '{@link java_graph.AbstractVariablesContainer#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables Container</em>' reference list.
	 * @see java_graph.Java_graphPackage#getVariableDeclarationFragment_VariablesContainer()
	 * @see java_graph.AbstractVariablesContainer#getFragments
	 * @model opposite="fragments" ordered="false"
	 * @generated
	 */
	EList<AbstractVariablesContainer> getVariablesContainer();

} // VariableDeclarationFragment

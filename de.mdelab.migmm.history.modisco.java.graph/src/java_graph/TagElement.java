/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.TagElement#getTagName <em>Tag Name</em>}</li>
 *   <li>{@link java_graph.TagElement#getFragments <em>Fragments</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getTagElement()
 * @model
 * @generated
 */
public interface TagElement extends ASTNode {
	/**
	 * Returns the value of the '<em><b>Tag Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag Name</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getTagElement_TagName()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<String> getTagName();

	/**
	 * Returns the value of the '<em><b>Fragments</b></em>' reference list.
	 * The list contents are of type {@link java_graph.ASTNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragments</em>' reference list.
	 * @see java_graph.Java_graphPackage#getTagElement_Fragments()
	 * @model
	 * @generated
	 */
	EList<ASTNode> getFragments();

} // TagElement

/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.Comment#getContent <em>Content</em>}</li>
 *   <li>{@link java_graph.Comment#getEnclosedByParent <em>Enclosed By Parent</em>}</li>
 *   <li>{@link java_graph.Comment#getPrefixOfParent <em>Prefix Of Parent</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getComment()
 * @model abstract="true"
 * @generated
 */
public interface Comment extends ASTNode {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getComment_Content()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getContent();

	/**
	 * Returns the value of the '<em><b>Enclosed By Parent</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enclosed By Parent</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getComment_EnclosedByParent()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<Boolean> getEnclosedByParent();

	/**
	 * Returns the value of the '<em><b>Prefix Of Parent</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix Of Parent</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getComment_PrefixOfParent()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<Boolean> getPrefixOfParent();

} // Comment

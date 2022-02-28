/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Javadoc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.Javadoc#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getJavadoc()
 * @model
 * @generated
 */
public interface Javadoc extends Comment {
	/**
	 * Returns the value of the '<em><b>Tags</b></em>' reference list.
	 * The list contents are of type {@link java_graph.TagElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' reference list.
	 * @see java_graph.Java_graphPackage#getJavadoc_Tags()
	 * @model
	 * @generated
	 */
	EList<TagElement> getTags();

} // Javadoc

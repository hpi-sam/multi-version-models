/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.Initializer#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getInitializer()
 * @model
 * @generated
 */
public interface Initializer extends BodyDeclaration {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Block}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference list.
	 * @see java_graph.Java_graphPackage#getInitializer_Body()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Block> getBody();

} // Initializer

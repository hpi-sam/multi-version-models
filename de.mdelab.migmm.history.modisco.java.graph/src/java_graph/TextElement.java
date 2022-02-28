/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.TextElement#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getTextElement()
 * @model
 * @generated
 */
public interface TextElement extends ASTNode {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getTextElement_Text()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getText();

} // TextElement

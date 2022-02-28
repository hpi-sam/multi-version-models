/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.StringLiteral#getEscapedValue <em>Escaped Value</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getStringLiteral()
 * @model
 * @generated
 */
public interface StringLiteral extends Expression {
	/**
	 * Returns the value of the '<em><b>Escaped Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Escaped Value</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getStringLiteral_EscapedValue()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getEscapedValue();

} // StringLiteral

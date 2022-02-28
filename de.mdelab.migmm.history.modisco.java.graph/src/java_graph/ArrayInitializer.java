/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.ArrayInitializer#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getArrayInitializer()
 * @model
 * @generated
 */
public interface ArrayInitializer extends Expression {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' reference list.
	 * @see java_graph.Java_graphPackage#getArrayInitializer_Expressions()
	 * @model
	 * @generated
	 */
	EList<Expression> getExpressions();

} // ArrayInitializer

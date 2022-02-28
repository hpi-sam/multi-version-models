/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.MethodInvocation#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getMethodInvocation()
 * @model
 * @generated
 */
public interface MethodInvocation extends Expression, AbstractMethodInvocation {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference list.
	 * @see java_graph.Java_graphPackage#getMethodInvocation_Expression()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Expression> getExpression();

} // MethodInvocation

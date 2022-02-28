/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Method Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.AbstractMethodInvocation#getMethod <em>Method</em>}</li>
 *   <li>{@link java_graph.AbstractMethodInvocation#getArguments <em>Arguments</em>}</li>
 *   <li>{@link java_graph.AbstractMethodInvocation#getTypeArguments <em>Type Arguments</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getAbstractMethodInvocation()
 * @model abstract="true"
 * @generated
 */
public interface AbstractMethodInvocation extends ASTNode {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference list.
	 * The list contents are of type {@link java_graph.AbstractMethodDeclaration}.
	 * It is bidirectional and its opposite is '{@link java_graph.AbstractMethodDeclaration#getUsages <em>Usages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' reference list.
	 * @see java_graph.Java_graphPackage#getAbstractMethodInvocation_Method()
	 * @see java_graph.AbstractMethodDeclaration#getUsages
	 * @model opposite="usages" required="true" ordered="false"
	 * @generated
	 */
	EList<AbstractMethodDeclaration> getMethod();

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' reference list.
	 * @see java_graph.Java_graphPackage#getAbstractMethodInvocation_Arguments()
	 * @model
	 * @generated
	 */
	EList<Expression> getArguments();

	/**
	 * Returns the value of the '<em><b>Type Arguments</b></em>' reference list.
	 * The list contents are of type {@link java_graph.TypeAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Arguments</em>' reference list.
	 * @see java_graph.Java_graphPackage#getAbstractMethodInvocation_TypeArguments()
	 * @model
	 * @generated
	 */
	EList<TypeAccess> getTypeArguments();

} // AbstractMethodInvocation

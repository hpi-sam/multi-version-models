/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Method Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.AbstractMethodDeclaration#getBody <em>Body</em>}</li>
 *   <li>{@link java_graph.AbstractMethodDeclaration#getParameters <em>Parameters</em>}</li>
 *   <li>{@link java_graph.AbstractMethodDeclaration#getThrownExceptions <em>Thrown Exceptions</em>}</li>
 *   <li>{@link java_graph.AbstractMethodDeclaration#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link java_graph.AbstractMethodDeclaration#getUsagesInDocComments <em>Usages In Doc Comments</em>}</li>
 *   <li>{@link java_graph.AbstractMethodDeclaration#getUsages <em>Usages</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getAbstractMethodDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface AbstractMethodDeclaration extends BodyDeclaration {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Block}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference list.
	 * @see java_graph.Java_graphPackage#getAbstractMethodDeclaration_Body()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Block> getBody();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link java_graph.SingleVariableDeclaration}.
	 * It is bidirectional and its opposite is '{@link java_graph.SingleVariableDeclaration#getMethodDeclaration <em>Method Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see java_graph.Java_graphPackage#getAbstractMethodDeclaration_Parameters()
	 * @see java_graph.SingleVariableDeclaration#getMethodDeclaration
	 * @model opposite="methodDeclaration"
	 * @generated
	 */
	EList<SingleVariableDeclaration> getParameters();

	/**
	 * Returns the value of the '<em><b>Thrown Exceptions</b></em>' reference list.
	 * The list contents are of type {@link java_graph.TypeAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thrown Exceptions</em>' reference list.
	 * @see java_graph.Java_graphPackage#getAbstractMethodDeclaration_ThrownExceptions()
	 * @model
	 * @generated
	 */
	EList<TypeAccess> getThrownExceptions();

	/**
	 * Returns the value of the '<em><b>Type Parameters</b></em>' reference list.
	 * The list contents are of type {@link java_graph.TypeParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Parameters</em>' reference list.
	 * @see java_graph.Java_graphPackage#getAbstractMethodDeclaration_TypeParameters()
	 * @model
	 * @generated
	 */
	EList<TypeParameter> getTypeParameters();

	/**
	 * Returns the value of the '<em><b>Usages In Doc Comments</b></em>' reference list.
	 * The list contents are of type {@link java_graph.MethodRef}.
	 * It is bidirectional and its opposite is '{@link java_graph.MethodRef#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usages In Doc Comments</em>' reference list.
	 * @see java_graph.Java_graphPackage#getAbstractMethodDeclaration_UsagesInDocComments()
	 * @see java_graph.MethodRef#getMethod
	 * @model opposite="method" ordered="false"
	 * @generated
	 */
	EList<MethodRef> getUsagesInDocComments();

	/**
	 * Returns the value of the '<em><b>Usages</b></em>' reference list.
	 * The list contents are of type {@link java_graph.AbstractMethodInvocation}.
	 * It is bidirectional and its opposite is '{@link java_graph.AbstractMethodInvocation#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usages</em>' reference list.
	 * @see java_graph.Java_graphPackage#getAbstractMethodDeclaration_Usages()
	 * @see java_graph.AbstractMethodInvocation#getMethod
	 * @model opposite="method" ordered="false"
	 * @generated
	 */
	EList<AbstractMethodInvocation> getUsages();

} // AbstractMethodDeclaration

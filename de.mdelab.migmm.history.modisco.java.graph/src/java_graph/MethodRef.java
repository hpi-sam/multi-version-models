/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.MethodRef#getMethod <em>Method</em>}</li>
 *   <li>{@link java_graph.MethodRef#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link java_graph.MethodRef#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getMethodRef()
 * @model
 * @generated
 */
public interface MethodRef extends ASTNode {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference list.
	 * The list contents are of type {@link java_graph.AbstractMethodDeclaration}.
	 * It is bidirectional and its opposite is '{@link java_graph.AbstractMethodDeclaration#getUsagesInDocComments <em>Usages In Doc Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' reference list.
	 * @see java_graph.Java_graphPackage#getMethodRef_Method()
	 * @see java_graph.AbstractMethodDeclaration#getUsagesInDocComments
	 * @model opposite="usagesInDocComments" required="true" ordered="false"
	 * @generated
	 */
	EList<AbstractMethodDeclaration> getMethod();

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' reference list.
	 * The list contents are of type {@link java_graph.TypeAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' reference list.
	 * @see java_graph.Java_graphPackage#getMethodRef_Qualifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<TypeAccess> getQualifier();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link java_graph.MethodRefParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see java_graph.Java_graphPackage#getMethodRef_Parameters()
	 * @model
	 * @generated
	 */
	EList<MethodRefParameter> getParameters();

} // MethodRef

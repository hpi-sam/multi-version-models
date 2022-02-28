/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.MethodDeclaration#getExtraArrayDimensions <em>Extra Array Dimensions</em>}</li>
 *   <li>{@link java_graph.MethodDeclaration#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link java_graph.MethodDeclaration#getRedefinedMethodDeclaration <em>Redefined Method Declaration</em>}</li>
 *   <li>{@link java_graph.MethodDeclaration#getRedefinitions <em>Redefinitions</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getMethodDeclaration()
 * @model
 * @generated
 */
public interface MethodDeclaration extends AbstractMethodDeclaration {
	/**
	 * Returns the value of the '<em><b>Extra Array Dimensions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Array Dimensions</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getMethodDeclaration_ExtraArrayDimensions()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<Integer> getExtraArrayDimensions();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference list.
	 * The list contents are of type {@link java_graph.TypeAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference list.
	 * @see java_graph.Java_graphPackage#getMethodDeclaration_ReturnType()
	 * @model ordered="false"
	 * @generated
	 */
	EList<TypeAccess> getReturnType();

	/**
	 * Returns the value of the '<em><b>Redefined Method Declaration</b></em>' reference list.
	 * The list contents are of type {@link java_graph.MethodDeclaration}.
	 * It is bidirectional and its opposite is '{@link java_graph.MethodDeclaration#getRedefinitions <em>Redefinitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Method Declaration</em>' reference list.
	 * @see java_graph.Java_graphPackage#getMethodDeclaration_RedefinedMethodDeclaration()
	 * @see java_graph.MethodDeclaration#getRedefinitions
	 * @model opposite="redefinitions" ordered="false"
	 * @generated
	 */
	EList<MethodDeclaration> getRedefinedMethodDeclaration();

	/**
	 * Returns the value of the '<em><b>Redefinitions</b></em>' reference list.
	 * The list contents are of type {@link java_graph.MethodDeclaration}.
	 * It is bidirectional and its opposite is '{@link java_graph.MethodDeclaration#getRedefinedMethodDeclaration <em>Redefined Method Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefinitions</em>' reference list.
	 * @see java_graph.Java_graphPackage#getMethodDeclaration_Redefinitions()
	 * @see java_graph.MethodDeclaration#getRedefinedMethodDeclaration
	 * @model opposite="redefinedMethodDeclaration" ordered="false"
	 * @generated
	 */
	EList<MethodDeclaration> getRedefinitions();

} // MethodDeclaration

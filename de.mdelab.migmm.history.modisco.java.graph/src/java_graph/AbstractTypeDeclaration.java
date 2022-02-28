/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.AbstractTypeDeclaration#getBodyDeclarations <em>Body Declarations</em>}</li>
 *   <li>{@link java_graph.AbstractTypeDeclaration#getCommentsBeforeBody <em>Comments Before Body</em>}</li>
 *   <li>{@link java_graph.AbstractTypeDeclaration#getCommentsAfterBody <em>Comments After Body</em>}</li>
 *   <li>{@link java_graph.AbstractTypeDeclaration#getPackage <em>Package</em>}</li>
 *   <li>{@link java_graph.AbstractTypeDeclaration#getSuperInterfaces <em>Super Interfaces</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getAbstractTypeDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface AbstractTypeDeclaration extends BodyDeclaration, Type {
	/**
	 * Returns the value of the '<em><b>Body Declarations</b></em>' reference list.
	 * The list contents are of type {@link java_graph.BodyDeclaration}.
	 * It is bidirectional and its opposite is '{@link java_graph.BodyDeclaration#getAbstractTypeDeclaration <em>Abstract Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Declarations</em>' reference list.
	 * @see java_graph.Java_graphPackage#getAbstractTypeDeclaration_BodyDeclarations()
	 * @see java_graph.BodyDeclaration#getAbstractTypeDeclaration
	 * @model opposite="abstractTypeDeclaration"
	 * @generated
	 */
	EList<BodyDeclaration> getBodyDeclarations();

	/**
	 * Returns the value of the '<em><b>Comments Before Body</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Comment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments Before Body</em>' reference list.
	 * @see java_graph.Java_graphPackage#getAbstractTypeDeclaration_CommentsBeforeBody()
	 * @model
	 * @generated
	 */
	EList<Comment> getCommentsBeforeBody();

	/**
	 * Returns the value of the '<em><b>Comments After Body</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Comment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments After Body</em>' reference list.
	 * @see java_graph.Java_graphPackage#getAbstractTypeDeclaration_CommentsAfterBody()
	 * @model
	 * @generated
	 */
	EList<Comment> getCommentsAfterBody();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Package}.
	 * It is bidirectional and its opposite is '{@link java_graph.Package#getOwnedElements <em>Owned Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference list.
	 * @see java_graph.Java_graphPackage#getAbstractTypeDeclaration_Package()
	 * @see java_graph.Package#getOwnedElements
	 * @model opposite="ownedElements" ordered="false"
	 * @generated
	 */
	EList<java_graph.Package> getPackage();

	/**
	 * Returns the value of the '<em><b>Super Interfaces</b></em>' reference list.
	 * The list contents are of type {@link java_graph.TypeAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Interfaces</em>' reference list.
	 * @see java_graph.Java_graphPackage#getAbstractTypeDeclaration_SuperInterfaces()
	 * @model
	 * @generated
	 */
	EList<TypeAccess> getSuperInterfaces();

} // AbstractTypeDeclaration

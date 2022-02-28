/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anonymous Class Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.AnonymousClassDeclaration#getBodyDeclarations <em>Body Declarations</em>}</li>
 *   <li>{@link java_graph.AnonymousClassDeclaration#getClassInstanceCreation <em>Class Instance Creation</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getAnonymousClassDeclaration()
 * @model
 * @generated
 */
public interface AnonymousClassDeclaration extends ASTNode {
	/**
	 * Returns the value of the '<em><b>Body Declarations</b></em>' reference list.
	 * The list contents are of type {@link java_graph.BodyDeclaration}.
	 * It is bidirectional and its opposite is '{@link java_graph.BodyDeclaration#getAnonymousClassDeclarationOwner <em>Anonymous Class Declaration Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Declarations</em>' reference list.
	 * @see java_graph.Java_graphPackage#getAnonymousClassDeclaration_BodyDeclarations()
	 * @see java_graph.BodyDeclaration#getAnonymousClassDeclarationOwner
	 * @model opposite="anonymousClassDeclarationOwner"
	 * @generated
	 */
	EList<BodyDeclaration> getBodyDeclarations();

	/**
	 * Returns the value of the '<em><b>Class Instance Creation</b></em>' reference list.
	 * The list contents are of type {@link java_graph.ClassInstanceCreation}.
	 * It is bidirectional and its opposite is '{@link java_graph.ClassInstanceCreation#getAnonymousClassDeclaration <em>Anonymous Class Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Instance Creation</em>' reference list.
	 * @see java_graph.Java_graphPackage#getAnonymousClassDeclaration_ClassInstanceCreation()
	 * @see java_graph.ClassInstanceCreation#getAnonymousClassDeclaration
	 * @model opposite="anonymousClassDeclaration" ordered="false"
	 * @generated
	 */
	EList<ClassInstanceCreation> getClassInstanceCreation();

} // AnonymousClassDeclaration

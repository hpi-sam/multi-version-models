/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.BodyDeclaration#getAbstractTypeDeclaration <em>Abstract Type Declaration</em>}</li>
 *   <li>{@link java_graph.BodyDeclaration#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link java_graph.BodyDeclaration#getAnonymousClassDeclarationOwner <em>Anonymous Class Declaration Owner</em>}</li>
 *   <li>{@link java_graph.BodyDeclaration#getModifier <em>Modifier</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getBodyDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface BodyDeclaration extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Abstract Type Declaration</b></em>' reference list.
	 * The list contents are of type {@link java_graph.AbstractTypeDeclaration}.
	 * It is bidirectional and its opposite is '{@link java_graph.AbstractTypeDeclaration#getBodyDeclarations <em>Body Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Type Declaration</em>' reference list.
	 * @see java_graph.Java_graphPackage#getBodyDeclaration_AbstractTypeDeclaration()
	 * @see java_graph.AbstractTypeDeclaration#getBodyDeclarations
	 * @model opposite="bodyDeclarations" ordered="false"
	 * @generated
	 */
	EList<AbstractTypeDeclaration> getAbstractTypeDeclaration();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' reference list.
	 * @see java_graph.Java_graphPackage#getBodyDeclaration_Annotations()
	 * @model
	 * @generated
	 */
	EList<Annotation> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Anonymous Class Declaration Owner</b></em>' reference list.
	 * The list contents are of type {@link java_graph.AnonymousClassDeclaration}.
	 * It is bidirectional and its opposite is '{@link java_graph.AnonymousClassDeclaration#getBodyDeclarations <em>Body Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anonymous Class Declaration Owner</em>' reference list.
	 * @see java_graph.Java_graphPackage#getBodyDeclaration_AnonymousClassDeclarationOwner()
	 * @see java_graph.AnonymousClassDeclaration#getBodyDeclarations
	 * @model opposite="bodyDeclarations" ordered="false"
	 * @generated
	 */
	EList<AnonymousClassDeclaration> getAnonymousClassDeclarationOwner();

	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Modifier}.
	 * It is bidirectional and its opposite is '{@link java_graph.Modifier#getBodyDeclaration <em>Body Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' reference list.
	 * @see java_graph.Java_graphPackage#getBodyDeclaration_Modifier()
	 * @see java_graph.Modifier#getBodyDeclaration
	 * @model opposite="bodyDeclaration" ordered="false"
	 * @generated
	 */
	EList<Modifier> getModifier();

} // BodyDeclaration

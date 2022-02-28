/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Type Member Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.AnnotationTypeMemberDeclaration#getDefault <em>Default</em>}</li>
 *   <li>{@link java_graph.AnnotationTypeMemberDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link java_graph.AnnotationTypeMemberDeclaration#getUsages <em>Usages</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getAnnotationTypeMemberDeclaration()
 * @model
 * @generated
 */
public interface AnnotationTypeMemberDeclaration extends BodyDeclaration {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' reference list.
	 * @see java_graph.Java_graphPackage#getAnnotationTypeMemberDeclaration_Default()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Expression> getDefault();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link java_graph.TypeAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see java_graph.Java_graphPackage#getAnnotationTypeMemberDeclaration_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<TypeAccess> getType();

	/**
	 * Returns the value of the '<em><b>Usages</b></em>' reference list.
	 * The list contents are of type {@link java_graph.AnnotationMemberValuePair}.
	 * It is bidirectional and its opposite is '{@link java_graph.AnnotationMemberValuePair#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usages</em>' reference list.
	 * @see java_graph.Java_graphPackage#getAnnotationTypeMemberDeclaration_Usages()
	 * @see java_graph.AnnotationMemberValuePair#getMember
	 * @model opposite="member" ordered="false"
	 * @generated
	 */
	EList<AnnotationMemberValuePair> getUsages();

} // AnnotationTypeMemberDeclaration

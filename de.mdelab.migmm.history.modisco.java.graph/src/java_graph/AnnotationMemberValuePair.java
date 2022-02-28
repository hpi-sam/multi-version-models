/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Member Value Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.AnnotationMemberValuePair#getMember <em>Member</em>}</li>
 *   <li>{@link java_graph.AnnotationMemberValuePair#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getAnnotationMemberValuePair()
 * @model
 * @generated
 */
public interface AnnotationMemberValuePair extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference list.
	 * The list contents are of type {@link java_graph.AnnotationTypeMemberDeclaration}.
	 * It is bidirectional and its opposite is '{@link java_graph.AnnotationTypeMemberDeclaration#getUsages <em>Usages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference list.
	 * @see java_graph.Java_graphPackage#getAnnotationMemberValuePair_Member()
	 * @see java_graph.AnnotationTypeMemberDeclaration#getUsages
	 * @model opposite="usages" ordered="false"
	 * @generated
	 */
	EList<AnnotationTypeMemberDeclaration> getMember();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference list.
	 * @see java_graph.Java_graphPackage#getAnnotationMemberValuePair_Value()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Expression> getValue();

} // AnnotationMemberValuePair

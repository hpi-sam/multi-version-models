/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.MemberRef#getMember <em>Member</em>}</li>
 *   <li>{@link java_graph.MemberRef#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getMemberRef()
 * @model
 * @generated
 */
public interface MemberRef extends ASTNode {
	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference list.
	 * The list contents are of type {@link java_graph.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference list.
	 * @see java_graph.Java_graphPackage#getMemberRef_Member()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<NamedElement> getMember();

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' reference list.
	 * The list contents are of type {@link java_graph.TypeAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' reference list.
	 * @see java_graph.Java_graphPackage#getMemberRef_Qualifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<TypeAccess> getQualifier();

} // MemberRef

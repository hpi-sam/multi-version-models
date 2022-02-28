/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unresolved Item Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.UnresolvedItemAccess#getElement <em>Element</em>}</li>
 *   <li>{@link java_graph.UnresolvedItemAccess#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getUnresolvedItemAccess()
 * @model
 * @generated
 */
public interface UnresolvedItemAccess extends Expression, NamespaceAccess {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference list.
	 * The list contents are of type {@link java_graph.UnresolvedItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference list.
	 * @see java_graph.Java_graphPackage#getUnresolvedItemAccess_Element()
	 * @model ordered="false"
	 * @generated
	 */
	EList<UnresolvedItem> getElement();

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' reference list.
	 * The list contents are of type {@link java_graph.ASTNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' reference list.
	 * @see java_graph.Java_graphPackage#getUnresolvedItemAccess_Qualifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ASTNode> getQualifier();

} // UnresolvedItemAccess

/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.TypeAccess#getType <em>Type</em>}</li>
 *   <li>{@link java_graph.TypeAccess#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getTypeAccess()
 * @model
 * @generated
 */
public interface TypeAccess extends Expression, NamespaceAccess {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Type}.
	 * It is bidirectional and its opposite is '{@link java_graph.Type#getUsagesInTypeAccess <em>Usages In Type Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see java_graph.Java_graphPackage#getTypeAccess_Type()
	 * @see java_graph.Type#getUsagesInTypeAccess
	 * @model opposite="usagesInTypeAccess" required="true" ordered="false"
	 * @generated
	 */
	EList<Type> getType();

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' reference list.
	 * The list contents are of type {@link java_graph.NamespaceAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' reference list.
	 * @see java_graph.Java_graphPackage#getTypeAccess_Qualifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<NamespaceAccess> getQualifier();

} // TypeAccess

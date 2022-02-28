/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.Type#getUsagesInTypeAccess <em>Usages In Type Access</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Usages In Type Access</b></em>' reference list.
	 * The list contents are of type {@link java_graph.TypeAccess}.
	 * It is bidirectional and its opposite is '{@link java_graph.TypeAccess#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usages In Type Access</em>' reference list.
	 * @see java_graph.Java_graphPackage#getType_UsagesInTypeAccess()
	 * @see java_graph.TypeAccess#getType
	 * @model opposite="type" ordered="false"
	 * @generated
	 */
	EList<TypeAccess> getUsagesInTypeAccess();

} // Type

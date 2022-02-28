/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wild Card Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.WildCardType#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link java_graph.WildCardType#getBound <em>Bound</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getWildCardType()
 * @model
 * @generated
 */
public interface WildCardType extends Type {
	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getWildCardType_UpperBound()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<Boolean> getUpperBound();

	/**
	 * Returns the value of the '<em><b>Bound</b></em>' reference list.
	 * The list contents are of type {@link java_graph.TypeAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound</em>' reference list.
	 * @see java_graph.Java_graphPackage#getWildCardType_Bound()
	 * @model ordered="false"
	 * @generated
	 */
	EList<TypeAccess> getBound();

} // WildCardType

/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unresolved Item Access adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedItemAccess_adapted#getElement <em>Element</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedItemAccess_adapted#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getUnresolvedItemAccess_adapted()
 * @model
 * @generated
 */
public interface UnresolvedItemAccess_adapted extends Expression_adapted, NamespaceAccess_adapted {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedItemAccess_adapted_elementItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getUnresolvedItemAccess_adapted_Element()
	 * @model ordered="false"
	 * @generated
	 */
	EList<UnresolvedItemAccess_adapted_elementItem> getElement();

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedItemAccess_adapted_qualifierItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getUnresolvedItemAccess_adapted_Qualifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<UnresolvedItemAccess_adapted_qualifierItem> getQualifier();

} // UnresolvedItemAccess_adapted

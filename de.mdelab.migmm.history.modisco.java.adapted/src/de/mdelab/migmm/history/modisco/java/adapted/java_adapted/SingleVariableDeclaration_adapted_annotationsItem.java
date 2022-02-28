/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Variable Declaration adapted annotations Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_annotationsItem#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getSingleVariableDeclaration_adapted_annotationsItem()
 * @model
 * @generated
 */
public interface SingleVariableDeclaration_adapted_annotationsItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' reference.
	 * @see #setAnnotations(Annotation_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getSingleVariableDeclaration_adapted_annotationsItem_Annotations()
	 * @model required="true"
	 * @generated
	 */
	Annotation_adapted getAnnotations();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_annotationsItem#getAnnotations <em>Annotations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(Annotation_adapted value);

} // SingleVariableDeclaration_adapted_annotationsItem
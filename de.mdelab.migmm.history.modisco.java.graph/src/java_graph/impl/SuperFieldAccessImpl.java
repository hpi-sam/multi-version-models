/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.Java_graphPackage;
import java_graph.SingleVariableAccess;
import java_graph.SuperFieldAccess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Super Field Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.SuperFieldAccessImpl#getField <em>Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuperFieldAccessImpl extends AbstractTypeQualifiedExpressionImpl implements SuperFieldAccess {
	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleVariableAccess> field;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperFieldAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getSuperFieldAccess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SingleVariableAccess> getField() {
		if (field == null) {
			field = new EObjectResolvingEList<SingleVariableAccess>(SingleVariableAccess.class, this, Java_graphPackage.SUPER_FIELD_ACCESS__FIELD);
		}
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_graphPackage.SUPER_FIELD_ACCESS__FIELD:
				return getField();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_graphPackage.SUPER_FIELD_ACCESS__FIELD:
				getField().clear();
				getField().addAll((Collection<? extends SingleVariableAccess>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Java_graphPackage.SUPER_FIELD_ACCESS__FIELD:
				getField().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_graphPackage.SUPER_FIELD_ACCESS__FIELD:
				return field != null && !field.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SuperFieldAccessImpl

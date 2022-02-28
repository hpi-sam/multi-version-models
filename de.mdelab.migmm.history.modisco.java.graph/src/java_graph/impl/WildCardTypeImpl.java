/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.Java_graphPackage;
import java_graph.TypeAccess;
import java_graph.WildCardType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wild Card Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.WildCardTypeImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link java_graph.impl.WildCardTypeImpl#getBound <em>Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WildCardTypeImpl extends TypeImpl implements WildCardType {
	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> upperBound;

	/**
	 * The cached value of the '{@link #getBound() <em>Bound</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBound()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAccess> bound;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WildCardTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getWildCardType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Boolean> getUpperBound() {
		if (upperBound == null) {
			upperBound = new EDataTypeEList<Boolean>(Boolean.class, this, Java_graphPackage.WILD_CARD_TYPE__UPPER_BOUND);
		}
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeAccess> getBound() {
		if (bound == null) {
			bound = new EObjectResolvingEList<TypeAccess>(TypeAccess.class, this, Java_graphPackage.WILD_CARD_TYPE__BOUND);
		}
		return bound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_graphPackage.WILD_CARD_TYPE__UPPER_BOUND:
				return getUpperBound();
			case Java_graphPackage.WILD_CARD_TYPE__BOUND:
				return getBound();
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
			case Java_graphPackage.WILD_CARD_TYPE__UPPER_BOUND:
				getUpperBound().clear();
				getUpperBound().addAll((Collection<? extends Boolean>)newValue);
				return;
			case Java_graphPackage.WILD_CARD_TYPE__BOUND:
				getBound().clear();
				getBound().addAll((Collection<? extends TypeAccess>)newValue);
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
			case Java_graphPackage.WILD_CARD_TYPE__UPPER_BOUND:
				getUpperBound().clear();
				return;
			case Java_graphPackage.WILD_CARD_TYPE__BOUND:
				getBound().clear();
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
			case Java_graphPackage.WILD_CARD_TYPE__UPPER_BOUND:
				return upperBound != null && !upperBound.isEmpty();
			case Java_graphPackage.WILD_CARD_TYPE__BOUND:
				return bound != null && !bound.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (upperBound: ");
		result.append(upperBound);
		result.append(')');
		return result.toString();
	}

} //WildCardTypeImpl

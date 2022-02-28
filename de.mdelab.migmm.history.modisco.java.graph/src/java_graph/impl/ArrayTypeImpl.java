/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.ArrayType;
import java_graph.Java_graphPackage;
import java_graph.TypeAccess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.ArrayTypeImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link java_graph.impl.ArrayTypeImpl#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayTypeImpl extends TypeImpl implements ArrayType {
	/**
	 * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> dimensions;

	/**
	 * The cached value of the '{@link #getElementType() <em>Element Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAccess> elementType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getArrayType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getDimensions() {
		if (dimensions == null) {
			dimensions = new EDataTypeEList<Integer>(Integer.class, this, Java_graphPackage.ARRAY_TYPE__DIMENSIONS);
		}
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeAccess> getElementType() {
		if (elementType == null) {
			elementType = new EObjectResolvingEList<TypeAccess>(TypeAccess.class, this, Java_graphPackage.ARRAY_TYPE__ELEMENT_TYPE);
		}
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_graphPackage.ARRAY_TYPE__DIMENSIONS:
				return getDimensions();
			case Java_graphPackage.ARRAY_TYPE__ELEMENT_TYPE:
				return getElementType();
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
			case Java_graphPackage.ARRAY_TYPE__DIMENSIONS:
				getDimensions().clear();
				getDimensions().addAll((Collection<? extends Integer>)newValue);
				return;
			case Java_graphPackage.ARRAY_TYPE__ELEMENT_TYPE:
				getElementType().clear();
				getElementType().addAll((Collection<? extends TypeAccess>)newValue);
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
			case Java_graphPackage.ARRAY_TYPE__DIMENSIONS:
				getDimensions().clear();
				return;
			case Java_graphPackage.ARRAY_TYPE__ELEMENT_TYPE:
				getElementType().clear();
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
			case Java_graphPackage.ARRAY_TYPE__DIMENSIONS:
				return dimensions != null && !dimensions.isEmpty();
			case Java_graphPackage.ARRAY_TYPE__ELEMENT_TYPE:
				return elementType != null && !elementType.isEmpty();
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
		result.append(" (dimensions: ");
		result.append(dimensions);
		result.append(')');
		return result.toString();
	}

} //ArrayTypeImpl

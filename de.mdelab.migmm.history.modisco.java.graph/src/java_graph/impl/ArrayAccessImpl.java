/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.ArrayAccess;
import java_graph.Expression;
import java_graph.Java_graphPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.ArrayAccessImpl#getArray <em>Array</em>}</li>
 *   <li>{@link java_graph.impl.ArrayAccessImpl#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayAccessImpl extends ExpressionImpl implements ArrayAccess {
	/**
	 * The cached value of the '{@link #getArray() <em>Array</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArray()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> array;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> index;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getArrayAccess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getArray() {
		if (array == null) {
			array = new EObjectResolvingEList<Expression>(Expression.class, this, Java_graphPackage.ARRAY_ACCESS__ARRAY);
		}
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getIndex() {
		if (index == null) {
			index = new EObjectResolvingEList<Expression>(Expression.class, this, Java_graphPackage.ARRAY_ACCESS__INDEX);
		}
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_graphPackage.ARRAY_ACCESS__ARRAY:
				return getArray();
			case Java_graphPackage.ARRAY_ACCESS__INDEX:
				return getIndex();
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
			case Java_graphPackage.ARRAY_ACCESS__ARRAY:
				getArray().clear();
				getArray().addAll((Collection<? extends Expression>)newValue);
				return;
			case Java_graphPackage.ARRAY_ACCESS__INDEX:
				getIndex().clear();
				getIndex().addAll((Collection<? extends Expression>)newValue);
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
			case Java_graphPackage.ARRAY_ACCESS__ARRAY:
				getArray().clear();
				return;
			case Java_graphPackage.ARRAY_ACCESS__INDEX:
				getIndex().clear();
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
			case Java_graphPackage.ARRAY_ACCESS__ARRAY:
				return array != null && !array.isEmpty();
			case Java_graphPackage.ARRAY_ACCESS__INDEX:
				return index != null && !index.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArrayAccessImpl

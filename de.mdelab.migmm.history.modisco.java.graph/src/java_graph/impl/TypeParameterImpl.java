/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.Java_graphPackage;
import java_graph.TypeAccess;
import java_graph.TypeParameter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.TypeParameterImpl#getBounds <em>Bounds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeParameterImpl extends TypeImpl implements TypeParameter {
	/**
	 * The cached value of the '{@link #getBounds() <em>Bounds</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBounds()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAccess> bounds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getTypeParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeAccess> getBounds() {
		if (bounds == null) {
			bounds = new EObjectResolvingEList<TypeAccess>(TypeAccess.class, this, Java_graphPackage.TYPE_PARAMETER__BOUNDS);
		}
		return bounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_graphPackage.TYPE_PARAMETER__BOUNDS:
				return getBounds();
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
			case Java_graphPackage.TYPE_PARAMETER__BOUNDS:
				getBounds().clear();
				getBounds().addAll((Collection<? extends TypeAccess>)newValue);
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
			case Java_graphPackage.TYPE_PARAMETER__BOUNDS:
				getBounds().clear();
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
			case Java_graphPackage.TYPE_PARAMETER__BOUNDS:
				return bounds != null && !bounds.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeParameterImpl

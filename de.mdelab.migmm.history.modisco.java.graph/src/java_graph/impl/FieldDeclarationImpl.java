/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.AbstractVariablesContainer;
import java_graph.FieldDeclaration;
import java_graph.Java_graphPackage;
import java_graph.TypeAccess;
import java_graph.VariableDeclarationFragment;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.FieldDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link java_graph.impl.FieldDeclarationImpl#getFragments <em>Fragments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldDeclarationImpl extends BodyDeclarationImpl implements FieldDeclaration {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAccess> type;

	/**
	 * The cached value of the '{@link #getFragments() <em>Fragments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragments()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDeclarationFragment> fragments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getFieldDeclaration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeAccess> getType() {
		if (type == null) {
			type = new EObjectResolvingEList<TypeAccess>(TypeAccess.class, this, Java_graphPackage.FIELD_DECLARATION__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VariableDeclarationFragment> getFragments() {
		if (fragments == null) {
			fragments = new EObjectWithInverseResolvingEList.ManyInverse<VariableDeclarationFragment>(VariableDeclarationFragment.class, this, Java_graphPackage.FIELD_DECLARATION__FRAGMENTS, Java_graphPackage.VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER);
		}
		return fragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_graphPackage.FIELD_DECLARATION__FRAGMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFragments()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_graphPackage.FIELD_DECLARATION__FRAGMENTS:
				return ((InternalEList<?>)getFragments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_graphPackage.FIELD_DECLARATION__TYPE:
				return getType();
			case Java_graphPackage.FIELD_DECLARATION__FRAGMENTS:
				return getFragments();
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
			case Java_graphPackage.FIELD_DECLARATION__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends TypeAccess>)newValue);
				return;
			case Java_graphPackage.FIELD_DECLARATION__FRAGMENTS:
				getFragments().clear();
				getFragments().addAll((Collection<? extends VariableDeclarationFragment>)newValue);
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
			case Java_graphPackage.FIELD_DECLARATION__TYPE:
				getType().clear();
				return;
			case Java_graphPackage.FIELD_DECLARATION__FRAGMENTS:
				getFragments().clear();
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
			case Java_graphPackage.FIELD_DECLARATION__TYPE:
				return type != null && !type.isEmpty();
			case Java_graphPackage.FIELD_DECLARATION__FRAGMENTS:
				return fragments != null && !fragments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractVariablesContainer.class) {
			switch (derivedFeatureID) {
				case Java_graphPackage.FIELD_DECLARATION__TYPE: return Java_graphPackage.ABSTRACT_VARIABLES_CONTAINER__TYPE;
				case Java_graphPackage.FIELD_DECLARATION__FRAGMENTS: return Java_graphPackage.ABSTRACT_VARIABLES_CONTAINER__FRAGMENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractVariablesContainer.class) {
			switch (baseFeatureID) {
				case Java_graphPackage.ABSTRACT_VARIABLES_CONTAINER__TYPE: return Java_graphPackage.FIELD_DECLARATION__TYPE;
				case Java_graphPackage.ABSTRACT_VARIABLES_CONTAINER__FRAGMENTS: return Java_graphPackage.FIELD_DECLARATION__FRAGMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FieldDeclarationImpl

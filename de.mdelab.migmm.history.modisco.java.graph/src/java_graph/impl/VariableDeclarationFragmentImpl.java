/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.AbstractVariablesContainer;
import java_graph.Java_graphPackage;
import java_graph.VariableDeclarationFragment;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.VariableDeclarationFragmentImpl#getVariablesContainer <em>Variables Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableDeclarationFragmentImpl extends VariableDeclarationImpl implements VariableDeclarationFragment {
	/**
	 * The cached value of the '{@link #getVariablesContainer() <em>Variables Container</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariablesContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractVariablesContainer> variablesContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclarationFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getVariableDeclarationFragment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractVariablesContainer> getVariablesContainer() {
		if (variablesContainer == null) {
			variablesContainer = new EObjectWithInverseResolvingEList.ManyInverse<AbstractVariablesContainer>(AbstractVariablesContainer.class, this, Java_graphPackage.VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER, Java_graphPackage.ABSTRACT_VARIABLES_CONTAINER__FRAGMENTS);
		}
		return variablesContainer;
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
			case Java_graphPackage.VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariablesContainer()).basicAdd(otherEnd, msgs);
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
			case Java_graphPackage.VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER:
				return ((InternalEList<?>)getVariablesContainer()).basicRemove(otherEnd, msgs);
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
			case Java_graphPackage.VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER:
				return getVariablesContainer();
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
			case Java_graphPackage.VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER:
				getVariablesContainer().clear();
				getVariablesContainer().addAll((Collection<? extends AbstractVariablesContainer>)newValue);
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
			case Java_graphPackage.VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER:
				getVariablesContainer().clear();
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
			case Java_graphPackage.VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER:
				return variablesContainer != null && !variablesContainer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VariableDeclarationFragmentImpl

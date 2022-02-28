/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.Expression;
import java_graph.Java_graphPackage;
import java_graph.SingleVariableAccess;
import java_graph.VariableDeclaration;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.VariableDeclarationImpl#getExtraArrayDimensions <em>Extra Array Dimensions</em>}</li>
 *   <li>{@link java_graph.impl.VariableDeclarationImpl#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link java_graph.impl.VariableDeclarationImpl#getUsageInVariableAccess <em>Usage In Variable Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VariableDeclarationImpl extends NamedElementImpl implements VariableDeclaration {
	/**
	 * The cached value of the '{@link #getExtraArrayDimensions() <em>Extra Array Dimensions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraArrayDimensions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> extraArrayDimensions;

	/**
	 * The cached value of the '{@link #getInitializer() <em>Initializer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializer()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> initializer;

	/**
	 * The cached value of the '{@link #getUsageInVariableAccess() <em>Usage In Variable Access</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageInVariableAccess()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleVariableAccess> usageInVariableAccess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getVariableDeclaration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getExtraArrayDimensions() {
		if (extraArrayDimensions == null) {
			extraArrayDimensions = new EDataTypeEList<Integer>(Integer.class, this, Java_graphPackage.VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS);
		}
		return extraArrayDimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getInitializer() {
		if (initializer == null) {
			initializer = new EObjectResolvingEList<Expression>(Expression.class, this, Java_graphPackage.VARIABLE_DECLARATION__INITIALIZER);
		}
		return initializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SingleVariableAccess> getUsageInVariableAccess() {
		if (usageInVariableAccess == null) {
			usageInVariableAccess = new EObjectWithInverseResolvingEList.ManyInverse<SingleVariableAccess>(SingleVariableAccess.class, this, Java_graphPackage.VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS, Java_graphPackage.SINGLE_VARIABLE_ACCESS__VARIABLE);
		}
		return usageInVariableAccess;
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
			case Java_graphPackage.VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsageInVariableAccess()).basicAdd(otherEnd, msgs);
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
			case Java_graphPackage.VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS:
				return ((InternalEList<?>)getUsageInVariableAccess()).basicRemove(otherEnd, msgs);
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
			case Java_graphPackage.VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS:
				return getExtraArrayDimensions();
			case Java_graphPackage.VARIABLE_DECLARATION__INITIALIZER:
				return getInitializer();
			case Java_graphPackage.VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS:
				return getUsageInVariableAccess();
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
			case Java_graphPackage.VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS:
				getExtraArrayDimensions().clear();
				getExtraArrayDimensions().addAll((Collection<? extends Integer>)newValue);
				return;
			case Java_graphPackage.VARIABLE_DECLARATION__INITIALIZER:
				getInitializer().clear();
				getInitializer().addAll((Collection<? extends Expression>)newValue);
				return;
			case Java_graphPackage.VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS:
				getUsageInVariableAccess().clear();
				getUsageInVariableAccess().addAll((Collection<? extends SingleVariableAccess>)newValue);
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
			case Java_graphPackage.VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS:
				getExtraArrayDimensions().clear();
				return;
			case Java_graphPackage.VARIABLE_DECLARATION__INITIALIZER:
				getInitializer().clear();
				return;
			case Java_graphPackage.VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS:
				getUsageInVariableAccess().clear();
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
			case Java_graphPackage.VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS:
				return extraArrayDimensions != null && !extraArrayDimensions.isEmpty();
			case Java_graphPackage.VARIABLE_DECLARATION__INITIALIZER:
				return initializer != null && !initializer.isEmpty();
			case Java_graphPackage.VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS:
				return usageInVariableAccess != null && !usageInVariableAccess.isEmpty();
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
		result.append(" (extraArrayDimensions: ");
		result.append(extraArrayDimensions);
		result.append(')');
		return result.toString();
	}

} //VariableDeclarationImpl

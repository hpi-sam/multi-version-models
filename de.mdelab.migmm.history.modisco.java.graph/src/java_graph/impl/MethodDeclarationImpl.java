/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.Java_graphPackage;
import java_graph.MethodDeclaration;
import java_graph.TypeAccess;

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
 * An implementation of the model object '<em><b>Method Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.MethodDeclarationImpl#getExtraArrayDimensions <em>Extra Array Dimensions</em>}</li>
 *   <li>{@link java_graph.impl.MethodDeclarationImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link java_graph.impl.MethodDeclarationImpl#getRedefinedMethodDeclaration <em>Redefined Method Declaration</em>}</li>
 *   <li>{@link java_graph.impl.MethodDeclarationImpl#getRedefinitions <em>Redefinitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodDeclarationImpl extends AbstractMethodDeclarationImpl implements MethodDeclaration {
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
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAccess> returnType;

	/**
	 * The cached value of the '{@link #getRedefinedMethodDeclaration() <em>Redefined Method Declaration</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedMethodDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodDeclaration> redefinedMethodDeclaration;

	/**
	 * The cached value of the '{@link #getRedefinitions() <em>Redefinitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodDeclaration> redefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getMethodDeclaration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getExtraArrayDimensions() {
		if (extraArrayDimensions == null) {
			extraArrayDimensions = new EDataTypeEList<Integer>(Integer.class, this, Java_graphPackage.METHOD_DECLARATION__EXTRA_ARRAY_DIMENSIONS);
		}
		return extraArrayDimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeAccess> getReturnType() {
		if (returnType == null) {
			returnType = new EObjectResolvingEList<TypeAccess>(TypeAccess.class, this, Java_graphPackage.METHOD_DECLARATION__RETURN_TYPE);
		}
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MethodDeclaration> getRedefinedMethodDeclaration() {
		if (redefinedMethodDeclaration == null) {
			redefinedMethodDeclaration = new EObjectWithInverseResolvingEList.ManyInverse<MethodDeclaration>(MethodDeclaration.class, this, Java_graphPackage.METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION, Java_graphPackage.METHOD_DECLARATION__REDEFINITIONS);
		}
		return redefinedMethodDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MethodDeclaration> getRedefinitions() {
		if (redefinitions == null) {
			redefinitions = new EObjectWithInverseResolvingEList.ManyInverse<MethodDeclaration>(MethodDeclaration.class, this, Java_graphPackage.METHOD_DECLARATION__REDEFINITIONS, Java_graphPackage.METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION);
		}
		return redefinitions;
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
			case Java_graphPackage.METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRedefinedMethodDeclaration()).basicAdd(otherEnd, msgs);
			case Java_graphPackage.METHOD_DECLARATION__REDEFINITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRedefinitions()).basicAdd(otherEnd, msgs);
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
			case Java_graphPackage.METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION:
				return ((InternalEList<?>)getRedefinedMethodDeclaration()).basicRemove(otherEnd, msgs);
			case Java_graphPackage.METHOD_DECLARATION__REDEFINITIONS:
				return ((InternalEList<?>)getRedefinitions()).basicRemove(otherEnd, msgs);
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
			case Java_graphPackage.METHOD_DECLARATION__EXTRA_ARRAY_DIMENSIONS:
				return getExtraArrayDimensions();
			case Java_graphPackage.METHOD_DECLARATION__RETURN_TYPE:
				return getReturnType();
			case Java_graphPackage.METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION:
				return getRedefinedMethodDeclaration();
			case Java_graphPackage.METHOD_DECLARATION__REDEFINITIONS:
				return getRedefinitions();
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
			case Java_graphPackage.METHOD_DECLARATION__EXTRA_ARRAY_DIMENSIONS:
				getExtraArrayDimensions().clear();
				getExtraArrayDimensions().addAll((Collection<? extends Integer>)newValue);
				return;
			case Java_graphPackage.METHOD_DECLARATION__RETURN_TYPE:
				getReturnType().clear();
				getReturnType().addAll((Collection<? extends TypeAccess>)newValue);
				return;
			case Java_graphPackage.METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION:
				getRedefinedMethodDeclaration().clear();
				getRedefinedMethodDeclaration().addAll((Collection<? extends MethodDeclaration>)newValue);
				return;
			case Java_graphPackage.METHOD_DECLARATION__REDEFINITIONS:
				getRedefinitions().clear();
				getRedefinitions().addAll((Collection<? extends MethodDeclaration>)newValue);
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
			case Java_graphPackage.METHOD_DECLARATION__EXTRA_ARRAY_DIMENSIONS:
				getExtraArrayDimensions().clear();
				return;
			case Java_graphPackage.METHOD_DECLARATION__RETURN_TYPE:
				getReturnType().clear();
				return;
			case Java_graphPackage.METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION:
				getRedefinedMethodDeclaration().clear();
				return;
			case Java_graphPackage.METHOD_DECLARATION__REDEFINITIONS:
				getRedefinitions().clear();
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
			case Java_graphPackage.METHOD_DECLARATION__EXTRA_ARRAY_DIMENSIONS:
				return extraArrayDimensions != null && !extraArrayDimensions.isEmpty();
			case Java_graphPackage.METHOD_DECLARATION__RETURN_TYPE:
				return returnType != null && !returnType.isEmpty();
			case Java_graphPackage.METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION:
				return redefinedMethodDeclaration != null && !redefinedMethodDeclaration.isEmpty();
			case Java_graphPackage.METHOD_DECLARATION__REDEFINITIONS:
				return redefinitions != null && !redefinitions.isEmpty();
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

} //MethodDeclarationImpl

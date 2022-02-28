/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.AbstractMethodDeclaration;
import java_graph.Java_graphPackage;
import java_graph.MethodRef;
import java_graph.MethodRefParameter;
import java_graph.TypeAccess;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.MethodRefImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link java_graph.impl.MethodRefImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link java_graph.impl.MethodRefImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodRefImpl extends ASTNodeImpl implements MethodRef {
	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractMethodDeclaration> method;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAccess> qualifier;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodRefParameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getMethodRef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractMethodDeclaration> getMethod() {
		if (method == null) {
			method = new EObjectWithInverseResolvingEList.ManyInverse<AbstractMethodDeclaration>(AbstractMethodDeclaration.class, this, Java_graphPackage.METHOD_REF__METHOD, Java_graphPackage.ABSTRACT_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS);
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeAccess> getQualifier() {
		if (qualifier == null) {
			qualifier = new EObjectResolvingEList<TypeAccess>(TypeAccess.class, this, Java_graphPackage.METHOD_REF__QUALIFIER);
		}
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MethodRefParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectResolvingEList<MethodRefParameter>(MethodRefParameter.class, this, Java_graphPackage.METHOD_REF__PARAMETERS);
		}
		return parameters;
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
			case Java_graphPackage.METHOD_REF__METHOD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethod()).basicAdd(otherEnd, msgs);
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
			case Java_graphPackage.METHOD_REF__METHOD:
				return ((InternalEList<?>)getMethod()).basicRemove(otherEnd, msgs);
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
			case Java_graphPackage.METHOD_REF__METHOD:
				return getMethod();
			case Java_graphPackage.METHOD_REF__QUALIFIER:
				return getQualifier();
			case Java_graphPackage.METHOD_REF__PARAMETERS:
				return getParameters();
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
			case Java_graphPackage.METHOD_REF__METHOD:
				getMethod().clear();
				getMethod().addAll((Collection<? extends AbstractMethodDeclaration>)newValue);
				return;
			case Java_graphPackage.METHOD_REF__QUALIFIER:
				getQualifier().clear();
				getQualifier().addAll((Collection<? extends TypeAccess>)newValue);
				return;
			case Java_graphPackage.METHOD_REF__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends MethodRefParameter>)newValue);
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
			case Java_graphPackage.METHOD_REF__METHOD:
				getMethod().clear();
				return;
			case Java_graphPackage.METHOD_REF__QUALIFIER:
				getQualifier().clear();
				return;
			case Java_graphPackage.METHOD_REF__PARAMETERS:
				getParameters().clear();
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
			case Java_graphPackage.METHOD_REF__METHOD:
				return method != null && !method.isEmpty();
			case Java_graphPackage.METHOD_REF__QUALIFIER:
				return qualifier != null && !qualifier.isEmpty();
			case Java_graphPackage.METHOD_REF__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MethodRefImpl

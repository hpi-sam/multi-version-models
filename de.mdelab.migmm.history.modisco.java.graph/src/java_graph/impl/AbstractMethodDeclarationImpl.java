/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.AbstractMethodDeclaration;
import java_graph.AbstractMethodInvocation;
import java_graph.Block;
import java_graph.Java_graphPackage;
import java_graph.MethodRef;
import java_graph.SingleVariableDeclaration;
import java_graph.TypeAccess;
import java_graph.TypeParameter;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Method Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.AbstractMethodDeclarationImpl#getBody <em>Body</em>}</li>
 *   <li>{@link java_graph.impl.AbstractMethodDeclarationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link java_graph.impl.AbstractMethodDeclarationImpl#getThrownExceptions <em>Thrown Exceptions</em>}</li>
 *   <li>{@link java_graph.impl.AbstractMethodDeclarationImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link java_graph.impl.AbstractMethodDeclarationImpl#getUsagesInDocComments <em>Usages In Doc Comments</em>}</li>
 *   <li>{@link java_graph.impl.AbstractMethodDeclarationImpl#getUsages <em>Usages</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractMethodDeclarationImpl extends BodyDeclarationImpl implements AbstractMethodDeclaration {
	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<Block> body;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleVariableDeclaration> parameters;

	/**
	 * The cached value of the '{@link #getThrownExceptions() <em>Thrown Exceptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrownExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAccess> thrownExceptions;

	/**
	 * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeParameter> typeParameters;

	/**
	 * The cached value of the '{@link #getUsagesInDocComments() <em>Usages In Doc Comments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsagesInDocComments()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodRef> usagesInDocComments;

	/**
	 * The cached value of the '{@link #getUsages() <em>Usages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsages()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractMethodInvocation> usages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractMethodDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getAbstractMethodDeclaration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Block> getBody() {
		if (body == null) {
			body = new EObjectResolvingEList<Block>(Block.class, this, Java_graphPackage.ABSTRACT_METHOD_DECLARATION__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SingleVariableDeclaration> getParameters() {
		if (parameters == null) {
			parameters = new EObjectWithInverseResolvingEList.ManyInverse<SingleVariableDeclaration>(SingleVariableDeclaration.class, this, Java_graphPackage.ABSTRACT_METHOD_DECLARATION__PARAMETERS, Java_graphPackage.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeAccess> getThrownExceptions() {
		if (thrownExceptions == null) {
			thrownExceptions = new EObjectResolvingEList<TypeAccess>(TypeAccess.class, this, Java_graphPackage.ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS);
		}
		return thrownExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeParameter> getTypeParameters() {
		if (typeParameters == null) {
			typeParameters = new EObjectResolvingEList<TypeParameter>(TypeParameter.class, this, Java_graphPackage.ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS);
		}
		return typeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MethodRef> getUsagesInDocComments() {
		if (usagesInDocComments == null) {
			usagesInDocComments = new EObjectWithInverseResolvingEList.ManyInverse<MethodRef>(MethodRef.class, this, Java_graphPackage.ABSTRACT_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS, Java_graphPackage.METHOD_REF__METHOD);
		}
		return usagesInDocComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractMethodInvocation> getUsages() {
		if (usages == null) {
			usages = new EObjectWithInverseResolvingEList.ManyInverse<AbstractMethodInvocation>(AbstractMethodInvocation.class, this, Java_graphPackage.ABSTRACT_METHOD_DECLARATION__USAGES, Java_graphPackage.ABSTRACT_METHOD_INVOCATION__METHOD);
		}
		return usages;
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
			case Java_graphPackage.ABSTRACT_METHOD_DECLARATION__PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameters()).basicAdd(otherEnd, msgs);
			case Java_graphPackage.ABSTRACT_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsagesInDocComments()).basicAdd(otherEnd, msgs);
			case Java_graphPackage.ABSTRACT_METHOD_DECLARATION__USAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsages()).basicAdd(otherEnd, msgs);
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
			case Java_graphPackage.ABSTRACT_METHOD_DECLARATION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case Java_graphPackage.ABSTRACT_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS:
				return ((InternalEList<?>)getUsagesInDocComments()).basicRemove(otherEnd, msgs);
			case Java_graphPackage.ABSTRACT_METHOD_DECLARATION__USAGES:
				return ((InternalEList<?>)getUsages()).basicRemove(otherEnd, msgs);
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
			case Java_graphPackage.ABSTRACT_METHOD_DECLARATION__BODY:
				return getBody();
			case Java_graphPackage.ABSTRACT_METHOD_DECLARATION__PARAMETERS:
				return getParameters();
			case Java_graphPackage.ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS:
				return getThrownExceptions();
			case Java_graphPackage.ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS:
				return getTypeParameters();
			case Java_graphPackage.ABSTRACT_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS:
				return getUsagesInDocComments();
			case Java_graphPackage.ABSTRACT_METHOD_DECLARATION__USAGES:
				return getUsages();
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
			case Java_graphPackage.ABSTRACT_METHOD_DECLARATION__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends Block>)newValue);
				return;
			case Java_graphPackage.ABSTRACT_METHOD_DECLARATION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends SingleVariableDeclaration>)newValue);
				return;
			case Java_graphPackage.ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS:
				getThrownExceptions().clear();
				getThrownExceptions().addAll((Collection<? extends TypeAccess>)newValue);
				return;
			case Java_graphPackage.ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends TypeParameter>)newValue);
				return;
			case Java_graphPackage.ABSTRACT_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS:
				getUsagesInDocComments().clear();
				getUsagesInDocComments().addAll((Collection<? extends MethodRef>)newValue);
				return;
			case Java_graphPackage.ABSTRACT_METHOD_DECLARATION__USAGES:
				getUsages().clear();
				getUsages().addAll((Collection<? extends AbstractMethodInvocation>)newValue);
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
			case Java_graphPackage.ABSTRACT_METHOD_DECLARATION__BODY:
				getBody().clear();
				return;
			case Java_graphPackage.ABSTRACT_METHOD_DECLARATION__PARAMETERS:
				getParameters().clear();
				return;
			case Java_graphPackage.ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS:
				getThrownExceptions().clear();
				return;
			case Java_graphPackage.ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS:
				getTypeParameters().clear();
				return;
			case Java_graphPackage.ABSTRACT_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS:
				getUsagesInDocComments().clear();
				return;
			case Java_graphPackage.ABSTRACT_METHOD_DECLARATION__USAGES:
				getUsages().clear();
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
			case Java_graphPackage.ABSTRACT_METHOD_DECLARATION__BODY:
				return body != null && !body.isEmpty();
			case Java_graphPackage.ABSTRACT_METHOD_DECLARATION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case Java_graphPackage.ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS:
				return thrownExceptions != null && !thrownExceptions.isEmpty();
			case Java_graphPackage.ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS:
				return typeParameters != null && !typeParameters.isEmpty();
			case Java_graphPackage.ABSTRACT_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS:
				return usagesInDocComments != null && !usagesInDocComments.isEmpty();
			case Java_graphPackage.ABSTRACT_METHOD_DECLARATION__USAGES:
				return usages != null && !usages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractMethodDeclarationImpl

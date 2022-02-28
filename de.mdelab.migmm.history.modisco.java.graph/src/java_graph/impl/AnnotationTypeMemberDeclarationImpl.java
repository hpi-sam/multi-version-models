/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.AnnotationMemberValuePair;
import java_graph.AnnotationTypeMemberDeclaration;
import java_graph.Expression;
import java_graph.Java_graphPackage;
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
 * An implementation of the model object '<em><b>Annotation Type Member Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.AnnotationTypeMemberDeclarationImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link java_graph.impl.AnnotationTypeMemberDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link java_graph.impl.AnnotationTypeMemberDeclarationImpl#getUsages <em>Usages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationTypeMemberDeclarationImpl extends BodyDeclarationImpl implements AnnotationTypeMemberDeclaration {
	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> default_;

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
	 * The cached value of the '{@link #getUsages() <em>Usages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsages()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationMemberValuePair> usages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationTypeMemberDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getAnnotationTypeMemberDeclaration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getDefault() {
		if (default_ == null) {
			default_ = new EObjectResolvingEList<Expression>(Expression.class, this, Java_graphPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT);
		}
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeAccess> getType() {
		if (type == null) {
			type = new EObjectResolvingEList<TypeAccess>(TypeAccess.class, this, Java_graphPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationMemberValuePair> getUsages() {
		if (usages == null) {
			usages = new EObjectWithInverseResolvingEList.ManyInverse<AnnotationMemberValuePair>(AnnotationMemberValuePair.class, this, Java_graphPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__USAGES, Java_graphPackage.ANNOTATION_MEMBER_VALUE_PAIR__MEMBER);
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
			case Java_graphPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__USAGES:
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
			case Java_graphPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__USAGES:
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
			case Java_graphPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT:
				return getDefault();
			case Java_graphPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE:
				return getType();
			case Java_graphPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__USAGES:
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
			case Java_graphPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT:
				getDefault().clear();
				getDefault().addAll((Collection<? extends Expression>)newValue);
				return;
			case Java_graphPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends TypeAccess>)newValue);
				return;
			case Java_graphPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__USAGES:
				getUsages().clear();
				getUsages().addAll((Collection<? extends AnnotationMemberValuePair>)newValue);
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
			case Java_graphPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT:
				getDefault().clear();
				return;
			case Java_graphPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE:
				getType().clear();
				return;
			case Java_graphPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__USAGES:
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
			case Java_graphPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT:
				return default_ != null && !default_.isEmpty();
			case Java_graphPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE:
				return type != null && !type.isEmpty();
			case Java_graphPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__USAGES:
				return usages != null && !usages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnnotationTypeMemberDeclarationImpl

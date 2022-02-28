/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.AnnotationMemberValuePair;
import java_graph.AnnotationTypeMemberDeclaration;
import java_graph.Expression;
import java_graph.Java_graphPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Member Value Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.AnnotationMemberValuePairImpl#getMember <em>Member</em>}</li>
 *   <li>{@link java_graph.impl.AnnotationMemberValuePairImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationMemberValuePairImpl extends NamedElementImpl implements AnnotationMemberValuePair {
	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationTypeMemberDeclaration> member;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationMemberValuePairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getAnnotationMemberValuePair();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationTypeMemberDeclaration> getMember() {
		if (member == null) {
			member = new EObjectWithInverseResolvingEList.ManyInverse<AnnotationTypeMemberDeclaration>(AnnotationTypeMemberDeclaration.class, this, Java_graphPackage.ANNOTATION_MEMBER_VALUE_PAIR__MEMBER, Java_graphPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__USAGES);
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getValue() {
		if (value == null) {
			value = new EObjectResolvingEList<Expression>(Expression.class, this, Java_graphPackage.ANNOTATION_MEMBER_VALUE_PAIR__VALUE);
		}
		return value;
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
			case Java_graphPackage.ANNOTATION_MEMBER_VALUE_PAIR__MEMBER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMember()).basicAdd(otherEnd, msgs);
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
			case Java_graphPackage.ANNOTATION_MEMBER_VALUE_PAIR__MEMBER:
				return ((InternalEList<?>)getMember()).basicRemove(otherEnd, msgs);
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
			case Java_graphPackage.ANNOTATION_MEMBER_VALUE_PAIR__MEMBER:
				return getMember();
			case Java_graphPackage.ANNOTATION_MEMBER_VALUE_PAIR__VALUE:
				return getValue();
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
			case Java_graphPackage.ANNOTATION_MEMBER_VALUE_PAIR__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends AnnotationTypeMemberDeclaration>)newValue);
				return;
			case Java_graphPackage.ANNOTATION_MEMBER_VALUE_PAIR__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends Expression>)newValue);
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
			case Java_graphPackage.ANNOTATION_MEMBER_VALUE_PAIR__MEMBER:
				getMember().clear();
				return;
			case Java_graphPackage.ANNOTATION_MEMBER_VALUE_PAIR__VALUE:
				getValue().clear();
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
			case Java_graphPackage.ANNOTATION_MEMBER_VALUE_PAIR__MEMBER:
				return member != null && !member.isEmpty();
			case Java_graphPackage.ANNOTATION_MEMBER_VALUE_PAIR__VALUE:
				return value != null && !value.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnnotationMemberValuePairImpl

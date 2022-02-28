/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.AnonymousClassDeclaration;
import java_graph.BodyDeclaration;
import java_graph.ClassInstanceCreation;
import java_graph.Java_graphPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anonymous Class Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.AnonymousClassDeclarationImpl#getBodyDeclarations <em>Body Declarations</em>}</li>
 *   <li>{@link java_graph.impl.AnonymousClassDeclarationImpl#getClassInstanceCreation <em>Class Instance Creation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnonymousClassDeclarationImpl extends ASTNodeImpl implements AnonymousClassDeclaration {
	/**
	 * The cached value of the '{@link #getBodyDeclarations() <em>Body Declarations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<BodyDeclaration> bodyDeclarations;

	/**
	 * The cached value of the '{@link #getClassInstanceCreation() <em>Class Instance Creation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassInstanceCreation()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassInstanceCreation> classInstanceCreation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnonymousClassDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getAnonymousClassDeclaration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BodyDeclaration> getBodyDeclarations() {
		if (bodyDeclarations == null) {
			bodyDeclarations = new EObjectWithInverseResolvingEList.ManyInverse<BodyDeclaration>(BodyDeclaration.class, this, Java_graphPackage.ANONYMOUS_CLASS_DECLARATION__BODY_DECLARATIONS, Java_graphPackage.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER);
		}
		return bodyDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClassInstanceCreation> getClassInstanceCreation() {
		if (classInstanceCreation == null) {
			classInstanceCreation = new EObjectWithInverseResolvingEList.ManyInverse<ClassInstanceCreation>(ClassInstanceCreation.class, this, Java_graphPackage.ANONYMOUS_CLASS_DECLARATION__CLASS_INSTANCE_CREATION, Java_graphPackage.CLASS_INSTANCE_CREATION__ANONYMOUS_CLASS_DECLARATION);
		}
		return classInstanceCreation;
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
			case Java_graphPackage.ANONYMOUS_CLASS_DECLARATION__BODY_DECLARATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBodyDeclarations()).basicAdd(otherEnd, msgs);
			case Java_graphPackage.ANONYMOUS_CLASS_DECLARATION__CLASS_INSTANCE_CREATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClassInstanceCreation()).basicAdd(otherEnd, msgs);
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
			case Java_graphPackage.ANONYMOUS_CLASS_DECLARATION__BODY_DECLARATIONS:
				return ((InternalEList<?>)getBodyDeclarations()).basicRemove(otherEnd, msgs);
			case Java_graphPackage.ANONYMOUS_CLASS_DECLARATION__CLASS_INSTANCE_CREATION:
				return ((InternalEList<?>)getClassInstanceCreation()).basicRemove(otherEnd, msgs);
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
			case Java_graphPackage.ANONYMOUS_CLASS_DECLARATION__BODY_DECLARATIONS:
				return getBodyDeclarations();
			case Java_graphPackage.ANONYMOUS_CLASS_DECLARATION__CLASS_INSTANCE_CREATION:
				return getClassInstanceCreation();
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
			case Java_graphPackage.ANONYMOUS_CLASS_DECLARATION__BODY_DECLARATIONS:
				getBodyDeclarations().clear();
				getBodyDeclarations().addAll((Collection<? extends BodyDeclaration>)newValue);
				return;
			case Java_graphPackage.ANONYMOUS_CLASS_DECLARATION__CLASS_INSTANCE_CREATION:
				getClassInstanceCreation().clear();
				getClassInstanceCreation().addAll((Collection<? extends ClassInstanceCreation>)newValue);
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
			case Java_graphPackage.ANONYMOUS_CLASS_DECLARATION__BODY_DECLARATIONS:
				getBodyDeclarations().clear();
				return;
			case Java_graphPackage.ANONYMOUS_CLASS_DECLARATION__CLASS_INSTANCE_CREATION:
				getClassInstanceCreation().clear();
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
			case Java_graphPackage.ANONYMOUS_CLASS_DECLARATION__BODY_DECLARATIONS:
				return bodyDeclarations != null && !bodyDeclarations.isEmpty();
			case Java_graphPackage.ANONYMOUS_CLASS_DECLARATION__CLASS_INSTANCE_CREATION:
				return classInstanceCreation != null && !classInstanceCreation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnonymousClassDeclarationImpl

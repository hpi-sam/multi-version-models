/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.AbstractTypeDeclaration;
import java_graph.Annotation;
import java_graph.AnonymousClassDeclaration;
import java_graph.BodyDeclaration;
import java_graph.Java_graphPackage;
import java_graph.Modifier;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.BodyDeclarationImpl#getAbstractTypeDeclaration <em>Abstract Type Declaration</em>}</li>
 *   <li>{@link java_graph.impl.BodyDeclarationImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link java_graph.impl.BodyDeclarationImpl#getAnonymousClassDeclarationOwner <em>Anonymous Class Declaration Owner</em>}</li>
 *   <li>{@link java_graph.impl.BodyDeclarationImpl#getModifier <em>Modifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BodyDeclarationImpl extends NamedElementImpl implements BodyDeclaration {
	/**
	 * The cached value of the '{@link #getAbstractTypeDeclaration() <em>Abstract Type Declaration</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractTypeDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractTypeDeclaration> abstractTypeDeclaration;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotations;

	/**
	 * The cached value of the '{@link #getAnonymousClassDeclarationOwner() <em>Anonymous Class Declaration Owner</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnonymousClassDeclarationOwner()
	 * @generated
	 * @ordered
	 */
	protected EList<AnonymousClassDeclaration> anonymousClassDeclarationOwner;

	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Modifier> modifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BodyDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getBodyDeclaration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractTypeDeclaration> getAbstractTypeDeclaration() {
		if (abstractTypeDeclaration == null) {
			abstractTypeDeclaration = new EObjectWithInverseResolvingEList.ManyInverse<AbstractTypeDeclaration>(AbstractTypeDeclaration.class, this, Java_graphPackage.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION, Java_graphPackage.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS);
		}
		return abstractTypeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectResolvingEList<Annotation>(Annotation.class, this, Java_graphPackage.BODY_DECLARATION__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnonymousClassDeclaration> getAnonymousClassDeclarationOwner() {
		if (anonymousClassDeclarationOwner == null) {
			anonymousClassDeclarationOwner = new EObjectWithInverseResolvingEList.ManyInverse<AnonymousClassDeclaration>(AnonymousClassDeclaration.class, this, Java_graphPackage.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER, Java_graphPackage.ANONYMOUS_CLASS_DECLARATION__BODY_DECLARATIONS);
		}
		return anonymousClassDeclarationOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Modifier> getModifier() {
		if (modifier == null) {
			modifier = new EObjectWithInverseResolvingEList.ManyInverse<Modifier>(Modifier.class, this, Java_graphPackage.BODY_DECLARATION__MODIFIER, Java_graphPackage.MODIFIER__BODY_DECLARATION);
		}
		return modifier;
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
			case Java_graphPackage.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAbstractTypeDeclaration()).basicAdd(otherEnd, msgs);
			case Java_graphPackage.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnonymousClassDeclarationOwner()).basicAdd(otherEnd, msgs);
			case Java_graphPackage.BODY_DECLARATION__MODIFIER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModifier()).basicAdd(otherEnd, msgs);
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
			case Java_graphPackage.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION:
				return ((InternalEList<?>)getAbstractTypeDeclaration()).basicRemove(otherEnd, msgs);
			case Java_graphPackage.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER:
				return ((InternalEList<?>)getAnonymousClassDeclarationOwner()).basicRemove(otherEnd, msgs);
			case Java_graphPackage.BODY_DECLARATION__MODIFIER:
				return ((InternalEList<?>)getModifier()).basicRemove(otherEnd, msgs);
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
			case Java_graphPackage.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION:
				return getAbstractTypeDeclaration();
			case Java_graphPackage.BODY_DECLARATION__ANNOTATIONS:
				return getAnnotations();
			case Java_graphPackage.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER:
				return getAnonymousClassDeclarationOwner();
			case Java_graphPackage.BODY_DECLARATION__MODIFIER:
				return getModifier();
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
			case Java_graphPackage.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION:
				getAbstractTypeDeclaration().clear();
				getAbstractTypeDeclaration().addAll((Collection<? extends AbstractTypeDeclaration>)newValue);
				return;
			case Java_graphPackage.BODY_DECLARATION__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case Java_graphPackage.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER:
				getAnonymousClassDeclarationOwner().clear();
				getAnonymousClassDeclarationOwner().addAll((Collection<? extends AnonymousClassDeclaration>)newValue);
				return;
			case Java_graphPackage.BODY_DECLARATION__MODIFIER:
				getModifier().clear();
				getModifier().addAll((Collection<? extends Modifier>)newValue);
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
			case Java_graphPackage.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION:
				getAbstractTypeDeclaration().clear();
				return;
			case Java_graphPackage.BODY_DECLARATION__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case Java_graphPackage.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER:
				getAnonymousClassDeclarationOwner().clear();
				return;
			case Java_graphPackage.BODY_DECLARATION__MODIFIER:
				getModifier().clear();
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
			case Java_graphPackage.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION:
				return abstractTypeDeclaration != null && !abstractTypeDeclaration.isEmpty();
			case Java_graphPackage.BODY_DECLARATION__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case Java_graphPackage.BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER:
				return anonymousClassDeclarationOwner != null && !anonymousClassDeclarationOwner.isEmpty();
			case Java_graphPackage.BODY_DECLARATION__MODIFIER:
				return modifier != null && !modifier.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BodyDeclarationImpl

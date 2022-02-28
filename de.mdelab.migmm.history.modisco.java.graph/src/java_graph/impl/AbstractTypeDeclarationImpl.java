/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.AbstractTypeDeclaration;
import java_graph.BodyDeclaration;
import java_graph.Comment;
import java_graph.Java_graphPackage;
import java_graph.Type;
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
 * An implementation of the model object '<em><b>Abstract Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.AbstractTypeDeclarationImpl#getUsagesInTypeAccess <em>Usages In Type Access</em>}</li>
 *   <li>{@link java_graph.impl.AbstractTypeDeclarationImpl#getBodyDeclarations <em>Body Declarations</em>}</li>
 *   <li>{@link java_graph.impl.AbstractTypeDeclarationImpl#getCommentsBeforeBody <em>Comments Before Body</em>}</li>
 *   <li>{@link java_graph.impl.AbstractTypeDeclarationImpl#getCommentsAfterBody <em>Comments After Body</em>}</li>
 *   <li>{@link java_graph.impl.AbstractTypeDeclarationImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link java_graph.impl.AbstractTypeDeclarationImpl#getSuperInterfaces <em>Super Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractTypeDeclarationImpl extends BodyDeclarationImpl implements AbstractTypeDeclaration {
	/**
	 * The cached value of the '{@link #getUsagesInTypeAccess() <em>Usages In Type Access</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsagesInTypeAccess()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAccess> usagesInTypeAccess;

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
	 * The cached value of the '{@link #getCommentsBeforeBody() <em>Comments Before Body</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentsBeforeBody()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> commentsBeforeBody;

	/**
	 * The cached value of the '{@link #getCommentsAfterBody() <em>Comments After Body</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentsAfterBody()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> commentsAfterBody;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<java_graph.Package> package_;

	/**
	 * The cached value of the '{@link #getSuperInterfaces() <em>Super Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAccess> superInterfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTypeDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getAbstractTypeDeclaration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeAccess> getUsagesInTypeAccess() {
		if (usagesInTypeAccess == null) {
			usagesInTypeAccess = new EObjectWithInverseResolvingEList.ManyInverse<TypeAccess>(TypeAccess.class, this, Java_graphPackage.ABSTRACT_TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS, Java_graphPackage.TYPE_ACCESS__TYPE);
		}
		return usagesInTypeAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BodyDeclaration> getBodyDeclarations() {
		if (bodyDeclarations == null) {
			bodyDeclarations = new EObjectWithInverseResolvingEList.ManyInverse<BodyDeclaration>(BodyDeclaration.class, this, Java_graphPackage.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS, Java_graphPackage.BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION);
		}
		return bodyDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getCommentsBeforeBody() {
		if (commentsBeforeBody == null) {
			commentsBeforeBody = new EObjectResolvingEList<Comment>(Comment.class, this, Java_graphPackage.ABSTRACT_TYPE_DECLARATION__COMMENTS_BEFORE_BODY);
		}
		return commentsBeforeBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getCommentsAfterBody() {
		if (commentsAfterBody == null) {
			commentsAfterBody = new EObjectResolvingEList<Comment>(Comment.class, this, Java_graphPackage.ABSTRACT_TYPE_DECLARATION__COMMENTS_AFTER_BODY);
		}
		return commentsAfterBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<java_graph.Package> getPackage() {
		if (package_ == null) {
			package_ = new EObjectWithInverseResolvingEList.ManyInverse<java_graph.Package>(java_graph.Package.class, this, Java_graphPackage.ABSTRACT_TYPE_DECLARATION__PACKAGE, Java_graphPackage.PACKAGE__OWNED_ELEMENTS);
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeAccess> getSuperInterfaces() {
		if (superInterfaces == null) {
			superInterfaces = new EObjectResolvingEList<TypeAccess>(TypeAccess.class, this, Java_graphPackage.ABSTRACT_TYPE_DECLARATION__SUPER_INTERFACES);
		}
		return superInterfaces;
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
			case Java_graphPackage.ABSTRACT_TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsagesInTypeAccess()).basicAdd(otherEnd, msgs);
			case Java_graphPackage.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBodyDeclarations()).basicAdd(otherEnd, msgs);
			case Java_graphPackage.ABSTRACT_TYPE_DECLARATION__PACKAGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackage()).basicAdd(otherEnd, msgs);
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
			case Java_graphPackage.ABSTRACT_TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS:
				return ((InternalEList<?>)getUsagesInTypeAccess()).basicRemove(otherEnd, msgs);
			case Java_graphPackage.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS:
				return ((InternalEList<?>)getBodyDeclarations()).basicRemove(otherEnd, msgs);
			case Java_graphPackage.ABSTRACT_TYPE_DECLARATION__PACKAGE:
				return ((InternalEList<?>)getPackage()).basicRemove(otherEnd, msgs);
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
			case Java_graphPackage.ABSTRACT_TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS:
				return getUsagesInTypeAccess();
			case Java_graphPackage.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS:
				return getBodyDeclarations();
			case Java_graphPackage.ABSTRACT_TYPE_DECLARATION__COMMENTS_BEFORE_BODY:
				return getCommentsBeforeBody();
			case Java_graphPackage.ABSTRACT_TYPE_DECLARATION__COMMENTS_AFTER_BODY:
				return getCommentsAfterBody();
			case Java_graphPackage.ABSTRACT_TYPE_DECLARATION__PACKAGE:
				return getPackage();
			case Java_graphPackage.ABSTRACT_TYPE_DECLARATION__SUPER_INTERFACES:
				return getSuperInterfaces();
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
			case Java_graphPackage.ABSTRACT_TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS:
				getUsagesInTypeAccess().clear();
				getUsagesInTypeAccess().addAll((Collection<? extends TypeAccess>)newValue);
				return;
			case Java_graphPackage.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS:
				getBodyDeclarations().clear();
				getBodyDeclarations().addAll((Collection<? extends BodyDeclaration>)newValue);
				return;
			case Java_graphPackage.ABSTRACT_TYPE_DECLARATION__COMMENTS_BEFORE_BODY:
				getCommentsBeforeBody().clear();
				getCommentsBeforeBody().addAll((Collection<? extends Comment>)newValue);
				return;
			case Java_graphPackage.ABSTRACT_TYPE_DECLARATION__COMMENTS_AFTER_BODY:
				getCommentsAfterBody().clear();
				getCommentsAfterBody().addAll((Collection<? extends Comment>)newValue);
				return;
			case Java_graphPackage.ABSTRACT_TYPE_DECLARATION__PACKAGE:
				getPackage().clear();
				getPackage().addAll((Collection<? extends java_graph.Package>)newValue);
				return;
			case Java_graphPackage.ABSTRACT_TYPE_DECLARATION__SUPER_INTERFACES:
				getSuperInterfaces().clear();
				getSuperInterfaces().addAll((Collection<? extends TypeAccess>)newValue);
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
			case Java_graphPackage.ABSTRACT_TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS:
				getUsagesInTypeAccess().clear();
				return;
			case Java_graphPackage.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS:
				getBodyDeclarations().clear();
				return;
			case Java_graphPackage.ABSTRACT_TYPE_DECLARATION__COMMENTS_BEFORE_BODY:
				getCommentsBeforeBody().clear();
				return;
			case Java_graphPackage.ABSTRACT_TYPE_DECLARATION__COMMENTS_AFTER_BODY:
				getCommentsAfterBody().clear();
				return;
			case Java_graphPackage.ABSTRACT_TYPE_DECLARATION__PACKAGE:
				getPackage().clear();
				return;
			case Java_graphPackage.ABSTRACT_TYPE_DECLARATION__SUPER_INTERFACES:
				getSuperInterfaces().clear();
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
			case Java_graphPackage.ABSTRACT_TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS:
				return usagesInTypeAccess != null && !usagesInTypeAccess.isEmpty();
			case Java_graphPackage.ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS:
				return bodyDeclarations != null && !bodyDeclarations.isEmpty();
			case Java_graphPackage.ABSTRACT_TYPE_DECLARATION__COMMENTS_BEFORE_BODY:
				return commentsBeforeBody != null && !commentsBeforeBody.isEmpty();
			case Java_graphPackage.ABSTRACT_TYPE_DECLARATION__COMMENTS_AFTER_BODY:
				return commentsAfterBody != null && !commentsAfterBody.isEmpty();
			case Java_graphPackage.ABSTRACT_TYPE_DECLARATION__PACKAGE:
				return package_ != null && !package_.isEmpty();
			case Java_graphPackage.ABSTRACT_TYPE_DECLARATION__SUPER_INTERFACES:
				return superInterfaces != null && !superInterfaces.isEmpty();
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
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
				case Java_graphPackage.ABSTRACT_TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS: return Java_graphPackage.TYPE__USAGES_IN_TYPE_ACCESS;
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
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
				case Java_graphPackage.TYPE__USAGES_IN_TYPE_ACCESS: return Java_graphPackage.ABSTRACT_TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AbstractTypeDeclarationImpl

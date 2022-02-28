/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.AbstractTypeDeclaration;
import java_graph.Java_graphPackage;
import java_graph.Model;
import java_graph.PackageAccess;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.PackageImpl#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link java_graph.impl.PackageImpl#getModel <em>Model</em>}</li>
 *   <li>{@link java_graph.impl.PackageImpl#getOwnedPackages <em>Owned Packages</em>}</li>
 *   <li>{@link java_graph.impl.PackageImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link java_graph.impl.PackageImpl#getUsagesInPackageAccess <em>Usages In Package Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends NamedElementImpl implements java_graph.Package {
	/**
	 * The cached value of the '{@link #getOwnedElements() <em>Owned Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractTypeDeclaration> ownedElements;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> model;

	/**
	 * The cached value of the '{@link #getOwnedPackages() <em>Owned Packages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<java_graph.Package> ownedPackages;

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
	 * The cached value of the '{@link #getUsagesInPackageAccess() <em>Usages In Package Access</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsagesInPackageAccess()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageAccess> usagesInPackageAccess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractTypeDeclaration> getOwnedElements() {
		if (ownedElements == null) {
			ownedElements = new EObjectWithInverseResolvingEList.ManyInverse<AbstractTypeDeclaration>(AbstractTypeDeclaration.class, this, Java_graphPackage.PACKAGE__OWNED_ELEMENTS, Java_graphPackage.ABSTRACT_TYPE_DECLARATION__PACKAGE);
		}
		return ownedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Model> getModel() {
		if (model == null) {
			model = new EObjectWithInverseResolvingEList.ManyInverse<Model>(Model.class, this, Java_graphPackage.PACKAGE__MODEL, Java_graphPackage.MODEL__OWNED_ELEMENTS);
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<java_graph.Package> getOwnedPackages() {
		if (ownedPackages == null) {
			ownedPackages = new EObjectWithInverseResolvingEList.ManyInverse<java_graph.Package>(java_graph.Package.class, this, Java_graphPackage.PACKAGE__OWNED_PACKAGES, Java_graphPackage.PACKAGE__PACKAGE);
		}
		return ownedPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<java_graph.Package> getPackage() {
		if (package_ == null) {
			package_ = new EObjectWithInverseResolvingEList.ManyInverse<java_graph.Package>(java_graph.Package.class, this, Java_graphPackage.PACKAGE__PACKAGE, Java_graphPackage.PACKAGE__OWNED_PACKAGES);
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PackageAccess> getUsagesInPackageAccess() {
		if (usagesInPackageAccess == null) {
			usagesInPackageAccess = new EObjectWithInverseResolvingEList.ManyInverse<PackageAccess>(PackageAccess.class, this, Java_graphPackage.PACKAGE__USAGES_IN_PACKAGE_ACCESS, Java_graphPackage.PACKAGE_ACCESS__PACKAGE);
		}
		return usagesInPackageAccess;
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
			case Java_graphPackage.PACKAGE__OWNED_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedElements()).basicAdd(otherEnd, msgs);
			case Java_graphPackage.PACKAGE__MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModel()).basicAdd(otherEnd, msgs);
			case Java_graphPackage.PACKAGE__OWNED_PACKAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedPackages()).basicAdd(otherEnd, msgs);
			case Java_graphPackage.PACKAGE__PACKAGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackage()).basicAdd(otherEnd, msgs);
			case Java_graphPackage.PACKAGE__USAGES_IN_PACKAGE_ACCESS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsagesInPackageAccess()).basicAdd(otherEnd, msgs);
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
			case Java_graphPackage.PACKAGE__OWNED_ELEMENTS:
				return ((InternalEList<?>)getOwnedElements()).basicRemove(otherEnd, msgs);
			case Java_graphPackage.PACKAGE__MODEL:
				return ((InternalEList<?>)getModel()).basicRemove(otherEnd, msgs);
			case Java_graphPackage.PACKAGE__OWNED_PACKAGES:
				return ((InternalEList<?>)getOwnedPackages()).basicRemove(otherEnd, msgs);
			case Java_graphPackage.PACKAGE__PACKAGE:
				return ((InternalEList<?>)getPackage()).basicRemove(otherEnd, msgs);
			case Java_graphPackage.PACKAGE__USAGES_IN_PACKAGE_ACCESS:
				return ((InternalEList<?>)getUsagesInPackageAccess()).basicRemove(otherEnd, msgs);
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
			case Java_graphPackage.PACKAGE__OWNED_ELEMENTS:
				return getOwnedElements();
			case Java_graphPackage.PACKAGE__MODEL:
				return getModel();
			case Java_graphPackage.PACKAGE__OWNED_PACKAGES:
				return getOwnedPackages();
			case Java_graphPackage.PACKAGE__PACKAGE:
				return getPackage();
			case Java_graphPackage.PACKAGE__USAGES_IN_PACKAGE_ACCESS:
				return getUsagesInPackageAccess();
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
			case Java_graphPackage.PACKAGE__OWNED_ELEMENTS:
				getOwnedElements().clear();
				getOwnedElements().addAll((Collection<? extends AbstractTypeDeclaration>)newValue);
				return;
			case Java_graphPackage.PACKAGE__MODEL:
				getModel().clear();
				getModel().addAll((Collection<? extends Model>)newValue);
				return;
			case Java_graphPackage.PACKAGE__OWNED_PACKAGES:
				getOwnedPackages().clear();
				getOwnedPackages().addAll((Collection<? extends java_graph.Package>)newValue);
				return;
			case Java_graphPackage.PACKAGE__PACKAGE:
				getPackage().clear();
				getPackage().addAll((Collection<? extends java_graph.Package>)newValue);
				return;
			case Java_graphPackage.PACKAGE__USAGES_IN_PACKAGE_ACCESS:
				getUsagesInPackageAccess().clear();
				getUsagesInPackageAccess().addAll((Collection<? extends PackageAccess>)newValue);
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
			case Java_graphPackage.PACKAGE__OWNED_ELEMENTS:
				getOwnedElements().clear();
				return;
			case Java_graphPackage.PACKAGE__MODEL:
				getModel().clear();
				return;
			case Java_graphPackage.PACKAGE__OWNED_PACKAGES:
				getOwnedPackages().clear();
				return;
			case Java_graphPackage.PACKAGE__PACKAGE:
				getPackage().clear();
				return;
			case Java_graphPackage.PACKAGE__USAGES_IN_PACKAGE_ACCESS:
				getUsagesInPackageAccess().clear();
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
			case Java_graphPackage.PACKAGE__OWNED_ELEMENTS:
				return ownedElements != null && !ownedElements.isEmpty();
			case Java_graphPackage.PACKAGE__MODEL:
				return model != null && !model.isEmpty();
			case Java_graphPackage.PACKAGE__OWNED_PACKAGES:
				return ownedPackages != null && !ownedPackages.isEmpty();
			case Java_graphPackage.PACKAGE__PACKAGE:
				return package_ != null && !package_.isEmpty();
			case Java_graphPackage.PACKAGE__USAGES_IN_PACKAGE_ACCESS:
				return usagesInPackageAccess != null && !usagesInPackageAccess.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PackageImpl

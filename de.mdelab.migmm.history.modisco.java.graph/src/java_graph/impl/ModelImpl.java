/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.Archive;
import java_graph.ClassFile;
import java_graph.CompilationUnit;
import java_graph.Java_graphPackage;
import java_graph.Model;
import java_graph.Type;
import java_graph.UnresolvedItem;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link java_graph.impl.ModelImpl#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link java_graph.impl.ModelImpl#getOrphanTypes <em>Orphan Types</em>}</li>
 *   <li>{@link java_graph.impl.ModelImpl#getUnresolvedItems <em>Unresolved Items</em>}</li>
 *   <li>{@link java_graph.impl.ModelImpl#getCompilationUnits <em>Compilation Units</em>}</li>
 *   <li>{@link java_graph.impl.ModelImpl#getClassFiles <em>Class Files</em>}</li>
 *   <li>{@link java_graph.impl.ModelImpl#getArchives <em>Archives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> name;

	/**
	 * The cached value of the '{@link #getOwnedElements() <em>Owned Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<java_graph.Package> ownedElements;

	/**
	 * The cached value of the '{@link #getOrphanTypes() <em>Orphan Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrphanTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> orphanTypes;

	/**
	 * The cached value of the '{@link #getUnresolvedItems() <em>Unresolved Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnresolvedItems()
	 * @generated
	 * @ordered
	 */
	protected EList<UnresolvedItem> unresolvedItems;

	/**
	 * The cached value of the '{@link #getCompilationUnits() <em>Compilation Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompilationUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<CompilationUnit> compilationUnits;

	/**
	 * The cached value of the '{@link #getClassFiles() <em>Class Files</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassFile> classFiles;

	/**
	 * The cached value of the '{@link #getArchives() <em>Archives</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchives()
	 * @generated
	 * @ordered
	 */
	protected EList<Archive> archives;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getName() {
		if (name == null) {
			name = new EDataTypeEList<String>(String.class, this, Java_graphPackage.MODEL__NAME);
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<java_graph.Package> getOwnedElements() {
		if (ownedElements == null) {
			ownedElements = new EObjectWithInverseResolvingEList.ManyInverse<java_graph.Package>(java_graph.Package.class, this, Java_graphPackage.MODEL__OWNED_ELEMENTS, Java_graphPackage.PACKAGE__MODEL);
		}
		return ownedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Type> getOrphanTypes() {
		if (orphanTypes == null) {
			orphanTypes = new EObjectResolvingEList<Type>(Type.class, this, Java_graphPackage.MODEL__ORPHAN_TYPES);
		}
		return orphanTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnresolvedItem> getUnresolvedItems() {
		if (unresolvedItems == null) {
			unresolvedItems = new EObjectResolvingEList<UnresolvedItem>(UnresolvedItem.class, this, Java_graphPackage.MODEL__UNRESOLVED_ITEMS);
		}
		return unresolvedItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CompilationUnit> getCompilationUnits() {
		if (compilationUnits == null) {
			compilationUnits = new EObjectResolvingEList<CompilationUnit>(CompilationUnit.class, this, Java_graphPackage.MODEL__COMPILATION_UNITS);
		}
		return compilationUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClassFile> getClassFiles() {
		if (classFiles == null) {
			classFiles = new EObjectResolvingEList<ClassFile>(ClassFile.class, this, Java_graphPackage.MODEL__CLASS_FILES);
		}
		return classFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Archive> getArchives() {
		if (archives == null) {
			archives = new EObjectResolvingEList<Archive>(Archive.class, this, Java_graphPackage.MODEL__ARCHIVES);
		}
		return archives;
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
			case Java_graphPackage.MODEL__OWNED_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedElements()).basicAdd(otherEnd, msgs);
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
			case Java_graphPackage.MODEL__OWNED_ELEMENTS:
				return ((InternalEList<?>)getOwnedElements()).basicRemove(otherEnd, msgs);
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
			case Java_graphPackage.MODEL__NAME:
				return getName();
			case Java_graphPackage.MODEL__OWNED_ELEMENTS:
				return getOwnedElements();
			case Java_graphPackage.MODEL__ORPHAN_TYPES:
				return getOrphanTypes();
			case Java_graphPackage.MODEL__UNRESOLVED_ITEMS:
				return getUnresolvedItems();
			case Java_graphPackage.MODEL__COMPILATION_UNITS:
				return getCompilationUnits();
			case Java_graphPackage.MODEL__CLASS_FILES:
				return getClassFiles();
			case Java_graphPackage.MODEL__ARCHIVES:
				return getArchives();
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
			case Java_graphPackage.MODEL__NAME:
				getName().clear();
				getName().addAll((Collection<? extends String>)newValue);
				return;
			case Java_graphPackage.MODEL__OWNED_ELEMENTS:
				getOwnedElements().clear();
				getOwnedElements().addAll((Collection<? extends java_graph.Package>)newValue);
				return;
			case Java_graphPackage.MODEL__ORPHAN_TYPES:
				getOrphanTypes().clear();
				getOrphanTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case Java_graphPackage.MODEL__UNRESOLVED_ITEMS:
				getUnresolvedItems().clear();
				getUnresolvedItems().addAll((Collection<? extends UnresolvedItem>)newValue);
				return;
			case Java_graphPackage.MODEL__COMPILATION_UNITS:
				getCompilationUnits().clear();
				getCompilationUnits().addAll((Collection<? extends CompilationUnit>)newValue);
				return;
			case Java_graphPackage.MODEL__CLASS_FILES:
				getClassFiles().clear();
				getClassFiles().addAll((Collection<? extends ClassFile>)newValue);
				return;
			case Java_graphPackage.MODEL__ARCHIVES:
				getArchives().clear();
				getArchives().addAll((Collection<? extends Archive>)newValue);
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
			case Java_graphPackage.MODEL__NAME:
				getName().clear();
				return;
			case Java_graphPackage.MODEL__OWNED_ELEMENTS:
				getOwnedElements().clear();
				return;
			case Java_graphPackage.MODEL__ORPHAN_TYPES:
				getOrphanTypes().clear();
				return;
			case Java_graphPackage.MODEL__UNRESOLVED_ITEMS:
				getUnresolvedItems().clear();
				return;
			case Java_graphPackage.MODEL__COMPILATION_UNITS:
				getCompilationUnits().clear();
				return;
			case Java_graphPackage.MODEL__CLASS_FILES:
				getClassFiles().clear();
				return;
			case Java_graphPackage.MODEL__ARCHIVES:
				getArchives().clear();
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
			case Java_graphPackage.MODEL__NAME:
				return name != null && !name.isEmpty();
			case Java_graphPackage.MODEL__OWNED_ELEMENTS:
				return ownedElements != null && !ownedElements.isEmpty();
			case Java_graphPackage.MODEL__ORPHAN_TYPES:
				return orphanTypes != null && !orphanTypes.isEmpty();
			case Java_graphPackage.MODEL__UNRESOLVED_ITEMS:
				return unresolvedItems != null && !unresolvedItems.isEmpty();
			case Java_graphPackage.MODEL__COMPILATION_UNITS:
				return compilationUnits != null && !compilationUnits.isEmpty();
			case Java_graphPackage.MODEL__CLASS_FILES:
				return classFiles != null && !classFiles.isEmpty();
			case Java_graphPackage.MODEL__ARCHIVES:
				return archives != null && !archives.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ModelImpl

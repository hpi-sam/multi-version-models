/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.ImportDeclaration;
import java_graph.Java_graphPackage;
import java_graph.NamedElement;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.ImportDeclarationImpl#getStatic <em>Static</em>}</li>
 *   <li>{@link java_graph.impl.ImportDeclarationImpl#getImportedElement <em>Imported Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportDeclarationImpl extends ASTNodeImpl implements ImportDeclaration {
	/**
	 * The cached value of the '{@link #getStatic() <em>Static</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatic()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> static_;

	/**
	 * The cached value of the '{@link #getImportedElement() <em>Imported Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> importedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getImportDeclaration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Boolean> getStatic() {
		if (static_ == null) {
			static_ = new EDataTypeEList<Boolean>(Boolean.class, this, Java_graphPackage.IMPORT_DECLARATION__STATIC);
		}
		return static_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement> getImportedElement() {
		if (importedElement == null) {
			importedElement = new EObjectWithInverseResolvingEList.ManyInverse<NamedElement>(NamedElement.class, this, Java_graphPackage.IMPORT_DECLARATION__IMPORTED_ELEMENT, Java_graphPackage.NAMED_ELEMENT__USAGES_IN_IMPORTS);
		}
		return importedElement;
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
			case Java_graphPackage.IMPORT_DECLARATION__IMPORTED_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImportedElement()).basicAdd(otherEnd, msgs);
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
			case Java_graphPackage.IMPORT_DECLARATION__IMPORTED_ELEMENT:
				return ((InternalEList<?>)getImportedElement()).basicRemove(otherEnd, msgs);
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
			case Java_graphPackage.IMPORT_DECLARATION__STATIC:
				return getStatic();
			case Java_graphPackage.IMPORT_DECLARATION__IMPORTED_ELEMENT:
				return getImportedElement();
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
			case Java_graphPackage.IMPORT_DECLARATION__STATIC:
				getStatic().clear();
				getStatic().addAll((Collection<? extends Boolean>)newValue);
				return;
			case Java_graphPackage.IMPORT_DECLARATION__IMPORTED_ELEMENT:
				getImportedElement().clear();
				getImportedElement().addAll((Collection<? extends NamedElement>)newValue);
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
			case Java_graphPackage.IMPORT_DECLARATION__STATIC:
				getStatic().clear();
				return;
			case Java_graphPackage.IMPORT_DECLARATION__IMPORTED_ELEMENT:
				getImportedElement().clear();
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
			case Java_graphPackage.IMPORT_DECLARATION__STATIC:
				return static_ != null && !static_.isEmpty();
			case Java_graphPackage.IMPORT_DECLARATION__IMPORTED_ELEMENT:
				return importedElement != null && !importedElement.isEmpty();
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
		result.append(" (static: ");
		result.append(static_);
		result.append(')');
		return result.toString();
	}

} //ImportDeclarationImpl

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
 * An implementation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.NamedElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link java_graph.impl.NamedElementImpl#getProxy <em>Proxy</em>}</li>
 *   <li>{@link java_graph.impl.NamedElementImpl#getUsagesInImports <em>Usages In Imports</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NamedElementImpl extends ASTNodeImpl implements NamedElement {
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
	 * The cached value of the '{@link #getProxy() <em>Proxy</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxy()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> proxy;

	/**
	 * The cached value of the '{@link #getUsagesInImports() <em>Usages In Imports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsagesInImports()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportDeclaration> usagesInImports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getNamedElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getName() {
		if (name == null) {
			name = new EDataTypeEList<String>(String.class, this, Java_graphPackage.NAMED_ELEMENT__NAME);
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Boolean> getProxy() {
		if (proxy == null) {
			proxy = new EDataTypeEList<Boolean>(Boolean.class, this, Java_graphPackage.NAMED_ELEMENT__PROXY);
		}
		return proxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImportDeclaration> getUsagesInImports() {
		if (usagesInImports == null) {
			usagesInImports = new EObjectWithInverseResolvingEList.ManyInverse<ImportDeclaration>(ImportDeclaration.class, this, Java_graphPackage.NAMED_ELEMENT__USAGES_IN_IMPORTS, Java_graphPackage.IMPORT_DECLARATION__IMPORTED_ELEMENT);
		}
		return usagesInImports;
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
			case Java_graphPackage.NAMED_ELEMENT__USAGES_IN_IMPORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsagesInImports()).basicAdd(otherEnd, msgs);
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
			case Java_graphPackage.NAMED_ELEMENT__USAGES_IN_IMPORTS:
				return ((InternalEList<?>)getUsagesInImports()).basicRemove(otherEnd, msgs);
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
			case Java_graphPackage.NAMED_ELEMENT__NAME:
				return getName();
			case Java_graphPackage.NAMED_ELEMENT__PROXY:
				return getProxy();
			case Java_graphPackage.NAMED_ELEMENT__USAGES_IN_IMPORTS:
				return getUsagesInImports();
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
			case Java_graphPackage.NAMED_ELEMENT__NAME:
				getName().clear();
				getName().addAll((Collection<? extends String>)newValue);
				return;
			case Java_graphPackage.NAMED_ELEMENT__PROXY:
				getProxy().clear();
				getProxy().addAll((Collection<? extends Boolean>)newValue);
				return;
			case Java_graphPackage.NAMED_ELEMENT__USAGES_IN_IMPORTS:
				getUsagesInImports().clear();
				getUsagesInImports().addAll((Collection<? extends ImportDeclaration>)newValue);
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
			case Java_graphPackage.NAMED_ELEMENT__NAME:
				getName().clear();
				return;
			case Java_graphPackage.NAMED_ELEMENT__PROXY:
				getProxy().clear();
				return;
			case Java_graphPackage.NAMED_ELEMENT__USAGES_IN_IMPORTS:
				getUsagesInImports().clear();
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
			case Java_graphPackage.NAMED_ELEMENT__NAME:
				return name != null && !name.isEmpty();
			case Java_graphPackage.NAMED_ELEMENT__PROXY:
				return proxy != null && !proxy.isEmpty();
			case Java_graphPackage.NAMED_ELEMENT__USAGES_IN_IMPORTS:
				return usagesInImports != null && !usagesInImports.isEmpty();
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
		result.append(", proxy: ");
		result.append(proxy);
		result.append(')');
		return result.toString();
	}

} //NamedElementImpl

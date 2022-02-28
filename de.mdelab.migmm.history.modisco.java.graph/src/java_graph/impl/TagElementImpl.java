/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.ASTNode;
import java_graph.Java_graphPackage;
import java_graph.TagElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tag Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.TagElementImpl#getTagName <em>Tag Name</em>}</li>
 *   <li>{@link java_graph.impl.TagElementImpl#getFragments <em>Fragments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TagElementImpl extends ASTNodeImpl implements TagElement {
	/**
	 * The cached value of the '{@link #getTagName() <em>Tag Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tagName;

	/**
	 * The cached value of the '{@link #getFragments() <em>Fragments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragments()
	 * @generated
	 * @ordered
	 */
	protected EList<ASTNode> fragments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getTagElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTagName() {
		if (tagName == null) {
			tagName = new EDataTypeEList<String>(String.class, this, Java_graphPackage.TAG_ELEMENT__TAG_NAME);
		}
		return tagName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ASTNode> getFragments() {
		if (fragments == null) {
			fragments = new EObjectResolvingEList<ASTNode>(ASTNode.class, this, Java_graphPackage.TAG_ELEMENT__FRAGMENTS);
		}
		return fragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_graphPackage.TAG_ELEMENT__TAG_NAME:
				return getTagName();
			case Java_graphPackage.TAG_ELEMENT__FRAGMENTS:
				return getFragments();
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
			case Java_graphPackage.TAG_ELEMENT__TAG_NAME:
				getTagName().clear();
				getTagName().addAll((Collection<? extends String>)newValue);
				return;
			case Java_graphPackage.TAG_ELEMENT__FRAGMENTS:
				getFragments().clear();
				getFragments().addAll((Collection<? extends ASTNode>)newValue);
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
			case Java_graphPackage.TAG_ELEMENT__TAG_NAME:
				getTagName().clear();
				return;
			case Java_graphPackage.TAG_ELEMENT__FRAGMENTS:
				getFragments().clear();
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
			case Java_graphPackage.TAG_ELEMENT__TAG_NAME:
				return tagName != null && !tagName.isEmpty();
			case Java_graphPackage.TAG_ELEMENT__FRAGMENTS:
				return fragments != null && !fragments.isEmpty();
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
		result.append(" (tagName: ");
		result.append(tagName);
		result.append(')');
		return result.toString();
	}

} //TagElementImpl

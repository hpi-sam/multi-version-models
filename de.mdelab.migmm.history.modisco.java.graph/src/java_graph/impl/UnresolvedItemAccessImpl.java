/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.ASTNode;
import java_graph.Java_graphPackage;
import java_graph.UnresolvedItem;
import java_graph.UnresolvedItemAccess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unresolved Item Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.UnresolvedItemAccessImpl#getElement <em>Element</em>}</li>
 *   <li>{@link java_graph.impl.UnresolvedItemAccessImpl#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnresolvedItemAccessImpl extends ExpressionImpl implements UnresolvedItemAccess {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<UnresolvedItem> element;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<ASTNode> qualifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnresolvedItemAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getUnresolvedItemAccess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnresolvedItem> getElement() {
		if (element == null) {
			element = new EObjectResolvingEList<UnresolvedItem>(UnresolvedItem.class, this, Java_graphPackage.UNRESOLVED_ITEM_ACCESS__ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ASTNode> getQualifier() {
		if (qualifier == null) {
			qualifier = new EObjectResolvingEList<ASTNode>(ASTNode.class, this, Java_graphPackage.UNRESOLVED_ITEM_ACCESS__QUALIFIER);
		}
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_graphPackage.UNRESOLVED_ITEM_ACCESS__ELEMENT:
				return getElement();
			case Java_graphPackage.UNRESOLVED_ITEM_ACCESS__QUALIFIER:
				return getQualifier();
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
			case Java_graphPackage.UNRESOLVED_ITEM_ACCESS__ELEMENT:
				getElement().clear();
				getElement().addAll((Collection<? extends UnresolvedItem>)newValue);
				return;
			case Java_graphPackage.UNRESOLVED_ITEM_ACCESS__QUALIFIER:
				getQualifier().clear();
				getQualifier().addAll((Collection<? extends ASTNode>)newValue);
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
			case Java_graphPackage.UNRESOLVED_ITEM_ACCESS__ELEMENT:
				getElement().clear();
				return;
			case Java_graphPackage.UNRESOLVED_ITEM_ACCESS__QUALIFIER:
				getQualifier().clear();
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
			case Java_graphPackage.UNRESOLVED_ITEM_ACCESS__ELEMENT:
				return element != null && !element.isEmpty();
			case Java_graphPackage.UNRESOLVED_ITEM_ACCESS__QUALIFIER:
				return qualifier != null && !qualifier.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UnresolvedItemAccessImpl

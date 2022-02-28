/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.AbstractTypeDeclaration;
import java_graph.Java_graphPackage;
import java_graph.TypeDeclarationStatement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Declaration Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.TypeDeclarationStatementImpl#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeDeclarationStatementImpl extends StatementImpl implements TypeDeclarationStatement {
	/**
	 * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractTypeDeclaration> declaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDeclarationStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getTypeDeclarationStatement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractTypeDeclaration> getDeclaration() {
		if (declaration == null) {
			declaration = new EObjectResolvingEList<AbstractTypeDeclaration>(AbstractTypeDeclaration.class, this, Java_graphPackage.TYPE_DECLARATION_STATEMENT__DECLARATION);
		}
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_graphPackage.TYPE_DECLARATION_STATEMENT__DECLARATION:
				return getDeclaration();
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
			case Java_graphPackage.TYPE_DECLARATION_STATEMENT__DECLARATION:
				getDeclaration().clear();
				getDeclaration().addAll((Collection<? extends AbstractTypeDeclaration>)newValue);
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
			case Java_graphPackage.TYPE_DECLARATION_STATEMENT__DECLARATION:
				getDeclaration().clear();
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
			case Java_graphPackage.TYPE_DECLARATION_STATEMENT__DECLARATION:
				return declaration != null && !declaration.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeDeclarationStatementImpl

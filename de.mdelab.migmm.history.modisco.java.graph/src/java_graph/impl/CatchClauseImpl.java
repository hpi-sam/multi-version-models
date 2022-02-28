/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.Block;
import java_graph.CatchClause;
import java_graph.Java_graphPackage;
import java_graph.SingleVariableDeclaration;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catch Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.CatchClauseImpl#getException <em>Exception</em>}</li>
 *   <li>{@link java_graph.impl.CatchClauseImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CatchClauseImpl extends StatementImpl implements CatchClause {
	/**
	 * The cached value of the '{@link #getException() <em>Exception</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleVariableDeclaration> exception;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<Block> body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatchClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getCatchClause();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SingleVariableDeclaration> getException() {
		if (exception == null) {
			exception = new EObjectWithInverseResolvingEList.ManyInverse<SingleVariableDeclaration>(SingleVariableDeclaration.class, this, Java_graphPackage.CATCH_CLAUSE__EXCEPTION, Java_graphPackage.SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE);
		}
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Block> getBody() {
		if (body == null) {
			body = new EObjectResolvingEList<Block>(Block.class, this, Java_graphPackage.CATCH_CLAUSE__BODY);
		}
		return body;
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
			case Java_graphPackage.CATCH_CLAUSE__EXCEPTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getException()).basicAdd(otherEnd, msgs);
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
			case Java_graphPackage.CATCH_CLAUSE__EXCEPTION:
				return ((InternalEList<?>)getException()).basicRemove(otherEnd, msgs);
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
			case Java_graphPackage.CATCH_CLAUSE__EXCEPTION:
				return getException();
			case Java_graphPackage.CATCH_CLAUSE__BODY:
				return getBody();
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
			case Java_graphPackage.CATCH_CLAUSE__EXCEPTION:
				getException().clear();
				getException().addAll((Collection<? extends SingleVariableDeclaration>)newValue);
				return;
			case Java_graphPackage.CATCH_CLAUSE__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends Block>)newValue);
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
			case Java_graphPackage.CATCH_CLAUSE__EXCEPTION:
				getException().clear();
				return;
			case Java_graphPackage.CATCH_CLAUSE__BODY:
				getBody().clear();
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
			case Java_graphPackage.CATCH_CLAUSE__EXCEPTION:
				return exception != null && !exception.isEmpty();
			case Java_graphPackage.CATCH_CLAUSE__BODY:
				return body != null && !body.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CatchClauseImpl

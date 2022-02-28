/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.Block;
import java_graph.CatchClause;
import java_graph.Java_graphPackage;
import java_graph.TryStatement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Try Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.TryStatementImpl#getBody <em>Body</em>}</li>
 *   <li>{@link java_graph.impl.TryStatementImpl#getFinally <em>Finally</em>}</li>
 *   <li>{@link java_graph.impl.TryStatementImpl#getCatchClauses <em>Catch Clauses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TryStatementImpl extends StatementImpl implements TryStatement {
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
	 * The cached value of the '{@link #getFinally() <em>Finally</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinally()
	 * @generated
	 * @ordered
	 */
	protected EList<Block> finally_;

	/**
	 * The cached value of the '{@link #getCatchClauses() <em>Catch Clauses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatchClauses()
	 * @generated
	 * @ordered
	 */
	protected EList<CatchClause> catchClauses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TryStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getTryStatement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Block> getBody() {
		if (body == null) {
			body = new EObjectResolvingEList<Block>(Block.class, this, Java_graphPackage.TRY_STATEMENT__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Block> getFinally() {
		if (finally_ == null) {
			finally_ = new EObjectResolvingEList<Block>(Block.class, this, Java_graphPackage.TRY_STATEMENT__FINALLY);
		}
		return finally_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CatchClause> getCatchClauses() {
		if (catchClauses == null) {
			catchClauses = new EObjectResolvingEList<CatchClause>(CatchClause.class, this, Java_graphPackage.TRY_STATEMENT__CATCH_CLAUSES);
		}
		return catchClauses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_graphPackage.TRY_STATEMENT__BODY:
				return getBody();
			case Java_graphPackage.TRY_STATEMENT__FINALLY:
				return getFinally();
			case Java_graphPackage.TRY_STATEMENT__CATCH_CLAUSES:
				return getCatchClauses();
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
			case Java_graphPackage.TRY_STATEMENT__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends Block>)newValue);
				return;
			case Java_graphPackage.TRY_STATEMENT__FINALLY:
				getFinally().clear();
				getFinally().addAll((Collection<? extends Block>)newValue);
				return;
			case Java_graphPackage.TRY_STATEMENT__CATCH_CLAUSES:
				getCatchClauses().clear();
				getCatchClauses().addAll((Collection<? extends CatchClause>)newValue);
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
			case Java_graphPackage.TRY_STATEMENT__BODY:
				getBody().clear();
				return;
			case Java_graphPackage.TRY_STATEMENT__FINALLY:
				getFinally().clear();
				return;
			case Java_graphPackage.TRY_STATEMENT__CATCH_CLAUSES:
				getCatchClauses().clear();
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
			case Java_graphPackage.TRY_STATEMENT__BODY:
				return body != null && !body.isEmpty();
			case Java_graphPackage.TRY_STATEMENT__FINALLY:
				return finally_ != null && !finally_.isEmpty();
			case Java_graphPackage.TRY_STATEMENT__CATCH_CLAUSES:
				return catchClauses != null && !catchClauses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TryStatementImpl

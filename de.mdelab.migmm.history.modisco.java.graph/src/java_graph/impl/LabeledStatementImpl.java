/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.BreakStatement;
import java_graph.ContinueStatement;
import java_graph.Java_graphPackage;
import java_graph.LabeledStatement;
import java_graph.Statement;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Labeled Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.LabeledStatementImpl#getBody <em>Body</em>}</li>
 *   <li>{@link java_graph.impl.LabeledStatementImpl#getUsagesInBreakStatements <em>Usages In Break Statements</em>}</li>
 *   <li>{@link java_graph.impl.LabeledStatementImpl#getUsagesInContinueStatements <em>Usages In Continue Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabeledStatementImpl extends NamedElementImpl implements LabeledStatement {
	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> body;

	/**
	 * The cached value of the '{@link #getUsagesInBreakStatements() <em>Usages In Break Statements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsagesInBreakStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<BreakStatement> usagesInBreakStatements;

	/**
	 * The cached value of the '{@link #getUsagesInContinueStatements() <em>Usages In Continue Statements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsagesInContinueStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<ContinueStatement> usagesInContinueStatements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabeledStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getLabeledStatement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Statement> getBody() {
		if (body == null) {
			body = new EObjectResolvingEList<Statement>(Statement.class, this, Java_graphPackage.LABELED_STATEMENT__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BreakStatement> getUsagesInBreakStatements() {
		if (usagesInBreakStatements == null) {
			usagesInBreakStatements = new EObjectWithInverseResolvingEList.ManyInverse<BreakStatement>(BreakStatement.class, this, Java_graphPackage.LABELED_STATEMENT__USAGES_IN_BREAK_STATEMENTS, Java_graphPackage.BREAK_STATEMENT__LABEL);
		}
		return usagesInBreakStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContinueStatement> getUsagesInContinueStatements() {
		if (usagesInContinueStatements == null) {
			usagesInContinueStatements = new EObjectWithInverseResolvingEList.ManyInverse<ContinueStatement>(ContinueStatement.class, this, Java_graphPackage.LABELED_STATEMENT__USAGES_IN_CONTINUE_STATEMENTS, Java_graphPackage.CONTINUE_STATEMENT__LABEL);
		}
		return usagesInContinueStatements;
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
			case Java_graphPackage.LABELED_STATEMENT__USAGES_IN_BREAK_STATEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsagesInBreakStatements()).basicAdd(otherEnd, msgs);
			case Java_graphPackage.LABELED_STATEMENT__USAGES_IN_CONTINUE_STATEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsagesInContinueStatements()).basicAdd(otherEnd, msgs);
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
			case Java_graphPackage.LABELED_STATEMENT__USAGES_IN_BREAK_STATEMENTS:
				return ((InternalEList<?>)getUsagesInBreakStatements()).basicRemove(otherEnd, msgs);
			case Java_graphPackage.LABELED_STATEMENT__USAGES_IN_CONTINUE_STATEMENTS:
				return ((InternalEList<?>)getUsagesInContinueStatements()).basicRemove(otherEnd, msgs);
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
			case Java_graphPackage.LABELED_STATEMENT__BODY:
				return getBody();
			case Java_graphPackage.LABELED_STATEMENT__USAGES_IN_BREAK_STATEMENTS:
				return getUsagesInBreakStatements();
			case Java_graphPackage.LABELED_STATEMENT__USAGES_IN_CONTINUE_STATEMENTS:
				return getUsagesInContinueStatements();
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
			case Java_graphPackage.LABELED_STATEMENT__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends Statement>)newValue);
				return;
			case Java_graphPackage.LABELED_STATEMENT__USAGES_IN_BREAK_STATEMENTS:
				getUsagesInBreakStatements().clear();
				getUsagesInBreakStatements().addAll((Collection<? extends BreakStatement>)newValue);
				return;
			case Java_graphPackage.LABELED_STATEMENT__USAGES_IN_CONTINUE_STATEMENTS:
				getUsagesInContinueStatements().clear();
				getUsagesInContinueStatements().addAll((Collection<? extends ContinueStatement>)newValue);
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
			case Java_graphPackage.LABELED_STATEMENT__BODY:
				getBody().clear();
				return;
			case Java_graphPackage.LABELED_STATEMENT__USAGES_IN_BREAK_STATEMENTS:
				getUsagesInBreakStatements().clear();
				return;
			case Java_graphPackage.LABELED_STATEMENT__USAGES_IN_CONTINUE_STATEMENTS:
				getUsagesInContinueStatements().clear();
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
			case Java_graphPackage.LABELED_STATEMENT__BODY:
				return body != null && !body.isEmpty();
			case Java_graphPackage.LABELED_STATEMENT__USAGES_IN_BREAK_STATEMENTS:
				return usagesInBreakStatements != null && !usagesInBreakStatements.isEmpty();
			case Java_graphPackage.LABELED_STATEMENT__USAGES_IN_CONTINUE_STATEMENTS:
				return usagesInContinueStatements != null && !usagesInContinueStatements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LabeledStatementImpl

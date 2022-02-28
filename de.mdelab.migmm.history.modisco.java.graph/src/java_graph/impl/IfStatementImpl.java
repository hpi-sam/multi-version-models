/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.Expression;
import java_graph.IfStatement;
import java_graph.Java_graphPackage;
import java_graph.Statement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.IfStatementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link java_graph.impl.IfStatementImpl#getThenStatement <em>Then Statement</em>}</li>
 *   <li>{@link java_graph.impl.IfStatementImpl#getElseStatement <em>Else Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfStatementImpl extends StatementImpl implements IfStatement {
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> expression;

	/**
	 * The cached value of the '{@link #getThenStatement() <em>Then Statement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> thenStatement;

	/**
	 * The cached value of the '{@link #getElseStatement() <em>Else Statement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> elseStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getIfStatement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getExpression() {
		if (expression == null) {
			expression = new EObjectResolvingEList<Expression>(Expression.class, this, Java_graphPackage.IF_STATEMENT__EXPRESSION);
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Statement> getThenStatement() {
		if (thenStatement == null) {
			thenStatement = new EObjectResolvingEList<Statement>(Statement.class, this, Java_graphPackage.IF_STATEMENT__THEN_STATEMENT);
		}
		return thenStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Statement> getElseStatement() {
		if (elseStatement == null) {
			elseStatement = new EObjectResolvingEList<Statement>(Statement.class, this, Java_graphPackage.IF_STATEMENT__ELSE_STATEMENT);
		}
		return elseStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_graphPackage.IF_STATEMENT__EXPRESSION:
				return getExpression();
			case Java_graphPackage.IF_STATEMENT__THEN_STATEMENT:
				return getThenStatement();
			case Java_graphPackage.IF_STATEMENT__ELSE_STATEMENT:
				return getElseStatement();
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
			case Java_graphPackage.IF_STATEMENT__EXPRESSION:
				getExpression().clear();
				getExpression().addAll((Collection<? extends Expression>)newValue);
				return;
			case Java_graphPackage.IF_STATEMENT__THEN_STATEMENT:
				getThenStatement().clear();
				getThenStatement().addAll((Collection<? extends Statement>)newValue);
				return;
			case Java_graphPackage.IF_STATEMENT__ELSE_STATEMENT:
				getElseStatement().clear();
				getElseStatement().addAll((Collection<? extends Statement>)newValue);
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
			case Java_graphPackage.IF_STATEMENT__EXPRESSION:
				getExpression().clear();
				return;
			case Java_graphPackage.IF_STATEMENT__THEN_STATEMENT:
				getThenStatement().clear();
				return;
			case Java_graphPackage.IF_STATEMENT__ELSE_STATEMENT:
				getElseStatement().clear();
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
			case Java_graphPackage.IF_STATEMENT__EXPRESSION:
				return expression != null && !expression.isEmpty();
			case Java_graphPackage.IF_STATEMENT__THEN_STATEMENT:
				return thenStatement != null && !thenStatement.isEmpty();
			case Java_graphPackage.IF_STATEMENT__ELSE_STATEMENT:
				return elseStatement != null && !elseStatement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfStatementImpl

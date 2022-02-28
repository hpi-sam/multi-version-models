/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.Expression;
import java_graph.Java_graphPackage;
import java_graph.PostfixExpression;
import java_graph.PostfixExpressionKind;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postfix Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.PostfixExpressionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link java_graph.impl.PostfixExpressionImpl#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostfixExpressionImpl extends ExpressionImpl implements PostfixExpression {
	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected EList<PostfixExpressionKind> operator;

	/**
	 * The cached value of the '{@link #getOperand() <em>Operand</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> operand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostfixExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getPostfixExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PostfixExpressionKind> getOperator() {
		if (operator == null) {
			operator = new EDataTypeEList<PostfixExpressionKind>(PostfixExpressionKind.class, this, Java_graphPackage.POSTFIX_EXPRESSION__OPERATOR);
		}
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getOperand() {
		if (operand == null) {
			operand = new EObjectResolvingEList<Expression>(Expression.class, this, Java_graphPackage.POSTFIX_EXPRESSION__OPERAND);
		}
		return operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_graphPackage.POSTFIX_EXPRESSION__OPERATOR:
				return getOperator();
			case Java_graphPackage.POSTFIX_EXPRESSION__OPERAND:
				return getOperand();
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
			case Java_graphPackage.POSTFIX_EXPRESSION__OPERATOR:
				getOperator().clear();
				getOperator().addAll((Collection<? extends PostfixExpressionKind>)newValue);
				return;
			case Java_graphPackage.POSTFIX_EXPRESSION__OPERAND:
				getOperand().clear();
				getOperand().addAll((Collection<? extends Expression>)newValue);
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
			case Java_graphPackage.POSTFIX_EXPRESSION__OPERATOR:
				getOperator().clear();
				return;
			case Java_graphPackage.POSTFIX_EXPRESSION__OPERAND:
				getOperand().clear();
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
			case Java_graphPackage.POSTFIX_EXPRESSION__OPERATOR:
				return operator != null && !operator.isEmpty();
			case Java_graphPackage.POSTFIX_EXPRESSION__OPERAND:
				return operand != null && !operand.isEmpty();
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //PostfixExpressionImpl

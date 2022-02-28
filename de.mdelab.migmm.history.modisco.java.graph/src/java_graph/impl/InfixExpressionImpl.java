/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.Expression;
import java_graph.InfixExpression;
import java_graph.InfixExpressionKind;
import java_graph.Java_graphPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infix Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.InfixExpressionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link java_graph.impl.InfixExpressionImpl#getRightOperand <em>Right Operand</em>}</li>
 *   <li>{@link java_graph.impl.InfixExpressionImpl#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link java_graph.impl.InfixExpressionImpl#getExtendedOperands <em>Extended Operands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfixExpressionImpl extends ExpressionImpl implements InfixExpression {
	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected EList<InfixExpressionKind> operator;

	/**
	 * The cached value of the '{@link #getRightOperand() <em>Right Operand</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightOperand()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> rightOperand;

	/**
	 * The cached value of the '{@link #getLeftOperand() <em>Left Operand</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftOperand()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> leftOperand;

	/**
	 * The cached value of the '{@link #getExtendedOperands() <em>Extended Operands</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedOperands()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> extendedOperands;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfixExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getInfixExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InfixExpressionKind> getOperator() {
		if (operator == null) {
			operator = new EDataTypeEList<InfixExpressionKind>(InfixExpressionKind.class, this, Java_graphPackage.INFIX_EXPRESSION__OPERATOR);
		}
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getRightOperand() {
		if (rightOperand == null) {
			rightOperand = new EObjectResolvingEList<Expression>(Expression.class, this, Java_graphPackage.INFIX_EXPRESSION__RIGHT_OPERAND);
		}
		return rightOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getLeftOperand() {
		if (leftOperand == null) {
			leftOperand = new EObjectResolvingEList<Expression>(Expression.class, this, Java_graphPackage.INFIX_EXPRESSION__LEFT_OPERAND);
		}
		return leftOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getExtendedOperands() {
		if (extendedOperands == null) {
			extendedOperands = new EObjectResolvingEList<Expression>(Expression.class, this, Java_graphPackage.INFIX_EXPRESSION__EXTENDED_OPERANDS);
		}
		return extendedOperands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_graphPackage.INFIX_EXPRESSION__OPERATOR:
				return getOperator();
			case Java_graphPackage.INFIX_EXPRESSION__RIGHT_OPERAND:
				return getRightOperand();
			case Java_graphPackage.INFIX_EXPRESSION__LEFT_OPERAND:
				return getLeftOperand();
			case Java_graphPackage.INFIX_EXPRESSION__EXTENDED_OPERANDS:
				return getExtendedOperands();
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
			case Java_graphPackage.INFIX_EXPRESSION__OPERATOR:
				getOperator().clear();
				getOperator().addAll((Collection<? extends InfixExpressionKind>)newValue);
				return;
			case Java_graphPackage.INFIX_EXPRESSION__RIGHT_OPERAND:
				getRightOperand().clear();
				getRightOperand().addAll((Collection<? extends Expression>)newValue);
				return;
			case Java_graphPackage.INFIX_EXPRESSION__LEFT_OPERAND:
				getLeftOperand().clear();
				getLeftOperand().addAll((Collection<? extends Expression>)newValue);
				return;
			case Java_graphPackage.INFIX_EXPRESSION__EXTENDED_OPERANDS:
				getExtendedOperands().clear();
				getExtendedOperands().addAll((Collection<? extends Expression>)newValue);
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
			case Java_graphPackage.INFIX_EXPRESSION__OPERATOR:
				getOperator().clear();
				return;
			case Java_graphPackage.INFIX_EXPRESSION__RIGHT_OPERAND:
				getRightOperand().clear();
				return;
			case Java_graphPackage.INFIX_EXPRESSION__LEFT_OPERAND:
				getLeftOperand().clear();
				return;
			case Java_graphPackage.INFIX_EXPRESSION__EXTENDED_OPERANDS:
				getExtendedOperands().clear();
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
			case Java_graphPackage.INFIX_EXPRESSION__OPERATOR:
				return operator != null && !operator.isEmpty();
			case Java_graphPackage.INFIX_EXPRESSION__RIGHT_OPERAND:
				return rightOperand != null && !rightOperand.isEmpty();
			case Java_graphPackage.INFIX_EXPRESSION__LEFT_OPERAND:
				return leftOperand != null && !leftOperand.isEmpty();
			case Java_graphPackage.INFIX_EXPRESSION__EXTENDED_OPERANDS:
				return extendedOperands != null && !extendedOperands.isEmpty();
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

} //InfixExpressionImpl

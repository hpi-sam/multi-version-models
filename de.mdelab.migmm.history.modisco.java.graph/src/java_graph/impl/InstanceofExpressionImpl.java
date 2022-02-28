/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.Expression;
import java_graph.InstanceofExpression;
import java_graph.Java_graphPackage;
import java_graph.TypeAccess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instanceof Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.InstanceofExpressionImpl#getRightOperand <em>Right Operand</em>}</li>
 *   <li>{@link java_graph.impl.InstanceofExpressionImpl#getLeftOperand <em>Left Operand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceofExpressionImpl extends ExpressionImpl implements InstanceofExpression {
	/**
	 * The cached value of the '{@link #getRightOperand() <em>Right Operand</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightOperand()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAccess> rightOperand;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceofExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getInstanceofExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeAccess> getRightOperand() {
		if (rightOperand == null) {
			rightOperand = new EObjectResolvingEList<TypeAccess>(TypeAccess.class, this, Java_graphPackage.INSTANCEOF_EXPRESSION__RIGHT_OPERAND);
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
			leftOperand = new EObjectResolvingEList<Expression>(Expression.class, this, Java_graphPackage.INSTANCEOF_EXPRESSION__LEFT_OPERAND);
		}
		return leftOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_graphPackage.INSTANCEOF_EXPRESSION__RIGHT_OPERAND:
				return getRightOperand();
			case Java_graphPackage.INSTANCEOF_EXPRESSION__LEFT_OPERAND:
				return getLeftOperand();
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
			case Java_graphPackage.INSTANCEOF_EXPRESSION__RIGHT_OPERAND:
				getRightOperand().clear();
				getRightOperand().addAll((Collection<? extends TypeAccess>)newValue);
				return;
			case Java_graphPackage.INSTANCEOF_EXPRESSION__LEFT_OPERAND:
				getLeftOperand().clear();
				getLeftOperand().addAll((Collection<? extends Expression>)newValue);
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
			case Java_graphPackage.INSTANCEOF_EXPRESSION__RIGHT_OPERAND:
				getRightOperand().clear();
				return;
			case Java_graphPackage.INSTANCEOF_EXPRESSION__LEFT_OPERAND:
				getLeftOperand().clear();
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
			case Java_graphPackage.INSTANCEOF_EXPRESSION__RIGHT_OPERAND:
				return rightOperand != null && !rightOperand.isEmpty();
			case Java_graphPackage.INSTANCEOF_EXPRESSION__LEFT_OPERAND:
				return leftOperand != null && !leftOperand.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InstanceofExpressionImpl

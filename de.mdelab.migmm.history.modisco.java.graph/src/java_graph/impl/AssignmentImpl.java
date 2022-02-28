/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.Assignment;
import java_graph.AssignmentKind;
import java_graph.Expression;
import java_graph.Java_graphPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.AssignmentImpl#getLeftHandSide <em>Left Hand Side</em>}</li>
 *   <li>{@link java_graph.impl.AssignmentImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link java_graph.impl.AssignmentImpl#getRightHandSide <em>Right Hand Side</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentImpl extends ExpressionImpl implements Assignment {
	/**
	 * The cached value of the '{@link #getLeftHandSide() <em>Left Hand Side</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftHandSide()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> leftHandSide;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected EList<AssignmentKind> operator;

	/**
	 * The cached value of the '{@link #getRightHandSide() <em>Right Hand Side</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightHandSide()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> rightHandSide;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getAssignment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getLeftHandSide() {
		if (leftHandSide == null) {
			leftHandSide = new EObjectResolvingEList<Expression>(Expression.class, this, Java_graphPackage.ASSIGNMENT__LEFT_HAND_SIDE);
		}
		return leftHandSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssignmentKind> getOperator() {
		if (operator == null) {
			operator = new EDataTypeEList<AssignmentKind>(AssignmentKind.class, this, Java_graphPackage.ASSIGNMENT__OPERATOR);
		}
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getRightHandSide() {
		if (rightHandSide == null) {
			rightHandSide = new EObjectResolvingEList<Expression>(Expression.class, this, Java_graphPackage.ASSIGNMENT__RIGHT_HAND_SIDE);
		}
		return rightHandSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_graphPackage.ASSIGNMENT__LEFT_HAND_SIDE:
				return getLeftHandSide();
			case Java_graphPackage.ASSIGNMENT__OPERATOR:
				return getOperator();
			case Java_graphPackage.ASSIGNMENT__RIGHT_HAND_SIDE:
				return getRightHandSide();
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
			case Java_graphPackage.ASSIGNMENT__LEFT_HAND_SIDE:
				getLeftHandSide().clear();
				getLeftHandSide().addAll((Collection<? extends Expression>)newValue);
				return;
			case Java_graphPackage.ASSIGNMENT__OPERATOR:
				getOperator().clear();
				getOperator().addAll((Collection<? extends AssignmentKind>)newValue);
				return;
			case Java_graphPackage.ASSIGNMENT__RIGHT_HAND_SIDE:
				getRightHandSide().clear();
				getRightHandSide().addAll((Collection<? extends Expression>)newValue);
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
			case Java_graphPackage.ASSIGNMENT__LEFT_HAND_SIDE:
				getLeftHandSide().clear();
				return;
			case Java_graphPackage.ASSIGNMENT__OPERATOR:
				getOperator().clear();
				return;
			case Java_graphPackage.ASSIGNMENT__RIGHT_HAND_SIDE:
				getRightHandSide().clear();
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
			case Java_graphPackage.ASSIGNMENT__LEFT_HAND_SIDE:
				return leftHandSide != null && !leftHandSide.isEmpty();
			case Java_graphPackage.ASSIGNMENT__OPERATOR:
				return operator != null && !operator.isEmpty();
			case Java_graphPackage.ASSIGNMENT__RIGHT_HAND_SIDE:
				return rightHandSide != null && !rightHandSide.isEmpty();
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

} //AssignmentImpl

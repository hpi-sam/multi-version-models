/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.ArrayCreation;
import java_graph.ArrayInitializer;
import java_graph.Expression;
import java_graph.Java_graphPackage;
import java_graph.TypeAccess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Creation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.ArrayCreationImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link java_graph.impl.ArrayCreationImpl#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link java_graph.impl.ArrayCreationImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayCreationImpl extends ExpressionImpl implements ArrayCreation {
	/**
	 * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> dimensions;

	/**
	 * The cached value of the '{@link #getInitializer() <em>Initializer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializer()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrayInitializer> initializer;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAccess> type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayCreationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getArrayCreation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getDimensions() {
		if (dimensions == null) {
			dimensions = new EObjectResolvingEList<Expression>(Expression.class, this, Java_graphPackage.ARRAY_CREATION__DIMENSIONS);
		}
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArrayInitializer> getInitializer() {
		if (initializer == null) {
			initializer = new EObjectResolvingEList<ArrayInitializer>(ArrayInitializer.class, this, Java_graphPackage.ARRAY_CREATION__INITIALIZER);
		}
		return initializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeAccess> getType() {
		if (type == null) {
			type = new EObjectResolvingEList<TypeAccess>(TypeAccess.class, this, Java_graphPackage.ARRAY_CREATION__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_graphPackage.ARRAY_CREATION__DIMENSIONS:
				return getDimensions();
			case Java_graphPackage.ARRAY_CREATION__INITIALIZER:
				return getInitializer();
			case Java_graphPackage.ARRAY_CREATION__TYPE:
				return getType();
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
			case Java_graphPackage.ARRAY_CREATION__DIMENSIONS:
				getDimensions().clear();
				getDimensions().addAll((Collection<? extends Expression>)newValue);
				return;
			case Java_graphPackage.ARRAY_CREATION__INITIALIZER:
				getInitializer().clear();
				getInitializer().addAll((Collection<? extends ArrayInitializer>)newValue);
				return;
			case Java_graphPackage.ARRAY_CREATION__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends TypeAccess>)newValue);
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
			case Java_graphPackage.ARRAY_CREATION__DIMENSIONS:
				getDimensions().clear();
				return;
			case Java_graphPackage.ARRAY_CREATION__INITIALIZER:
				getInitializer().clear();
				return;
			case Java_graphPackage.ARRAY_CREATION__TYPE:
				getType().clear();
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
			case Java_graphPackage.ARRAY_CREATION__DIMENSIONS:
				return dimensions != null && !dimensions.isEmpty();
			case Java_graphPackage.ARRAY_CREATION__INITIALIZER:
				return initializer != null && !initializer.isEmpty();
			case Java_graphPackage.ARRAY_CREATION__TYPE:
				return type != null && !type.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArrayCreationImpl

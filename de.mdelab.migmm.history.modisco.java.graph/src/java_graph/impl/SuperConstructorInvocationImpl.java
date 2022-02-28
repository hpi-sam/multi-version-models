/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.AbstractMethodDeclaration;
import java_graph.AbstractMethodInvocation;
import java_graph.Expression;
import java_graph.Java_graphPackage;
import java_graph.SuperConstructorInvocation;
import java_graph.TypeAccess;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Super Constructor Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.SuperConstructorInvocationImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link java_graph.impl.SuperConstructorInvocationImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link java_graph.impl.SuperConstructorInvocationImpl#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link java_graph.impl.SuperConstructorInvocationImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuperConstructorInvocationImpl extends StatementImpl implements SuperConstructorInvocation {
	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractMethodDeclaration> method;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> arguments;

	/**
	 * The cached value of the '{@link #getTypeArguments() <em>Type Arguments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAccess> typeArguments;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperConstructorInvocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getSuperConstructorInvocation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractMethodDeclaration> getMethod() {
		if (method == null) {
			method = new EObjectWithInverseResolvingEList.ManyInverse<AbstractMethodDeclaration>(AbstractMethodDeclaration.class, this, Java_graphPackage.SUPER_CONSTRUCTOR_INVOCATION__METHOD, Java_graphPackage.ABSTRACT_METHOD_DECLARATION__USAGES);
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getArguments() {
		if (arguments == null) {
			arguments = new EObjectResolvingEList<Expression>(Expression.class, this, Java_graphPackage.SUPER_CONSTRUCTOR_INVOCATION__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeAccess> getTypeArguments() {
		if (typeArguments == null) {
			typeArguments = new EObjectResolvingEList<TypeAccess>(TypeAccess.class, this, Java_graphPackage.SUPER_CONSTRUCTOR_INVOCATION__TYPE_ARGUMENTS);
		}
		return typeArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getExpression() {
		if (expression == null) {
			expression = new EObjectResolvingEList<Expression>(Expression.class, this, Java_graphPackage.SUPER_CONSTRUCTOR_INVOCATION__EXPRESSION);
		}
		return expression;
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
			case Java_graphPackage.SUPER_CONSTRUCTOR_INVOCATION__METHOD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethod()).basicAdd(otherEnd, msgs);
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
			case Java_graphPackage.SUPER_CONSTRUCTOR_INVOCATION__METHOD:
				return ((InternalEList<?>)getMethod()).basicRemove(otherEnd, msgs);
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
			case Java_graphPackage.SUPER_CONSTRUCTOR_INVOCATION__METHOD:
				return getMethod();
			case Java_graphPackage.SUPER_CONSTRUCTOR_INVOCATION__ARGUMENTS:
				return getArguments();
			case Java_graphPackage.SUPER_CONSTRUCTOR_INVOCATION__TYPE_ARGUMENTS:
				return getTypeArguments();
			case Java_graphPackage.SUPER_CONSTRUCTOR_INVOCATION__EXPRESSION:
				return getExpression();
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
			case Java_graphPackage.SUPER_CONSTRUCTOR_INVOCATION__METHOD:
				getMethod().clear();
				getMethod().addAll((Collection<? extends AbstractMethodDeclaration>)newValue);
				return;
			case Java_graphPackage.SUPER_CONSTRUCTOR_INVOCATION__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Expression>)newValue);
				return;
			case Java_graphPackage.SUPER_CONSTRUCTOR_INVOCATION__TYPE_ARGUMENTS:
				getTypeArguments().clear();
				getTypeArguments().addAll((Collection<? extends TypeAccess>)newValue);
				return;
			case Java_graphPackage.SUPER_CONSTRUCTOR_INVOCATION__EXPRESSION:
				getExpression().clear();
				getExpression().addAll((Collection<? extends Expression>)newValue);
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
			case Java_graphPackage.SUPER_CONSTRUCTOR_INVOCATION__METHOD:
				getMethod().clear();
				return;
			case Java_graphPackage.SUPER_CONSTRUCTOR_INVOCATION__ARGUMENTS:
				getArguments().clear();
				return;
			case Java_graphPackage.SUPER_CONSTRUCTOR_INVOCATION__TYPE_ARGUMENTS:
				getTypeArguments().clear();
				return;
			case Java_graphPackage.SUPER_CONSTRUCTOR_INVOCATION__EXPRESSION:
				getExpression().clear();
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
			case Java_graphPackage.SUPER_CONSTRUCTOR_INVOCATION__METHOD:
				return method != null && !method.isEmpty();
			case Java_graphPackage.SUPER_CONSTRUCTOR_INVOCATION__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case Java_graphPackage.SUPER_CONSTRUCTOR_INVOCATION__TYPE_ARGUMENTS:
				return typeArguments != null && !typeArguments.isEmpty();
			case Java_graphPackage.SUPER_CONSTRUCTOR_INVOCATION__EXPRESSION:
				return expression != null && !expression.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractMethodInvocation.class) {
			switch (derivedFeatureID) {
				case Java_graphPackage.SUPER_CONSTRUCTOR_INVOCATION__METHOD: return Java_graphPackage.ABSTRACT_METHOD_INVOCATION__METHOD;
				case Java_graphPackage.SUPER_CONSTRUCTOR_INVOCATION__ARGUMENTS: return Java_graphPackage.ABSTRACT_METHOD_INVOCATION__ARGUMENTS;
				case Java_graphPackage.SUPER_CONSTRUCTOR_INVOCATION__TYPE_ARGUMENTS: return Java_graphPackage.ABSTRACT_METHOD_INVOCATION__TYPE_ARGUMENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractMethodInvocation.class) {
			switch (baseFeatureID) {
				case Java_graphPackage.ABSTRACT_METHOD_INVOCATION__METHOD: return Java_graphPackage.SUPER_CONSTRUCTOR_INVOCATION__METHOD;
				case Java_graphPackage.ABSTRACT_METHOD_INVOCATION__ARGUMENTS: return Java_graphPackage.SUPER_CONSTRUCTOR_INVOCATION__ARGUMENTS;
				case Java_graphPackage.ABSTRACT_METHOD_INVOCATION__TYPE_ARGUMENTS: return Java_graphPackage.SUPER_CONSTRUCTOR_INVOCATION__TYPE_ARGUMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SuperConstructorInvocationImpl

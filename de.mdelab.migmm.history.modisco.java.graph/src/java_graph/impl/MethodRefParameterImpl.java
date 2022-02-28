/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.Java_graphPackage;
import java_graph.MethodRefParameter;
import java_graph.TypeAccess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Ref Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.MethodRefParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link java_graph.impl.MethodRefParameterImpl#getVarargs <em>Varargs</em>}</li>
 *   <li>{@link java_graph.impl.MethodRefParameterImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodRefParameterImpl extends ASTNodeImpl implements MethodRefParameter {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> name;

	/**
	 * The cached value of the '{@link #getVarargs() <em>Varargs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarargs()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> varargs;

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
	protected MethodRefParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getMethodRefParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getName() {
		if (name == null) {
			name = new EDataTypeEList<String>(String.class, this, Java_graphPackage.METHOD_REF_PARAMETER__NAME);
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Boolean> getVarargs() {
		if (varargs == null) {
			varargs = new EDataTypeEList<Boolean>(Boolean.class, this, Java_graphPackage.METHOD_REF_PARAMETER__VARARGS);
		}
		return varargs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeAccess> getType() {
		if (type == null) {
			type = new EObjectResolvingEList<TypeAccess>(TypeAccess.class, this, Java_graphPackage.METHOD_REF_PARAMETER__TYPE);
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
			case Java_graphPackage.METHOD_REF_PARAMETER__NAME:
				return getName();
			case Java_graphPackage.METHOD_REF_PARAMETER__VARARGS:
				return getVarargs();
			case Java_graphPackage.METHOD_REF_PARAMETER__TYPE:
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
			case Java_graphPackage.METHOD_REF_PARAMETER__NAME:
				getName().clear();
				getName().addAll((Collection<? extends String>)newValue);
				return;
			case Java_graphPackage.METHOD_REF_PARAMETER__VARARGS:
				getVarargs().clear();
				getVarargs().addAll((Collection<? extends Boolean>)newValue);
				return;
			case Java_graphPackage.METHOD_REF_PARAMETER__TYPE:
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
			case Java_graphPackage.METHOD_REF_PARAMETER__NAME:
				getName().clear();
				return;
			case Java_graphPackage.METHOD_REF_PARAMETER__VARARGS:
				getVarargs().clear();
				return;
			case Java_graphPackage.METHOD_REF_PARAMETER__TYPE:
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
			case Java_graphPackage.METHOD_REF_PARAMETER__NAME:
				return name != null && !name.isEmpty();
			case Java_graphPackage.METHOD_REF_PARAMETER__VARARGS:
				return varargs != null && !varargs.isEmpty();
			case Java_graphPackage.METHOD_REF_PARAMETER__TYPE:
				return type != null && !type.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", varargs: ");
		result.append(varargs);
		result.append(')');
		return result.toString();
	}

} //MethodRefParameterImpl

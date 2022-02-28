/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.AbstractMethodDeclaration;
import java_graph.Annotation;
import java_graph.CatchClause;
import java_graph.EnhancedForStatement;
import java_graph.Java_graphPackage;
import java_graph.Modifier;
import java_graph.SingleVariableDeclaration;
import java_graph.TypeAccess;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.SingleVariableDeclarationImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link java_graph.impl.SingleVariableDeclarationImpl#getVarargs <em>Varargs</em>}</li>
 *   <li>{@link java_graph.impl.SingleVariableDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link java_graph.impl.SingleVariableDeclarationImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link java_graph.impl.SingleVariableDeclarationImpl#getMethodDeclaration <em>Method Declaration</em>}</li>
 *   <li>{@link java_graph.impl.SingleVariableDeclarationImpl#getCatchClause <em>Catch Clause</em>}</li>
 *   <li>{@link java_graph.impl.SingleVariableDeclarationImpl#getEnhancedForStatement <em>Enhanced For Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleVariableDeclarationImpl extends VariableDeclarationImpl implements SingleVariableDeclaration {
	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Modifier> modifier;

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
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotations;

	/**
	 * The cached value of the '{@link #getMethodDeclaration() <em>Method Declaration</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractMethodDeclaration> methodDeclaration;

	/**
	 * The cached value of the '{@link #getCatchClause() <em>Catch Clause</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatchClause()
	 * @generated
	 * @ordered
	 */
	protected EList<CatchClause> catchClause;

	/**
	 * The cached value of the '{@link #getEnhancedForStatement() <em>Enhanced For Statement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnhancedForStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<EnhancedForStatement> enhancedForStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleVariableDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getSingleVariableDeclaration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Modifier> getModifier() {
		if (modifier == null) {
			modifier = new EObjectWithInverseResolvingEList.ManyInverse<Modifier>(Modifier.class, this, Java_graphPackage.SINGLE_VARIABLE_DECLARATION__MODIFIER, Java_graphPackage.MODIFIER__SINGLE_VARIABLE_DECLARATION);
		}
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Boolean> getVarargs() {
		if (varargs == null) {
			varargs = new EDataTypeEList<Boolean>(Boolean.class, this, Java_graphPackage.SINGLE_VARIABLE_DECLARATION__VARARGS);
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
			type = new EObjectResolvingEList<TypeAccess>(TypeAccess.class, this, Java_graphPackage.SINGLE_VARIABLE_DECLARATION__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectResolvingEList<Annotation>(Annotation.class, this, Java_graphPackage.SINGLE_VARIABLE_DECLARATION__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractMethodDeclaration> getMethodDeclaration() {
		if (methodDeclaration == null) {
			methodDeclaration = new EObjectWithInverseResolvingEList.ManyInverse<AbstractMethodDeclaration>(AbstractMethodDeclaration.class, this, Java_graphPackage.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION, Java_graphPackage.ABSTRACT_METHOD_DECLARATION__PARAMETERS);
		}
		return methodDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CatchClause> getCatchClause() {
		if (catchClause == null) {
			catchClause = new EObjectWithInverseResolvingEList.ManyInverse<CatchClause>(CatchClause.class, this, Java_graphPackage.SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE, Java_graphPackage.CATCH_CLAUSE__EXCEPTION);
		}
		return catchClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnhancedForStatement> getEnhancedForStatement() {
		if (enhancedForStatement == null) {
			enhancedForStatement = new EObjectWithInverseResolvingEList.ManyInverse<EnhancedForStatement>(EnhancedForStatement.class, this, Java_graphPackage.SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT, Java_graphPackage.ENHANCED_FOR_STATEMENT__PARAMETER);
		}
		return enhancedForStatement;
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
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__MODIFIER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModifier()).basicAdd(otherEnd, msgs);
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethodDeclaration()).basicAdd(otherEnd, msgs);
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCatchClause()).basicAdd(otherEnd, msgs);
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnhancedForStatement()).basicAdd(otherEnd, msgs);
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
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__MODIFIER:
				return ((InternalEList<?>)getModifier()).basicRemove(otherEnd, msgs);
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION:
				return ((InternalEList<?>)getMethodDeclaration()).basicRemove(otherEnd, msgs);
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE:
				return ((InternalEList<?>)getCatchClause()).basicRemove(otherEnd, msgs);
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT:
				return ((InternalEList<?>)getEnhancedForStatement()).basicRemove(otherEnd, msgs);
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
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__MODIFIER:
				return getModifier();
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__VARARGS:
				return getVarargs();
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__TYPE:
				return getType();
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__ANNOTATIONS:
				return getAnnotations();
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION:
				return getMethodDeclaration();
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE:
				return getCatchClause();
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT:
				return getEnhancedForStatement();
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
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__MODIFIER:
				getModifier().clear();
				getModifier().addAll((Collection<? extends Modifier>)newValue);
				return;
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__VARARGS:
				getVarargs().clear();
				getVarargs().addAll((Collection<? extends Boolean>)newValue);
				return;
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends TypeAccess>)newValue);
				return;
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION:
				getMethodDeclaration().clear();
				getMethodDeclaration().addAll((Collection<? extends AbstractMethodDeclaration>)newValue);
				return;
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE:
				getCatchClause().clear();
				getCatchClause().addAll((Collection<? extends CatchClause>)newValue);
				return;
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT:
				getEnhancedForStatement().clear();
				getEnhancedForStatement().addAll((Collection<? extends EnhancedForStatement>)newValue);
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
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__MODIFIER:
				getModifier().clear();
				return;
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__VARARGS:
				getVarargs().clear();
				return;
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__TYPE:
				getType().clear();
				return;
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION:
				getMethodDeclaration().clear();
				return;
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE:
				getCatchClause().clear();
				return;
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT:
				getEnhancedForStatement().clear();
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
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__MODIFIER:
				return modifier != null && !modifier.isEmpty();
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__VARARGS:
				return varargs != null && !varargs.isEmpty();
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__TYPE:
				return type != null && !type.isEmpty();
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION:
				return methodDeclaration != null && !methodDeclaration.isEmpty();
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE:
				return catchClause != null && !catchClause.isEmpty();
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT:
				return enhancedForStatement != null && !enhancedForStatement.isEmpty();
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
		result.append(" (varargs: ");
		result.append(varargs);
		result.append(')');
		return result.toString();
	}

} //SingleVariableDeclarationImpl

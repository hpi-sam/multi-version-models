/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.AbstractVariablesContainer;
import java_graph.Annotation;
import java_graph.Java_graphPackage;
import java_graph.Modifier;
import java_graph.TypeAccess;
import java_graph.VariableDeclarationExpression;
import java_graph.VariableDeclarationFragment;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.VariableDeclarationExpressionImpl#getType <em>Type</em>}</li>
 *   <li>{@link java_graph.impl.VariableDeclarationExpressionImpl#getFragments <em>Fragments</em>}</li>
 *   <li>{@link java_graph.impl.VariableDeclarationExpressionImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link java_graph.impl.VariableDeclarationExpressionImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableDeclarationExpressionImpl extends ExpressionImpl implements VariableDeclarationExpression {
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
	 * The cached value of the '{@link #getFragments() <em>Fragments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragments()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDeclarationFragment> fragments;

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
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclarationExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getVariableDeclarationExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeAccess> getType() {
		if (type == null) {
			type = new EObjectResolvingEList<TypeAccess>(TypeAccess.class, this, Java_graphPackage.VARIABLE_DECLARATION_EXPRESSION__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VariableDeclarationFragment> getFragments() {
		if (fragments == null) {
			fragments = new EObjectWithInverseResolvingEList.ManyInverse<VariableDeclarationFragment>(VariableDeclarationFragment.class, this, Java_graphPackage.VARIABLE_DECLARATION_EXPRESSION__FRAGMENTS, Java_graphPackage.VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER);
		}
		return fragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Modifier> getModifier() {
		if (modifier == null) {
			modifier = new EObjectWithInverseResolvingEList.ManyInverse<Modifier>(Modifier.class, this, Java_graphPackage.VARIABLE_DECLARATION_EXPRESSION__MODIFIER, Java_graphPackage.MODIFIER__VARIABLE_DECLARATION_EXPRESSION);
		}
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectResolvingEList<Annotation>(Annotation.class, this, Java_graphPackage.VARIABLE_DECLARATION_EXPRESSION__ANNOTATIONS);
		}
		return annotations;
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
			case Java_graphPackage.VARIABLE_DECLARATION_EXPRESSION__FRAGMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFragments()).basicAdd(otherEnd, msgs);
			case Java_graphPackage.VARIABLE_DECLARATION_EXPRESSION__MODIFIER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModifier()).basicAdd(otherEnd, msgs);
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
			case Java_graphPackage.VARIABLE_DECLARATION_EXPRESSION__FRAGMENTS:
				return ((InternalEList<?>)getFragments()).basicRemove(otherEnd, msgs);
			case Java_graphPackage.VARIABLE_DECLARATION_EXPRESSION__MODIFIER:
				return ((InternalEList<?>)getModifier()).basicRemove(otherEnd, msgs);
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
			case Java_graphPackage.VARIABLE_DECLARATION_EXPRESSION__TYPE:
				return getType();
			case Java_graphPackage.VARIABLE_DECLARATION_EXPRESSION__FRAGMENTS:
				return getFragments();
			case Java_graphPackage.VARIABLE_DECLARATION_EXPRESSION__MODIFIER:
				return getModifier();
			case Java_graphPackage.VARIABLE_DECLARATION_EXPRESSION__ANNOTATIONS:
				return getAnnotations();
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
			case Java_graphPackage.VARIABLE_DECLARATION_EXPRESSION__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends TypeAccess>)newValue);
				return;
			case Java_graphPackage.VARIABLE_DECLARATION_EXPRESSION__FRAGMENTS:
				getFragments().clear();
				getFragments().addAll((Collection<? extends VariableDeclarationFragment>)newValue);
				return;
			case Java_graphPackage.VARIABLE_DECLARATION_EXPRESSION__MODIFIER:
				getModifier().clear();
				getModifier().addAll((Collection<? extends Modifier>)newValue);
				return;
			case Java_graphPackage.VARIABLE_DECLARATION_EXPRESSION__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
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
			case Java_graphPackage.VARIABLE_DECLARATION_EXPRESSION__TYPE:
				getType().clear();
				return;
			case Java_graphPackage.VARIABLE_DECLARATION_EXPRESSION__FRAGMENTS:
				getFragments().clear();
				return;
			case Java_graphPackage.VARIABLE_DECLARATION_EXPRESSION__MODIFIER:
				getModifier().clear();
				return;
			case Java_graphPackage.VARIABLE_DECLARATION_EXPRESSION__ANNOTATIONS:
				getAnnotations().clear();
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
			case Java_graphPackage.VARIABLE_DECLARATION_EXPRESSION__TYPE:
				return type != null && !type.isEmpty();
			case Java_graphPackage.VARIABLE_DECLARATION_EXPRESSION__FRAGMENTS:
				return fragments != null && !fragments.isEmpty();
			case Java_graphPackage.VARIABLE_DECLARATION_EXPRESSION__MODIFIER:
				return modifier != null && !modifier.isEmpty();
			case Java_graphPackage.VARIABLE_DECLARATION_EXPRESSION__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
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
		if (baseClass == AbstractVariablesContainer.class) {
			switch (derivedFeatureID) {
				case Java_graphPackage.VARIABLE_DECLARATION_EXPRESSION__TYPE: return Java_graphPackage.ABSTRACT_VARIABLES_CONTAINER__TYPE;
				case Java_graphPackage.VARIABLE_DECLARATION_EXPRESSION__FRAGMENTS: return Java_graphPackage.ABSTRACT_VARIABLES_CONTAINER__FRAGMENTS;
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
		if (baseClass == AbstractVariablesContainer.class) {
			switch (baseFeatureID) {
				case Java_graphPackage.ABSTRACT_VARIABLES_CONTAINER__TYPE: return Java_graphPackage.VARIABLE_DECLARATION_EXPRESSION__TYPE;
				case Java_graphPackage.ABSTRACT_VARIABLES_CONTAINER__FRAGMENTS: return Java_graphPackage.VARIABLE_DECLARATION_EXPRESSION__FRAGMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //VariableDeclarationExpressionImpl

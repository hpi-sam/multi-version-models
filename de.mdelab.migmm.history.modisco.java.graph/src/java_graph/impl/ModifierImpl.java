/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.BodyDeclaration;
import java_graph.InheritanceKind;
import java_graph.Java_graphPackage;
import java_graph.Modifier;
import java_graph.SingleVariableDeclaration;
import java_graph.VariableDeclarationExpression;
import java_graph.VariableDeclarationStatement;
import java_graph.VisibilityKind;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.ModifierImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link java_graph.impl.ModifierImpl#getInheritance <em>Inheritance</em>}</li>
 *   <li>{@link java_graph.impl.ModifierImpl#getStatic <em>Static</em>}</li>
 *   <li>{@link java_graph.impl.ModifierImpl#getTransient <em>Transient</em>}</li>
 *   <li>{@link java_graph.impl.ModifierImpl#getVolatile <em>Volatile</em>}</li>
 *   <li>{@link java_graph.impl.ModifierImpl#getNative <em>Native</em>}</li>
 *   <li>{@link java_graph.impl.ModifierImpl#getStrictfp <em>Strictfp</em>}</li>
 *   <li>{@link java_graph.impl.ModifierImpl#getSynchronized <em>Synchronized</em>}</li>
 *   <li>{@link java_graph.impl.ModifierImpl#getBodyDeclaration <em>Body Declaration</em>}</li>
 *   <li>{@link java_graph.impl.ModifierImpl#getSingleVariableDeclaration <em>Single Variable Declaration</em>}</li>
 *   <li>{@link java_graph.impl.ModifierImpl#getVariableDeclarationStatement <em>Variable Declaration Statement</em>}</li>
 *   <li>{@link java_graph.impl.ModifierImpl#getVariableDeclarationExpression <em>Variable Declaration Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModifierImpl extends ASTNodeImpl implements Modifier {
	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected EList<VisibilityKind> visibility;

	/**
	 * The cached value of the '{@link #getInheritance() <em>Inheritance</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritance()
	 * @generated
	 * @ordered
	 */
	protected EList<InheritanceKind> inheritance;

	/**
	 * The cached value of the '{@link #getStatic() <em>Static</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatic()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> static_;

	/**
	 * The cached value of the '{@link #getTransient() <em>Transient</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransient()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> transient_;

	/**
	 * The cached value of the '{@link #getVolatile() <em>Volatile</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolatile()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> volatile_;

	/**
	 * The cached value of the '{@link #getNative() <em>Native</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNative()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> native_;

	/**
	 * The cached value of the '{@link #getStrictfp() <em>Strictfp</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrictfp()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> strictfp_;

	/**
	 * The cached value of the '{@link #getSynchronized() <em>Synchronized</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronized()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> synchronized_;

	/**
	 * The cached value of the '{@link #getBodyDeclaration() <em>Body Declaration</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EList<BodyDeclaration> bodyDeclaration;

	/**
	 * The cached value of the '{@link #getSingleVariableDeclaration() <em>Single Variable Declaration</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleVariableDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleVariableDeclaration> singleVariableDeclaration;

	/**
	 * The cached value of the '{@link #getVariableDeclarationStatement() <em>Variable Declaration Statement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableDeclarationStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDeclarationStatement> variableDeclarationStatement;

	/**
	 * The cached value of the '{@link #getVariableDeclarationExpression() <em>Variable Declaration Expression</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableDeclarationExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDeclarationExpression> variableDeclarationExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getModifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VisibilityKind> getVisibility() {
		if (visibility == null) {
			visibility = new EDataTypeEList<VisibilityKind>(VisibilityKind.class, this, Java_graphPackage.MODIFIER__VISIBILITY);
		}
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InheritanceKind> getInheritance() {
		if (inheritance == null) {
			inheritance = new EDataTypeEList<InheritanceKind>(InheritanceKind.class, this, Java_graphPackage.MODIFIER__INHERITANCE);
		}
		return inheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Boolean> getStatic() {
		if (static_ == null) {
			static_ = new EDataTypeEList<Boolean>(Boolean.class, this, Java_graphPackage.MODIFIER__STATIC);
		}
		return static_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Boolean> getTransient() {
		if (transient_ == null) {
			transient_ = new EDataTypeEList<Boolean>(Boolean.class, this, Java_graphPackage.MODIFIER__TRANSIENT);
		}
		return transient_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Boolean> getVolatile() {
		if (volatile_ == null) {
			volatile_ = new EDataTypeEList<Boolean>(Boolean.class, this, Java_graphPackage.MODIFIER__VOLATILE);
		}
		return volatile_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Boolean> getNative() {
		if (native_ == null) {
			native_ = new EDataTypeEList<Boolean>(Boolean.class, this, Java_graphPackage.MODIFIER__NATIVE);
		}
		return native_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Boolean> getStrictfp() {
		if (strictfp_ == null) {
			strictfp_ = new EDataTypeEList<Boolean>(Boolean.class, this, Java_graphPackage.MODIFIER__STRICTFP);
		}
		return strictfp_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Boolean> getSynchronized() {
		if (synchronized_ == null) {
			synchronized_ = new EDataTypeEList<Boolean>(Boolean.class, this, Java_graphPackage.MODIFIER__SYNCHRONIZED);
		}
		return synchronized_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BodyDeclaration> getBodyDeclaration() {
		if (bodyDeclaration == null) {
			bodyDeclaration = new EObjectWithInverseResolvingEList.ManyInverse<BodyDeclaration>(BodyDeclaration.class, this, Java_graphPackage.MODIFIER__BODY_DECLARATION, Java_graphPackage.BODY_DECLARATION__MODIFIER);
		}
		return bodyDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SingleVariableDeclaration> getSingleVariableDeclaration() {
		if (singleVariableDeclaration == null) {
			singleVariableDeclaration = new EObjectWithInverseResolvingEList.ManyInverse<SingleVariableDeclaration>(SingleVariableDeclaration.class, this, Java_graphPackage.MODIFIER__SINGLE_VARIABLE_DECLARATION, Java_graphPackage.SINGLE_VARIABLE_DECLARATION__MODIFIER);
		}
		return singleVariableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VariableDeclarationStatement> getVariableDeclarationStatement() {
		if (variableDeclarationStatement == null) {
			variableDeclarationStatement = new EObjectWithInverseResolvingEList.ManyInverse<VariableDeclarationStatement>(VariableDeclarationStatement.class, this, Java_graphPackage.MODIFIER__VARIABLE_DECLARATION_STATEMENT, Java_graphPackage.VARIABLE_DECLARATION_STATEMENT__MODIFIER);
		}
		return variableDeclarationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VariableDeclarationExpression> getVariableDeclarationExpression() {
		if (variableDeclarationExpression == null) {
			variableDeclarationExpression = new EObjectWithInverseResolvingEList.ManyInverse<VariableDeclarationExpression>(VariableDeclarationExpression.class, this, Java_graphPackage.MODIFIER__VARIABLE_DECLARATION_EXPRESSION, Java_graphPackage.VARIABLE_DECLARATION_EXPRESSION__MODIFIER);
		}
		return variableDeclarationExpression;
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
			case Java_graphPackage.MODIFIER__BODY_DECLARATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBodyDeclaration()).basicAdd(otherEnd, msgs);
			case Java_graphPackage.MODIFIER__SINGLE_VARIABLE_DECLARATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSingleVariableDeclaration()).basicAdd(otherEnd, msgs);
			case Java_graphPackage.MODIFIER__VARIABLE_DECLARATION_STATEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariableDeclarationStatement()).basicAdd(otherEnd, msgs);
			case Java_graphPackage.MODIFIER__VARIABLE_DECLARATION_EXPRESSION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariableDeclarationExpression()).basicAdd(otherEnd, msgs);
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
			case Java_graphPackage.MODIFIER__BODY_DECLARATION:
				return ((InternalEList<?>)getBodyDeclaration()).basicRemove(otherEnd, msgs);
			case Java_graphPackage.MODIFIER__SINGLE_VARIABLE_DECLARATION:
				return ((InternalEList<?>)getSingleVariableDeclaration()).basicRemove(otherEnd, msgs);
			case Java_graphPackage.MODIFIER__VARIABLE_DECLARATION_STATEMENT:
				return ((InternalEList<?>)getVariableDeclarationStatement()).basicRemove(otherEnd, msgs);
			case Java_graphPackage.MODIFIER__VARIABLE_DECLARATION_EXPRESSION:
				return ((InternalEList<?>)getVariableDeclarationExpression()).basicRemove(otherEnd, msgs);
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
			case Java_graphPackage.MODIFIER__VISIBILITY:
				return getVisibility();
			case Java_graphPackage.MODIFIER__INHERITANCE:
				return getInheritance();
			case Java_graphPackage.MODIFIER__STATIC:
				return getStatic();
			case Java_graphPackage.MODIFIER__TRANSIENT:
				return getTransient();
			case Java_graphPackage.MODIFIER__VOLATILE:
				return getVolatile();
			case Java_graphPackage.MODIFIER__NATIVE:
				return getNative();
			case Java_graphPackage.MODIFIER__STRICTFP:
				return getStrictfp();
			case Java_graphPackage.MODIFIER__SYNCHRONIZED:
				return getSynchronized();
			case Java_graphPackage.MODIFIER__BODY_DECLARATION:
				return getBodyDeclaration();
			case Java_graphPackage.MODIFIER__SINGLE_VARIABLE_DECLARATION:
				return getSingleVariableDeclaration();
			case Java_graphPackage.MODIFIER__VARIABLE_DECLARATION_STATEMENT:
				return getVariableDeclarationStatement();
			case Java_graphPackage.MODIFIER__VARIABLE_DECLARATION_EXPRESSION:
				return getVariableDeclarationExpression();
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
			case Java_graphPackage.MODIFIER__VISIBILITY:
				getVisibility().clear();
				getVisibility().addAll((Collection<? extends VisibilityKind>)newValue);
				return;
			case Java_graphPackage.MODIFIER__INHERITANCE:
				getInheritance().clear();
				getInheritance().addAll((Collection<? extends InheritanceKind>)newValue);
				return;
			case Java_graphPackage.MODIFIER__STATIC:
				getStatic().clear();
				getStatic().addAll((Collection<? extends Boolean>)newValue);
				return;
			case Java_graphPackage.MODIFIER__TRANSIENT:
				getTransient().clear();
				getTransient().addAll((Collection<? extends Boolean>)newValue);
				return;
			case Java_graphPackage.MODIFIER__VOLATILE:
				getVolatile().clear();
				getVolatile().addAll((Collection<? extends Boolean>)newValue);
				return;
			case Java_graphPackage.MODIFIER__NATIVE:
				getNative().clear();
				getNative().addAll((Collection<? extends Boolean>)newValue);
				return;
			case Java_graphPackage.MODIFIER__STRICTFP:
				getStrictfp().clear();
				getStrictfp().addAll((Collection<? extends Boolean>)newValue);
				return;
			case Java_graphPackage.MODIFIER__SYNCHRONIZED:
				getSynchronized().clear();
				getSynchronized().addAll((Collection<? extends Boolean>)newValue);
				return;
			case Java_graphPackage.MODIFIER__BODY_DECLARATION:
				getBodyDeclaration().clear();
				getBodyDeclaration().addAll((Collection<? extends BodyDeclaration>)newValue);
				return;
			case Java_graphPackage.MODIFIER__SINGLE_VARIABLE_DECLARATION:
				getSingleVariableDeclaration().clear();
				getSingleVariableDeclaration().addAll((Collection<? extends SingleVariableDeclaration>)newValue);
				return;
			case Java_graphPackage.MODIFIER__VARIABLE_DECLARATION_STATEMENT:
				getVariableDeclarationStatement().clear();
				getVariableDeclarationStatement().addAll((Collection<? extends VariableDeclarationStatement>)newValue);
				return;
			case Java_graphPackage.MODIFIER__VARIABLE_DECLARATION_EXPRESSION:
				getVariableDeclarationExpression().clear();
				getVariableDeclarationExpression().addAll((Collection<? extends VariableDeclarationExpression>)newValue);
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
			case Java_graphPackage.MODIFIER__VISIBILITY:
				getVisibility().clear();
				return;
			case Java_graphPackage.MODIFIER__INHERITANCE:
				getInheritance().clear();
				return;
			case Java_graphPackage.MODIFIER__STATIC:
				getStatic().clear();
				return;
			case Java_graphPackage.MODIFIER__TRANSIENT:
				getTransient().clear();
				return;
			case Java_graphPackage.MODIFIER__VOLATILE:
				getVolatile().clear();
				return;
			case Java_graphPackage.MODIFIER__NATIVE:
				getNative().clear();
				return;
			case Java_graphPackage.MODIFIER__STRICTFP:
				getStrictfp().clear();
				return;
			case Java_graphPackage.MODIFIER__SYNCHRONIZED:
				getSynchronized().clear();
				return;
			case Java_graphPackage.MODIFIER__BODY_DECLARATION:
				getBodyDeclaration().clear();
				return;
			case Java_graphPackage.MODIFIER__SINGLE_VARIABLE_DECLARATION:
				getSingleVariableDeclaration().clear();
				return;
			case Java_graphPackage.MODIFIER__VARIABLE_DECLARATION_STATEMENT:
				getVariableDeclarationStatement().clear();
				return;
			case Java_graphPackage.MODIFIER__VARIABLE_DECLARATION_EXPRESSION:
				getVariableDeclarationExpression().clear();
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
			case Java_graphPackage.MODIFIER__VISIBILITY:
				return visibility != null && !visibility.isEmpty();
			case Java_graphPackage.MODIFIER__INHERITANCE:
				return inheritance != null && !inheritance.isEmpty();
			case Java_graphPackage.MODIFIER__STATIC:
				return static_ != null && !static_.isEmpty();
			case Java_graphPackage.MODIFIER__TRANSIENT:
				return transient_ != null && !transient_.isEmpty();
			case Java_graphPackage.MODIFIER__VOLATILE:
				return volatile_ != null && !volatile_.isEmpty();
			case Java_graphPackage.MODIFIER__NATIVE:
				return native_ != null && !native_.isEmpty();
			case Java_graphPackage.MODIFIER__STRICTFP:
				return strictfp_ != null && !strictfp_.isEmpty();
			case Java_graphPackage.MODIFIER__SYNCHRONIZED:
				return synchronized_ != null && !synchronized_.isEmpty();
			case Java_graphPackage.MODIFIER__BODY_DECLARATION:
				return bodyDeclaration != null && !bodyDeclaration.isEmpty();
			case Java_graphPackage.MODIFIER__SINGLE_VARIABLE_DECLARATION:
				return singleVariableDeclaration != null && !singleVariableDeclaration.isEmpty();
			case Java_graphPackage.MODIFIER__VARIABLE_DECLARATION_STATEMENT:
				return variableDeclarationStatement != null && !variableDeclarationStatement.isEmpty();
			case Java_graphPackage.MODIFIER__VARIABLE_DECLARATION_EXPRESSION:
				return variableDeclarationExpression != null && !variableDeclarationExpression.isEmpty();
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
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(", inheritance: ");
		result.append(inheritance);
		result.append(", static: ");
		result.append(static_);
		result.append(", transient: ");
		result.append(transient_);
		result.append(", volatile: ");
		result.append(volatile_);
		result.append(", native: ");
		result.append(native_);
		result.append(", strictfp: ");
		result.append(strictfp_);
		result.append(", synchronized: ");
		result.append(synchronized_);
		result.append(')');
		return result.toString();
	}

} //ModifierImpl

/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.Comment;
import java_graph.Java_graphPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.CommentImpl#getContent <em>Content</em>}</li>
 *   <li>{@link java_graph.impl.CommentImpl#getEnclosedByParent <em>Enclosed By Parent</em>}</li>
 *   <li>{@link java_graph.impl.CommentImpl#getPrefixOfParent <em>Prefix Of Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CommentImpl extends ASTNodeImpl implements Comment {
	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EList<String> content;

	/**
	 * The cached value of the '{@link #getEnclosedByParent() <em>Enclosed By Parent</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnclosedByParent()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> enclosedByParent;

	/**
	 * The cached value of the '{@link #getPrefixOfParent() <em>Prefix Of Parent</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefixOfParent()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> prefixOfParent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getComment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getContent() {
		if (content == null) {
			content = new EDataTypeEList<String>(String.class, this, Java_graphPackage.COMMENT__CONTENT);
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Boolean> getEnclosedByParent() {
		if (enclosedByParent == null) {
			enclosedByParent = new EDataTypeEList<Boolean>(Boolean.class, this, Java_graphPackage.COMMENT__ENCLOSED_BY_PARENT);
		}
		return enclosedByParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Boolean> getPrefixOfParent() {
		if (prefixOfParent == null) {
			prefixOfParent = new EDataTypeEList<Boolean>(Boolean.class, this, Java_graphPackage.COMMENT__PREFIX_OF_PARENT);
		}
		return prefixOfParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_graphPackage.COMMENT__CONTENT:
				return getContent();
			case Java_graphPackage.COMMENT__ENCLOSED_BY_PARENT:
				return getEnclosedByParent();
			case Java_graphPackage.COMMENT__PREFIX_OF_PARENT:
				return getPrefixOfParent();
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
			case Java_graphPackage.COMMENT__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends String>)newValue);
				return;
			case Java_graphPackage.COMMENT__ENCLOSED_BY_PARENT:
				getEnclosedByParent().clear();
				getEnclosedByParent().addAll((Collection<? extends Boolean>)newValue);
				return;
			case Java_graphPackage.COMMENT__PREFIX_OF_PARENT:
				getPrefixOfParent().clear();
				getPrefixOfParent().addAll((Collection<? extends Boolean>)newValue);
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
			case Java_graphPackage.COMMENT__CONTENT:
				getContent().clear();
				return;
			case Java_graphPackage.COMMENT__ENCLOSED_BY_PARENT:
				getEnclosedByParent().clear();
				return;
			case Java_graphPackage.COMMENT__PREFIX_OF_PARENT:
				getPrefixOfParent().clear();
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
			case Java_graphPackage.COMMENT__CONTENT:
				return content != null && !content.isEmpty();
			case Java_graphPackage.COMMENT__ENCLOSED_BY_PARENT:
				return enclosedByParent != null && !enclosedByParent.isEmpty();
			case Java_graphPackage.COMMENT__PREFIX_OF_PARENT:
				return prefixOfParent != null && !prefixOfParent.isEmpty();
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
		result.append(" (content: ");
		result.append(content);
		result.append(", enclosedByParent: ");
		result.append(enclosedByParent);
		result.append(", prefixOfParent: ");
		result.append(prefixOfParent);
		result.append(')');
		return result.toString();
	}

} //CommentImpl

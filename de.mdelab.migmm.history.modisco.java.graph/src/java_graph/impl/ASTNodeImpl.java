/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.ASTNode;
import java_graph.ClassFile;
import java_graph.Comment;
import java_graph.CompilationUnit;
import java_graph.Java_graphPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AST Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.ASTNodeImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link java_graph.impl.ASTNodeImpl#getOriginalCompilationUnit <em>Original Compilation Unit</em>}</li>
 *   <li>{@link java_graph.impl.ASTNodeImpl#getOriginalClassFile <em>Original Class File</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ASTNodeImpl extends MinimalEObjectImpl.Container implements ASTNode {
	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> comments;

	/**
	 * The cached value of the '{@link #getOriginalCompilationUnit() <em>Original Compilation Unit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalCompilationUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<CompilationUnit> originalCompilationUnit;

	/**
	 * The cached value of the '{@link #getOriginalClassFile() <em>Original Class File</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalClassFile()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassFile> originalClassFile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ASTNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getASTNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		if (comments == null) {
			comments = new EObjectResolvingEList<Comment>(Comment.class, this, Java_graphPackage.AST_NODE__COMMENTS);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CompilationUnit> getOriginalCompilationUnit() {
		if (originalCompilationUnit == null) {
			originalCompilationUnit = new EObjectResolvingEList<CompilationUnit>(CompilationUnit.class, this, Java_graphPackage.AST_NODE__ORIGINAL_COMPILATION_UNIT);
		}
		return originalCompilationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClassFile> getOriginalClassFile() {
		if (originalClassFile == null) {
			originalClassFile = new EObjectResolvingEList<ClassFile>(ClassFile.class, this, Java_graphPackage.AST_NODE__ORIGINAL_CLASS_FILE);
		}
		return originalClassFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_graphPackage.AST_NODE__COMMENTS:
				return getComments();
			case Java_graphPackage.AST_NODE__ORIGINAL_COMPILATION_UNIT:
				return getOriginalCompilationUnit();
			case Java_graphPackage.AST_NODE__ORIGINAL_CLASS_FILE:
				return getOriginalClassFile();
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
			case Java_graphPackage.AST_NODE__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case Java_graphPackage.AST_NODE__ORIGINAL_COMPILATION_UNIT:
				getOriginalCompilationUnit().clear();
				getOriginalCompilationUnit().addAll((Collection<? extends CompilationUnit>)newValue);
				return;
			case Java_graphPackage.AST_NODE__ORIGINAL_CLASS_FILE:
				getOriginalClassFile().clear();
				getOriginalClassFile().addAll((Collection<? extends ClassFile>)newValue);
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
			case Java_graphPackage.AST_NODE__COMMENTS:
				getComments().clear();
				return;
			case Java_graphPackage.AST_NODE__ORIGINAL_COMPILATION_UNIT:
				getOriginalCompilationUnit().clear();
				return;
			case Java_graphPackage.AST_NODE__ORIGINAL_CLASS_FILE:
				getOriginalClassFile().clear();
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
			case Java_graphPackage.AST_NODE__COMMENTS:
				return comments != null && !comments.isEmpty();
			case Java_graphPackage.AST_NODE__ORIGINAL_COMPILATION_UNIT:
				return originalCompilationUnit != null && !originalCompilationUnit.isEmpty();
			case Java_graphPackage.AST_NODE__ORIGINAL_CLASS_FILE:
				return originalClassFile != null && !originalClassFile.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ASTNodeImpl

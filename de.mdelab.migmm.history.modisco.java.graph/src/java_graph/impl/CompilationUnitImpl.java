/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.AbstractTypeDeclaration;
import java_graph.Comment;
import java_graph.CompilationUnit;
import java_graph.ImportDeclaration;
import java_graph.Java_graphPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.CompilationUnitImpl#getOriginalFilePath <em>Original File Path</em>}</li>
 *   <li>{@link java_graph.impl.CompilationUnitImpl#getCommentList <em>Comment List</em>}</li>
 *   <li>{@link java_graph.impl.CompilationUnitImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link java_graph.impl.CompilationUnitImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link java_graph.impl.CompilationUnitImpl#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompilationUnitImpl extends NamedElementImpl implements CompilationUnit {
	/**
	 * The cached value of the '{@link #getOriginalFilePath() <em>Original File Path</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalFilePath()
	 * @generated
	 * @ordered
	 */
	protected EList<String> originalFilePath;

	/**
	 * The cached value of the '{@link #getCommentList() <em>Comment List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentList()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> commentList;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportDeclaration> imports;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<java_graph.Package> package_;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractTypeDeclaration> types;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompilationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getCompilationUnit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOriginalFilePath() {
		if (originalFilePath == null) {
			originalFilePath = new EDataTypeEList<String>(String.class, this, Java_graphPackage.COMPILATION_UNIT__ORIGINAL_FILE_PATH);
		}
		return originalFilePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getCommentList() {
		if (commentList == null) {
			commentList = new EObjectResolvingEList<Comment>(Comment.class, this, Java_graphPackage.COMPILATION_UNIT__COMMENT_LIST);
		}
		return commentList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImportDeclaration> getImports() {
		if (imports == null) {
			imports = new EObjectResolvingEList<ImportDeclaration>(ImportDeclaration.class, this, Java_graphPackage.COMPILATION_UNIT__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<java_graph.Package> getPackage() {
		if (package_ == null) {
			package_ = new EObjectResolvingEList<java_graph.Package>(java_graph.Package.class, this, Java_graphPackage.COMPILATION_UNIT__PACKAGE);
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractTypeDeclaration> getTypes() {
		if (types == null) {
			types = new EObjectResolvingEList<AbstractTypeDeclaration>(AbstractTypeDeclaration.class, this, Java_graphPackage.COMPILATION_UNIT__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_graphPackage.COMPILATION_UNIT__ORIGINAL_FILE_PATH:
				return getOriginalFilePath();
			case Java_graphPackage.COMPILATION_UNIT__COMMENT_LIST:
				return getCommentList();
			case Java_graphPackage.COMPILATION_UNIT__IMPORTS:
				return getImports();
			case Java_graphPackage.COMPILATION_UNIT__PACKAGE:
				return getPackage();
			case Java_graphPackage.COMPILATION_UNIT__TYPES:
				return getTypes();
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
			case Java_graphPackage.COMPILATION_UNIT__ORIGINAL_FILE_PATH:
				getOriginalFilePath().clear();
				getOriginalFilePath().addAll((Collection<? extends String>)newValue);
				return;
			case Java_graphPackage.COMPILATION_UNIT__COMMENT_LIST:
				getCommentList().clear();
				getCommentList().addAll((Collection<? extends Comment>)newValue);
				return;
			case Java_graphPackage.COMPILATION_UNIT__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends ImportDeclaration>)newValue);
				return;
			case Java_graphPackage.COMPILATION_UNIT__PACKAGE:
				getPackage().clear();
				getPackage().addAll((Collection<? extends java_graph.Package>)newValue);
				return;
			case Java_graphPackage.COMPILATION_UNIT__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends AbstractTypeDeclaration>)newValue);
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
			case Java_graphPackage.COMPILATION_UNIT__ORIGINAL_FILE_PATH:
				getOriginalFilePath().clear();
				return;
			case Java_graphPackage.COMPILATION_UNIT__COMMENT_LIST:
				getCommentList().clear();
				return;
			case Java_graphPackage.COMPILATION_UNIT__IMPORTS:
				getImports().clear();
				return;
			case Java_graphPackage.COMPILATION_UNIT__PACKAGE:
				getPackage().clear();
				return;
			case Java_graphPackage.COMPILATION_UNIT__TYPES:
				getTypes().clear();
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
			case Java_graphPackage.COMPILATION_UNIT__ORIGINAL_FILE_PATH:
				return originalFilePath != null && !originalFilePath.isEmpty();
			case Java_graphPackage.COMPILATION_UNIT__COMMENT_LIST:
				return commentList != null && !commentList.isEmpty();
			case Java_graphPackage.COMPILATION_UNIT__IMPORTS:
				return imports != null && !imports.isEmpty();
			case Java_graphPackage.COMPILATION_UNIT__PACKAGE:
				return package_ != null && !package_.isEmpty();
			case Java_graphPackage.COMPILATION_UNIT__TYPES:
				return types != null && !types.isEmpty();
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
		result.append(" (originalFilePath: ");
		result.append(originalFilePath);
		result.append(')');
		return result.toString();
	}

} //CompilationUnitImpl

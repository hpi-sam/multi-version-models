/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.AbstractTypeDeclaration;
import java_graph.ClassFile;
import java_graph.CompilationUnit;
import java_graph.Java_graphPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.ClassFileImpl#getOriginalFilePath <em>Original File Path</em>}</li>
 *   <li>{@link java_graph.impl.ClassFileImpl#getType <em>Type</em>}</li>
 *   <li>{@link java_graph.impl.ClassFileImpl#getAttachedSource <em>Attached Source</em>}</li>
 *   <li>{@link java_graph.impl.ClassFileImpl#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassFileImpl extends NamedElementImpl implements ClassFile {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractTypeDeclaration> type;

	/**
	 * The cached value of the '{@link #getAttachedSource() <em>Attached Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachedSource()
	 * @generated
	 * @ordered
	 */
	protected EList<CompilationUnit> attachedSource;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getClassFile();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOriginalFilePath() {
		if (originalFilePath == null) {
			originalFilePath = new EDataTypeEList<String>(String.class, this, Java_graphPackage.CLASS_FILE__ORIGINAL_FILE_PATH);
		}
		return originalFilePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractTypeDeclaration> getType() {
		if (type == null) {
			type = new EObjectResolvingEList<AbstractTypeDeclaration>(AbstractTypeDeclaration.class, this, Java_graphPackage.CLASS_FILE__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CompilationUnit> getAttachedSource() {
		if (attachedSource == null) {
			attachedSource = new EObjectResolvingEList<CompilationUnit>(CompilationUnit.class, this, Java_graphPackage.CLASS_FILE__ATTACHED_SOURCE);
		}
		return attachedSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<java_graph.Package> getPackage() {
		if (package_ == null) {
			package_ = new EObjectResolvingEList<java_graph.Package>(java_graph.Package.class, this, Java_graphPackage.CLASS_FILE__PACKAGE);
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_graphPackage.CLASS_FILE__ORIGINAL_FILE_PATH:
				return getOriginalFilePath();
			case Java_graphPackage.CLASS_FILE__TYPE:
				return getType();
			case Java_graphPackage.CLASS_FILE__ATTACHED_SOURCE:
				return getAttachedSource();
			case Java_graphPackage.CLASS_FILE__PACKAGE:
				return getPackage();
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
			case Java_graphPackage.CLASS_FILE__ORIGINAL_FILE_PATH:
				getOriginalFilePath().clear();
				getOriginalFilePath().addAll((Collection<? extends String>)newValue);
				return;
			case Java_graphPackage.CLASS_FILE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends AbstractTypeDeclaration>)newValue);
				return;
			case Java_graphPackage.CLASS_FILE__ATTACHED_SOURCE:
				getAttachedSource().clear();
				getAttachedSource().addAll((Collection<? extends CompilationUnit>)newValue);
				return;
			case Java_graphPackage.CLASS_FILE__PACKAGE:
				getPackage().clear();
				getPackage().addAll((Collection<? extends java_graph.Package>)newValue);
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
			case Java_graphPackage.CLASS_FILE__ORIGINAL_FILE_PATH:
				getOriginalFilePath().clear();
				return;
			case Java_graphPackage.CLASS_FILE__TYPE:
				getType().clear();
				return;
			case Java_graphPackage.CLASS_FILE__ATTACHED_SOURCE:
				getAttachedSource().clear();
				return;
			case Java_graphPackage.CLASS_FILE__PACKAGE:
				getPackage().clear();
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
			case Java_graphPackage.CLASS_FILE__ORIGINAL_FILE_PATH:
				return originalFilePath != null && !originalFilePath.isEmpty();
			case Java_graphPackage.CLASS_FILE__TYPE:
				return type != null && !type.isEmpty();
			case Java_graphPackage.CLASS_FILE__ATTACHED_SOURCE:
				return attachedSource != null && !attachedSource.isEmpty();
			case Java_graphPackage.CLASS_FILE__PACKAGE:
				return package_ != null && !package_.isEmpty();
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

} //ClassFileImpl

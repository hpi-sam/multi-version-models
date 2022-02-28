/**
 */
package java_graph.impl;

import java.util.Collection;

import java_graph.Archive;
import java_graph.ClassFile;
import java_graph.Java_graphPackage;
import java_graph.Manifest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Archive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_graph.impl.ArchiveImpl#getOriginalFilePath <em>Original File Path</em>}</li>
 *   <li>{@link java_graph.impl.ArchiveImpl#getClassFiles <em>Class Files</em>}</li>
 *   <li>{@link java_graph.impl.ArchiveImpl#getManifest <em>Manifest</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchiveImpl extends NamedElementImpl implements Archive {
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
	 * The cached value of the '{@link #getClassFiles() <em>Class Files</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassFile> classFiles;

	/**
	 * The cached value of the '{@link #getManifest() <em>Manifest</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManifest()
	 * @generated
	 * @ordered
	 */
	protected EList<Manifest> manifest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_graphPackage.eINSTANCE.getArchive();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOriginalFilePath() {
		if (originalFilePath == null) {
			originalFilePath = new EDataTypeEList<String>(String.class, this, Java_graphPackage.ARCHIVE__ORIGINAL_FILE_PATH);
		}
		return originalFilePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClassFile> getClassFiles() {
		if (classFiles == null) {
			classFiles = new EObjectResolvingEList<ClassFile>(ClassFile.class, this, Java_graphPackage.ARCHIVE__CLASS_FILES);
		}
		return classFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Manifest> getManifest() {
		if (manifest == null) {
			manifest = new EObjectResolvingEList<Manifest>(Manifest.class, this, Java_graphPackage.ARCHIVE__MANIFEST);
		}
		return manifest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_graphPackage.ARCHIVE__ORIGINAL_FILE_PATH:
				return getOriginalFilePath();
			case Java_graphPackage.ARCHIVE__CLASS_FILES:
				return getClassFiles();
			case Java_graphPackage.ARCHIVE__MANIFEST:
				return getManifest();
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
			case Java_graphPackage.ARCHIVE__ORIGINAL_FILE_PATH:
				getOriginalFilePath().clear();
				getOriginalFilePath().addAll((Collection<? extends String>)newValue);
				return;
			case Java_graphPackage.ARCHIVE__CLASS_FILES:
				getClassFiles().clear();
				getClassFiles().addAll((Collection<? extends ClassFile>)newValue);
				return;
			case Java_graphPackage.ARCHIVE__MANIFEST:
				getManifest().clear();
				getManifest().addAll((Collection<? extends Manifest>)newValue);
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
			case Java_graphPackage.ARCHIVE__ORIGINAL_FILE_PATH:
				getOriginalFilePath().clear();
				return;
			case Java_graphPackage.ARCHIVE__CLASS_FILES:
				getClassFiles().clear();
				return;
			case Java_graphPackage.ARCHIVE__MANIFEST:
				getManifest().clear();
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
			case Java_graphPackage.ARCHIVE__ORIGINAL_FILE_PATH:
				return originalFilePath != null && !originalFilePath.isEmpty();
			case Java_graphPackage.ARCHIVE__CLASS_FILES:
				return classFiles != null && !classFiles.isEmpty();
			case Java_graphPackage.ARCHIVE__MANIFEST:
				return manifest != null && !manifest.isEmpty();
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

} //ArchiveImpl

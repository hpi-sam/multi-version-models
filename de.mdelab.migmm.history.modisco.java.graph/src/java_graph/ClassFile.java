/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.ClassFile#getOriginalFilePath <em>Original File Path</em>}</li>
 *   <li>{@link java_graph.ClassFile#getType <em>Type</em>}</li>
 *   <li>{@link java_graph.ClassFile#getAttachedSource <em>Attached Source</em>}</li>
 *   <li>{@link java_graph.ClassFile#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getClassFile()
 * @model
 * @generated
 */
public interface ClassFile extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Original File Path</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original File Path</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getClassFile_OriginalFilePath()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getOriginalFilePath();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link java_graph.AbstractTypeDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see java_graph.Java_graphPackage#getClassFile_Type()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AbstractTypeDeclaration> getType();

	/**
	 * Returns the value of the '<em><b>Attached Source</b></em>' reference list.
	 * The list contents are of type {@link java_graph.CompilationUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attached Source</em>' reference list.
	 * @see java_graph.Java_graphPackage#getClassFile_AttachedSource()
	 * @model ordered="false"
	 * @generated
	 */
	EList<CompilationUnit> getAttachedSource();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference list.
	 * @see java_graph.Java_graphPackage#getClassFile_Package()
	 * @model ordered="false"
	 * @generated
	 */
	EList<java_graph.Package> getPackage();

} // ClassFile

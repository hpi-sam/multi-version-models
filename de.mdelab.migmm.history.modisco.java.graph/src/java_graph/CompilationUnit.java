/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.CompilationUnit#getOriginalFilePath <em>Original File Path</em>}</li>
 *   <li>{@link java_graph.CompilationUnit#getCommentList <em>Comment List</em>}</li>
 *   <li>{@link java_graph.CompilationUnit#getImports <em>Imports</em>}</li>
 *   <li>{@link java_graph.CompilationUnit#getPackage <em>Package</em>}</li>
 *   <li>{@link java_graph.CompilationUnit#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getCompilationUnit()
 * @model
 * @generated
 */
public interface CompilationUnit extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Original File Path</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original File Path</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getCompilationUnit_OriginalFilePath()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getOriginalFilePath();

	/**
	 * Returns the value of the '<em><b>Comment List</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Comment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment List</em>' reference list.
	 * @see java_graph.Java_graphPackage#getCompilationUnit_CommentList()
	 * @model
	 * @generated
	 */
	EList<Comment> getCommentList();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' reference list.
	 * The list contents are of type {@link java_graph.ImportDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' reference list.
	 * @see java_graph.Java_graphPackage#getCompilationUnit_Imports()
	 * @model
	 * @generated
	 */
	EList<ImportDeclaration> getImports();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference list.
	 * @see java_graph.Java_graphPackage#getCompilationUnit_Package()
	 * @model ordered="false"
	 * @generated
	 */
	EList<java_graph.Package> getPackage();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' reference list.
	 * The list contents are of type {@link java_graph.AbstractTypeDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' reference list.
	 * @see java_graph.Java_graphPackage#getCompilationUnit_Types()
	 * @model
	 * @generated
	 */
	EList<AbstractTypeDeclaration> getTypes();

} // CompilationUnit

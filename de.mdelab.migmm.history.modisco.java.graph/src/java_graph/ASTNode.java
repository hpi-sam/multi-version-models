/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AST Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.ASTNode#getComments <em>Comments</em>}</li>
 *   <li>{@link java_graph.ASTNode#getOriginalCompilationUnit <em>Original Compilation Unit</em>}</li>
 *   <li>{@link java_graph.ASTNode#getOriginalClassFile <em>Original Class File</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getASTNode()
 * @model abstract="true"
 * @generated
 */
public interface ASTNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Comments</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Comment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' reference list.
	 * @see java_graph.Java_graphPackage#getASTNode_Comments()
	 * @model
	 * @generated
	 */
	EList<Comment> getComments();

	/**
	 * Returns the value of the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * The list contents are of type {@link java_graph.CompilationUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Compilation Unit</em>' reference list.
	 * @see java_graph.Java_graphPackage#getASTNode_OriginalCompilationUnit()
	 * @model ordered="false"
	 * @generated
	 */
	EList<CompilationUnit> getOriginalCompilationUnit();

	/**
	 * Returns the value of the '<em><b>Original Class File</b></em>' reference list.
	 * The list contents are of type {@link java_graph.ClassFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Class File</em>' reference list.
	 * @see java_graph.Java_graphPackage#getASTNode_OriginalClassFile()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ClassFile> getOriginalClassFile();

} // ASTNode

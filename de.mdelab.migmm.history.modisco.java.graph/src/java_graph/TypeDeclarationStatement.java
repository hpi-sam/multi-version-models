/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Declaration Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.TypeDeclarationStatement#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getTypeDeclarationStatement()
 * @model
 * @generated
 */
public interface TypeDeclarationStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' reference list.
	 * The list contents are of type {@link java_graph.AbstractTypeDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' reference list.
	 * @see java_graph.Java_graphPackage#getTypeDeclarationStatement_Declaration()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<AbstractTypeDeclaration> getDeclaration();

} // TypeDeclarationStatement

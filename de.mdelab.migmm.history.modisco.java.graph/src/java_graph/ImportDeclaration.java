/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.ImportDeclaration#getStatic <em>Static</em>}</li>
 *   <li>{@link java_graph.ImportDeclaration#getImportedElement <em>Imported Element</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getImportDeclaration()
 * @model
 * @generated
 */
public interface ImportDeclaration extends ASTNode {
	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getImportDeclaration_Static()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<Boolean> getStatic();

	/**
	 * Returns the value of the '<em><b>Imported Element</b></em>' reference list.
	 * The list contents are of type {@link java_graph.NamedElement}.
	 * It is bidirectional and its opposite is '{@link java_graph.NamedElement#getUsagesInImports <em>Usages In Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Element</em>' reference list.
	 * @see java_graph.Java_graphPackage#getImportDeclaration_ImportedElement()
	 * @see java_graph.NamedElement#getUsagesInImports
	 * @model opposite="usagesInImports" required="true" ordered="false"
	 * @generated
	 */
	EList<NamedElement> getImportedElement();

} // ImportDeclaration

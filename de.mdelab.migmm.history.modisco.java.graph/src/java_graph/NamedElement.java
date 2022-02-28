/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.NamedElement#getName <em>Name</em>}</li>
 *   <li>{@link java_graph.NamedElement#getProxy <em>Proxy</em>}</li>
 *   <li>{@link java_graph.NamedElement#getUsagesInImports <em>Usages In Imports</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface NamedElement extends ASTNode {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getNamedElement_Name()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<String> getName();

	/**
	 * Returns the value of the '<em><b>Proxy</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getNamedElement_Proxy()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<Boolean> getProxy();

	/**
	 * Returns the value of the '<em><b>Usages In Imports</b></em>' reference list.
	 * The list contents are of type {@link java_graph.ImportDeclaration}.
	 * It is bidirectional and its opposite is '{@link java_graph.ImportDeclaration#getImportedElement <em>Imported Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usages In Imports</em>' reference list.
	 * @see java_graph.Java_graphPackage#getNamedElement_UsagesInImports()
	 * @see java_graph.ImportDeclaration#getImportedElement
	 * @model opposite="importedElement" ordered="false"
	 * @generated
	 */
	EList<ImportDeclaration> getUsagesInImports();

} // NamedElement

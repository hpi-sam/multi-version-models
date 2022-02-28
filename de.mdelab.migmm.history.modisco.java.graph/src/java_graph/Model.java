/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.Model#getName <em>Name</em>}</li>
 *   <li>{@link java_graph.Model#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link java_graph.Model#getOrphanTypes <em>Orphan Types</em>}</li>
 *   <li>{@link java_graph.Model#getUnresolvedItems <em>Unresolved Items</em>}</li>
 *   <li>{@link java_graph.Model#getCompilationUnits <em>Compilation Units</em>}</li>
 *   <li>{@link java_graph.Model#getClassFiles <em>Class Files</em>}</li>
 *   <li>{@link java_graph.Model#getArchives <em>Archives</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getModel_Name()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<String> getName();

	/**
	 * Returns the value of the '<em><b>Owned Elements</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Package}.
	 * It is bidirectional and its opposite is '{@link java_graph.Package#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Elements</em>' reference list.
	 * @see java_graph.Java_graphPackage#getModel_OwnedElements()
	 * @see java_graph.Package#getModel
	 * @model opposite="model" ordered="false"
	 * @generated
	 */
	EList<java_graph.Package> getOwnedElements();

	/**
	 * Returns the value of the '<em><b>Orphan Types</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orphan Types</em>' reference list.
	 * @see java_graph.Java_graphPackage#getModel_OrphanTypes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Type> getOrphanTypes();

	/**
	 * Returns the value of the '<em><b>Unresolved Items</b></em>' reference list.
	 * The list contents are of type {@link java_graph.UnresolvedItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unresolved Items</em>' reference list.
	 * @see java_graph.Java_graphPackage#getModel_UnresolvedItems()
	 * @model ordered="false"
	 * @generated
	 */
	EList<UnresolvedItem> getUnresolvedItems();

	/**
	 * Returns the value of the '<em><b>Compilation Units</b></em>' reference list.
	 * The list contents are of type {@link java_graph.CompilationUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compilation Units</em>' reference list.
	 * @see java_graph.Java_graphPackage#getModel_CompilationUnits()
	 * @model ordered="false"
	 * @generated
	 */
	EList<CompilationUnit> getCompilationUnits();

	/**
	 * Returns the value of the '<em><b>Class Files</b></em>' reference list.
	 * The list contents are of type {@link java_graph.ClassFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Files</em>' reference list.
	 * @see java_graph.Java_graphPackage#getModel_ClassFiles()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ClassFile> getClassFiles();

	/**
	 * Returns the value of the '<em><b>Archives</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Archive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Archives</em>' reference list.
	 * @see java_graph.Java_graphPackage#getModel_Archives()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Archive> getArchives();

} // Model

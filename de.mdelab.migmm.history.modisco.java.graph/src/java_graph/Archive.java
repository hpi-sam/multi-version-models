/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Archive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.Archive#getOriginalFilePath <em>Original File Path</em>}</li>
 *   <li>{@link java_graph.Archive#getClassFiles <em>Class Files</em>}</li>
 *   <li>{@link java_graph.Archive#getManifest <em>Manifest</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getArchive()
 * @model
 * @generated
 */
public interface Archive extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Original File Path</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original File Path</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getArchive_OriginalFilePath()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getOriginalFilePath();

	/**
	 * Returns the value of the '<em><b>Class Files</b></em>' reference list.
	 * The list contents are of type {@link java_graph.ClassFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Files</em>' reference list.
	 * @see java_graph.Java_graphPackage#getArchive_ClassFiles()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ClassFile> getClassFiles();

	/**
	 * Returns the value of the '<em><b>Manifest</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Manifest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manifest</em>' reference list.
	 * @see java_graph.Java_graphPackage#getArchive_Manifest()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Manifest> getManifest();

} // Archive

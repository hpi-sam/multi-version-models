/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.ClassDeclaration#getSuperClass <em>Super Class</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getClassDeclaration()
 * @model
 * @generated
 */
public interface ClassDeclaration extends TypeDeclaration {
	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference list.
	 * The list contents are of type {@link java_graph.TypeAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class</em>' reference list.
	 * @see java_graph.Java_graphPackage#getClassDeclaration_SuperClass()
	 * @model ordered="false"
	 * @generated
	 */
	EList<TypeAccess> getSuperClass();

} // ClassDeclaration

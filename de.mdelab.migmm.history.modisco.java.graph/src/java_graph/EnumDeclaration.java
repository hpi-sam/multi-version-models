/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.EnumDeclaration#getEnumConstants <em>Enum Constants</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getEnumDeclaration()
 * @model
 * @generated
 */
public interface EnumDeclaration extends AbstractTypeDeclaration {
	/**
	 * Returns the value of the '<em><b>Enum Constants</b></em>' reference list.
	 * The list contents are of type {@link java_graph.EnumConstantDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Constants</em>' reference list.
	 * @see java_graph.Java_graphPackage#getEnumDeclaration_EnumConstants()
	 * @model
	 * @generated
	 */
	EList<EnumConstantDeclaration> getEnumConstants();

} // EnumDeclaration

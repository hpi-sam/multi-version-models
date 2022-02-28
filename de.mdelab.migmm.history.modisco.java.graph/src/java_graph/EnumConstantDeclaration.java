/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Constant Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.EnumConstantDeclaration#getAnonymousClassDeclaration <em>Anonymous Class Declaration</em>}</li>
 *   <li>{@link java_graph.EnumConstantDeclaration#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getEnumConstantDeclaration()
 * @model
 * @generated
 */
public interface EnumConstantDeclaration extends BodyDeclaration, VariableDeclaration {
	/**
	 * Returns the value of the '<em><b>Anonymous Class Declaration</b></em>' reference list.
	 * The list contents are of type {@link java_graph.AnonymousClassDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anonymous Class Declaration</em>' reference list.
	 * @see java_graph.Java_graphPackage#getEnumConstantDeclaration_AnonymousClassDeclaration()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AnonymousClassDeclaration> getAnonymousClassDeclaration();

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' reference list.
	 * @see java_graph.Java_graphPackage#getEnumConstantDeclaration_Arguments()
	 * @model
	 * @generated
	 */
	EList<Expression> getArguments();

} // EnumConstantDeclaration

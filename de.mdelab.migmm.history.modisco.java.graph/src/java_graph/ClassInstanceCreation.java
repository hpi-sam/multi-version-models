/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Instance Creation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.ClassInstanceCreation#getAnonymousClassDeclaration <em>Anonymous Class Declaration</em>}</li>
 *   <li>{@link java_graph.ClassInstanceCreation#getExpression <em>Expression</em>}</li>
 *   <li>{@link java_graph.ClassInstanceCreation#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getClassInstanceCreation()
 * @model
 * @generated
 */
public interface ClassInstanceCreation extends Expression, AbstractMethodInvocation {
	/**
	 * Returns the value of the '<em><b>Anonymous Class Declaration</b></em>' reference list.
	 * The list contents are of type {@link java_graph.AnonymousClassDeclaration}.
	 * It is bidirectional and its opposite is '{@link java_graph.AnonymousClassDeclaration#getClassInstanceCreation <em>Class Instance Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anonymous Class Declaration</em>' reference list.
	 * @see java_graph.Java_graphPackage#getClassInstanceCreation_AnonymousClassDeclaration()
	 * @see java_graph.AnonymousClassDeclaration#getClassInstanceCreation
	 * @model opposite="classInstanceCreation" ordered="false"
	 * @generated
	 */
	EList<AnonymousClassDeclaration> getAnonymousClassDeclaration();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference list.
	 * @see java_graph.Java_graphPackage#getClassInstanceCreation_Expression()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Expression> getExpression();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link java_graph.TypeAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see java_graph.Java_graphPackage#getClassInstanceCreation_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<TypeAccess> getType();

} // ClassInstanceCreation

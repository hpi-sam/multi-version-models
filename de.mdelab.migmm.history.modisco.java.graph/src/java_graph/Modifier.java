/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.Modifier#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link java_graph.Modifier#getInheritance <em>Inheritance</em>}</li>
 *   <li>{@link java_graph.Modifier#getStatic <em>Static</em>}</li>
 *   <li>{@link java_graph.Modifier#getTransient <em>Transient</em>}</li>
 *   <li>{@link java_graph.Modifier#getVolatile <em>Volatile</em>}</li>
 *   <li>{@link java_graph.Modifier#getNative <em>Native</em>}</li>
 *   <li>{@link java_graph.Modifier#getStrictfp <em>Strictfp</em>}</li>
 *   <li>{@link java_graph.Modifier#getSynchronized <em>Synchronized</em>}</li>
 *   <li>{@link java_graph.Modifier#getBodyDeclaration <em>Body Declaration</em>}</li>
 *   <li>{@link java_graph.Modifier#getSingleVariableDeclaration <em>Single Variable Declaration</em>}</li>
 *   <li>{@link java_graph.Modifier#getVariableDeclarationStatement <em>Variable Declaration Statement</em>}</li>
 *   <li>{@link java_graph.Modifier#getVariableDeclarationExpression <em>Variable Declaration Expression</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getModifier()
 * @model
 * @generated
 */
public interface Modifier extends ASTNode {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute list.
	 * The list contents are of type {@link java_graph.VisibilityKind}.
	 * The literals are from the enumeration {@link java_graph.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute list.
	 * @see java_graph.VisibilityKind
	 * @see java_graph.Java_graphPackage#getModifier_Visibility()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<VisibilityKind> getVisibility();

	/**
	 * Returns the value of the '<em><b>Inheritance</b></em>' attribute list.
	 * The list contents are of type {@link java_graph.InheritanceKind}.
	 * The literals are from the enumeration {@link java_graph.InheritanceKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inheritance</em>' attribute list.
	 * @see java_graph.InheritanceKind
	 * @see java_graph.Java_graphPackage#getModifier_Inheritance()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<InheritanceKind> getInheritance();

	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getModifier_Static()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<Boolean> getStatic();

	/**
	 * Returns the value of the '<em><b>Transient</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getModifier_Transient()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<Boolean> getTransient();

	/**
	 * Returns the value of the '<em><b>Volatile</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volatile</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getModifier_Volatile()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<Boolean> getVolatile();

	/**
	 * Returns the value of the '<em><b>Native</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Native</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getModifier_Native()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<Boolean> getNative();

	/**
	 * Returns the value of the '<em><b>Strictfp</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strictfp</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getModifier_Strictfp()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<Boolean> getStrictfp();

	/**
	 * Returns the value of the '<em><b>Synchronized</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronized</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getModifier_Synchronized()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<Boolean> getSynchronized();

	/**
	 * Returns the value of the '<em><b>Body Declaration</b></em>' reference list.
	 * The list contents are of type {@link java_graph.BodyDeclaration}.
	 * It is bidirectional and its opposite is '{@link java_graph.BodyDeclaration#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Declaration</em>' reference list.
	 * @see java_graph.Java_graphPackage#getModifier_BodyDeclaration()
	 * @see java_graph.BodyDeclaration#getModifier
	 * @model opposite="modifier" ordered="false"
	 * @generated
	 */
	EList<BodyDeclaration> getBodyDeclaration();

	/**
	 * Returns the value of the '<em><b>Single Variable Declaration</b></em>' reference list.
	 * The list contents are of type {@link java_graph.SingleVariableDeclaration}.
	 * It is bidirectional and its opposite is '{@link java_graph.SingleVariableDeclaration#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Variable Declaration</em>' reference list.
	 * @see java_graph.Java_graphPackage#getModifier_SingleVariableDeclaration()
	 * @see java_graph.SingleVariableDeclaration#getModifier
	 * @model opposite="modifier" ordered="false"
	 * @generated
	 */
	EList<SingleVariableDeclaration> getSingleVariableDeclaration();

	/**
	 * Returns the value of the '<em><b>Variable Declaration Statement</b></em>' reference list.
	 * The list contents are of type {@link java_graph.VariableDeclarationStatement}.
	 * It is bidirectional and its opposite is '{@link java_graph.VariableDeclarationStatement#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Declaration Statement</em>' reference list.
	 * @see java_graph.Java_graphPackage#getModifier_VariableDeclarationStatement()
	 * @see java_graph.VariableDeclarationStatement#getModifier
	 * @model opposite="modifier" ordered="false"
	 * @generated
	 */
	EList<VariableDeclarationStatement> getVariableDeclarationStatement();

	/**
	 * Returns the value of the '<em><b>Variable Declaration Expression</b></em>' reference list.
	 * The list contents are of type {@link java_graph.VariableDeclarationExpression}.
	 * It is bidirectional and its opposite is '{@link java_graph.VariableDeclarationExpression#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Declaration Expression</em>' reference list.
	 * @see java_graph.Java_graphPackage#getModifier_VariableDeclarationExpression()
	 * @see java_graph.VariableDeclarationExpression#getModifier
	 * @model opposite="modifier" ordered="false"
	 * @generated
	 */
	EList<VariableDeclarationExpression> getVariableDeclarationExpression();

} // Modifier

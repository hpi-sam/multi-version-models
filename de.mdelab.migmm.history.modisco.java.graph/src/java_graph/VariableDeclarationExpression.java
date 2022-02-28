/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.VariableDeclarationExpression#getModifier <em>Modifier</em>}</li>
 *   <li>{@link java_graph.VariableDeclarationExpression#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getVariableDeclarationExpression()
 * @model
 * @generated
 */
public interface VariableDeclarationExpression extends Expression, AbstractVariablesContainer {
	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Modifier}.
	 * It is bidirectional and its opposite is '{@link java_graph.Modifier#getVariableDeclarationExpression <em>Variable Declaration Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' reference list.
	 * @see java_graph.Java_graphPackage#getVariableDeclarationExpression_Modifier()
	 * @see java_graph.Modifier#getVariableDeclarationExpression
	 * @model opposite="variableDeclarationExpression" ordered="false"
	 * @generated
	 */
	EList<Modifier> getModifier();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' reference list.
	 * @see java_graph.Java_graphPackage#getVariableDeclarationExpression_Annotations()
	 * @model
	 * @generated
	 */
	EList<Annotation> getAnnotations();

} // VariableDeclarationExpression

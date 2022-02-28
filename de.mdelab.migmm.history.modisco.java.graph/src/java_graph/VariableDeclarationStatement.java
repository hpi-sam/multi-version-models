/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.VariableDeclarationStatement#getExtraArrayDimensions <em>Extra Array Dimensions</em>}</li>
 *   <li>{@link java_graph.VariableDeclarationStatement#getModifier <em>Modifier</em>}</li>
 *   <li>{@link java_graph.VariableDeclarationStatement#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getVariableDeclarationStatement()
 * @model
 * @generated
 */
public interface VariableDeclarationStatement extends Statement, AbstractVariablesContainer {
	/**
	 * Returns the value of the '<em><b>Extra Array Dimensions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Array Dimensions</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getVariableDeclarationStatement_ExtraArrayDimensions()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<Integer> getExtraArrayDimensions();

	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Modifier}.
	 * It is bidirectional and its opposite is '{@link java_graph.Modifier#getVariableDeclarationStatement <em>Variable Declaration Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' reference list.
	 * @see java_graph.Java_graphPackage#getVariableDeclarationStatement_Modifier()
	 * @see java_graph.Modifier#getVariableDeclarationStatement
	 * @model opposite="variableDeclarationStatement" ordered="false"
	 * @generated
	 */
	EList<Modifier> getModifier();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' reference list.
	 * @see java_graph.Java_graphPackage#getVariableDeclarationStatement_Annotations()
	 * @model
	 * @generated
	 */
	EList<Annotation> getAnnotations();

} // VariableDeclarationStatement

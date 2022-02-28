/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.SingleVariableDeclaration#getModifier <em>Modifier</em>}</li>
 *   <li>{@link java_graph.SingleVariableDeclaration#getVarargs <em>Varargs</em>}</li>
 *   <li>{@link java_graph.SingleVariableDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link java_graph.SingleVariableDeclaration#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link java_graph.SingleVariableDeclaration#getMethodDeclaration <em>Method Declaration</em>}</li>
 *   <li>{@link java_graph.SingleVariableDeclaration#getCatchClause <em>Catch Clause</em>}</li>
 *   <li>{@link java_graph.SingleVariableDeclaration#getEnhancedForStatement <em>Enhanced For Statement</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getSingleVariableDeclaration()
 * @model
 * @generated
 */
public interface SingleVariableDeclaration extends VariableDeclaration {
	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Modifier}.
	 * It is bidirectional and its opposite is '{@link java_graph.Modifier#getSingleVariableDeclaration <em>Single Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' reference list.
	 * @see java_graph.Java_graphPackage#getSingleVariableDeclaration_Modifier()
	 * @see java_graph.Modifier#getSingleVariableDeclaration
	 * @model opposite="singleVariableDeclaration" ordered="false"
	 * @generated
	 */
	EList<Modifier> getModifier();

	/**
	 * Returns the value of the '<em><b>Varargs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varargs</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getSingleVariableDeclaration_Varargs()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<Boolean> getVarargs();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link java_graph.TypeAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see java_graph.Java_graphPackage#getSingleVariableDeclaration_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<TypeAccess> getType();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' reference list.
	 * @see java_graph.Java_graphPackage#getSingleVariableDeclaration_Annotations()
	 * @model
	 * @generated
	 */
	EList<Annotation> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Method Declaration</b></em>' reference list.
	 * The list contents are of type {@link java_graph.AbstractMethodDeclaration}.
	 * It is bidirectional and its opposite is '{@link java_graph.AbstractMethodDeclaration#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Declaration</em>' reference list.
	 * @see java_graph.Java_graphPackage#getSingleVariableDeclaration_MethodDeclaration()
	 * @see java_graph.AbstractMethodDeclaration#getParameters
	 * @model opposite="parameters" ordered="false"
	 * @generated
	 */
	EList<AbstractMethodDeclaration> getMethodDeclaration();

	/**
	 * Returns the value of the '<em><b>Catch Clause</b></em>' reference list.
	 * The list contents are of type {@link java_graph.CatchClause}.
	 * It is bidirectional and its opposite is '{@link java_graph.CatchClause#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catch Clause</em>' reference list.
	 * @see java_graph.Java_graphPackage#getSingleVariableDeclaration_CatchClause()
	 * @see java_graph.CatchClause#getException
	 * @model opposite="exception" ordered="false"
	 * @generated
	 */
	EList<CatchClause> getCatchClause();

	/**
	 * Returns the value of the '<em><b>Enhanced For Statement</b></em>' reference list.
	 * The list contents are of type {@link java_graph.EnhancedForStatement}.
	 * It is bidirectional and its opposite is '{@link java_graph.EnhancedForStatement#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enhanced For Statement</em>' reference list.
	 * @see java_graph.Java_graphPackage#getSingleVariableDeclaration_EnhancedForStatement()
	 * @see java_graph.EnhancedForStatement#getParameter
	 * @model opposite="parameter" ordered="false"
	 * @generated
	 */
	EList<EnhancedForStatement> getEnhancedForStatement();

} // SingleVariableDeclaration

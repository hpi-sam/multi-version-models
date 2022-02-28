/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Ref Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.MethodRefParameter#getName <em>Name</em>}</li>
 *   <li>{@link java_graph.MethodRefParameter#getVarargs <em>Varargs</em>}</li>
 *   <li>{@link java_graph.MethodRefParameter#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getMethodRefParameter()
 * @model
 * @generated
 */
public interface MethodRefParameter extends ASTNode {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getMethodRefParameter_Name()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<String> getName();

	/**
	 * Returns the value of the '<em><b>Varargs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varargs</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getMethodRefParameter_Varargs()
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
	 * @see java_graph.Java_graphPackage#getMethodRefParameter_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<TypeAccess> getType();

} // MethodRefParameter

/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameterized Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.ParameterizedType#getType <em>Type</em>}</li>
 *   <li>{@link java_graph.ParameterizedType#getTypeArguments <em>Type Arguments</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getParameterizedType()
 * @model
 * @generated
 */
public interface ParameterizedType extends Type {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link java_graph.TypeAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see java_graph.Java_graphPackage#getParameterizedType_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<TypeAccess> getType();

	/**
	 * Returns the value of the '<em><b>Type Arguments</b></em>' reference list.
	 * The list contents are of type {@link java_graph.TypeAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Arguments</em>' reference list.
	 * @see java_graph.Java_graphPackage#getParameterizedType_TypeArguments()
	 * @model
	 * @generated
	 */
	EList<TypeAccess> getTypeArguments();

} // ParameterizedType

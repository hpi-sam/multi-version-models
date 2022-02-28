/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Creation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.ArrayCreation#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link java_graph.ArrayCreation#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link java_graph.ArrayCreation#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getArrayCreation()
 * @model
 * @generated
 */
public interface ArrayCreation extends Expression {
	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' reference list.
	 * @see java_graph.Java_graphPackage#getArrayCreation_Dimensions()
	 * @model
	 * @generated
	 */
	EList<Expression> getDimensions();

	/**
	 * Returns the value of the '<em><b>Initializer</b></em>' reference list.
	 * The list contents are of type {@link java_graph.ArrayInitializer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializer</em>' reference list.
	 * @see java_graph.Java_graphPackage#getArrayCreation_Initializer()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ArrayInitializer> getInitializer();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link java_graph.TypeAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see java_graph.Java_graphPackage#getArrayCreation_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<TypeAccess> getType();

} // ArrayCreation

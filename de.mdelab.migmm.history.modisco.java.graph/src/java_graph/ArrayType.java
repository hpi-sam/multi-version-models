/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.ArrayType#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link java_graph.ArrayType#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getArrayType()
 * @model
 * @generated
 */
public interface ArrayType extends Type {
	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' attribute list.
	 * @see java_graph.Java_graphPackage#getArrayType_Dimensions()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<Integer> getDimensions();

	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' reference list.
	 * The list contents are of type {@link java_graph.TypeAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' reference list.
	 * @see java_graph.Java_graphPackage#getArrayType_ElementType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<TypeAccess> getElementType();

} // ArrayType

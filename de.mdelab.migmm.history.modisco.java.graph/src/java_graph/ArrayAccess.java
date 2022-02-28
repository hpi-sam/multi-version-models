/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.ArrayAccess#getArray <em>Array</em>}</li>
 *   <li>{@link java_graph.ArrayAccess#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getArrayAccess()
 * @model
 * @generated
 */
public interface ArrayAccess extends Expression {
	/**
	 * Returns the value of the '<em><b>Array</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array</em>' reference list.
	 * @see java_graph.Java_graphPackage#getArrayAccess_Array()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Expression> getArray();

	/**
	 * Returns the value of the '<em><b>Index</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' reference list.
	 * @see java_graph.Java_graphPackage#getArrayAccess_Index()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Expression> getIndex();

} // ArrayAccess

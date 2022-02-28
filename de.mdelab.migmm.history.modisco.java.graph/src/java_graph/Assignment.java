/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.Assignment#getLeftHandSide <em>Left Hand Side</em>}</li>
 *   <li>{@link java_graph.Assignment#getOperator <em>Operator</em>}</li>
 *   <li>{@link java_graph.Assignment#getRightHandSide <em>Right Hand Side</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends Expression {
	/**
	 * Returns the value of the '<em><b>Left Hand Side</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Hand Side</em>' reference list.
	 * @see java_graph.Java_graphPackage#getAssignment_LeftHandSide()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Expression> getLeftHandSide();

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute list.
	 * The list contents are of type {@link java_graph.AssignmentKind}.
	 * The literals are from the enumeration {@link java_graph.AssignmentKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute list.
	 * @see java_graph.AssignmentKind
	 * @see java_graph.Java_graphPackage#getAssignment_Operator()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EList<AssignmentKind> getOperator();

	/**
	 * Returns the value of the '<em><b>Right Hand Side</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Hand Side</em>' reference list.
	 * @see java_graph.Java_graphPackage#getAssignment_RightHandSide()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Expression> getRightHandSide();

} // Assignment

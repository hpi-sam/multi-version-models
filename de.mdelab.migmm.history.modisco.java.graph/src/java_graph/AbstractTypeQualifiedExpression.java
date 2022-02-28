/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Type Qualified Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.AbstractTypeQualifiedExpression#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getAbstractTypeQualifiedExpression()
 * @model abstract="true"
 * @generated
 */
public interface AbstractTypeQualifiedExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' reference list.
	 * The list contents are of type {@link java_graph.TypeAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' reference list.
	 * @see java_graph.Java_graphPackage#getAbstractTypeQualifiedExpression_Qualifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<TypeAccess> getQualifier();

} // AbstractTypeQualifiedExpression

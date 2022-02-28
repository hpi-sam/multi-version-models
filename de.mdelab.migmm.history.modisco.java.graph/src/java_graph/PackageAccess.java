/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.PackageAccess#getPackage <em>Package</em>}</li>
 *   <li>{@link java_graph.PackageAccess#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getPackageAccess()
 * @model
 * @generated
 */
public interface PackageAccess extends NamespaceAccess {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Package}.
	 * It is bidirectional and its opposite is '{@link java_graph.Package#getUsagesInPackageAccess <em>Usages In Package Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference list.
	 * @see java_graph.Java_graphPackage#getPackageAccess_Package()
	 * @see java_graph.Package#getUsagesInPackageAccess
	 * @model opposite="usagesInPackageAccess" required="true" ordered="false"
	 * @generated
	 */
	EList<java_graph.Package> getPackage();

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' reference list.
	 * The list contents are of type {@link java_graph.PackageAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' reference list.
	 * @see java_graph.Java_graphPackage#getPackageAccess_Qualifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<PackageAccess> getQualifier();

} // PackageAccess

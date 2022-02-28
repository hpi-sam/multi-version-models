/**
 */
package java_graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link java_graph.Package#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link java_graph.Package#getModel <em>Model</em>}</li>
 *   <li>{@link java_graph.Package#getOwnedPackages <em>Owned Packages</em>}</li>
 *   <li>{@link java_graph.Package#getPackage <em>Package</em>}</li>
 *   <li>{@link java_graph.Package#getUsagesInPackageAccess <em>Usages In Package Access</em>}</li>
 * </ul>
 *
 * @see java_graph.Java_graphPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Elements</b></em>' reference list.
	 * The list contents are of type {@link java_graph.AbstractTypeDeclaration}.
	 * It is bidirectional and its opposite is '{@link java_graph.AbstractTypeDeclaration#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Elements</em>' reference list.
	 * @see java_graph.Java_graphPackage#getPackage_OwnedElements()
	 * @see java_graph.AbstractTypeDeclaration#getPackage
	 * @model opposite="package" ordered="false"
	 * @generated
	 */
	EList<AbstractTypeDeclaration> getOwnedElements();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Model}.
	 * It is bidirectional and its opposite is '{@link java_graph.Model#getOwnedElements <em>Owned Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference list.
	 * @see java_graph.Java_graphPackage#getPackage_Model()
	 * @see java_graph.Model#getOwnedElements
	 * @model opposite="ownedElements" ordered="false"
	 * @generated
	 */
	EList<Model> getModel();

	/**
	 * Returns the value of the '<em><b>Owned Packages</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Package}.
	 * It is bidirectional and its opposite is '{@link java_graph.Package#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Packages</em>' reference list.
	 * @see java_graph.Java_graphPackage#getPackage_OwnedPackages()
	 * @see java_graph.Package#getPackage
	 * @model opposite="package" ordered="false"
	 * @generated
	 */
	EList<Package> getOwnedPackages();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference list.
	 * The list contents are of type {@link java_graph.Package}.
	 * It is bidirectional and its opposite is '{@link java_graph.Package#getOwnedPackages <em>Owned Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference list.
	 * @see java_graph.Java_graphPackage#getPackage_Package()
	 * @see java_graph.Package#getOwnedPackages
	 * @model opposite="ownedPackages" ordered="false"
	 * @generated
	 */
	EList<Package> getPackage();

	/**
	 * Returns the value of the '<em><b>Usages In Package Access</b></em>' reference list.
	 * The list contents are of type {@link java_graph.PackageAccess}.
	 * It is bidirectional and its opposite is '{@link java_graph.PackageAccess#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usages In Package Access</em>' reference list.
	 * @see java_graph.Java_graphPackage#getPackage_UsagesInPackageAccess()
	 * @see java_graph.PackageAccess#getPackage
	 * @model opposite="package" ordered="false"
	 * @generated
	 */
	EList<PackageAccess> getUsagesInPackageAccess();

} // Package

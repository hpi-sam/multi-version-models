/**
 */
package java_graph;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see java_graph.Java_graphFactory
 * @model kind="package"
 * @generated
 */
public interface Java_graphPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "java_graph";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_graph";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "java_graph";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Java_graphPackage eINSTANCE = java_graph.impl.Java_graphPackageImpl.init();

	/**
	 * The meta object id for the '{@link java_graph.impl.ASTNodeImpl <em>AST Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.ASTNodeImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getASTNode()
	 * @generated
	 */
	int AST_NODE = 8;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_NODE__COMMENTS = 0;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_NODE__ORIGINAL_COMPILATION_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_NODE__ORIGINAL_CLASS_FILE = 2;

	/**
	 * The number of structural features of the '<em>AST Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_NODE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>AST Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.NamedElementImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 65;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__COMMENTS = AST_NODE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ORIGINAL_COMPILATION_UNIT = AST_NODE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ORIGINAL_CLASS_FILE = AST_NODE__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__PROXY = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__USAGES_IN_IMPORTS = AST_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.BodyDeclarationImpl <em>Body Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.BodyDeclarationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getBodyDeclaration()
	 * @generated
	 */
	int BODY_DECLARATION = 19;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_DECLARATION__COMMENTS = NAMED_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_DECLARATION__ORIGINAL_COMPILATION_UNIT = NAMED_ELEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_DECLARATION__ORIGINAL_CLASS_FILE = NAMED_ELEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_DECLARATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_DECLARATION__PROXY = NAMED_ELEMENT__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_DECLARATION__USAGES_IN_IMPORTS = NAMED_ELEMENT__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_DECLARATION__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_DECLARATION__MODIFIER = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Body Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_DECLARATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Body Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_DECLARATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.AbstractMethodDeclarationImpl <em>Abstract Method Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.AbstractMethodDeclarationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getAbstractMethodDeclaration()
	 * @generated
	 */
	int ABSTRACT_METHOD_DECLARATION = 0;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_DECLARATION__COMMENTS = BODY_DECLARATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_DECLARATION__ORIGINAL_COMPILATION_UNIT = BODY_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_DECLARATION__ORIGINAL_CLASS_FILE = BODY_DECLARATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_DECLARATION__NAME = BODY_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_DECLARATION__PROXY = BODY_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_DECLARATION__USAGES_IN_IMPORTS = BODY_DECLARATION__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_DECLARATION__ABSTRACT_TYPE_DECLARATION = BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_DECLARATION__ANNOTATIONS = BODY_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_DECLARATION__MODIFIER = BODY_DECLARATION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_DECLARATION__BODY = BODY_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_DECLARATION__PARAMETERS = BODY_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Thrown Exceptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS = BODY_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS = BODY_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Usages In Doc Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS = BODY_DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Usages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_DECLARATION__USAGES = BODY_DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Abstract Method Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_DECLARATION_FEATURE_COUNT = BODY_DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Abstract Method Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_DECLARATION_OPERATION_COUNT = BODY_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.AbstractMethodInvocationImpl <em>Abstract Method Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.AbstractMethodInvocationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getAbstractMethodInvocation()
	 * @generated
	 */
	int ABSTRACT_METHOD_INVOCATION = 1;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_INVOCATION__COMMENTS = AST_NODE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_INVOCATION__ORIGINAL_COMPILATION_UNIT = AST_NODE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_INVOCATION__ORIGINAL_CLASS_FILE = AST_NODE__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_INVOCATION__METHOD = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_INVOCATION__ARGUMENTS = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_INVOCATION__TYPE_ARGUMENTS = AST_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Method Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_INVOCATION_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Abstract Method Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_METHOD_INVOCATION_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.AbstractTypeDeclarationImpl <em>Abstract Type Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.AbstractTypeDeclarationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getAbstractTypeDeclaration()
	 * @generated
	 */
	int ABSTRACT_TYPE_DECLARATION = 2;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__COMMENTS = BODY_DECLARATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__ORIGINAL_COMPILATION_UNIT = BODY_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__ORIGINAL_CLASS_FILE = BODY_DECLARATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__NAME = BODY_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__PROXY = BODY_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__USAGES_IN_IMPORTS = BODY_DECLARATION__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__ABSTRACT_TYPE_DECLARATION = BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__ANNOTATIONS = BODY_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__MODIFIER = BODY_DECLARATION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Usages In Type Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS = BODY_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body Declarations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS = BODY_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comments Before Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__COMMENTS_BEFORE_BODY = BODY_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Comments After Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__COMMENTS_AFTER_BODY = BODY_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__PACKAGE = BODY_DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Super Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__SUPER_INTERFACES = BODY_DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Abstract Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION_FEATURE_COUNT = BODY_DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Abstract Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION_OPERATION_COUNT = BODY_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.ExpressionImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 41;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__COMMENTS = AST_NODE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ORIGINAL_COMPILATION_UNIT = AST_NODE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ORIGINAL_CLASS_FILE = AST_NODE__ORIGINAL_CLASS_FILE;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.AbstractTypeQualifiedExpressionImpl <em>Abstract Type Qualified Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.AbstractTypeQualifiedExpressionImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getAbstractTypeQualifiedExpression()
	 * @generated
	 */
	int ABSTRACT_TYPE_QUALIFIED_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_QUALIFIED_EXPRESSION__COMMENTS = EXPRESSION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_QUALIFIED_EXPRESSION__ORIGINAL_COMPILATION_UNIT = EXPRESSION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_QUALIFIED_EXPRESSION__ORIGINAL_CLASS_FILE = EXPRESSION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_QUALIFIED_EXPRESSION__QUALIFIER = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Type Qualified Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_QUALIFIED_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Type Qualified Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_QUALIFIED_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.AbstractVariablesContainerImpl <em>Abstract Variables Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.AbstractVariablesContainerImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getAbstractVariablesContainer()
	 * @generated
	 */
	int ABSTRACT_VARIABLES_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLES_CONTAINER__COMMENTS = AST_NODE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLES_CONTAINER__ORIGINAL_COMPILATION_UNIT = AST_NODE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLES_CONTAINER__ORIGINAL_CLASS_FILE = AST_NODE__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLES_CONTAINER__TYPE = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLES_CONTAINER__FRAGMENTS = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Variables Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLES_CONTAINER_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Variables Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLES_CONTAINER_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.AnnotationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 5;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__COMMENTS = EXPRESSION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ORIGINAL_COMPILATION_UNIT = EXPRESSION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ORIGINAL_CLASS_FILE = EXPRESSION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__TYPE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__VALUES = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.ArchiveImpl <em>Archive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.ArchiveImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getArchive()
	 * @generated
	 */
	int ARCHIVE = 6;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__COMMENTS = NAMED_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__ORIGINAL_COMPILATION_UNIT = NAMED_ELEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__ORIGINAL_CLASS_FILE = NAMED_ELEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__PROXY = NAMED_ELEMENT__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__USAGES_IN_IMPORTS = NAMED_ELEMENT__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Original File Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__ORIGINAL_FILE_PATH = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__CLASS_FILES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Manifest</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__MANIFEST = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Archive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Archive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.StatementImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 88;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__COMMENTS = AST_NODE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__ORIGINAL_COMPILATION_UNIT = AST_NODE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__ORIGINAL_CLASS_FILE = AST_NODE__ORIGINAL_CLASS_FILE;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.AssertStatementImpl <em>Assert Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.AssertStatementImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getAssertStatement()
	 * @generated
	 */
	int ASSERT_STATEMENT = 7;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_STATEMENT__COMMENTS = STATEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_STATEMENT__ORIGINAL_COMPILATION_UNIT = STATEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_STATEMENT__ORIGINAL_CLASS_FILE = STATEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_STATEMENT__MESSAGE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assert Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Assert Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.AnnotationMemberValuePairImpl <em>Annotation Member Value Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.AnnotationMemberValuePairImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getAnnotationMemberValuePair()
	 * @generated
	 */
	int ANNOTATION_MEMBER_VALUE_PAIR = 9;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_PAIR__COMMENTS = NAMED_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_PAIR__ORIGINAL_COMPILATION_UNIT = NAMED_ELEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_PAIR__ORIGINAL_CLASS_FILE = NAMED_ELEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_PAIR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_PAIR__PROXY = NAMED_ELEMENT__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_PAIR__USAGES_IN_IMPORTS = NAMED_ELEMENT__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_PAIR__MEMBER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_PAIR__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Annotation Member Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_PAIR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Annotation Member Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_PAIR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.AnnotationTypeDeclarationImpl <em>Annotation Type Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.AnnotationTypeDeclarationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getAnnotationTypeDeclaration()
	 * @generated
	 */
	int ANNOTATION_TYPE_DECLARATION = 10;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_DECLARATION__COMMENTS = ABSTRACT_TYPE_DECLARATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_DECLARATION__ORIGINAL_COMPILATION_UNIT = ABSTRACT_TYPE_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_DECLARATION__ORIGINAL_CLASS_FILE = ABSTRACT_TYPE_DECLARATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_DECLARATION__NAME = ABSTRACT_TYPE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_DECLARATION__PROXY = ABSTRACT_TYPE_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_DECLARATION__USAGES_IN_IMPORTS = ABSTRACT_TYPE_DECLARATION__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_DECLARATION__ABSTRACT_TYPE_DECLARATION = ABSTRACT_TYPE_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_DECLARATION__ANNOTATIONS = ABSTRACT_TYPE_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = ABSTRACT_TYPE_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_DECLARATION__MODIFIER = ABSTRACT_TYPE_DECLARATION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Usages In Type Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS = ABSTRACT_TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS;

	/**
	 * The feature id for the '<em><b>Body Declarations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_DECLARATION__BODY_DECLARATIONS = ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Comments Before Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_DECLARATION__COMMENTS_BEFORE_BODY = ABSTRACT_TYPE_DECLARATION__COMMENTS_BEFORE_BODY;

	/**
	 * The feature id for the '<em><b>Comments After Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_DECLARATION__COMMENTS_AFTER_BODY = ABSTRACT_TYPE_DECLARATION__COMMENTS_AFTER_BODY;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_DECLARATION__PACKAGE = ABSTRACT_TYPE_DECLARATION__PACKAGE;

	/**
	 * The feature id for the '<em><b>Super Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_DECLARATION__SUPER_INTERFACES = ABSTRACT_TYPE_DECLARATION__SUPER_INTERFACES;

	/**
	 * The number of structural features of the '<em>Annotation Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_DECLARATION_FEATURE_COUNT = ABSTRACT_TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Annotation Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_DECLARATION_OPERATION_COUNT = ABSTRACT_TYPE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.AnnotationTypeMemberDeclarationImpl <em>Annotation Type Member Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.AnnotationTypeMemberDeclarationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getAnnotationTypeMemberDeclaration()
	 * @generated
	 */
	int ANNOTATION_TYPE_MEMBER_DECLARATION = 11;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MEMBER_DECLARATION__COMMENTS = BODY_DECLARATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MEMBER_DECLARATION__ORIGINAL_COMPILATION_UNIT = BODY_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MEMBER_DECLARATION__ORIGINAL_CLASS_FILE = BODY_DECLARATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MEMBER_DECLARATION__NAME = BODY_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MEMBER_DECLARATION__PROXY = BODY_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MEMBER_DECLARATION__USAGES_IN_IMPORTS = BODY_DECLARATION__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MEMBER_DECLARATION__ABSTRACT_TYPE_DECLARATION = BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MEMBER_DECLARATION__ANNOTATIONS = BODY_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MEMBER_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MEMBER_DECLARATION__MODIFIER = BODY_DECLARATION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT = BODY_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE = BODY_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Usages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MEMBER_DECLARATION__USAGES = BODY_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Annotation Type Member Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MEMBER_DECLARATION_FEATURE_COUNT = BODY_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Annotation Type Member Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MEMBER_DECLARATION_OPERATION_COUNT = BODY_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.AnonymousClassDeclarationImpl <em>Anonymous Class Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.AnonymousClassDeclarationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getAnonymousClassDeclaration()
	 * @generated
	 */
	int ANONYMOUS_CLASS_DECLARATION = 12;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_DECLARATION__COMMENTS = AST_NODE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_DECLARATION__ORIGINAL_COMPILATION_UNIT = AST_NODE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_DECLARATION__ORIGINAL_CLASS_FILE = AST_NODE__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Body Declarations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_DECLARATION__BODY_DECLARATIONS = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class Instance Creation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_DECLARATION__CLASS_INSTANCE_CREATION = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Anonymous Class Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_DECLARATION_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Anonymous Class Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_DECLARATION_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.ArrayAccessImpl <em>Array Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.ArrayAccessImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getArrayAccess()
	 * @generated
	 */
	int ARRAY_ACCESS = 13;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS__COMMENTS = EXPRESSION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS__ORIGINAL_COMPILATION_UNIT = EXPRESSION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS__ORIGINAL_CLASS_FILE = EXPRESSION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Array</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS__ARRAY = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS__INDEX = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Array Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.ArrayCreationImpl <em>Array Creation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.ArrayCreationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getArrayCreation()
	 * @generated
	 */
	int ARRAY_CREATION = 14;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CREATION__COMMENTS = EXPRESSION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CREATION__ORIGINAL_COMPILATION_UNIT = EXPRESSION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CREATION__ORIGINAL_CLASS_FILE = EXPRESSION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CREATION__DIMENSIONS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initializer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CREATION__INITIALIZER = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CREATION__TYPE = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Array Creation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CREATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Array Creation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CREATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.ArrayInitializerImpl <em>Array Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.ArrayInitializerImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getArrayInitializer()
	 * @generated
	 */
	int ARRAY_INITIALIZER = 15;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INITIALIZER__COMMENTS = EXPRESSION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INITIALIZER__ORIGINAL_COMPILATION_UNIT = EXPRESSION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INITIALIZER__ORIGINAL_CLASS_FILE = EXPRESSION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INITIALIZER__EXPRESSIONS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INITIALIZER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INITIALIZER_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.ArrayLengthAccessImpl <em>Array Length Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.ArrayLengthAccessImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getArrayLengthAccess()
	 * @generated
	 */
	int ARRAY_LENGTH_ACCESS = 16;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LENGTH_ACCESS__COMMENTS = EXPRESSION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LENGTH_ACCESS__ORIGINAL_COMPILATION_UNIT = EXPRESSION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LENGTH_ACCESS__ORIGINAL_CLASS_FILE = EXPRESSION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Array</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LENGTH_ACCESS__ARRAY = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Length Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LENGTH_ACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array Length Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LENGTH_ACCESS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.TypeImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 101;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__COMMENTS = NAMED_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ORIGINAL_COMPILATION_UNIT = NAMED_ELEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ORIGINAL_CLASS_FILE = NAMED_ELEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__PROXY = NAMED_ELEMENT__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__USAGES_IN_IMPORTS = NAMED_ELEMENT__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Usages In Type Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__USAGES_IN_TYPE_ACCESS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.ArrayTypeImpl <em>Array Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.ArrayTypeImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getArrayType()
	 * @generated
	 */
	int ARRAY_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__COMMENTS = TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__ORIGINAL_COMPILATION_UNIT = TYPE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__ORIGINAL_CLASS_FILE = TYPE__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__PROXY = TYPE__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__USAGES_IN_IMPORTS = TYPE__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Usages In Type Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__USAGES_IN_TYPE_ACCESS = TYPE__USAGES_IN_TYPE_ACCESS;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__DIMENSIONS = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__ELEMENT_TYPE = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Array Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.AssignmentImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 18;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__COMMENTS = EXPRESSION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ORIGINAL_COMPILATION_UNIT = EXPRESSION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ORIGINAL_CLASS_FILE = EXPRESSION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Left Hand Side</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__LEFT_HAND_SIDE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Hand Side</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__RIGHT_HAND_SIDE = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.BooleanLiteralImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 20;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__COMMENTS = EXPRESSION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__ORIGINAL_COMPILATION_UNIT = EXPRESSION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__ORIGINAL_CLASS_FILE = EXPRESSION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.CommentImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 33;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__COMMENTS = AST_NODE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__ORIGINAL_COMPILATION_UNIT = AST_NODE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__ORIGINAL_CLASS_FILE = AST_NODE__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CONTENT = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enclosed By Parent</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__ENCLOSED_BY_PARENT = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prefix Of Parent</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__PREFIX_OF_PARENT = AST_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.BlockCommentImpl <em>Block Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.BlockCommentImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getBlockComment()
	 * @generated
	 */
	int BLOCK_COMMENT = 21;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_COMMENT__COMMENTS = COMMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_COMMENT__ORIGINAL_COMPILATION_UNIT = COMMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_COMMENT__ORIGINAL_CLASS_FILE = COMMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_COMMENT__CONTENT = COMMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Enclosed By Parent</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_COMMENT__ENCLOSED_BY_PARENT = COMMENT__ENCLOSED_BY_PARENT;

	/**
	 * The feature id for the '<em><b>Prefix Of Parent</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_COMMENT__PREFIX_OF_PARENT = COMMENT__PREFIX_OF_PARENT;

	/**
	 * The number of structural features of the '<em>Block Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_COMMENT_FEATURE_COUNT = COMMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Block Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_COMMENT_OPERATION_COUNT = COMMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.BlockImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 22;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__COMMENTS = STATEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ORIGINAL_COMPILATION_UNIT = STATEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ORIGINAL_CLASS_FILE = STATEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.BreakStatementImpl <em>Break Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.BreakStatementImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getBreakStatement()
	 * @generated
	 */
	int BREAK_STATEMENT = 23;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT__COMMENTS = STATEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT__ORIGINAL_COMPILATION_UNIT = STATEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT__ORIGINAL_CLASS_FILE = STATEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT__LABEL = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Break Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Break Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.CastExpressionImpl <em>Cast Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.CastExpressionImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getCastExpression()
	 * @generated
	 */
	int CAST_EXPRESSION = 24;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION__COMMENTS = EXPRESSION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION__ORIGINAL_COMPILATION_UNIT = EXPRESSION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION__ORIGINAL_CLASS_FILE = EXPRESSION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION__TYPE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cast Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cast Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.CatchClauseImpl <em>Catch Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.CatchClauseImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getCatchClause()
	 * @generated
	 */
	int CATCH_CLAUSE = 25;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_CLAUSE__COMMENTS = STATEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_CLAUSE__ORIGINAL_COMPILATION_UNIT = STATEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_CLAUSE__ORIGINAL_CLASS_FILE = STATEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_CLAUSE__EXCEPTION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_CLAUSE__BODY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Catch Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_CLAUSE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Catch Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_CLAUSE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.CharacterLiteralImpl <em>Character Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.CharacterLiteralImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getCharacterLiteral()
	 * @generated
	 */
	int CHARACTER_LITERAL = 26;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_LITERAL__COMMENTS = EXPRESSION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_LITERAL__ORIGINAL_COMPILATION_UNIT = EXPRESSION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_LITERAL__ORIGINAL_CLASS_FILE = EXPRESSION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Escaped Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_LITERAL__ESCAPED_VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Character Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Character Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_LITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.ClassFileImpl <em>Class File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.ClassFileImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getClassFile()
	 * @generated
	 */
	int CLASS_FILE = 27;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FILE__COMMENTS = NAMED_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FILE__ORIGINAL_COMPILATION_UNIT = NAMED_ELEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FILE__ORIGINAL_CLASS_FILE = NAMED_ELEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FILE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FILE__PROXY = NAMED_ELEMENT__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FILE__USAGES_IN_IMPORTS = NAMED_ELEMENT__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Original File Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FILE__ORIGINAL_FILE_PATH = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FILE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attached Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FILE__ATTACHED_SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FILE__PACKAGE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Class File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FILE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Class File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FILE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.ClassInstanceCreationImpl <em>Class Instance Creation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.ClassInstanceCreationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getClassInstanceCreation()
	 * @generated
	 */
	int CLASS_INSTANCE_CREATION = 28;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION__COMMENTS = EXPRESSION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION__ORIGINAL_COMPILATION_UNIT = EXPRESSION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION__ORIGINAL_CLASS_FILE = EXPRESSION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION__METHOD = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION__TYPE_ARGUMENTS = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION__ANONYMOUS_CLASS_DECLARATION = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION__TYPE = EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Class Instance Creation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Class Instance Creation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.ConstructorDeclarationImpl <em>Constructor Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.ConstructorDeclarationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getConstructorDeclaration()
	 * @generated
	 */
	int CONSTRUCTOR_DECLARATION = 29;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION__COMMENTS = ABSTRACT_METHOD_DECLARATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION__ORIGINAL_COMPILATION_UNIT = ABSTRACT_METHOD_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION__ORIGINAL_CLASS_FILE = ABSTRACT_METHOD_DECLARATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION__NAME = ABSTRACT_METHOD_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION__PROXY = ABSTRACT_METHOD_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION__USAGES_IN_IMPORTS = ABSTRACT_METHOD_DECLARATION__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION__ABSTRACT_TYPE_DECLARATION = ABSTRACT_METHOD_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION__ANNOTATIONS = ABSTRACT_METHOD_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = ABSTRACT_METHOD_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION__MODIFIER = ABSTRACT_METHOD_DECLARATION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION__BODY = ABSTRACT_METHOD_DECLARATION__BODY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION__PARAMETERS = ABSTRACT_METHOD_DECLARATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Thrown Exceptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION__THROWN_EXCEPTIONS = ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION__TYPE_PARAMETERS = ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Usages In Doc Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION__USAGES_IN_DOC_COMMENTS = ABSTRACT_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS;

	/**
	 * The feature id for the '<em><b>Usages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION__USAGES = ABSTRACT_METHOD_DECLARATION__USAGES;

	/**
	 * The number of structural features of the '<em>Constructor Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION_FEATURE_COUNT = ABSTRACT_METHOD_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constructor Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_DECLARATION_OPERATION_COUNT = ABSTRACT_METHOD_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.ConditionalExpressionImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getConditionalExpression()
	 * @generated
	 */
	int CONDITIONAL_EXPRESSION = 30;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__COMMENTS = EXPRESSION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__ORIGINAL_COMPILATION_UNIT = EXPRESSION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__ORIGINAL_CLASS_FILE = EXPRESSION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Else Expression</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__ELSE_EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Then Expression</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__THEN_EXPRESSION = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conditional Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Conditional Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.ConstructorInvocationImpl <em>Constructor Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.ConstructorInvocationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getConstructorInvocation()
	 * @generated
	 */
	int CONSTRUCTOR_INVOCATION = 31;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION__COMMENTS = STATEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION__ORIGINAL_COMPILATION_UNIT = STATEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION__ORIGINAL_CLASS_FILE = STATEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION__METHOD = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION__ARGUMENTS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION__TYPE_ARGUMENTS = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Constructor Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Constructor Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.TypeDeclarationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getTypeDeclaration()
	 * @generated
	 */
	int TYPE_DECLARATION = 103;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__COMMENTS = ABSTRACT_TYPE_DECLARATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__ORIGINAL_COMPILATION_UNIT = ABSTRACT_TYPE_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__ORIGINAL_CLASS_FILE = ABSTRACT_TYPE_DECLARATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__NAME = ABSTRACT_TYPE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__PROXY = ABSTRACT_TYPE_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__USAGES_IN_IMPORTS = ABSTRACT_TYPE_DECLARATION__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__ABSTRACT_TYPE_DECLARATION = ABSTRACT_TYPE_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__ANNOTATIONS = ABSTRACT_TYPE_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = ABSTRACT_TYPE_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__MODIFIER = ABSTRACT_TYPE_DECLARATION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Usages In Type Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS = ABSTRACT_TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS;

	/**
	 * The feature id for the '<em><b>Body Declarations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__BODY_DECLARATIONS = ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Comments Before Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__COMMENTS_BEFORE_BODY = ABSTRACT_TYPE_DECLARATION__COMMENTS_BEFORE_BODY;

	/**
	 * The feature id for the '<em><b>Comments After Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__COMMENTS_AFTER_BODY = ABSTRACT_TYPE_DECLARATION__COMMENTS_AFTER_BODY;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__PACKAGE = ABSTRACT_TYPE_DECLARATION__PACKAGE;

	/**
	 * The feature id for the '<em><b>Super Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__SUPER_INTERFACES = ABSTRACT_TYPE_DECLARATION__SUPER_INTERFACES;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__TYPE_PARAMETERS = ABSTRACT_TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION_FEATURE_COUNT = ABSTRACT_TYPE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION_OPERATION_COUNT = ABSTRACT_TYPE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.ClassDeclarationImpl <em>Class Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.ClassDeclarationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getClassDeclaration()
	 * @generated
	 */
	int CLASS_DECLARATION = 32;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__COMMENTS = TYPE_DECLARATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__ORIGINAL_COMPILATION_UNIT = TYPE_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__ORIGINAL_CLASS_FILE = TYPE_DECLARATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__NAME = TYPE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__PROXY = TYPE_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__USAGES_IN_IMPORTS = TYPE_DECLARATION__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__ABSTRACT_TYPE_DECLARATION = TYPE_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__ANNOTATIONS = TYPE_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = TYPE_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__MODIFIER = TYPE_DECLARATION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Usages In Type Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__USAGES_IN_TYPE_ACCESS = TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS;

	/**
	 * The feature id for the '<em><b>Body Declarations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__BODY_DECLARATIONS = TYPE_DECLARATION__BODY_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Comments Before Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__COMMENTS_BEFORE_BODY = TYPE_DECLARATION__COMMENTS_BEFORE_BODY;

	/**
	 * The feature id for the '<em><b>Comments After Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__COMMENTS_AFTER_BODY = TYPE_DECLARATION__COMMENTS_AFTER_BODY;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__PACKAGE = TYPE_DECLARATION__PACKAGE;

	/**
	 * The feature id for the '<em><b>Super Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__SUPER_INTERFACES = TYPE_DECLARATION__SUPER_INTERFACES;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__TYPE_PARAMETERS = TYPE_DECLARATION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__SUPER_CLASS = TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION_FEATURE_COUNT = TYPE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Class Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION_OPERATION_COUNT = TYPE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.CompilationUnitImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getCompilationUnit()
	 * @generated
	 */
	int COMPILATION_UNIT = 34;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__COMMENTS = NAMED_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__ORIGINAL_COMPILATION_UNIT = NAMED_ELEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__ORIGINAL_CLASS_FILE = NAMED_ELEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__PROXY = NAMED_ELEMENT__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__USAGES_IN_IMPORTS = NAMED_ELEMENT__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Original File Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__ORIGINAL_FILE_PATH = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__COMMENT_LIST = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__IMPORTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__PACKAGE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__TYPES = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Compilation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Compilation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.ContinueStatementImpl <em>Continue Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.ContinueStatementImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getContinueStatement()
	 * @generated
	 */
	int CONTINUE_STATEMENT = 35;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STATEMENT__COMMENTS = STATEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STATEMENT__ORIGINAL_COMPILATION_UNIT = STATEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STATEMENT__ORIGINAL_CLASS_FILE = STATEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STATEMENT__LABEL = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Continue Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Continue Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.DoStatementImpl <em>Do Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.DoStatementImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getDoStatement()
	 * @generated
	 */
	int DO_STATEMENT = 36;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_STATEMENT__COMMENTS = STATEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_STATEMENT__ORIGINAL_COMPILATION_UNIT = STATEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_STATEMENT__ORIGINAL_CLASS_FILE = STATEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Do Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Do Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.EmptyStatementImpl <em>Empty Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.EmptyStatementImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getEmptyStatement()
	 * @generated
	 */
	int EMPTY_STATEMENT = 37;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_STATEMENT__COMMENTS = STATEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_STATEMENT__ORIGINAL_COMPILATION_UNIT = STATEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_STATEMENT__ORIGINAL_CLASS_FILE = STATEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The number of structural features of the '<em>Empty Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Empty Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.EnhancedForStatementImpl <em>Enhanced For Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.EnhancedForStatementImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getEnhancedForStatement()
	 * @generated
	 */
	int ENHANCED_FOR_STATEMENT = 38;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_FOR_STATEMENT__COMMENTS = STATEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_FOR_STATEMENT__ORIGINAL_COMPILATION_UNIT = STATEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_FOR_STATEMENT__ORIGINAL_CLASS_FILE = STATEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_FOR_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_FOR_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_FOR_STATEMENT__PARAMETER = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Enhanced For Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_FOR_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Enhanced For Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_FOR_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.EnumConstantDeclarationImpl <em>Enum Constant Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.EnumConstantDeclarationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getEnumConstantDeclaration()
	 * @generated
	 */
	int ENUM_CONSTANT_DECLARATION = 39;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT_DECLARATION__COMMENTS = BODY_DECLARATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT_DECLARATION__ORIGINAL_COMPILATION_UNIT = BODY_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT_DECLARATION__ORIGINAL_CLASS_FILE = BODY_DECLARATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT_DECLARATION__NAME = BODY_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT_DECLARATION__PROXY = BODY_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT_DECLARATION__USAGES_IN_IMPORTS = BODY_DECLARATION__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT_DECLARATION__ABSTRACT_TYPE_DECLARATION = BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT_DECLARATION__ANNOTATIONS = BODY_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT_DECLARATION__MODIFIER = BODY_DECLARATION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Extra Array Dimensions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT_DECLARATION__EXTRA_ARRAY_DIMENSIONS = BODY_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initializer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT_DECLARATION__INITIALIZER = BODY_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Usage In Variable Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT_DECLARATION__USAGE_IN_VARIABLE_ACCESS = BODY_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION = BODY_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT_DECLARATION__ARGUMENTS = BODY_DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Enum Constant Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT_DECLARATION_FEATURE_COUNT = BODY_DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Enum Constant Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT_DECLARATION_OPERATION_COUNT = BODY_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.EnumDeclarationImpl <em>Enum Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.EnumDeclarationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getEnumDeclaration()
	 * @generated
	 */
	int ENUM_DECLARATION = 40;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__COMMENTS = ABSTRACT_TYPE_DECLARATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__ORIGINAL_COMPILATION_UNIT = ABSTRACT_TYPE_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__ORIGINAL_CLASS_FILE = ABSTRACT_TYPE_DECLARATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__NAME = ABSTRACT_TYPE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__PROXY = ABSTRACT_TYPE_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__USAGES_IN_IMPORTS = ABSTRACT_TYPE_DECLARATION__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__ABSTRACT_TYPE_DECLARATION = ABSTRACT_TYPE_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__ANNOTATIONS = ABSTRACT_TYPE_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = ABSTRACT_TYPE_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__MODIFIER = ABSTRACT_TYPE_DECLARATION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Usages In Type Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__USAGES_IN_TYPE_ACCESS = ABSTRACT_TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS;

	/**
	 * The feature id for the '<em><b>Body Declarations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__BODY_DECLARATIONS = ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Comments Before Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__COMMENTS_BEFORE_BODY = ABSTRACT_TYPE_DECLARATION__COMMENTS_BEFORE_BODY;

	/**
	 * The feature id for the '<em><b>Comments After Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__COMMENTS_AFTER_BODY = ABSTRACT_TYPE_DECLARATION__COMMENTS_AFTER_BODY;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__PACKAGE = ABSTRACT_TYPE_DECLARATION__PACKAGE;

	/**
	 * The feature id for the '<em><b>Super Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__SUPER_INTERFACES = ABSTRACT_TYPE_DECLARATION__SUPER_INTERFACES;

	/**
	 * The feature id for the '<em><b>Enum Constants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__ENUM_CONSTANTS = ABSTRACT_TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION_FEATURE_COUNT = ABSTRACT_TYPE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enum Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION_OPERATION_COUNT = ABSTRACT_TYPE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.ExpressionStatementImpl <em>Expression Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.ExpressionStatementImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getExpressionStatement()
	 * @generated
	 */
	int EXPRESSION_STATEMENT = 42;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT__COMMENTS = STATEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT__ORIGINAL_COMPILATION_UNIT = STATEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT__ORIGINAL_CLASS_FILE = STATEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.FieldAccessImpl <em>Field Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.FieldAccessImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getFieldAccess()
	 * @generated
	 */
	int FIELD_ACCESS = 43;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS__COMMENTS = EXPRESSION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS__ORIGINAL_COMPILATION_UNIT = EXPRESSION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS__ORIGINAL_CLASS_FILE = EXPRESSION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS__FIELD = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS__EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Field Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.FieldDeclarationImpl <em>Field Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.FieldDeclarationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getFieldDeclaration()
	 * @generated
	 */
	int FIELD_DECLARATION = 44;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION__COMMENTS = BODY_DECLARATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION__ORIGINAL_COMPILATION_UNIT = BODY_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION__ORIGINAL_CLASS_FILE = BODY_DECLARATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION__NAME = BODY_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION__PROXY = BODY_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION__USAGES_IN_IMPORTS = BODY_DECLARATION__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION__ABSTRACT_TYPE_DECLARATION = BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION__ANNOTATIONS = BODY_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION__MODIFIER = BODY_DECLARATION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION__TYPE = BODY_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION__FRAGMENTS = BODY_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION_FEATURE_COUNT = BODY_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Field Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION_OPERATION_COUNT = BODY_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.ForStatementImpl <em>For Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.ForStatementImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getForStatement()
	 * @generated
	 */
	int FOR_STATEMENT = 45;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__COMMENTS = STATEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__ORIGINAL_COMPILATION_UNIT = STATEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__ORIGINAL_CLASS_FILE = STATEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__UPDATERS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initializers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__INITIALIZERS = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>For Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>For Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.IfStatementImpl <em>If Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.IfStatementImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getIfStatement()
	 * @generated
	 */
	int IF_STATEMENT = 46;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__COMMENTS = STATEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__ORIGINAL_COMPILATION_UNIT = STATEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__ORIGINAL_CLASS_FILE = STATEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__THEN_STATEMENT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__ELSE_STATEMENT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.ImportDeclarationImpl <em>Import Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.ImportDeclarationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getImportDeclaration()
	 * @generated
	 */
	int IMPORT_DECLARATION = 47;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DECLARATION__COMMENTS = AST_NODE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DECLARATION__ORIGINAL_COMPILATION_UNIT = AST_NODE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DECLARATION__ORIGINAL_CLASS_FILE = AST_NODE__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DECLARATION__STATIC = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imported Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DECLARATION__IMPORTED_ELEMENT = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Import Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DECLARATION_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Import Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DECLARATION_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.InfixExpressionImpl <em>Infix Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.InfixExpressionImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getInfixExpression()
	 * @generated
	 */
	int INFIX_EXPRESSION = 48;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_EXPRESSION__COMMENTS = EXPRESSION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_EXPRESSION__ORIGINAL_COMPILATION_UNIT = EXPRESSION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_EXPRESSION__ORIGINAL_CLASS_FILE = EXPRESSION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_EXPRESSION__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_EXPRESSION__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Extended Operands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_EXPRESSION__EXTENDED_OPERANDS = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Infix Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Infix Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.InitializerImpl <em>Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.InitializerImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getInitializer()
	 * @generated
	 */
	int INITIALIZER = 49;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__COMMENTS = BODY_DECLARATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__ORIGINAL_COMPILATION_UNIT = BODY_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__ORIGINAL_CLASS_FILE = BODY_DECLARATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__NAME = BODY_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__PROXY = BODY_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__USAGES_IN_IMPORTS = BODY_DECLARATION__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__ABSTRACT_TYPE_DECLARATION = BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__ANNOTATIONS = BODY_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__ANONYMOUS_CLASS_DECLARATION_OWNER = BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__MODIFIER = BODY_DECLARATION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__BODY = BODY_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER_FEATURE_COUNT = BODY_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER_OPERATION_COUNT = BODY_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.InstanceofExpressionImpl <em>Instanceof Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.InstanceofExpressionImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getInstanceofExpression()
	 * @generated
	 */
	int INSTANCEOF_EXPRESSION = 50;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEOF_EXPRESSION__COMMENTS = EXPRESSION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEOF_EXPRESSION__ORIGINAL_COMPILATION_UNIT = EXPRESSION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEOF_EXPRESSION__ORIGINAL_CLASS_FILE = EXPRESSION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEOF_EXPRESSION__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEOF_EXPRESSION__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instanceof Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEOF_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Instanceof Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEOF_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.InterfaceDeclarationImpl <em>Interface Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.InterfaceDeclarationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getInterfaceDeclaration()
	 * @generated
	 */
	int INTERFACE_DECLARATION = 51;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__COMMENTS = TYPE_DECLARATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__ORIGINAL_COMPILATION_UNIT = TYPE_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__ORIGINAL_CLASS_FILE = TYPE_DECLARATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__NAME = TYPE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__PROXY = TYPE_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__USAGES_IN_IMPORTS = TYPE_DECLARATION__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__ABSTRACT_TYPE_DECLARATION = TYPE_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__ANNOTATIONS = TYPE_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = TYPE_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__MODIFIER = TYPE_DECLARATION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Usages In Type Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__USAGES_IN_TYPE_ACCESS = TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS;

	/**
	 * The feature id for the '<em><b>Body Declarations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__BODY_DECLARATIONS = TYPE_DECLARATION__BODY_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Comments Before Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__COMMENTS_BEFORE_BODY = TYPE_DECLARATION__COMMENTS_BEFORE_BODY;

	/**
	 * The feature id for the '<em><b>Comments After Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__COMMENTS_AFTER_BODY = TYPE_DECLARATION__COMMENTS_AFTER_BODY;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__PACKAGE = TYPE_DECLARATION__PACKAGE;

	/**
	 * The feature id for the '<em><b>Super Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__SUPER_INTERFACES = TYPE_DECLARATION__SUPER_INTERFACES;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__TYPE_PARAMETERS = TYPE_DECLARATION__TYPE_PARAMETERS;

	/**
	 * The number of structural features of the '<em>Interface Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION_FEATURE_COUNT = TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION_OPERATION_COUNT = TYPE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.JavadocImpl <em>Javadoc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.JavadocImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getJavadoc()
	 * @generated
	 */
	int JAVADOC = 52;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVADOC__COMMENTS = COMMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVADOC__ORIGINAL_COMPILATION_UNIT = COMMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVADOC__ORIGINAL_CLASS_FILE = COMMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVADOC__CONTENT = COMMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Enclosed By Parent</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVADOC__ENCLOSED_BY_PARENT = COMMENT__ENCLOSED_BY_PARENT;

	/**
	 * The feature id for the '<em><b>Prefix Of Parent</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVADOC__PREFIX_OF_PARENT = COMMENT__PREFIX_OF_PARENT;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVADOC__TAGS = COMMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Javadoc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVADOC_FEATURE_COUNT = COMMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Javadoc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVADOC_OPERATION_COUNT = COMMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.LabeledStatementImpl <em>Labeled Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.LabeledStatementImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getLabeledStatement()
	 * @generated
	 */
	int LABELED_STATEMENT = 53;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_STATEMENT__COMMENTS = NAMED_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_STATEMENT__ORIGINAL_COMPILATION_UNIT = NAMED_ELEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_STATEMENT__ORIGINAL_CLASS_FILE = NAMED_ELEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_STATEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_STATEMENT__PROXY = NAMED_ELEMENT__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_STATEMENT__USAGES_IN_IMPORTS = NAMED_ELEMENT__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_STATEMENT__BODY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Usages In Break Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_STATEMENT__USAGES_IN_BREAK_STATEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Usages In Continue Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_STATEMENT__USAGES_IN_CONTINUE_STATEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Labeled Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_STATEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Labeled Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_STATEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.LineCommentImpl <em>Line Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.LineCommentImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getLineComment()
	 * @generated
	 */
	int LINE_COMMENT = 54;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_COMMENT__COMMENTS = COMMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_COMMENT__ORIGINAL_COMPILATION_UNIT = COMMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_COMMENT__ORIGINAL_CLASS_FILE = COMMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_COMMENT__CONTENT = COMMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Enclosed By Parent</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_COMMENT__ENCLOSED_BY_PARENT = COMMENT__ENCLOSED_BY_PARENT;

	/**
	 * The feature id for the '<em><b>Prefix Of Parent</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_COMMENT__PREFIX_OF_PARENT = COMMENT__PREFIX_OF_PARENT;

	/**
	 * The number of structural features of the '<em>Line Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_COMMENT_FEATURE_COUNT = COMMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Line Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_COMMENT_OPERATION_COUNT = COMMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.ManifestImpl <em>Manifest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.ManifestImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getManifest()
	 * @generated
	 */
	int MANIFEST = 55;

	/**
	 * The feature id for the '<em><b>Main Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__MAIN_ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Entry Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__ENTRY_ATTRIBUTES = 1;

	/**
	 * The number of structural features of the '<em>Manifest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Manifest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.ManifestAttributeImpl <em>Manifest Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.ManifestAttributeImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getManifestAttribute()
	 * @generated
	 */
	int MANIFEST_ATTRIBUTE = 56;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_ATTRIBUTE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_ATTRIBUTE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Manifest Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Manifest Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.ManifestEntryImpl <em>Manifest Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.ManifestEntryImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getManifestEntry()
	 * @generated
	 */
	int MANIFEST_ENTRY = 57;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_ENTRY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_ENTRY__ATTRIBUTES = 1;

	/**
	 * The number of structural features of the '<em>Manifest Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Manifest Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.MemberRefImpl <em>Member Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.MemberRefImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getMemberRef()
	 * @generated
	 */
	int MEMBER_REF = 58;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_REF__COMMENTS = AST_NODE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_REF__ORIGINAL_COMPILATION_UNIT = AST_NODE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_REF__ORIGINAL_CLASS_FILE = AST_NODE__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_REF__MEMBER = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_REF__QUALIFIER = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Member Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_REF_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Member Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_REF_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.MethodDeclarationImpl <em>Method Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.MethodDeclarationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getMethodDeclaration()
	 * @generated
	 */
	int METHOD_DECLARATION = 59;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__COMMENTS = ABSTRACT_METHOD_DECLARATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__ORIGINAL_COMPILATION_UNIT = ABSTRACT_METHOD_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__ORIGINAL_CLASS_FILE = ABSTRACT_METHOD_DECLARATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__NAME = ABSTRACT_METHOD_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__PROXY = ABSTRACT_METHOD_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__USAGES_IN_IMPORTS = ABSTRACT_METHOD_DECLARATION__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__ABSTRACT_TYPE_DECLARATION = ABSTRACT_METHOD_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__ANNOTATIONS = ABSTRACT_METHOD_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = ABSTRACT_METHOD_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__MODIFIER = ABSTRACT_METHOD_DECLARATION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__BODY = ABSTRACT_METHOD_DECLARATION__BODY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__PARAMETERS = ABSTRACT_METHOD_DECLARATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Thrown Exceptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__THROWN_EXCEPTIONS = ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__TYPE_PARAMETERS = ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Usages In Doc Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS = ABSTRACT_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS;

	/**
	 * The feature id for the '<em><b>Usages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__USAGES = ABSTRACT_METHOD_DECLARATION__USAGES;

	/**
	 * The feature id for the '<em><b>Extra Array Dimensions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__EXTRA_ARRAY_DIMENSIONS = ABSTRACT_METHOD_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__RETURN_TYPE = ABSTRACT_METHOD_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Redefined Method Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION = ABSTRACT_METHOD_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Redefinitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__REDEFINITIONS = ABSTRACT_METHOD_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Method Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION_FEATURE_COUNT = ABSTRACT_METHOD_DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Method Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION_OPERATION_COUNT = ABSTRACT_METHOD_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.MethodInvocationImpl <em>Method Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.MethodInvocationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getMethodInvocation()
	 * @generated
	 */
	int METHOD_INVOCATION = 60;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION__COMMENTS = EXPRESSION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION__ORIGINAL_COMPILATION_UNIT = EXPRESSION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION__ORIGINAL_CLASS_FILE = EXPRESSION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION__METHOD = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION__TYPE_ARGUMENTS = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Method Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Method Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.MethodRefImpl <em>Method Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.MethodRefImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getMethodRef()
	 * @generated
	 */
	int METHOD_REF = 61;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_REF__COMMENTS = AST_NODE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_REF__ORIGINAL_COMPILATION_UNIT = AST_NODE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_REF__ORIGINAL_CLASS_FILE = AST_NODE__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_REF__METHOD = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_REF__QUALIFIER = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_REF__PARAMETERS = AST_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Method Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_REF_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Method Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_REF_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.MethodRefParameterImpl <em>Method Ref Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.MethodRefParameterImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getMethodRefParameter()
	 * @generated
	 */
	int METHOD_REF_PARAMETER = 62;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_REF_PARAMETER__COMMENTS = AST_NODE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_REF_PARAMETER__ORIGINAL_COMPILATION_UNIT = AST_NODE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_REF_PARAMETER__ORIGINAL_CLASS_FILE = AST_NODE__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_REF_PARAMETER__NAME = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Varargs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_REF_PARAMETER__VARARGS = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_REF_PARAMETER__TYPE = AST_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Method Ref Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_REF_PARAMETER_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Method Ref Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_REF_PARAMETER_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.ModelImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 63;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OWNED_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Orphan Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ORPHAN_TYPES = 2;

	/**
	 * The feature id for the '<em><b>Unresolved Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__UNRESOLVED_ITEMS = 3;

	/**
	 * The feature id for the '<em><b>Compilation Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__COMPILATION_UNITS = 4;

	/**
	 * The feature id for the '<em><b>Class Files</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CLASS_FILES = 5;

	/**
	 * The feature id for the '<em><b>Archives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ARCHIVES = 6;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.ModifierImpl <em>Modifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.ModifierImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getModifier()
	 * @generated
	 */
	int MODIFIER = 64;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__COMMENTS = AST_NODE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__ORIGINAL_COMPILATION_UNIT = AST_NODE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__ORIGINAL_CLASS_FILE = AST_NODE__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__VISIBILITY = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__INHERITANCE = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__STATIC = AST_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__TRANSIENT = AST_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__VOLATILE = AST_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Native</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__NATIVE = AST_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Strictfp</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__STRICTFP = AST_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__SYNCHRONIZED = AST_NODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Body Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__BODY_DECLARATION = AST_NODE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Single Variable Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__SINGLE_VARIABLE_DECLARATION = AST_NODE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Variable Declaration Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__VARIABLE_DECLARATION_STATEMENT = AST_NODE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Variable Declaration Expression</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__VARIABLE_DECLARATION_EXPRESSION = AST_NODE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.NamespaceAccessImpl <em>Namespace Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.NamespaceAccessImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getNamespaceAccess()
	 * @generated
	 */
	int NAMESPACE_ACCESS = 66;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_ACCESS__COMMENTS = AST_NODE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_ACCESS__ORIGINAL_COMPILATION_UNIT = AST_NODE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_ACCESS__ORIGINAL_CLASS_FILE = AST_NODE__ORIGINAL_CLASS_FILE;

	/**
	 * The number of structural features of the '<em>Namespace Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_ACCESS_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Namespace Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_ACCESS_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.NumberLiteralImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getNumberLiteral()
	 * @generated
	 */
	int NUMBER_LITERAL = 67;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL__COMMENTS = EXPRESSION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL__ORIGINAL_COMPILATION_UNIT = EXPRESSION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL__ORIGINAL_CLASS_FILE = EXPRESSION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Token Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL__TOKEN_VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.NullLiteralImpl <em>Null Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.NullLiteralImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getNullLiteral()
	 * @generated
	 */
	int NULL_LITERAL = 68;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL__COMMENTS = EXPRESSION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL__ORIGINAL_COMPILATION_UNIT = EXPRESSION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL__ORIGINAL_CLASS_FILE = EXPRESSION__ORIGINAL_CLASS_FILE;

	/**
	 * The number of structural features of the '<em>Null Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Null Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.PackageImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 69;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__COMMENTS = NAMED_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ORIGINAL_COMPILATION_UNIT = NAMED_ELEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ORIGINAL_CLASS_FILE = NAMED_ELEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PROXY = NAMED_ELEMENT__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__USAGES_IN_IMPORTS = NAMED_ELEMENT__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Owned Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MODEL = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Packages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_PACKAGES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Usages In Package Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__USAGES_IN_PACKAGE_ACCESS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.PackageAccessImpl <em>Package Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.PackageAccessImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getPackageAccess()
	 * @generated
	 */
	int PACKAGE_ACCESS = 70;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ACCESS__COMMENTS = NAMESPACE_ACCESS__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ACCESS__ORIGINAL_COMPILATION_UNIT = NAMESPACE_ACCESS__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ACCESS__ORIGINAL_CLASS_FILE = NAMESPACE_ACCESS__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ACCESS__PACKAGE = NAMESPACE_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ACCESS__QUALIFIER = NAMESPACE_ACCESS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Package Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ACCESS_FEATURE_COUNT = NAMESPACE_ACCESS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Package Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ACCESS_OPERATION_COUNT = NAMESPACE_ACCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.ParameterizedTypeImpl <em>Parameterized Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.ParameterizedTypeImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getParameterizedType()
	 * @generated
	 */
	int PARAMETERIZED_TYPE = 71;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE__COMMENTS = TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE__ORIGINAL_COMPILATION_UNIT = TYPE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE__ORIGINAL_CLASS_FILE = TYPE__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE__PROXY = TYPE__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE__USAGES_IN_IMPORTS = TYPE__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Usages In Type Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE__USAGES_IN_TYPE_ACCESS = TYPE__USAGES_IN_TYPE_ACCESS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE__TYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE__TYPE_ARGUMENTS = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameterized Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameterized Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.ParenthesizedExpressionImpl <em>Parenthesized Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.ParenthesizedExpressionImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getParenthesizedExpression()
	 * @generated
	 */
	int PARENTHESIZED_EXPRESSION = 72;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIZED_EXPRESSION__COMMENTS = EXPRESSION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIZED_EXPRESSION__ORIGINAL_COMPILATION_UNIT = EXPRESSION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIZED_EXPRESSION__ORIGINAL_CLASS_FILE = EXPRESSION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIZED_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parenthesized Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIZED_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parenthesized Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIZED_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.PostfixExpressionImpl <em>Postfix Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.PostfixExpressionImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getPostfixExpression()
	 * @generated
	 */
	int POSTFIX_EXPRESSION = 73;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTFIX_EXPRESSION__COMMENTS = EXPRESSION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTFIX_EXPRESSION__ORIGINAL_COMPILATION_UNIT = EXPRESSION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTFIX_EXPRESSION__ORIGINAL_CLASS_FILE = EXPRESSION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTFIX_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTFIX_EXPRESSION__OPERAND = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Postfix Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTFIX_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Postfix Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTFIX_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.PrefixExpressionImpl <em>Prefix Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.PrefixExpressionImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getPrefixExpression()
	 * @generated
	 */
	int PREFIX_EXPRESSION = 74;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_EXPRESSION__COMMENTS = EXPRESSION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_EXPRESSION__ORIGINAL_COMPILATION_UNIT = EXPRESSION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_EXPRESSION__ORIGINAL_CLASS_FILE = EXPRESSION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_EXPRESSION__OPERAND = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Prefix Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Prefix Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.PrimitiveTypeImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 75;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__COMMENTS = TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__ORIGINAL_COMPILATION_UNIT = TYPE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__ORIGINAL_CLASS_FILE = TYPE__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__PROXY = TYPE__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__USAGES_IN_IMPORTS = TYPE__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Usages In Type Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__USAGES_IN_TYPE_ACCESS = TYPE__USAGES_IN_TYPE_ACCESS;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.PrimitiveTypeBooleanImpl <em>Primitive Type Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.PrimitiveTypeBooleanImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getPrimitiveTypeBoolean()
	 * @generated
	 */
	int PRIMITIVE_TYPE_BOOLEAN = 76;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_BOOLEAN__COMMENTS = PRIMITIVE_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_BOOLEAN__ORIGINAL_COMPILATION_UNIT = PRIMITIVE_TYPE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_BOOLEAN__ORIGINAL_CLASS_FILE = PRIMITIVE_TYPE__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_BOOLEAN__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_BOOLEAN__PROXY = PRIMITIVE_TYPE__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_BOOLEAN__USAGES_IN_IMPORTS = PRIMITIVE_TYPE__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Usages In Type Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_BOOLEAN__USAGES_IN_TYPE_ACCESS = PRIMITIVE_TYPE__USAGES_IN_TYPE_ACCESS;

	/**
	 * The number of structural features of the '<em>Primitive Type Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_BOOLEAN_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Type Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_BOOLEAN_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.PrimitiveTypeByteImpl <em>Primitive Type Byte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.PrimitiveTypeByteImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getPrimitiveTypeByte()
	 * @generated
	 */
	int PRIMITIVE_TYPE_BYTE = 77;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_BYTE__COMMENTS = PRIMITIVE_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_BYTE__ORIGINAL_COMPILATION_UNIT = PRIMITIVE_TYPE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_BYTE__ORIGINAL_CLASS_FILE = PRIMITIVE_TYPE__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_BYTE__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_BYTE__PROXY = PRIMITIVE_TYPE__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_BYTE__USAGES_IN_IMPORTS = PRIMITIVE_TYPE__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Usages In Type Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_BYTE__USAGES_IN_TYPE_ACCESS = PRIMITIVE_TYPE__USAGES_IN_TYPE_ACCESS;

	/**
	 * The number of structural features of the '<em>Primitive Type Byte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_BYTE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Type Byte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_BYTE_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.PrimitiveTypeCharImpl <em>Primitive Type Char</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.PrimitiveTypeCharImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getPrimitiveTypeChar()
	 * @generated
	 */
	int PRIMITIVE_TYPE_CHAR = 78;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_CHAR__COMMENTS = PRIMITIVE_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_CHAR__ORIGINAL_COMPILATION_UNIT = PRIMITIVE_TYPE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_CHAR__ORIGINAL_CLASS_FILE = PRIMITIVE_TYPE__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_CHAR__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_CHAR__PROXY = PRIMITIVE_TYPE__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_CHAR__USAGES_IN_IMPORTS = PRIMITIVE_TYPE__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Usages In Type Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_CHAR__USAGES_IN_TYPE_ACCESS = PRIMITIVE_TYPE__USAGES_IN_TYPE_ACCESS;

	/**
	 * The number of structural features of the '<em>Primitive Type Char</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_CHAR_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Type Char</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_CHAR_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.PrimitiveTypeDoubleImpl <em>Primitive Type Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.PrimitiveTypeDoubleImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getPrimitiveTypeDouble()
	 * @generated
	 */
	int PRIMITIVE_TYPE_DOUBLE = 79;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_DOUBLE__COMMENTS = PRIMITIVE_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_DOUBLE__ORIGINAL_COMPILATION_UNIT = PRIMITIVE_TYPE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_DOUBLE__ORIGINAL_CLASS_FILE = PRIMITIVE_TYPE__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_DOUBLE__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_DOUBLE__PROXY = PRIMITIVE_TYPE__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_DOUBLE__USAGES_IN_IMPORTS = PRIMITIVE_TYPE__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Usages In Type Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_DOUBLE__USAGES_IN_TYPE_ACCESS = PRIMITIVE_TYPE__USAGES_IN_TYPE_ACCESS;

	/**
	 * The number of structural features of the '<em>Primitive Type Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_DOUBLE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Type Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_DOUBLE_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.PrimitiveTypeShortImpl <em>Primitive Type Short</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.PrimitiveTypeShortImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getPrimitiveTypeShort()
	 * @generated
	 */
	int PRIMITIVE_TYPE_SHORT = 80;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHORT__COMMENTS = PRIMITIVE_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHORT__ORIGINAL_COMPILATION_UNIT = PRIMITIVE_TYPE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHORT__ORIGINAL_CLASS_FILE = PRIMITIVE_TYPE__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHORT__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHORT__PROXY = PRIMITIVE_TYPE__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHORT__USAGES_IN_IMPORTS = PRIMITIVE_TYPE__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Usages In Type Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHORT__USAGES_IN_TYPE_ACCESS = PRIMITIVE_TYPE__USAGES_IN_TYPE_ACCESS;

	/**
	 * The number of structural features of the '<em>Primitive Type Short</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHORT_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Type Short</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHORT_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.PrimitiveTypeFloatImpl <em>Primitive Type Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.PrimitiveTypeFloatImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getPrimitiveTypeFloat()
	 * @generated
	 */
	int PRIMITIVE_TYPE_FLOAT = 81;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FLOAT__COMMENTS = PRIMITIVE_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FLOAT__ORIGINAL_COMPILATION_UNIT = PRIMITIVE_TYPE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FLOAT__ORIGINAL_CLASS_FILE = PRIMITIVE_TYPE__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FLOAT__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FLOAT__PROXY = PRIMITIVE_TYPE__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FLOAT__USAGES_IN_IMPORTS = PRIMITIVE_TYPE__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Usages In Type Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FLOAT__USAGES_IN_TYPE_ACCESS = PRIMITIVE_TYPE__USAGES_IN_TYPE_ACCESS;

	/**
	 * The number of structural features of the '<em>Primitive Type Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FLOAT_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Type Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FLOAT_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.PrimitiveTypeIntImpl <em>Primitive Type Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.PrimitiveTypeIntImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getPrimitiveTypeInt()
	 * @generated
	 */
	int PRIMITIVE_TYPE_INT = 82;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_INT__COMMENTS = PRIMITIVE_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_INT__ORIGINAL_COMPILATION_UNIT = PRIMITIVE_TYPE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_INT__ORIGINAL_CLASS_FILE = PRIMITIVE_TYPE__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_INT__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_INT__PROXY = PRIMITIVE_TYPE__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_INT__USAGES_IN_IMPORTS = PRIMITIVE_TYPE__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Usages In Type Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_INT__USAGES_IN_TYPE_ACCESS = PRIMITIVE_TYPE__USAGES_IN_TYPE_ACCESS;

	/**
	 * The number of structural features of the '<em>Primitive Type Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_INT_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Type Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_INT_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.PrimitiveTypeLongImpl <em>Primitive Type Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.PrimitiveTypeLongImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getPrimitiveTypeLong()
	 * @generated
	 */
	int PRIMITIVE_TYPE_LONG = 83;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_LONG__COMMENTS = PRIMITIVE_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_LONG__ORIGINAL_COMPILATION_UNIT = PRIMITIVE_TYPE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_LONG__ORIGINAL_CLASS_FILE = PRIMITIVE_TYPE__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_LONG__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_LONG__PROXY = PRIMITIVE_TYPE__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_LONG__USAGES_IN_IMPORTS = PRIMITIVE_TYPE__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Usages In Type Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_LONG__USAGES_IN_TYPE_ACCESS = PRIMITIVE_TYPE__USAGES_IN_TYPE_ACCESS;

	/**
	 * The number of structural features of the '<em>Primitive Type Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_LONG_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Type Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_LONG_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.PrimitiveTypeVoidImpl <em>Primitive Type Void</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.PrimitiveTypeVoidImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getPrimitiveTypeVoid()
	 * @generated
	 */
	int PRIMITIVE_TYPE_VOID = 84;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_VOID__COMMENTS = PRIMITIVE_TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_VOID__ORIGINAL_COMPILATION_UNIT = PRIMITIVE_TYPE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_VOID__ORIGINAL_CLASS_FILE = PRIMITIVE_TYPE__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_VOID__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_VOID__PROXY = PRIMITIVE_TYPE__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_VOID__USAGES_IN_IMPORTS = PRIMITIVE_TYPE__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Usages In Type Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_VOID__USAGES_IN_TYPE_ACCESS = PRIMITIVE_TYPE__USAGES_IN_TYPE_ACCESS;

	/**
	 * The number of structural features of the '<em>Primitive Type Void</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_VOID_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Type Void</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_VOID_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.ReturnStatementImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getReturnStatement()
	 * @generated
	 */
	int RETURN_STATEMENT = 85;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__COMMENTS = STATEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__ORIGINAL_COMPILATION_UNIT = STATEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__ORIGINAL_CLASS_FILE = STATEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Return Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.SingleVariableAccessImpl <em>Single Variable Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.SingleVariableAccessImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getSingleVariableAccess()
	 * @generated
	 */
	int SINGLE_VARIABLE_ACCESS = 86;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_ACCESS__COMMENTS = EXPRESSION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_ACCESS__ORIGINAL_COMPILATION_UNIT = EXPRESSION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_ACCESS__ORIGINAL_CLASS_FILE = EXPRESSION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_ACCESS__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_ACCESS__QUALIFIER = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Single Variable Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_ACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Single Variable Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_ACCESS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.VariableDeclarationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getVariableDeclaration()
	 * @generated
	 */
	int VARIABLE_DECLARATION = 120;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__COMMENTS = NAMED_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__ORIGINAL_COMPILATION_UNIT = NAMED_ELEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__ORIGINAL_CLASS_FILE = NAMED_ELEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__PROXY = NAMED_ELEMENT__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__USAGES_IN_IMPORTS = NAMED_ELEMENT__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Extra Array Dimensions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initializer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__INITIALIZER = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Usage In Variable Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.SingleVariableDeclarationImpl <em>Single Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.SingleVariableDeclarationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getSingleVariableDeclaration()
	 * @generated
	 */
	int SINGLE_VARIABLE_DECLARATION = 87;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION__COMMENTS = VARIABLE_DECLARATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION__ORIGINAL_COMPILATION_UNIT = VARIABLE_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION__ORIGINAL_CLASS_FILE = VARIABLE_DECLARATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION__NAME = VARIABLE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION__PROXY = VARIABLE_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION__USAGES_IN_IMPORTS = VARIABLE_DECLARATION__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Extra Array Dimensions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS = VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Initializer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION__INITIALIZER = VARIABLE_DECLARATION__INITIALIZER;

	/**
	 * The feature id for the '<em><b>Usage In Variable Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS = VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION__MODIFIER = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Varargs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION__VARARGS = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION__TYPE = VARIABLE_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION__ANNOTATIONS = VARIABLE_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Method Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION = VARIABLE_DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Catch Clause</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE = VARIABLE_DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Enhanced For Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT = VARIABLE_DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Single Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Single Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION_OPERATION_COUNT = VARIABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.StringLiteralImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 89;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__COMMENTS = EXPRESSION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__ORIGINAL_COMPILATION_UNIT = EXPRESSION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__ORIGINAL_CLASS_FILE = EXPRESSION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Escaped Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__ESCAPED_VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.SuperConstructorInvocationImpl <em>Super Constructor Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.SuperConstructorInvocationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getSuperConstructorInvocation()
	 * @generated
	 */
	int SUPER_CONSTRUCTOR_INVOCATION = 90;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONSTRUCTOR_INVOCATION__COMMENTS = STATEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONSTRUCTOR_INVOCATION__ORIGINAL_COMPILATION_UNIT = STATEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONSTRUCTOR_INVOCATION__ORIGINAL_CLASS_FILE = STATEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONSTRUCTOR_INVOCATION__METHOD = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONSTRUCTOR_INVOCATION__ARGUMENTS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONSTRUCTOR_INVOCATION__TYPE_ARGUMENTS = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONSTRUCTOR_INVOCATION__EXPRESSION = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Super Constructor Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONSTRUCTOR_INVOCATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Super Constructor Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONSTRUCTOR_INVOCATION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.SuperFieldAccessImpl <em>Super Field Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.SuperFieldAccessImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getSuperFieldAccess()
	 * @generated
	 */
	int SUPER_FIELD_ACCESS = 91;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FIELD_ACCESS__COMMENTS = ABSTRACT_TYPE_QUALIFIED_EXPRESSION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FIELD_ACCESS__ORIGINAL_COMPILATION_UNIT = ABSTRACT_TYPE_QUALIFIED_EXPRESSION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FIELD_ACCESS__ORIGINAL_CLASS_FILE = ABSTRACT_TYPE_QUALIFIED_EXPRESSION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FIELD_ACCESS__QUALIFIER = ABSTRACT_TYPE_QUALIFIED_EXPRESSION__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FIELD_ACCESS__FIELD = ABSTRACT_TYPE_QUALIFIED_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Super Field Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FIELD_ACCESS_FEATURE_COUNT = ABSTRACT_TYPE_QUALIFIED_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Super Field Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FIELD_ACCESS_OPERATION_COUNT = ABSTRACT_TYPE_QUALIFIED_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.SuperMethodInvocationImpl <em>Super Method Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.SuperMethodInvocationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getSuperMethodInvocation()
	 * @generated
	 */
	int SUPER_METHOD_INVOCATION = 92;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION__COMMENTS = ABSTRACT_TYPE_QUALIFIED_EXPRESSION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION__ORIGINAL_COMPILATION_UNIT = ABSTRACT_TYPE_QUALIFIED_EXPRESSION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION__ORIGINAL_CLASS_FILE = ABSTRACT_TYPE_QUALIFIED_EXPRESSION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION__QUALIFIER = ABSTRACT_TYPE_QUALIFIED_EXPRESSION__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION__METHOD = ABSTRACT_TYPE_QUALIFIED_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION__ARGUMENTS = ABSTRACT_TYPE_QUALIFIED_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION__TYPE_ARGUMENTS = ABSTRACT_TYPE_QUALIFIED_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Super Method Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION_FEATURE_COUNT = ABSTRACT_TYPE_QUALIFIED_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Super Method Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION_OPERATION_COUNT = ABSTRACT_TYPE_QUALIFIED_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.SwitchCaseImpl <em>Switch Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.SwitchCaseImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getSwitchCase()
	 * @generated
	 */
	int SWITCH_CASE = 93;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE__COMMENTS = STATEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE__ORIGINAL_COMPILATION_UNIT = STATEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE__ORIGINAL_CLASS_FILE = STATEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE__DEFAULT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE__EXPRESSION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Switch Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Switch Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.SwitchStatementImpl <em>Switch Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.SwitchStatementImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getSwitchStatement()
	 * @generated
	 */
	int SWITCH_STATEMENT = 94;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT__COMMENTS = STATEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT__ORIGINAL_COMPILATION_UNIT = STATEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT__ORIGINAL_CLASS_FILE = STATEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT__STATEMENTS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Switch Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Switch Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.SynchronizedStatementImpl <em>Synchronized Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.SynchronizedStatementImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getSynchronizedStatement()
	 * @generated
	 */
	int SYNCHRONIZED_STATEMENT = 95;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED_STATEMENT__COMMENTS = STATEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED_STATEMENT__ORIGINAL_COMPILATION_UNIT = STATEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED_STATEMENT__ORIGINAL_CLASS_FILE = STATEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Synchronized Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Synchronized Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.TagElementImpl <em>Tag Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.TagElementImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getTagElement()
	 * @generated
	 */
	int TAG_ELEMENT = 96;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_ELEMENT__COMMENTS = AST_NODE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_ELEMENT__ORIGINAL_COMPILATION_UNIT = AST_NODE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_ELEMENT__ORIGINAL_CLASS_FILE = AST_NODE__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Tag Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_ELEMENT__TAG_NAME = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_ELEMENT__FRAGMENTS = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tag Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_ELEMENT_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tag Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_ELEMENT_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.TextElementImpl <em>Text Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.TextElementImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getTextElement()
	 * @generated
	 */
	int TEXT_ELEMENT = 97;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT__COMMENTS = AST_NODE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT__ORIGINAL_COMPILATION_UNIT = AST_NODE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT__ORIGINAL_CLASS_FILE = AST_NODE__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT__TEXT = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.ThisExpressionImpl <em>This Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.ThisExpressionImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getThisExpression()
	 * @generated
	 */
	int THIS_EXPRESSION = 98;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_EXPRESSION__COMMENTS = ABSTRACT_TYPE_QUALIFIED_EXPRESSION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_EXPRESSION__ORIGINAL_COMPILATION_UNIT = ABSTRACT_TYPE_QUALIFIED_EXPRESSION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_EXPRESSION__ORIGINAL_CLASS_FILE = ABSTRACT_TYPE_QUALIFIED_EXPRESSION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_EXPRESSION__QUALIFIER = ABSTRACT_TYPE_QUALIFIED_EXPRESSION__QUALIFIER;

	/**
	 * The number of structural features of the '<em>This Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_EXPRESSION_FEATURE_COUNT = ABSTRACT_TYPE_QUALIFIED_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>This Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_EXPRESSION_OPERATION_COUNT = ABSTRACT_TYPE_QUALIFIED_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.ThrowStatementImpl <em>Throw Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.ThrowStatementImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getThrowStatement()
	 * @generated
	 */
	int THROW_STATEMENT = 99;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_STATEMENT__COMMENTS = STATEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_STATEMENT__ORIGINAL_COMPILATION_UNIT = STATEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_STATEMENT__ORIGINAL_CLASS_FILE = STATEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Throw Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Throw Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.TryStatementImpl <em>Try Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.TryStatementImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getTryStatement()
	 * @generated
	 */
	int TRY_STATEMENT = 100;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT__COMMENTS = STATEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT__ORIGINAL_COMPILATION_UNIT = STATEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT__ORIGINAL_CLASS_FILE = STATEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Finally</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT__FINALLY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Catch Clauses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT__CATCH_CLAUSES = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Try Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Try Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.TypeAccessImpl <em>Type Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.TypeAccessImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getTypeAccess()
	 * @generated
	 */
	int TYPE_ACCESS = 102;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ACCESS__COMMENTS = EXPRESSION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ACCESS__ORIGINAL_COMPILATION_UNIT = EXPRESSION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ACCESS__ORIGINAL_CLASS_FILE = EXPRESSION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ACCESS__TYPE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ACCESS__QUALIFIER = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Type Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ACCESS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.TypeDeclarationStatementImpl <em>Type Declaration Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.TypeDeclarationStatementImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getTypeDeclarationStatement()
	 * @generated
	 */
	int TYPE_DECLARATION_STATEMENT = 104;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION_STATEMENT__COMMENTS = STATEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION_STATEMENT__ORIGINAL_COMPILATION_UNIT = STATEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION_STATEMENT__ORIGINAL_CLASS_FILE = STATEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION_STATEMENT__DECLARATION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Declaration Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type Declaration Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.TypeLiteralImpl <em>Type Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.TypeLiteralImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getTypeLiteral()
	 * @generated
	 */
	int TYPE_LITERAL = 105;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LITERAL__COMMENTS = EXPRESSION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LITERAL__ORIGINAL_COMPILATION_UNIT = EXPRESSION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LITERAL__ORIGINAL_CLASS_FILE = EXPRESSION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LITERAL__TYPE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.TypeParameterImpl <em>Type Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.TypeParameterImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getTypeParameter()
	 * @generated
	 */
	int TYPE_PARAMETER = 106;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__COMMENTS = TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__ORIGINAL_COMPILATION_UNIT = TYPE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__ORIGINAL_CLASS_FILE = TYPE__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__PROXY = TYPE__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__USAGES_IN_IMPORTS = TYPE__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Usages In Type Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__USAGES_IN_TYPE_ACCESS = TYPE__USAGES_IN_TYPE_ACCESS;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__BOUNDS = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.UnresolvedItemImpl <em>Unresolved Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.UnresolvedItemImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getUnresolvedItem()
	 * @generated
	 */
	int UNRESOLVED_ITEM = 107;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ITEM__COMMENTS = NAMED_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ITEM__ORIGINAL_COMPILATION_UNIT = NAMED_ELEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ITEM__ORIGINAL_CLASS_FILE = NAMED_ELEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ITEM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ITEM__PROXY = NAMED_ELEMENT__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ITEM__USAGES_IN_IMPORTS = NAMED_ELEMENT__USAGES_IN_IMPORTS;

	/**
	 * The number of structural features of the '<em>Unresolved Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ITEM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unresolved Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ITEM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.UnresolvedItemAccessImpl <em>Unresolved Item Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.UnresolvedItemAccessImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getUnresolvedItemAccess()
	 * @generated
	 */
	int UNRESOLVED_ITEM_ACCESS = 108;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ITEM_ACCESS__COMMENTS = EXPRESSION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ITEM_ACCESS__ORIGINAL_COMPILATION_UNIT = EXPRESSION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ITEM_ACCESS__ORIGINAL_CLASS_FILE = EXPRESSION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ITEM_ACCESS__ELEMENT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ITEM_ACCESS__QUALIFIER = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unresolved Item Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ITEM_ACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unresolved Item Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ITEM_ACCESS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.UnresolvedAnnotationDeclarationImpl <em>Unresolved Annotation Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.UnresolvedAnnotationDeclarationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getUnresolvedAnnotationDeclaration()
	 * @generated
	 */
	int UNRESOLVED_ANNOTATION_DECLARATION = 109;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_DECLARATION__COMMENTS = ANNOTATION_TYPE_DECLARATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_DECLARATION__ORIGINAL_COMPILATION_UNIT = ANNOTATION_TYPE_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_DECLARATION__ORIGINAL_CLASS_FILE = ANNOTATION_TYPE_DECLARATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_DECLARATION__NAME = ANNOTATION_TYPE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_DECLARATION__PROXY = ANNOTATION_TYPE_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_DECLARATION__USAGES_IN_IMPORTS = ANNOTATION_TYPE_DECLARATION__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_DECLARATION__ABSTRACT_TYPE_DECLARATION = ANNOTATION_TYPE_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_DECLARATION__ANNOTATIONS = ANNOTATION_TYPE_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = ANNOTATION_TYPE_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_DECLARATION__MODIFIER = ANNOTATION_TYPE_DECLARATION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Usages In Type Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_DECLARATION__USAGES_IN_TYPE_ACCESS = ANNOTATION_TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS;

	/**
	 * The feature id for the '<em><b>Body Declarations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_DECLARATION__BODY_DECLARATIONS = ANNOTATION_TYPE_DECLARATION__BODY_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Comments Before Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_DECLARATION__COMMENTS_BEFORE_BODY = ANNOTATION_TYPE_DECLARATION__COMMENTS_BEFORE_BODY;

	/**
	 * The feature id for the '<em><b>Comments After Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_DECLARATION__COMMENTS_AFTER_BODY = ANNOTATION_TYPE_DECLARATION__COMMENTS_AFTER_BODY;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_DECLARATION__PACKAGE = ANNOTATION_TYPE_DECLARATION__PACKAGE;

	/**
	 * The feature id for the '<em><b>Super Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_DECLARATION__SUPER_INTERFACES = ANNOTATION_TYPE_DECLARATION__SUPER_INTERFACES;

	/**
	 * The number of structural features of the '<em>Unresolved Annotation Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_DECLARATION_FEATURE_COUNT = ANNOTATION_TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unresolved Annotation Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_DECLARATION_OPERATION_COUNT = ANNOTATION_TYPE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.UnresolvedAnnotationTypeMemberDeclarationImpl <em>Unresolved Annotation Type Member Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.UnresolvedAnnotationTypeMemberDeclarationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getUnresolvedAnnotationTypeMemberDeclaration()
	 * @generated
	 */
	int UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION = 110;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION__COMMENTS = ANNOTATION_TYPE_MEMBER_DECLARATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION__ORIGINAL_COMPILATION_UNIT = ANNOTATION_TYPE_MEMBER_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION__ORIGINAL_CLASS_FILE = ANNOTATION_TYPE_MEMBER_DECLARATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION__NAME = ANNOTATION_TYPE_MEMBER_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION__PROXY = ANNOTATION_TYPE_MEMBER_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION__USAGES_IN_IMPORTS = ANNOTATION_TYPE_MEMBER_DECLARATION__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION__ABSTRACT_TYPE_DECLARATION = ANNOTATION_TYPE_MEMBER_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION__ANNOTATIONS = ANNOTATION_TYPE_MEMBER_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = ANNOTATION_TYPE_MEMBER_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION__MODIFIER = ANNOTATION_TYPE_MEMBER_DECLARATION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT = ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE = ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Usages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION__USAGES = ANNOTATION_TYPE_MEMBER_DECLARATION__USAGES;

	/**
	 * The number of structural features of the '<em>Unresolved Annotation Type Member Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION_FEATURE_COUNT = ANNOTATION_TYPE_MEMBER_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unresolved Annotation Type Member Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION_OPERATION_COUNT = ANNOTATION_TYPE_MEMBER_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.UnresolvedClassDeclarationImpl <em>Unresolved Class Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.UnresolvedClassDeclarationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getUnresolvedClassDeclaration()
	 * @generated
	 */
	int UNRESOLVED_CLASS_DECLARATION = 111;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_CLASS_DECLARATION__COMMENTS = CLASS_DECLARATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_CLASS_DECLARATION__ORIGINAL_COMPILATION_UNIT = CLASS_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_CLASS_DECLARATION__ORIGINAL_CLASS_FILE = CLASS_DECLARATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_CLASS_DECLARATION__NAME = CLASS_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_CLASS_DECLARATION__PROXY = CLASS_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_CLASS_DECLARATION__USAGES_IN_IMPORTS = CLASS_DECLARATION__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_CLASS_DECLARATION__ABSTRACT_TYPE_DECLARATION = CLASS_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_CLASS_DECLARATION__ANNOTATIONS = CLASS_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_CLASS_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = CLASS_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_CLASS_DECLARATION__MODIFIER = CLASS_DECLARATION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Usages In Type Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_CLASS_DECLARATION__USAGES_IN_TYPE_ACCESS = CLASS_DECLARATION__USAGES_IN_TYPE_ACCESS;

	/**
	 * The feature id for the '<em><b>Body Declarations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_CLASS_DECLARATION__BODY_DECLARATIONS = CLASS_DECLARATION__BODY_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Comments Before Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_CLASS_DECLARATION__COMMENTS_BEFORE_BODY = CLASS_DECLARATION__COMMENTS_BEFORE_BODY;

	/**
	 * The feature id for the '<em><b>Comments After Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_CLASS_DECLARATION__COMMENTS_AFTER_BODY = CLASS_DECLARATION__COMMENTS_AFTER_BODY;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_CLASS_DECLARATION__PACKAGE = CLASS_DECLARATION__PACKAGE;

	/**
	 * The feature id for the '<em><b>Super Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_CLASS_DECLARATION__SUPER_INTERFACES = CLASS_DECLARATION__SUPER_INTERFACES;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_CLASS_DECLARATION__TYPE_PARAMETERS = CLASS_DECLARATION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_CLASS_DECLARATION__SUPER_CLASS = CLASS_DECLARATION__SUPER_CLASS;

	/**
	 * The number of structural features of the '<em>Unresolved Class Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_CLASS_DECLARATION_FEATURE_COUNT = CLASS_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unresolved Class Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_CLASS_DECLARATION_OPERATION_COUNT = CLASS_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.UnresolvedEnumDeclarationImpl <em>Unresolved Enum Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.UnresolvedEnumDeclarationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getUnresolvedEnumDeclaration()
	 * @generated
	 */
	int UNRESOLVED_ENUM_DECLARATION = 112;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ENUM_DECLARATION__COMMENTS = ENUM_DECLARATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ENUM_DECLARATION__ORIGINAL_COMPILATION_UNIT = ENUM_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ENUM_DECLARATION__ORIGINAL_CLASS_FILE = ENUM_DECLARATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ENUM_DECLARATION__NAME = ENUM_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ENUM_DECLARATION__PROXY = ENUM_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ENUM_DECLARATION__USAGES_IN_IMPORTS = ENUM_DECLARATION__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ENUM_DECLARATION__ABSTRACT_TYPE_DECLARATION = ENUM_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ENUM_DECLARATION__ANNOTATIONS = ENUM_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ENUM_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = ENUM_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ENUM_DECLARATION__MODIFIER = ENUM_DECLARATION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Usages In Type Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ENUM_DECLARATION__USAGES_IN_TYPE_ACCESS = ENUM_DECLARATION__USAGES_IN_TYPE_ACCESS;

	/**
	 * The feature id for the '<em><b>Body Declarations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ENUM_DECLARATION__BODY_DECLARATIONS = ENUM_DECLARATION__BODY_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Comments Before Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ENUM_DECLARATION__COMMENTS_BEFORE_BODY = ENUM_DECLARATION__COMMENTS_BEFORE_BODY;

	/**
	 * The feature id for the '<em><b>Comments After Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ENUM_DECLARATION__COMMENTS_AFTER_BODY = ENUM_DECLARATION__COMMENTS_AFTER_BODY;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ENUM_DECLARATION__PACKAGE = ENUM_DECLARATION__PACKAGE;

	/**
	 * The feature id for the '<em><b>Super Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ENUM_DECLARATION__SUPER_INTERFACES = ENUM_DECLARATION__SUPER_INTERFACES;

	/**
	 * The feature id for the '<em><b>Enum Constants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ENUM_DECLARATION__ENUM_CONSTANTS = ENUM_DECLARATION__ENUM_CONSTANTS;

	/**
	 * The number of structural features of the '<em>Unresolved Enum Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ENUM_DECLARATION_FEATURE_COUNT = ENUM_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unresolved Enum Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ENUM_DECLARATION_OPERATION_COUNT = ENUM_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.UnresolvedInterfaceDeclarationImpl <em>Unresolved Interface Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.UnresolvedInterfaceDeclarationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getUnresolvedInterfaceDeclaration()
	 * @generated
	 */
	int UNRESOLVED_INTERFACE_DECLARATION = 113;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_INTERFACE_DECLARATION__COMMENTS = INTERFACE_DECLARATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_INTERFACE_DECLARATION__ORIGINAL_COMPILATION_UNIT = INTERFACE_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_INTERFACE_DECLARATION__ORIGINAL_CLASS_FILE = INTERFACE_DECLARATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_INTERFACE_DECLARATION__NAME = INTERFACE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_INTERFACE_DECLARATION__PROXY = INTERFACE_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_INTERFACE_DECLARATION__USAGES_IN_IMPORTS = INTERFACE_DECLARATION__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_INTERFACE_DECLARATION__ABSTRACT_TYPE_DECLARATION = INTERFACE_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_INTERFACE_DECLARATION__ANNOTATIONS = INTERFACE_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_INTERFACE_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = INTERFACE_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_INTERFACE_DECLARATION__MODIFIER = INTERFACE_DECLARATION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Usages In Type Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_INTERFACE_DECLARATION__USAGES_IN_TYPE_ACCESS = INTERFACE_DECLARATION__USAGES_IN_TYPE_ACCESS;

	/**
	 * The feature id for the '<em><b>Body Declarations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_INTERFACE_DECLARATION__BODY_DECLARATIONS = INTERFACE_DECLARATION__BODY_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Comments Before Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_INTERFACE_DECLARATION__COMMENTS_BEFORE_BODY = INTERFACE_DECLARATION__COMMENTS_BEFORE_BODY;

	/**
	 * The feature id for the '<em><b>Comments After Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_INTERFACE_DECLARATION__COMMENTS_AFTER_BODY = INTERFACE_DECLARATION__COMMENTS_AFTER_BODY;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_INTERFACE_DECLARATION__PACKAGE = INTERFACE_DECLARATION__PACKAGE;

	/**
	 * The feature id for the '<em><b>Super Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_INTERFACE_DECLARATION__SUPER_INTERFACES = INTERFACE_DECLARATION__SUPER_INTERFACES;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_INTERFACE_DECLARATION__TYPE_PARAMETERS = INTERFACE_DECLARATION__TYPE_PARAMETERS;

	/**
	 * The number of structural features of the '<em>Unresolved Interface Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_INTERFACE_DECLARATION_FEATURE_COUNT = INTERFACE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unresolved Interface Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_INTERFACE_DECLARATION_OPERATION_COUNT = INTERFACE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.UnresolvedLabeledStatementImpl <em>Unresolved Labeled Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.UnresolvedLabeledStatementImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getUnresolvedLabeledStatement()
	 * @generated
	 */
	int UNRESOLVED_LABELED_STATEMENT = 114;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_LABELED_STATEMENT__COMMENTS = LABELED_STATEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_LABELED_STATEMENT__ORIGINAL_COMPILATION_UNIT = LABELED_STATEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_LABELED_STATEMENT__ORIGINAL_CLASS_FILE = LABELED_STATEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_LABELED_STATEMENT__NAME = LABELED_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_LABELED_STATEMENT__PROXY = LABELED_STATEMENT__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_LABELED_STATEMENT__USAGES_IN_IMPORTS = LABELED_STATEMENT__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_LABELED_STATEMENT__BODY = LABELED_STATEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Usages In Break Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_LABELED_STATEMENT__USAGES_IN_BREAK_STATEMENTS = LABELED_STATEMENT__USAGES_IN_BREAK_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Usages In Continue Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_LABELED_STATEMENT__USAGES_IN_CONTINUE_STATEMENTS = LABELED_STATEMENT__USAGES_IN_CONTINUE_STATEMENTS;

	/**
	 * The number of structural features of the '<em>Unresolved Labeled Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_LABELED_STATEMENT_FEATURE_COUNT = LABELED_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unresolved Labeled Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_LABELED_STATEMENT_OPERATION_COUNT = LABELED_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.UnresolvedMethodDeclarationImpl <em>Unresolved Method Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.UnresolvedMethodDeclarationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getUnresolvedMethodDeclaration()
	 * @generated
	 */
	int UNRESOLVED_METHOD_DECLARATION = 115;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_METHOD_DECLARATION__COMMENTS = METHOD_DECLARATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_METHOD_DECLARATION__ORIGINAL_COMPILATION_UNIT = METHOD_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_METHOD_DECLARATION__ORIGINAL_CLASS_FILE = METHOD_DECLARATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_METHOD_DECLARATION__NAME = METHOD_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_METHOD_DECLARATION__PROXY = METHOD_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_METHOD_DECLARATION__USAGES_IN_IMPORTS = METHOD_DECLARATION__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_METHOD_DECLARATION__ABSTRACT_TYPE_DECLARATION = METHOD_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_METHOD_DECLARATION__ANNOTATIONS = METHOD_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_METHOD_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = METHOD_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_METHOD_DECLARATION__MODIFIER = METHOD_DECLARATION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_METHOD_DECLARATION__BODY = METHOD_DECLARATION__BODY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_METHOD_DECLARATION__PARAMETERS = METHOD_DECLARATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Thrown Exceptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_METHOD_DECLARATION__THROWN_EXCEPTIONS = METHOD_DECLARATION__THROWN_EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_METHOD_DECLARATION__TYPE_PARAMETERS = METHOD_DECLARATION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Usages In Doc Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS = METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS;

	/**
	 * The feature id for the '<em><b>Usages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_METHOD_DECLARATION__USAGES = METHOD_DECLARATION__USAGES;

	/**
	 * The feature id for the '<em><b>Extra Array Dimensions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_METHOD_DECLARATION__EXTRA_ARRAY_DIMENSIONS = METHOD_DECLARATION__EXTRA_ARRAY_DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_METHOD_DECLARATION__RETURN_TYPE = METHOD_DECLARATION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Redefined Method Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION = METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION;

	/**
	 * The feature id for the '<em><b>Redefinitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_METHOD_DECLARATION__REDEFINITIONS = METHOD_DECLARATION__REDEFINITIONS;

	/**
	 * The number of structural features of the '<em>Unresolved Method Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_METHOD_DECLARATION_FEATURE_COUNT = METHOD_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unresolved Method Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_METHOD_DECLARATION_OPERATION_COUNT = METHOD_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.UnresolvedSingleVariableDeclarationImpl <em>Unresolved Single Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.UnresolvedSingleVariableDeclarationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getUnresolvedSingleVariableDeclaration()
	 * @generated
	 */
	int UNRESOLVED_SINGLE_VARIABLE_DECLARATION = 116;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_SINGLE_VARIABLE_DECLARATION__COMMENTS = SINGLE_VARIABLE_DECLARATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_SINGLE_VARIABLE_DECLARATION__ORIGINAL_COMPILATION_UNIT = SINGLE_VARIABLE_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_SINGLE_VARIABLE_DECLARATION__ORIGINAL_CLASS_FILE = SINGLE_VARIABLE_DECLARATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_SINGLE_VARIABLE_DECLARATION__NAME = SINGLE_VARIABLE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_SINGLE_VARIABLE_DECLARATION__PROXY = SINGLE_VARIABLE_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_SINGLE_VARIABLE_DECLARATION__USAGES_IN_IMPORTS = SINGLE_VARIABLE_DECLARATION__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Extra Array Dimensions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_SINGLE_VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS = SINGLE_VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Initializer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_SINGLE_VARIABLE_DECLARATION__INITIALIZER = SINGLE_VARIABLE_DECLARATION__INITIALIZER;

	/**
	 * The feature id for the '<em><b>Usage In Variable Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_SINGLE_VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS = SINGLE_VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_SINGLE_VARIABLE_DECLARATION__MODIFIER = SINGLE_VARIABLE_DECLARATION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Varargs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_SINGLE_VARIABLE_DECLARATION__VARARGS = SINGLE_VARIABLE_DECLARATION__VARARGS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_SINGLE_VARIABLE_DECLARATION__TYPE = SINGLE_VARIABLE_DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_SINGLE_VARIABLE_DECLARATION__ANNOTATIONS = SINGLE_VARIABLE_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Method Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION = SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION;

	/**
	 * The feature id for the '<em><b>Catch Clause</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE = SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE;

	/**
	 * The feature id for the '<em><b>Enhanced For Statement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT = SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT;

	/**
	 * The number of structural features of the '<em>Unresolved Single Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_SINGLE_VARIABLE_DECLARATION_FEATURE_COUNT = SINGLE_VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unresolved Single Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_SINGLE_VARIABLE_DECLARATION_OPERATION_COUNT = SINGLE_VARIABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.UnresolvedTypeImpl <em>Unresolved Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.UnresolvedTypeImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getUnresolvedType()
	 * @generated
	 */
	int UNRESOLVED_TYPE = 117;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE__COMMENTS = TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE__ORIGINAL_COMPILATION_UNIT = TYPE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE__ORIGINAL_CLASS_FILE = TYPE__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE__PROXY = TYPE__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE__USAGES_IN_IMPORTS = TYPE__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Usages In Type Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE__USAGES_IN_TYPE_ACCESS = TYPE__USAGES_IN_TYPE_ACCESS;

	/**
	 * The number of structural features of the '<em>Unresolved Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unresolved Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.UnresolvedTypeDeclarationImpl <em>Unresolved Type Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.UnresolvedTypeDeclarationImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getUnresolvedTypeDeclaration()
	 * @generated
	 */
	int UNRESOLVED_TYPE_DECLARATION = 118;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION__COMMENTS = ABSTRACT_TYPE_DECLARATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION__ORIGINAL_COMPILATION_UNIT = ABSTRACT_TYPE_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION__ORIGINAL_CLASS_FILE = ABSTRACT_TYPE_DECLARATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION__NAME = ABSTRACT_TYPE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION__PROXY = ABSTRACT_TYPE_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION__USAGES_IN_IMPORTS = ABSTRACT_TYPE_DECLARATION__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION__ABSTRACT_TYPE_DECLARATION = ABSTRACT_TYPE_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION__ANNOTATIONS = ABSTRACT_TYPE_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = ABSTRACT_TYPE_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION__MODIFIER = ABSTRACT_TYPE_DECLARATION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Usages In Type Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS = ABSTRACT_TYPE_DECLARATION__USAGES_IN_TYPE_ACCESS;

	/**
	 * The feature id for the '<em><b>Body Declarations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION__BODY_DECLARATIONS = ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Comments Before Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION__COMMENTS_BEFORE_BODY = ABSTRACT_TYPE_DECLARATION__COMMENTS_BEFORE_BODY;

	/**
	 * The feature id for the '<em><b>Comments After Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION__COMMENTS_AFTER_BODY = ABSTRACT_TYPE_DECLARATION__COMMENTS_AFTER_BODY;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION__PACKAGE = ABSTRACT_TYPE_DECLARATION__PACKAGE;

	/**
	 * The feature id for the '<em><b>Super Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION__SUPER_INTERFACES = ABSTRACT_TYPE_DECLARATION__SUPER_INTERFACES;

	/**
	 * The number of structural features of the '<em>Unresolved Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION_FEATURE_COUNT = ABSTRACT_TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unresolved Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_TYPE_DECLARATION_OPERATION_COUNT = ABSTRACT_TYPE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.VariableDeclarationFragmentImpl <em>Variable Declaration Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.VariableDeclarationFragmentImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getVariableDeclarationFragment()
	 * @generated
	 */
	int VARIABLE_DECLARATION_FRAGMENT = 122;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT__COMMENTS = VARIABLE_DECLARATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT__ORIGINAL_COMPILATION_UNIT = VARIABLE_DECLARATION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT__ORIGINAL_CLASS_FILE = VARIABLE_DECLARATION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT__NAME = VARIABLE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT__PROXY = VARIABLE_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT__USAGES_IN_IMPORTS = VARIABLE_DECLARATION__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Extra Array Dimensions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT__EXTRA_ARRAY_DIMENSIONS = VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Initializer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT__INITIALIZER = VARIABLE_DECLARATION__INITIALIZER;

	/**
	 * The feature id for the '<em><b>Usage In Variable Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT__USAGE_IN_VARIABLE_ACCESS = VARIABLE_DECLARATION__USAGE_IN_VARIABLE_ACCESS;

	/**
	 * The feature id for the '<em><b>Variables Container</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Declaration Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Declaration Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT_OPERATION_COUNT = VARIABLE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.UnresolvedVariableDeclarationFragmentImpl <em>Unresolved Variable Declaration Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.UnresolvedVariableDeclarationFragmentImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getUnresolvedVariableDeclarationFragment()
	 * @generated
	 */
	int UNRESOLVED_VARIABLE_DECLARATION_FRAGMENT = 119;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_VARIABLE_DECLARATION_FRAGMENT__COMMENTS = VARIABLE_DECLARATION_FRAGMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_VARIABLE_DECLARATION_FRAGMENT__ORIGINAL_COMPILATION_UNIT = VARIABLE_DECLARATION_FRAGMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_VARIABLE_DECLARATION_FRAGMENT__ORIGINAL_CLASS_FILE = VARIABLE_DECLARATION_FRAGMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_VARIABLE_DECLARATION_FRAGMENT__NAME = VARIABLE_DECLARATION_FRAGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_VARIABLE_DECLARATION_FRAGMENT__PROXY = VARIABLE_DECLARATION_FRAGMENT__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_VARIABLE_DECLARATION_FRAGMENT__USAGES_IN_IMPORTS = VARIABLE_DECLARATION_FRAGMENT__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Extra Array Dimensions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_VARIABLE_DECLARATION_FRAGMENT__EXTRA_ARRAY_DIMENSIONS = VARIABLE_DECLARATION_FRAGMENT__EXTRA_ARRAY_DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Initializer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_VARIABLE_DECLARATION_FRAGMENT__INITIALIZER = VARIABLE_DECLARATION_FRAGMENT__INITIALIZER;

	/**
	 * The feature id for the '<em><b>Usage In Variable Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_VARIABLE_DECLARATION_FRAGMENT__USAGE_IN_VARIABLE_ACCESS = VARIABLE_DECLARATION_FRAGMENT__USAGE_IN_VARIABLE_ACCESS;

	/**
	 * The feature id for the '<em><b>Variables Container</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER = VARIABLE_DECLARATION_FRAGMENT__VARIABLES_CONTAINER;

	/**
	 * The number of structural features of the '<em>Unresolved Variable Declaration Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_VARIABLE_DECLARATION_FRAGMENT_FEATURE_COUNT = VARIABLE_DECLARATION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unresolved Variable Declaration Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_VARIABLE_DECLARATION_FRAGMENT_OPERATION_COUNT = VARIABLE_DECLARATION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.VariableDeclarationExpressionImpl <em>Variable Declaration Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.VariableDeclarationExpressionImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getVariableDeclarationExpression()
	 * @generated
	 */
	int VARIABLE_DECLARATION_EXPRESSION = 121;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_EXPRESSION__COMMENTS = EXPRESSION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_EXPRESSION__ORIGINAL_COMPILATION_UNIT = EXPRESSION__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_EXPRESSION__ORIGINAL_CLASS_FILE = EXPRESSION__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_EXPRESSION__TYPE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_EXPRESSION__FRAGMENTS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_EXPRESSION__MODIFIER = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_EXPRESSION__ANNOTATIONS = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Variable Declaration Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Variable Declaration Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.VariableDeclarationStatementImpl <em>Variable Declaration Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.VariableDeclarationStatementImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getVariableDeclarationStatement()
	 * @generated
	 */
	int VARIABLE_DECLARATION_STATEMENT = 123;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_STATEMENT__COMMENTS = STATEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_STATEMENT__ORIGINAL_COMPILATION_UNIT = STATEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_STATEMENT__ORIGINAL_CLASS_FILE = STATEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_STATEMENT__TYPE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_STATEMENT__FRAGMENTS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extra Array Dimensions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_STATEMENT__EXTRA_ARRAY_DIMENSIONS = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_STATEMENT__MODIFIER = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_STATEMENT__ANNOTATIONS = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Variable Declaration Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Variable Declaration Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.WildCardTypeImpl <em>Wild Card Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.WildCardTypeImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getWildCardType()
	 * @generated
	 */
	int WILD_CARD_TYPE = 124;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILD_CARD_TYPE__COMMENTS = TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILD_CARD_TYPE__ORIGINAL_COMPILATION_UNIT = TYPE__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILD_CARD_TYPE__ORIGINAL_CLASS_FILE = TYPE__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILD_CARD_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILD_CARD_TYPE__PROXY = TYPE__PROXY;

	/**
	 * The feature id for the '<em><b>Usages In Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILD_CARD_TYPE__USAGES_IN_IMPORTS = TYPE__USAGES_IN_IMPORTS;

	/**
	 * The feature id for the '<em><b>Usages In Type Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILD_CARD_TYPE__USAGES_IN_TYPE_ACCESS = TYPE__USAGES_IN_TYPE_ACCESS;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILD_CARD_TYPE__UPPER_BOUND = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILD_CARD_TYPE__BOUND = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Wild Card Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILD_CARD_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Wild Card Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILD_CARD_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.impl.WhileStatementImpl <em>While Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.impl.WhileStatementImpl
	 * @see java_graph.impl.Java_graphPackageImpl#getWhileStatement()
	 * @generated
	 */
	int WHILE_STATEMENT = 125;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__COMMENTS = STATEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__ORIGINAL_COMPILATION_UNIT = STATEMENT__ORIGINAL_COMPILATION_UNIT;

	/**
	 * The feature id for the '<em><b>Original Class File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__ORIGINAL_CLASS_FILE = STATEMENT__ORIGINAL_CLASS_FILE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java_graph.AssignmentKind <em>Assignment Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.AssignmentKind
	 * @see java_graph.impl.Java_graphPackageImpl#getAssignmentKind()
	 * @generated
	 */
	int ASSIGNMENT_KIND = 126;

	/**
	 * The meta object id for the '{@link java_graph.InfixExpressionKind <em>Infix Expression Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.InfixExpressionKind
	 * @see java_graph.impl.Java_graphPackageImpl#getInfixExpressionKind()
	 * @generated
	 */
	int INFIX_EXPRESSION_KIND = 127;

	/**
	 * The meta object id for the '{@link java_graph.InheritanceKind <em>Inheritance Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.InheritanceKind
	 * @see java_graph.impl.Java_graphPackageImpl#getInheritanceKind()
	 * @generated
	 */
	int INHERITANCE_KIND = 128;

	/**
	 * The meta object id for the '{@link java_graph.PostfixExpressionKind <em>Postfix Expression Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.PostfixExpressionKind
	 * @see java_graph.impl.Java_graphPackageImpl#getPostfixExpressionKind()
	 * @generated
	 */
	int POSTFIX_EXPRESSION_KIND = 129;

	/**
	 * The meta object id for the '{@link java_graph.PrefixExpressionKind <em>Prefix Expression Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.PrefixExpressionKind
	 * @see java_graph.impl.Java_graphPackageImpl#getPrefixExpressionKind()
	 * @generated
	 */
	int PREFIX_EXPRESSION_KIND = 130;

	/**
	 * The meta object id for the '{@link java_graph.VisibilityKind <em>Visibility Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java_graph.VisibilityKind
	 * @see java_graph.impl.Java_graphPackageImpl#getVisibilityKind()
	 * @generated
	 */
	int VISIBILITY_KIND = 131;


	/**
	 * Returns the meta object for class '{@link java_graph.AbstractMethodDeclaration <em>Abstract Method Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Method Declaration</em>'.
	 * @see java_graph.AbstractMethodDeclaration
	 * @generated
	 */
	EClass getAbstractMethodDeclaration();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.AbstractMethodDeclaration#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Body</em>'.
	 * @see java_graph.AbstractMethodDeclaration#getBody()
	 * @see #getAbstractMethodDeclaration()
	 * @generated
	 */
	EReference getAbstractMethodDeclaration_Body();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.AbstractMethodDeclaration#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see java_graph.AbstractMethodDeclaration#getParameters()
	 * @see #getAbstractMethodDeclaration()
	 * @generated
	 */
	EReference getAbstractMethodDeclaration_Parameters();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.AbstractMethodDeclaration#getThrownExceptions <em>Thrown Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Thrown Exceptions</em>'.
	 * @see java_graph.AbstractMethodDeclaration#getThrownExceptions()
	 * @see #getAbstractMethodDeclaration()
	 * @generated
	 */
	EReference getAbstractMethodDeclaration_ThrownExceptions();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.AbstractMethodDeclaration#getTypeParameters <em>Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type Parameters</em>'.
	 * @see java_graph.AbstractMethodDeclaration#getTypeParameters()
	 * @see #getAbstractMethodDeclaration()
	 * @generated
	 */
	EReference getAbstractMethodDeclaration_TypeParameters();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.AbstractMethodDeclaration#getUsagesInDocComments <em>Usages In Doc Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usages In Doc Comments</em>'.
	 * @see java_graph.AbstractMethodDeclaration#getUsagesInDocComments()
	 * @see #getAbstractMethodDeclaration()
	 * @generated
	 */
	EReference getAbstractMethodDeclaration_UsagesInDocComments();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.AbstractMethodDeclaration#getUsages <em>Usages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usages</em>'.
	 * @see java_graph.AbstractMethodDeclaration#getUsages()
	 * @see #getAbstractMethodDeclaration()
	 * @generated
	 */
	EReference getAbstractMethodDeclaration_Usages();

	/**
	 * Returns the meta object for class '{@link java_graph.AbstractMethodInvocation <em>Abstract Method Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Method Invocation</em>'.
	 * @see java_graph.AbstractMethodInvocation
	 * @generated
	 */
	EClass getAbstractMethodInvocation();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.AbstractMethodInvocation#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Method</em>'.
	 * @see java_graph.AbstractMethodInvocation#getMethod()
	 * @see #getAbstractMethodInvocation()
	 * @generated
	 */
	EReference getAbstractMethodInvocation_Method();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.AbstractMethodInvocation#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arguments</em>'.
	 * @see java_graph.AbstractMethodInvocation#getArguments()
	 * @see #getAbstractMethodInvocation()
	 * @generated
	 */
	EReference getAbstractMethodInvocation_Arguments();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.AbstractMethodInvocation#getTypeArguments <em>Type Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type Arguments</em>'.
	 * @see java_graph.AbstractMethodInvocation#getTypeArguments()
	 * @see #getAbstractMethodInvocation()
	 * @generated
	 */
	EReference getAbstractMethodInvocation_TypeArguments();

	/**
	 * Returns the meta object for class '{@link java_graph.AbstractTypeDeclaration <em>Abstract Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Type Declaration</em>'.
	 * @see java_graph.AbstractTypeDeclaration
	 * @generated
	 */
	EClass getAbstractTypeDeclaration();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.AbstractTypeDeclaration#getBodyDeclarations <em>Body Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Body Declarations</em>'.
	 * @see java_graph.AbstractTypeDeclaration#getBodyDeclarations()
	 * @see #getAbstractTypeDeclaration()
	 * @generated
	 */
	EReference getAbstractTypeDeclaration_BodyDeclarations();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.AbstractTypeDeclaration#getCommentsBeforeBody <em>Comments Before Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Comments Before Body</em>'.
	 * @see java_graph.AbstractTypeDeclaration#getCommentsBeforeBody()
	 * @see #getAbstractTypeDeclaration()
	 * @generated
	 */
	EReference getAbstractTypeDeclaration_CommentsBeforeBody();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.AbstractTypeDeclaration#getCommentsAfterBody <em>Comments After Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Comments After Body</em>'.
	 * @see java_graph.AbstractTypeDeclaration#getCommentsAfterBody()
	 * @see #getAbstractTypeDeclaration()
	 * @generated
	 */
	EReference getAbstractTypeDeclaration_CommentsAfterBody();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.AbstractTypeDeclaration#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Package</em>'.
	 * @see java_graph.AbstractTypeDeclaration#getPackage()
	 * @see #getAbstractTypeDeclaration()
	 * @generated
	 */
	EReference getAbstractTypeDeclaration_Package();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.AbstractTypeDeclaration#getSuperInterfaces <em>Super Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Interfaces</em>'.
	 * @see java_graph.AbstractTypeDeclaration#getSuperInterfaces()
	 * @see #getAbstractTypeDeclaration()
	 * @generated
	 */
	EReference getAbstractTypeDeclaration_SuperInterfaces();

	/**
	 * Returns the meta object for class '{@link java_graph.AbstractTypeQualifiedExpression <em>Abstract Type Qualified Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Type Qualified Expression</em>'.
	 * @see java_graph.AbstractTypeQualifiedExpression
	 * @generated
	 */
	EClass getAbstractTypeQualifiedExpression();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.AbstractTypeQualifiedExpression#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Qualifier</em>'.
	 * @see java_graph.AbstractTypeQualifiedExpression#getQualifier()
	 * @see #getAbstractTypeQualifiedExpression()
	 * @generated
	 */
	EReference getAbstractTypeQualifiedExpression_Qualifier();

	/**
	 * Returns the meta object for class '{@link java_graph.AbstractVariablesContainer <em>Abstract Variables Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Variables Container</em>'.
	 * @see java_graph.AbstractVariablesContainer
	 * @generated
	 */
	EClass getAbstractVariablesContainer();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.AbstractVariablesContainer#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see java_graph.AbstractVariablesContainer#getType()
	 * @see #getAbstractVariablesContainer()
	 * @generated
	 */
	EReference getAbstractVariablesContainer_Type();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.AbstractVariablesContainer#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fragments</em>'.
	 * @see java_graph.AbstractVariablesContainer#getFragments()
	 * @see #getAbstractVariablesContainer()
	 * @generated
	 */
	EReference getAbstractVariablesContainer_Fragments();

	/**
	 * Returns the meta object for class '{@link java_graph.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see java_graph.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.Annotation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see java_graph.Annotation#getType()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Type();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.Annotation#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Values</em>'.
	 * @see java_graph.Annotation#getValues()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Values();

	/**
	 * Returns the meta object for class '{@link java_graph.Archive <em>Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archive</em>'.
	 * @see java_graph.Archive
	 * @generated
	 */
	EClass getArchive();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.Archive#getOriginalFilePath <em>Original File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Original File Path</em>'.
	 * @see java_graph.Archive#getOriginalFilePath()
	 * @see #getArchive()
	 * @generated
	 */
	EAttribute getArchive_OriginalFilePath();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.Archive#getClassFiles <em>Class Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Class Files</em>'.
	 * @see java_graph.Archive#getClassFiles()
	 * @see #getArchive()
	 * @generated
	 */
	EReference getArchive_ClassFiles();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.Archive#getManifest <em>Manifest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Manifest</em>'.
	 * @see java_graph.Archive#getManifest()
	 * @see #getArchive()
	 * @generated
	 */
	EReference getArchive_Manifest();

	/**
	 * Returns the meta object for class '{@link java_graph.AssertStatement <em>Assert Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assert Statement</em>'.
	 * @see java_graph.AssertStatement
	 * @generated
	 */
	EClass getAssertStatement();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.AssertStatement#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Message</em>'.
	 * @see java_graph.AssertStatement#getMessage()
	 * @see #getAssertStatement()
	 * @generated
	 */
	EReference getAssertStatement_Message();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.AssertStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expression</em>'.
	 * @see java_graph.AssertStatement#getExpression()
	 * @see #getAssertStatement()
	 * @generated
	 */
	EReference getAssertStatement_Expression();

	/**
	 * Returns the meta object for class '{@link java_graph.ASTNode <em>AST Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AST Node</em>'.
	 * @see java_graph.ASTNode
	 * @generated
	 */
	EClass getASTNode();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ASTNode#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Comments</em>'.
	 * @see java_graph.ASTNode#getComments()
	 * @see #getASTNode()
	 * @generated
	 */
	EReference getASTNode_Comments();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ASTNode#getOriginalCompilationUnit <em>Original Compilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Original Compilation Unit</em>'.
	 * @see java_graph.ASTNode#getOriginalCompilationUnit()
	 * @see #getASTNode()
	 * @generated
	 */
	EReference getASTNode_OriginalCompilationUnit();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ASTNode#getOriginalClassFile <em>Original Class File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Original Class File</em>'.
	 * @see java_graph.ASTNode#getOriginalClassFile()
	 * @see #getASTNode()
	 * @generated
	 */
	EReference getASTNode_OriginalClassFile();

	/**
	 * Returns the meta object for class '{@link java_graph.AnnotationMemberValuePair <em>Annotation Member Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Member Value Pair</em>'.
	 * @see java_graph.AnnotationMemberValuePair
	 * @generated
	 */
	EClass getAnnotationMemberValuePair();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.AnnotationMemberValuePair#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member</em>'.
	 * @see java_graph.AnnotationMemberValuePair#getMember()
	 * @see #getAnnotationMemberValuePair()
	 * @generated
	 */
	EReference getAnnotationMemberValuePair_Member();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.AnnotationMemberValuePair#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see java_graph.AnnotationMemberValuePair#getValue()
	 * @see #getAnnotationMemberValuePair()
	 * @generated
	 */
	EReference getAnnotationMemberValuePair_Value();

	/**
	 * Returns the meta object for class '{@link java_graph.AnnotationTypeDeclaration <em>Annotation Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Type Declaration</em>'.
	 * @see java_graph.AnnotationTypeDeclaration
	 * @generated
	 */
	EClass getAnnotationTypeDeclaration();

	/**
	 * Returns the meta object for class '{@link java_graph.AnnotationTypeMemberDeclaration <em>Annotation Type Member Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Type Member Declaration</em>'.
	 * @see java_graph.AnnotationTypeMemberDeclaration
	 * @generated
	 */
	EClass getAnnotationTypeMemberDeclaration();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.AnnotationTypeMemberDeclaration#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Default</em>'.
	 * @see java_graph.AnnotationTypeMemberDeclaration#getDefault()
	 * @see #getAnnotationTypeMemberDeclaration()
	 * @generated
	 */
	EReference getAnnotationTypeMemberDeclaration_Default();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.AnnotationTypeMemberDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see java_graph.AnnotationTypeMemberDeclaration#getType()
	 * @see #getAnnotationTypeMemberDeclaration()
	 * @generated
	 */
	EReference getAnnotationTypeMemberDeclaration_Type();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.AnnotationTypeMemberDeclaration#getUsages <em>Usages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usages</em>'.
	 * @see java_graph.AnnotationTypeMemberDeclaration#getUsages()
	 * @see #getAnnotationTypeMemberDeclaration()
	 * @generated
	 */
	EReference getAnnotationTypeMemberDeclaration_Usages();

	/**
	 * Returns the meta object for class '{@link java_graph.AnonymousClassDeclaration <em>Anonymous Class Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anonymous Class Declaration</em>'.
	 * @see java_graph.AnonymousClassDeclaration
	 * @generated
	 */
	EClass getAnonymousClassDeclaration();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.AnonymousClassDeclaration#getBodyDeclarations <em>Body Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Body Declarations</em>'.
	 * @see java_graph.AnonymousClassDeclaration#getBodyDeclarations()
	 * @see #getAnonymousClassDeclaration()
	 * @generated
	 */
	EReference getAnonymousClassDeclaration_BodyDeclarations();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.AnonymousClassDeclaration#getClassInstanceCreation <em>Class Instance Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Class Instance Creation</em>'.
	 * @see java_graph.AnonymousClassDeclaration#getClassInstanceCreation()
	 * @see #getAnonymousClassDeclaration()
	 * @generated
	 */
	EReference getAnonymousClassDeclaration_ClassInstanceCreation();

	/**
	 * Returns the meta object for class '{@link java_graph.ArrayAccess <em>Array Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Access</em>'.
	 * @see java_graph.ArrayAccess
	 * @generated
	 */
	EClass getArrayAccess();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ArrayAccess#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Array</em>'.
	 * @see java_graph.ArrayAccess#getArray()
	 * @see #getArrayAccess()
	 * @generated
	 */
	EReference getArrayAccess_Array();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ArrayAccess#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Index</em>'.
	 * @see java_graph.ArrayAccess#getIndex()
	 * @see #getArrayAccess()
	 * @generated
	 */
	EReference getArrayAccess_Index();

	/**
	 * Returns the meta object for class '{@link java_graph.ArrayCreation <em>Array Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Creation</em>'.
	 * @see java_graph.ArrayCreation
	 * @generated
	 */
	EClass getArrayCreation();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ArrayCreation#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dimensions</em>'.
	 * @see java_graph.ArrayCreation#getDimensions()
	 * @see #getArrayCreation()
	 * @generated
	 */
	EReference getArrayCreation_Dimensions();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ArrayCreation#getInitializer <em>Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Initializer</em>'.
	 * @see java_graph.ArrayCreation#getInitializer()
	 * @see #getArrayCreation()
	 * @generated
	 */
	EReference getArrayCreation_Initializer();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ArrayCreation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see java_graph.ArrayCreation#getType()
	 * @see #getArrayCreation()
	 * @generated
	 */
	EReference getArrayCreation_Type();

	/**
	 * Returns the meta object for class '{@link java_graph.ArrayInitializer <em>Array Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Initializer</em>'.
	 * @see java_graph.ArrayInitializer
	 * @generated
	 */
	EClass getArrayInitializer();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ArrayInitializer#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expressions</em>'.
	 * @see java_graph.ArrayInitializer#getExpressions()
	 * @see #getArrayInitializer()
	 * @generated
	 */
	EReference getArrayInitializer_Expressions();

	/**
	 * Returns the meta object for class '{@link java_graph.ArrayLengthAccess <em>Array Length Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Length Access</em>'.
	 * @see java_graph.ArrayLengthAccess
	 * @generated
	 */
	EClass getArrayLengthAccess();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ArrayLengthAccess#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Array</em>'.
	 * @see java_graph.ArrayLengthAccess#getArray()
	 * @see #getArrayLengthAccess()
	 * @generated
	 */
	EReference getArrayLengthAccess_Array();

	/**
	 * Returns the meta object for class '{@link java_graph.ArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Type</em>'.
	 * @see java_graph.ArrayType
	 * @generated
	 */
	EClass getArrayType();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.ArrayType#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dimensions</em>'.
	 * @see java_graph.ArrayType#getDimensions()
	 * @see #getArrayType()
	 * @generated
	 */
	EAttribute getArrayType_Dimensions();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ArrayType#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Element Type</em>'.
	 * @see java_graph.ArrayType#getElementType()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_ElementType();

	/**
	 * Returns the meta object for class '{@link java_graph.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see java_graph.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.Assignment#getLeftHandSide <em>Left Hand Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Left Hand Side</em>'.
	 * @see java_graph.Assignment#getLeftHandSide()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_LeftHandSide();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.Assignment#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Operator</em>'.
	 * @see java_graph.Assignment#getOperator()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_Operator();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.Assignment#getRightHandSide <em>Right Hand Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Right Hand Side</em>'.
	 * @see java_graph.Assignment#getRightHandSide()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_RightHandSide();

	/**
	 * Returns the meta object for class '{@link java_graph.BodyDeclaration <em>Body Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body Declaration</em>'.
	 * @see java_graph.BodyDeclaration
	 * @generated
	 */
	EClass getBodyDeclaration();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.BodyDeclaration#getAbstractTypeDeclaration <em>Abstract Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Abstract Type Declaration</em>'.
	 * @see java_graph.BodyDeclaration#getAbstractTypeDeclaration()
	 * @see #getBodyDeclaration()
	 * @generated
	 */
	EReference getBodyDeclaration_AbstractTypeDeclaration();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.BodyDeclaration#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotations</em>'.
	 * @see java_graph.BodyDeclaration#getAnnotations()
	 * @see #getBodyDeclaration()
	 * @generated
	 */
	EReference getBodyDeclaration_Annotations();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.BodyDeclaration#getAnonymousClassDeclarationOwner <em>Anonymous Class Declaration Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Anonymous Class Declaration Owner</em>'.
	 * @see java_graph.BodyDeclaration#getAnonymousClassDeclarationOwner()
	 * @see #getBodyDeclaration()
	 * @generated
	 */
	EReference getBodyDeclaration_AnonymousClassDeclarationOwner();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.BodyDeclaration#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modifier</em>'.
	 * @see java_graph.BodyDeclaration#getModifier()
	 * @see #getBodyDeclaration()
	 * @generated
	 */
	EReference getBodyDeclaration_Modifier();

	/**
	 * Returns the meta object for class '{@link java_graph.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see java_graph.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.BooleanLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see java_graph.BooleanLiteral#getValue()
	 * @see #getBooleanLiteral()
	 * @generated
	 */
	EAttribute getBooleanLiteral_Value();

	/**
	 * Returns the meta object for class '{@link java_graph.BlockComment <em>Block Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Comment</em>'.
	 * @see java_graph.BlockComment
	 * @generated
	 */
	EClass getBlockComment();

	/**
	 * Returns the meta object for class '{@link java_graph.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see java_graph.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.Block#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Statements</em>'.
	 * @see java_graph.Block#getStatements()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Statements();

	/**
	 * Returns the meta object for class '{@link java_graph.BreakStatement <em>Break Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Break Statement</em>'.
	 * @see java_graph.BreakStatement
	 * @generated
	 */
	EClass getBreakStatement();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.BreakStatement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Label</em>'.
	 * @see java_graph.BreakStatement#getLabel()
	 * @see #getBreakStatement()
	 * @generated
	 */
	EReference getBreakStatement_Label();

	/**
	 * Returns the meta object for class '{@link java_graph.CastExpression <em>Cast Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cast Expression</em>'.
	 * @see java_graph.CastExpression
	 * @generated
	 */
	EClass getCastExpression();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.CastExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expression</em>'.
	 * @see java_graph.CastExpression#getExpression()
	 * @see #getCastExpression()
	 * @generated
	 */
	EReference getCastExpression_Expression();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.CastExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see java_graph.CastExpression#getType()
	 * @see #getCastExpression()
	 * @generated
	 */
	EReference getCastExpression_Type();

	/**
	 * Returns the meta object for class '{@link java_graph.CatchClause <em>Catch Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catch Clause</em>'.
	 * @see java_graph.CatchClause
	 * @generated
	 */
	EClass getCatchClause();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.CatchClause#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exception</em>'.
	 * @see java_graph.CatchClause#getException()
	 * @see #getCatchClause()
	 * @generated
	 */
	EReference getCatchClause_Exception();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.CatchClause#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Body</em>'.
	 * @see java_graph.CatchClause#getBody()
	 * @see #getCatchClause()
	 * @generated
	 */
	EReference getCatchClause_Body();

	/**
	 * Returns the meta object for class '{@link java_graph.CharacterLiteral <em>Character Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Literal</em>'.
	 * @see java_graph.CharacterLiteral
	 * @generated
	 */
	EClass getCharacterLiteral();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.CharacterLiteral#getEscapedValue <em>Escaped Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Escaped Value</em>'.
	 * @see java_graph.CharacterLiteral#getEscapedValue()
	 * @see #getCharacterLiteral()
	 * @generated
	 */
	EAttribute getCharacterLiteral_EscapedValue();

	/**
	 * Returns the meta object for class '{@link java_graph.ClassFile <em>Class File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class File</em>'.
	 * @see java_graph.ClassFile
	 * @generated
	 */
	EClass getClassFile();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.ClassFile#getOriginalFilePath <em>Original File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Original File Path</em>'.
	 * @see java_graph.ClassFile#getOriginalFilePath()
	 * @see #getClassFile()
	 * @generated
	 */
	EAttribute getClassFile_OriginalFilePath();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ClassFile#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see java_graph.ClassFile#getType()
	 * @see #getClassFile()
	 * @generated
	 */
	EReference getClassFile_Type();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ClassFile#getAttachedSource <em>Attached Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attached Source</em>'.
	 * @see java_graph.ClassFile#getAttachedSource()
	 * @see #getClassFile()
	 * @generated
	 */
	EReference getClassFile_AttachedSource();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ClassFile#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Package</em>'.
	 * @see java_graph.ClassFile#getPackage()
	 * @see #getClassFile()
	 * @generated
	 */
	EReference getClassFile_Package();

	/**
	 * Returns the meta object for class '{@link java_graph.ClassInstanceCreation <em>Class Instance Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Instance Creation</em>'.
	 * @see java_graph.ClassInstanceCreation
	 * @generated
	 */
	EClass getClassInstanceCreation();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ClassInstanceCreation#getAnonymousClassDeclaration <em>Anonymous Class Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Anonymous Class Declaration</em>'.
	 * @see java_graph.ClassInstanceCreation#getAnonymousClassDeclaration()
	 * @see #getClassInstanceCreation()
	 * @generated
	 */
	EReference getClassInstanceCreation_AnonymousClassDeclaration();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ClassInstanceCreation#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expression</em>'.
	 * @see java_graph.ClassInstanceCreation#getExpression()
	 * @see #getClassInstanceCreation()
	 * @generated
	 */
	EReference getClassInstanceCreation_Expression();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ClassInstanceCreation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see java_graph.ClassInstanceCreation#getType()
	 * @see #getClassInstanceCreation()
	 * @generated
	 */
	EReference getClassInstanceCreation_Type();

	/**
	 * Returns the meta object for class '{@link java_graph.ConstructorDeclaration <em>Constructor Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor Declaration</em>'.
	 * @see java_graph.ConstructorDeclaration
	 * @generated
	 */
	EClass getConstructorDeclaration();

	/**
	 * Returns the meta object for class '{@link java_graph.ConditionalExpression <em>Conditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Expression</em>'.
	 * @see java_graph.ConditionalExpression
	 * @generated
	 */
	EClass getConditionalExpression();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ConditionalExpression#getElseExpression <em>Else Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Else Expression</em>'.
	 * @see java_graph.ConditionalExpression#getElseExpression()
	 * @see #getConditionalExpression()
	 * @generated
	 */
	EReference getConditionalExpression_ElseExpression();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ConditionalExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expression</em>'.
	 * @see java_graph.ConditionalExpression#getExpression()
	 * @see #getConditionalExpression()
	 * @generated
	 */
	EReference getConditionalExpression_Expression();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ConditionalExpression#getThenExpression <em>Then Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Then Expression</em>'.
	 * @see java_graph.ConditionalExpression#getThenExpression()
	 * @see #getConditionalExpression()
	 * @generated
	 */
	EReference getConditionalExpression_ThenExpression();

	/**
	 * Returns the meta object for class '{@link java_graph.ConstructorInvocation <em>Constructor Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor Invocation</em>'.
	 * @see java_graph.ConstructorInvocation
	 * @generated
	 */
	EClass getConstructorInvocation();

	/**
	 * Returns the meta object for class '{@link java_graph.ClassDeclaration <em>Class Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Declaration</em>'.
	 * @see java_graph.ClassDeclaration
	 * @generated
	 */
	EClass getClassDeclaration();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ClassDeclaration#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Class</em>'.
	 * @see java_graph.ClassDeclaration#getSuperClass()
	 * @see #getClassDeclaration()
	 * @generated
	 */
	EReference getClassDeclaration_SuperClass();

	/**
	 * Returns the meta object for class '{@link java_graph.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see java_graph.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.Comment#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Content</em>'.
	 * @see java_graph.Comment#getContent()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Content();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.Comment#getEnclosedByParent <em>Enclosed By Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Enclosed By Parent</em>'.
	 * @see java_graph.Comment#getEnclosedByParent()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_EnclosedByParent();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.Comment#getPrefixOfParent <em>Prefix Of Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Prefix Of Parent</em>'.
	 * @see java_graph.Comment#getPrefixOfParent()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_PrefixOfParent();

	/**
	 * Returns the meta object for class '{@link java_graph.CompilationUnit <em>Compilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compilation Unit</em>'.
	 * @see java_graph.CompilationUnit
	 * @generated
	 */
	EClass getCompilationUnit();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.CompilationUnit#getOriginalFilePath <em>Original File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Original File Path</em>'.
	 * @see java_graph.CompilationUnit#getOriginalFilePath()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EAttribute getCompilationUnit_OriginalFilePath();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.CompilationUnit#getCommentList <em>Comment List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Comment List</em>'.
	 * @see java_graph.CompilationUnit#getCommentList()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EReference getCompilationUnit_CommentList();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.CompilationUnit#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imports</em>'.
	 * @see java_graph.CompilationUnit#getImports()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EReference getCompilationUnit_Imports();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.CompilationUnit#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Package</em>'.
	 * @see java_graph.CompilationUnit#getPackage()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EReference getCompilationUnit_Package();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.CompilationUnit#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Types</em>'.
	 * @see java_graph.CompilationUnit#getTypes()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EReference getCompilationUnit_Types();

	/**
	 * Returns the meta object for class '{@link java_graph.ContinueStatement <em>Continue Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continue Statement</em>'.
	 * @see java_graph.ContinueStatement
	 * @generated
	 */
	EClass getContinueStatement();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ContinueStatement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Label</em>'.
	 * @see java_graph.ContinueStatement#getLabel()
	 * @see #getContinueStatement()
	 * @generated
	 */
	EReference getContinueStatement_Label();

	/**
	 * Returns the meta object for class '{@link java_graph.DoStatement <em>Do Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Do Statement</em>'.
	 * @see java_graph.DoStatement
	 * @generated
	 */
	EClass getDoStatement();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.DoStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expression</em>'.
	 * @see java_graph.DoStatement#getExpression()
	 * @see #getDoStatement()
	 * @generated
	 */
	EReference getDoStatement_Expression();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.DoStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Body</em>'.
	 * @see java_graph.DoStatement#getBody()
	 * @see #getDoStatement()
	 * @generated
	 */
	EReference getDoStatement_Body();

	/**
	 * Returns the meta object for class '{@link java_graph.EmptyStatement <em>Empty Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Statement</em>'.
	 * @see java_graph.EmptyStatement
	 * @generated
	 */
	EClass getEmptyStatement();

	/**
	 * Returns the meta object for class '{@link java_graph.EnhancedForStatement <em>Enhanced For Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enhanced For Statement</em>'.
	 * @see java_graph.EnhancedForStatement
	 * @generated
	 */
	EClass getEnhancedForStatement();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.EnhancedForStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Body</em>'.
	 * @see java_graph.EnhancedForStatement#getBody()
	 * @see #getEnhancedForStatement()
	 * @generated
	 */
	EReference getEnhancedForStatement_Body();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.EnhancedForStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expression</em>'.
	 * @see java_graph.EnhancedForStatement#getExpression()
	 * @see #getEnhancedForStatement()
	 * @generated
	 */
	EReference getEnhancedForStatement_Expression();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.EnhancedForStatement#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter</em>'.
	 * @see java_graph.EnhancedForStatement#getParameter()
	 * @see #getEnhancedForStatement()
	 * @generated
	 */
	EReference getEnhancedForStatement_Parameter();

	/**
	 * Returns the meta object for class '{@link java_graph.EnumConstantDeclaration <em>Enum Constant Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Constant Declaration</em>'.
	 * @see java_graph.EnumConstantDeclaration
	 * @generated
	 */
	EClass getEnumConstantDeclaration();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.EnumConstantDeclaration#getAnonymousClassDeclaration <em>Anonymous Class Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Anonymous Class Declaration</em>'.
	 * @see java_graph.EnumConstantDeclaration#getAnonymousClassDeclaration()
	 * @see #getEnumConstantDeclaration()
	 * @generated
	 */
	EReference getEnumConstantDeclaration_AnonymousClassDeclaration();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.EnumConstantDeclaration#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arguments</em>'.
	 * @see java_graph.EnumConstantDeclaration#getArguments()
	 * @see #getEnumConstantDeclaration()
	 * @generated
	 */
	EReference getEnumConstantDeclaration_Arguments();

	/**
	 * Returns the meta object for class '{@link java_graph.EnumDeclaration <em>Enum Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Declaration</em>'.
	 * @see java_graph.EnumDeclaration
	 * @generated
	 */
	EClass getEnumDeclaration();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.EnumDeclaration#getEnumConstants <em>Enum Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enum Constants</em>'.
	 * @see java_graph.EnumDeclaration#getEnumConstants()
	 * @see #getEnumDeclaration()
	 * @generated
	 */
	EReference getEnumDeclaration_EnumConstants();

	/**
	 * Returns the meta object for class '{@link java_graph.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see java_graph.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link java_graph.ExpressionStatement <em>Expression Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Statement</em>'.
	 * @see java_graph.ExpressionStatement
	 * @generated
	 */
	EClass getExpressionStatement();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ExpressionStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expression</em>'.
	 * @see java_graph.ExpressionStatement#getExpression()
	 * @see #getExpressionStatement()
	 * @generated
	 */
	EReference getExpressionStatement_Expression();

	/**
	 * Returns the meta object for class '{@link java_graph.FieldAccess <em>Field Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Access</em>'.
	 * @see java_graph.FieldAccess
	 * @generated
	 */
	EClass getFieldAccess();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.FieldAccess#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Field</em>'.
	 * @see java_graph.FieldAccess#getField()
	 * @see #getFieldAccess()
	 * @generated
	 */
	EReference getFieldAccess_Field();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.FieldAccess#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expression</em>'.
	 * @see java_graph.FieldAccess#getExpression()
	 * @see #getFieldAccess()
	 * @generated
	 */
	EReference getFieldAccess_Expression();

	/**
	 * Returns the meta object for class '{@link java_graph.FieldDeclaration <em>Field Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Declaration</em>'.
	 * @see java_graph.FieldDeclaration
	 * @generated
	 */
	EClass getFieldDeclaration();

	/**
	 * Returns the meta object for class '{@link java_graph.ForStatement <em>For Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Statement</em>'.
	 * @see java_graph.ForStatement
	 * @generated
	 */
	EClass getForStatement();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ForStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expression</em>'.
	 * @see java_graph.ForStatement#getExpression()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_Expression();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ForStatement#getUpdaters <em>Updaters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Updaters</em>'.
	 * @see java_graph.ForStatement#getUpdaters()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_Updaters();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ForStatement#getInitializers <em>Initializers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Initializers</em>'.
	 * @see java_graph.ForStatement#getInitializers()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_Initializers();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ForStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Body</em>'.
	 * @see java_graph.ForStatement#getBody()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_Body();

	/**
	 * Returns the meta object for class '{@link java_graph.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Statement</em>'.
	 * @see java_graph.IfStatement
	 * @generated
	 */
	EClass getIfStatement();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.IfStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expression</em>'.
	 * @see java_graph.IfStatement#getExpression()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Expression();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.IfStatement#getThenStatement <em>Then Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Then Statement</em>'.
	 * @see java_graph.IfStatement#getThenStatement()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_ThenStatement();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.IfStatement#getElseStatement <em>Else Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Else Statement</em>'.
	 * @see java_graph.IfStatement#getElseStatement()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_ElseStatement();

	/**
	 * Returns the meta object for class '{@link java_graph.ImportDeclaration <em>Import Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Declaration</em>'.
	 * @see java_graph.ImportDeclaration
	 * @generated
	 */
	EClass getImportDeclaration();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.ImportDeclaration#getStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Static</em>'.
	 * @see java_graph.ImportDeclaration#getStatic()
	 * @see #getImportDeclaration()
	 * @generated
	 */
	EAttribute getImportDeclaration_Static();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ImportDeclaration#getImportedElement <em>Imported Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imported Element</em>'.
	 * @see java_graph.ImportDeclaration#getImportedElement()
	 * @see #getImportDeclaration()
	 * @generated
	 */
	EReference getImportDeclaration_ImportedElement();

	/**
	 * Returns the meta object for class '{@link java_graph.InfixExpression <em>Infix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infix Expression</em>'.
	 * @see java_graph.InfixExpression
	 * @generated
	 */
	EClass getInfixExpression();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.InfixExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Operator</em>'.
	 * @see java_graph.InfixExpression#getOperator()
	 * @see #getInfixExpression()
	 * @generated
	 */
	EAttribute getInfixExpression_Operator();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.InfixExpression#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Right Operand</em>'.
	 * @see java_graph.InfixExpression#getRightOperand()
	 * @see #getInfixExpression()
	 * @generated
	 */
	EReference getInfixExpression_RightOperand();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.InfixExpression#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Left Operand</em>'.
	 * @see java_graph.InfixExpression#getLeftOperand()
	 * @see #getInfixExpression()
	 * @generated
	 */
	EReference getInfixExpression_LeftOperand();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.InfixExpression#getExtendedOperands <em>Extended Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extended Operands</em>'.
	 * @see java_graph.InfixExpression#getExtendedOperands()
	 * @see #getInfixExpression()
	 * @generated
	 */
	EReference getInfixExpression_ExtendedOperands();

	/**
	 * Returns the meta object for class '{@link java_graph.Initializer <em>Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initializer</em>'.
	 * @see java_graph.Initializer
	 * @generated
	 */
	EClass getInitializer();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.Initializer#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Body</em>'.
	 * @see java_graph.Initializer#getBody()
	 * @see #getInitializer()
	 * @generated
	 */
	EReference getInitializer_Body();

	/**
	 * Returns the meta object for class '{@link java_graph.InstanceofExpression <em>Instanceof Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instanceof Expression</em>'.
	 * @see java_graph.InstanceofExpression
	 * @generated
	 */
	EClass getInstanceofExpression();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.InstanceofExpression#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Right Operand</em>'.
	 * @see java_graph.InstanceofExpression#getRightOperand()
	 * @see #getInstanceofExpression()
	 * @generated
	 */
	EReference getInstanceofExpression_RightOperand();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.InstanceofExpression#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Left Operand</em>'.
	 * @see java_graph.InstanceofExpression#getLeftOperand()
	 * @see #getInstanceofExpression()
	 * @generated
	 */
	EReference getInstanceofExpression_LeftOperand();

	/**
	 * Returns the meta object for class '{@link java_graph.InterfaceDeclaration <em>Interface Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Declaration</em>'.
	 * @see java_graph.InterfaceDeclaration
	 * @generated
	 */
	EClass getInterfaceDeclaration();

	/**
	 * Returns the meta object for class '{@link java_graph.Javadoc <em>Javadoc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Javadoc</em>'.
	 * @see java_graph.Javadoc
	 * @generated
	 */
	EClass getJavadoc();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.Javadoc#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tags</em>'.
	 * @see java_graph.Javadoc#getTags()
	 * @see #getJavadoc()
	 * @generated
	 */
	EReference getJavadoc_Tags();

	/**
	 * Returns the meta object for class '{@link java_graph.LabeledStatement <em>Labeled Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labeled Statement</em>'.
	 * @see java_graph.LabeledStatement
	 * @generated
	 */
	EClass getLabeledStatement();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.LabeledStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Body</em>'.
	 * @see java_graph.LabeledStatement#getBody()
	 * @see #getLabeledStatement()
	 * @generated
	 */
	EReference getLabeledStatement_Body();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.LabeledStatement#getUsagesInBreakStatements <em>Usages In Break Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usages In Break Statements</em>'.
	 * @see java_graph.LabeledStatement#getUsagesInBreakStatements()
	 * @see #getLabeledStatement()
	 * @generated
	 */
	EReference getLabeledStatement_UsagesInBreakStatements();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.LabeledStatement#getUsagesInContinueStatements <em>Usages In Continue Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usages In Continue Statements</em>'.
	 * @see java_graph.LabeledStatement#getUsagesInContinueStatements()
	 * @see #getLabeledStatement()
	 * @generated
	 */
	EReference getLabeledStatement_UsagesInContinueStatements();

	/**
	 * Returns the meta object for class '{@link java_graph.LineComment <em>Line Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Comment</em>'.
	 * @see java_graph.LineComment
	 * @generated
	 */
	EClass getLineComment();

	/**
	 * Returns the meta object for class '{@link java_graph.Manifest <em>Manifest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manifest</em>'.
	 * @see java_graph.Manifest
	 * @generated
	 */
	EClass getManifest();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.Manifest#getMainAttributes <em>Main Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Main Attributes</em>'.
	 * @see java_graph.Manifest#getMainAttributes()
	 * @see #getManifest()
	 * @generated
	 */
	EReference getManifest_MainAttributes();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.Manifest#getEntryAttributes <em>Entry Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entry Attributes</em>'.
	 * @see java_graph.Manifest#getEntryAttributes()
	 * @see #getManifest()
	 * @generated
	 */
	EReference getManifest_EntryAttributes();

	/**
	 * Returns the meta object for class '{@link java_graph.ManifestAttribute <em>Manifest Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manifest Attribute</em>'.
	 * @see java_graph.ManifestAttribute
	 * @generated
	 */
	EClass getManifestAttribute();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.ManifestAttribute#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Key</em>'.
	 * @see java_graph.ManifestAttribute#getKey()
	 * @see #getManifestAttribute()
	 * @generated
	 */
	EAttribute getManifestAttribute_Key();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.ManifestAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see java_graph.ManifestAttribute#getValue()
	 * @see #getManifestAttribute()
	 * @generated
	 */
	EAttribute getManifestAttribute_Value();

	/**
	 * Returns the meta object for class '{@link java_graph.ManifestEntry <em>Manifest Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manifest Entry</em>'.
	 * @see java_graph.ManifestEntry
	 * @generated
	 */
	EClass getManifestEntry();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.ManifestEntry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Name</em>'.
	 * @see java_graph.ManifestEntry#getName()
	 * @see #getManifestEntry()
	 * @generated
	 */
	EAttribute getManifestEntry_Name();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ManifestEntry#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see java_graph.ManifestEntry#getAttributes()
	 * @see #getManifestEntry()
	 * @generated
	 */
	EReference getManifestEntry_Attributes();

	/**
	 * Returns the meta object for class '{@link java_graph.MemberRef <em>Member Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member Ref</em>'.
	 * @see java_graph.MemberRef
	 * @generated
	 */
	EClass getMemberRef();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.MemberRef#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member</em>'.
	 * @see java_graph.MemberRef#getMember()
	 * @see #getMemberRef()
	 * @generated
	 */
	EReference getMemberRef_Member();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.MemberRef#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Qualifier</em>'.
	 * @see java_graph.MemberRef#getQualifier()
	 * @see #getMemberRef()
	 * @generated
	 */
	EReference getMemberRef_Qualifier();

	/**
	 * Returns the meta object for class '{@link java_graph.MethodDeclaration <em>Method Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Declaration</em>'.
	 * @see java_graph.MethodDeclaration
	 * @generated
	 */
	EClass getMethodDeclaration();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.MethodDeclaration#getExtraArrayDimensions <em>Extra Array Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Extra Array Dimensions</em>'.
	 * @see java_graph.MethodDeclaration#getExtraArrayDimensions()
	 * @see #getMethodDeclaration()
	 * @generated
	 */
	EAttribute getMethodDeclaration_ExtraArrayDimensions();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.MethodDeclaration#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Return Type</em>'.
	 * @see java_graph.MethodDeclaration#getReturnType()
	 * @see #getMethodDeclaration()
	 * @generated
	 */
	EReference getMethodDeclaration_ReturnType();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.MethodDeclaration#getRedefinedMethodDeclaration <em>Redefined Method Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Redefined Method Declaration</em>'.
	 * @see java_graph.MethodDeclaration#getRedefinedMethodDeclaration()
	 * @see #getMethodDeclaration()
	 * @generated
	 */
	EReference getMethodDeclaration_RedefinedMethodDeclaration();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.MethodDeclaration#getRedefinitions <em>Redefinitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Redefinitions</em>'.
	 * @see java_graph.MethodDeclaration#getRedefinitions()
	 * @see #getMethodDeclaration()
	 * @generated
	 */
	EReference getMethodDeclaration_Redefinitions();

	/**
	 * Returns the meta object for class '{@link java_graph.MethodInvocation <em>Method Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Invocation</em>'.
	 * @see java_graph.MethodInvocation
	 * @generated
	 */
	EClass getMethodInvocation();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.MethodInvocation#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expression</em>'.
	 * @see java_graph.MethodInvocation#getExpression()
	 * @see #getMethodInvocation()
	 * @generated
	 */
	EReference getMethodInvocation_Expression();

	/**
	 * Returns the meta object for class '{@link java_graph.MethodRef <em>Method Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Ref</em>'.
	 * @see java_graph.MethodRef
	 * @generated
	 */
	EClass getMethodRef();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.MethodRef#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Method</em>'.
	 * @see java_graph.MethodRef#getMethod()
	 * @see #getMethodRef()
	 * @generated
	 */
	EReference getMethodRef_Method();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.MethodRef#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Qualifier</em>'.
	 * @see java_graph.MethodRef#getQualifier()
	 * @see #getMethodRef()
	 * @generated
	 */
	EReference getMethodRef_Qualifier();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.MethodRef#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see java_graph.MethodRef#getParameters()
	 * @see #getMethodRef()
	 * @generated
	 */
	EReference getMethodRef_Parameters();

	/**
	 * Returns the meta object for class '{@link java_graph.MethodRefParameter <em>Method Ref Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Ref Parameter</em>'.
	 * @see java_graph.MethodRefParameter
	 * @generated
	 */
	EClass getMethodRefParameter();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.MethodRefParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Name</em>'.
	 * @see java_graph.MethodRefParameter#getName()
	 * @see #getMethodRefParameter()
	 * @generated
	 */
	EAttribute getMethodRefParameter_Name();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.MethodRefParameter#getVarargs <em>Varargs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Varargs</em>'.
	 * @see java_graph.MethodRefParameter#getVarargs()
	 * @see #getMethodRefParameter()
	 * @generated
	 */
	EAttribute getMethodRefParameter_Varargs();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.MethodRefParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see java_graph.MethodRefParameter#getType()
	 * @see #getMethodRefParameter()
	 * @generated
	 */
	EReference getMethodRefParameter_Type();

	/**
	 * Returns the meta object for class '{@link java_graph.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see java_graph.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Name</em>'.
	 * @see java_graph.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.Model#getOwnedElements <em>Owned Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Elements</em>'.
	 * @see java_graph.Model#getOwnedElements()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_OwnedElements();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.Model#getOrphanTypes <em>Orphan Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Orphan Types</em>'.
	 * @see java_graph.Model#getOrphanTypes()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_OrphanTypes();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.Model#getUnresolvedItems <em>Unresolved Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unresolved Items</em>'.
	 * @see java_graph.Model#getUnresolvedItems()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_UnresolvedItems();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.Model#getCompilationUnits <em>Compilation Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compilation Units</em>'.
	 * @see java_graph.Model#getCompilationUnits()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_CompilationUnits();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.Model#getClassFiles <em>Class Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Class Files</em>'.
	 * @see java_graph.Model#getClassFiles()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_ClassFiles();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.Model#getArchives <em>Archives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Archives</em>'.
	 * @see java_graph.Model#getArchives()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Archives();

	/**
	 * Returns the meta object for class '{@link java_graph.Modifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modifier</em>'.
	 * @see java_graph.Modifier
	 * @generated
	 */
	EClass getModifier();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.Modifier#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Visibility</em>'.
	 * @see java_graph.Modifier#getVisibility()
	 * @see #getModifier()
	 * @generated
	 */
	EAttribute getModifier_Visibility();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.Modifier#getInheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Inheritance</em>'.
	 * @see java_graph.Modifier#getInheritance()
	 * @see #getModifier()
	 * @generated
	 */
	EAttribute getModifier_Inheritance();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.Modifier#getStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Static</em>'.
	 * @see java_graph.Modifier#getStatic()
	 * @see #getModifier()
	 * @generated
	 */
	EAttribute getModifier_Static();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.Modifier#getTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Transient</em>'.
	 * @see java_graph.Modifier#getTransient()
	 * @see #getModifier()
	 * @generated
	 */
	EAttribute getModifier_Transient();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.Modifier#getVolatile <em>Volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Volatile</em>'.
	 * @see java_graph.Modifier#getVolatile()
	 * @see #getModifier()
	 * @generated
	 */
	EAttribute getModifier_Volatile();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.Modifier#getNative <em>Native</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Native</em>'.
	 * @see java_graph.Modifier#getNative()
	 * @see #getModifier()
	 * @generated
	 */
	EAttribute getModifier_Native();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.Modifier#getStrictfp <em>Strictfp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Strictfp</em>'.
	 * @see java_graph.Modifier#getStrictfp()
	 * @see #getModifier()
	 * @generated
	 */
	EAttribute getModifier_Strictfp();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.Modifier#getSynchronized <em>Synchronized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Synchronized</em>'.
	 * @see java_graph.Modifier#getSynchronized()
	 * @see #getModifier()
	 * @generated
	 */
	EAttribute getModifier_Synchronized();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.Modifier#getBodyDeclaration <em>Body Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Body Declaration</em>'.
	 * @see java_graph.Modifier#getBodyDeclaration()
	 * @see #getModifier()
	 * @generated
	 */
	EReference getModifier_BodyDeclaration();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.Modifier#getSingleVariableDeclaration <em>Single Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Single Variable Declaration</em>'.
	 * @see java_graph.Modifier#getSingleVariableDeclaration()
	 * @see #getModifier()
	 * @generated
	 */
	EReference getModifier_SingleVariableDeclaration();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.Modifier#getVariableDeclarationStatement <em>Variable Declaration Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variable Declaration Statement</em>'.
	 * @see java_graph.Modifier#getVariableDeclarationStatement()
	 * @see #getModifier()
	 * @generated
	 */
	EReference getModifier_VariableDeclarationStatement();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.Modifier#getVariableDeclarationExpression <em>Variable Declaration Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variable Declaration Expression</em>'.
	 * @see java_graph.Modifier#getVariableDeclarationExpression()
	 * @see #getModifier()
	 * @generated
	 */
	EReference getModifier_VariableDeclarationExpression();

	/**
	 * Returns the meta object for class '{@link java_graph.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see java_graph.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Name</em>'.
	 * @see java_graph.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.NamedElement#getProxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Proxy</em>'.
	 * @see java_graph.NamedElement#getProxy()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Proxy();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.NamedElement#getUsagesInImports <em>Usages In Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usages In Imports</em>'.
	 * @see java_graph.NamedElement#getUsagesInImports()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_UsagesInImports();

	/**
	 * Returns the meta object for class '{@link java_graph.NamespaceAccess <em>Namespace Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace Access</em>'.
	 * @see java_graph.NamespaceAccess
	 * @generated
	 */
	EClass getNamespaceAccess();

	/**
	 * Returns the meta object for class '{@link java_graph.NumberLiteral <em>Number Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Literal</em>'.
	 * @see java_graph.NumberLiteral
	 * @generated
	 */
	EClass getNumberLiteral();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.NumberLiteral#getTokenValue <em>Token Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Token Value</em>'.
	 * @see java_graph.NumberLiteral#getTokenValue()
	 * @see #getNumberLiteral()
	 * @generated
	 */
	EAttribute getNumberLiteral_TokenValue();

	/**
	 * Returns the meta object for class '{@link java_graph.NullLiteral <em>Null Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Literal</em>'.
	 * @see java_graph.NullLiteral
	 * @generated
	 */
	EClass getNullLiteral();

	/**
	 * Returns the meta object for class '{@link java_graph.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see java_graph.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.Package#getOwnedElements <em>Owned Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Elements</em>'.
	 * @see java_graph.Package#getOwnedElements()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_OwnedElements();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.Package#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Model</em>'.
	 * @see java_graph.Package#getModel()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Model();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.Package#getOwnedPackages <em>Owned Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Packages</em>'.
	 * @see java_graph.Package#getOwnedPackages()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_OwnedPackages();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.Package#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Package</em>'.
	 * @see java_graph.Package#getPackage()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Package();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.Package#getUsagesInPackageAccess <em>Usages In Package Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usages In Package Access</em>'.
	 * @see java_graph.Package#getUsagesInPackageAccess()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_UsagesInPackageAccess();

	/**
	 * Returns the meta object for class '{@link java_graph.PackageAccess <em>Package Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Access</em>'.
	 * @see java_graph.PackageAccess
	 * @generated
	 */
	EClass getPackageAccess();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.PackageAccess#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Package</em>'.
	 * @see java_graph.PackageAccess#getPackage()
	 * @see #getPackageAccess()
	 * @generated
	 */
	EReference getPackageAccess_Package();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.PackageAccess#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Qualifier</em>'.
	 * @see java_graph.PackageAccess#getQualifier()
	 * @see #getPackageAccess()
	 * @generated
	 */
	EReference getPackageAccess_Qualifier();

	/**
	 * Returns the meta object for class '{@link java_graph.ParameterizedType <em>Parameterized Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameterized Type</em>'.
	 * @see java_graph.ParameterizedType
	 * @generated
	 */
	EClass getParameterizedType();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ParameterizedType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see java_graph.ParameterizedType#getType()
	 * @see #getParameterizedType()
	 * @generated
	 */
	EReference getParameterizedType_Type();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ParameterizedType#getTypeArguments <em>Type Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type Arguments</em>'.
	 * @see java_graph.ParameterizedType#getTypeArguments()
	 * @see #getParameterizedType()
	 * @generated
	 */
	EReference getParameterizedType_TypeArguments();

	/**
	 * Returns the meta object for class '{@link java_graph.ParenthesizedExpression <em>Parenthesized Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parenthesized Expression</em>'.
	 * @see java_graph.ParenthesizedExpression
	 * @generated
	 */
	EClass getParenthesizedExpression();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ParenthesizedExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expression</em>'.
	 * @see java_graph.ParenthesizedExpression#getExpression()
	 * @see #getParenthesizedExpression()
	 * @generated
	 */
	EReference getParenthesizedExpression_Expression();

	/**
	 * Returns the meta object for class '{@link java_graph.PostfixExpression <em>Postfix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postfix Expression</em>'.
	 * @see java_graph.PostfixExpression
	 * @generated
	 */
	EClass getPostfixExpression();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.PostfixExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Operator</em>'.
	 * @see java_graph.PostfixExpression#getOperator()
	 * @see #getPostfixExpression()
	 * @generated
	 */
	EAttribute getPostfixExpression_Operator();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.PostfixExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operand</em>'.
	 * @see java_graph.PostfixExpression#getOperand()
	 * @see #getPostfixExpression()
	 * @generated
	 */
	EReference getPostfixExpression_Operand();

	/**
	 * Returns the meta object for class '{@link java_graph.PrefixExpression <em>Prefix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prefix Expression</em>'.
	 * @see java_graph.PrefixExpression
	 * @generated
	 */
	EClass getPrefixExpression();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.PrefixExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Operator</em>'.
	 * @see java_graph.PrefixExpression#getOperator()
	 * @see #getPrefixExpression()
	 * @generated
	 */
	EAttribute getPrefixExpression_Operator();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.PrefixExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operand</em>'.
	 * @see java_graph.PrefixExpression#getOperand()
	 * @see #getPrefixExpression()
	 * @generated
	 */
	EReference getPrefixExpression_Operand();

	/**
	 * Returns the meta object for class '{@link java_graph.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see java_graph.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for class '{@link java_graph.PrimitiveTypeBoolean <em>Primitive Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type Boolean</em>'.
	 * @see java_graph.PrimitiveTypeBoolean
	 * @generated
	 */
	EClass getPrimitiveTypeBoolean();

	/**
	 * Returns the meta object for class '{@link java_graph.PrimitiveTypeByte <em>Primitive Type Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type Byte</em>'.
	 * @see java_graph.PrimitiveTypeByte
	 * @generated
	 */
	EClass getPrimitiveTypeByte();

	/**
	 * Returns the meta object for class '{@link java_graph.PrimitiveTypeChar <em>Primitive Type Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type Char</em>'.
	 * @see java_graph.PrimitiveTypeChar
	 * @generated
	 */
	EClass getPrimitiveTypeChar();

	/**
	 * Returns the meta object for class '{@link java_graph.PrimitiveTypeDouble <em>Primitive Type Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type Double</em>'.
	 * @see java_graph.PrimitiveTypeDouble
	 * @generated
	 */
	EClass getPrimitiveTypeDouble();

	/**
	 * Returns the meta object for class '{@link java_graph.PrimitiveTypeShort <em>Primitive Type Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type Short</em>'.
	 * @see java_graph.PrimitiveTypeShort
	 * @generated
	 */
	EClass getPrimitiveTypeShort();

	/**
	 * Returns the meta object for class '{@link java_graph.PrimitiveTypeFloat <em>Primitive Type Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type Float</em>'.
	 * @see java_graph.PrimitiveTypeFloat
	 * @generated
	 */
	EClass getPrimitiveTypeFloat();

	/**
	 * Returns the meta object for class '{@link java_graph.PrimitiveTypeInt <em>Primitive Type Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type Int</em>'.
	 * @see java_graph.PrimitiveTypeInt
	 * @generated
	 */
	EClass getPrimitiveTypeInt();

	/**
	 * Returns the meta object for class '{@link java_graph.PrimitiveTypeLong <em>Primitive Type Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type Long</em>'.
	 * @see java_graph.PrimitiveTypeLong
	 * @generated
	 */
	EClass getPrimitiveTypeLong();

	/**
	 * Returns the meta object for class '{@link java_graph.PrimitiveTypeVoid <em>Primitive Type Void</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type Void</em>'.
	 * @see java_graph.PrimitiveTypeVoid
	 * @generated
	 */
	EClass getPrimitiveTypeVoid();

	/**
	 * Returns the meta object for class '{@link java_graph.ReturnStatement <em>Return Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Statement</em>'.
	 * @see java_graph.ReturnStatement
	 * @generated
	 */
	EClass getReturnStatement();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ReturnStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expression</em>'.
	 * @see java_graph.ReturnStatement#getExpression()
	 * @see #getReturnStatement()
	 * @generated
	 */
	EReference getReturnStatement_Expression();

	/**
	 * Returns the meta object for class '{@link java_graph.SingleVariableAccess <em>Single Variable Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Variable Access</em>'.
	 * @see java_graph.SingleVariableAccess
	 * @generated
	 */
	EClass getSingleVariableAccess();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.SingleVariableAccess#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variable</em>'.
	 * @see java_graph.SingleVariableAccess#getVariable()
	 * @see #getSingleVariableAccess()
	 * @generated
	 */
	EReference getSingleVariableAccess_Variable();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.SingleVariableAccess#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Qualifier</em>'.
	 * @see java_graph.SingleVariableAccess#getQualifier()
	 * @see #getSingleVariableAccess()
	 * @generated
	 */
	EReference getSingleVariableAccess_Qualifier();

	/**
	 * Returns the meta object for class '{@link java_graph.SingleVariableDeclaration <em>Single Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Variable Declaration</em>'.
	 * @see java_graph.SingleVariableDeclaration
	 * @generated
	 */
	EClass getSingleVariableDeclaration();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.SingleVariableDeclaration#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modifier</em>'.
	 * @see java_graph.SingleVariableDeclaration#getModifier()
	 * @see #getSingleVariableDeclaration()
	 * @generated
	 */
	EReference getSingleVariableDeclaration_Modifier();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.SingleVariableDeclaration#getVarargs <em>Varargs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Varargs</em>'.
	 * @see java_graph.SingleVariableDeclaration#getVarargs()
	 * @see #getSingleVariableDeclaration()
	 * @generated
	 */
	EAttribute getSingleVariableDeclaration_Varargs();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.SingleVariableDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see java_graph.SingleVariableDeclaration#getType()
	 * @see #getSingleVariableDeclaration()
	 * @generated
	 */
	EReference getSingleVariableDeclaration_Type();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.SingleVariableDeclaration#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotations</em>'.
	 * @see java_graph.SingleVariableDeclaration#getAnnotations()
	 * @see #getSingleVariableDeclaration()
	 * @generated
	 */
	EReference getSingleVariableDeclaration_Annotations();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.SingleVariableDeclaration#getMethodDeclaration <em>Method Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Method Declaration</em>'.
	 * @see java_graph.SingleVariableDeclaration#getMethodDeclaration()
	 * @see #getSingleVariableDeclaration()
	 * @generated
	 */
	EReference getSingleVariableDeclaration_MethodDeclaration();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.SingleVariableDeclaration#getCatchClause <em>Catch Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Catch Clause</em>'.
	 * @see java_graph.SingleVariableDeclaration#getCatchClause()
	 * @see #getSingleVariableDeclaration()
	 * @generated
	 */
	EReference getSingleVariableDeclaration_CatchClause();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.SingleVariableDeclaration#getEnhancedForStatement <em>Enhanced For Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enhanced For Statement</em>'.
	 * @see java_graph.SingleVariableDeclaration#getEnhancedForStatement()
	 * @see #getSingleVariableDeclaration()
	 * @generated
	 */
	EReference getSingleVariableDeclaration_EnhancedForStatement();

	/**
	 * Returns the meta object for class '{@link java_graph.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see java_graph.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link java_graph.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see java_graph.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.StringLiteral#getEscapedValue <em>Escaped Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Escaped Value</em>'.
	 * @see java_graph.StringLiteral#getEscapedValue()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_EscapedValue();

	/**
	 * Returns the meta object for class '{@link java_graph.SuperConstructorInvocation <em>Super Constructor Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Constructor Invocation</em>'.
	 * @see java_graph.SuperConstructorInvocation
	 * @generated
	 */
	EClass getSuperConstructorInvocation();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.SuperConstructorInvocation#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expression</em>'.
	 * @see java_graph.SuperConstructorInvocation#getExpression()
	 * @see #getSuperConstructorInvocation()
	 * @generated
	 */
	EReference getSuperConstructorInvocation_Expression();

	/**
	 * Returns the meta object for class '{@link java_graph.SuperFieldAccess <em>Super Field Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Field Access</em>'.
	 * @see java_graph.SuperFieldAccess
	 * @generated
	 */
	EClass getSuperFieldAccess();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.SuperFieldAccess#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Field</em>'.
	 * @see java_graph.SuperFieldAccess#getField()
	 * @see #getSuperFieldAccess()
	 * @generated
	 */
	EReference getSuperFieldAccess_Field();

	/**
	 * Returns the meta object for class '{@link java_graph.SuperMethodInvocation <em>Super Method Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Method Invocation</em>'.
	 * @see java_graph.SuperMethodInvocation
	 * @generated
	 */
	EClass getSuperMethodInvocation();

	/**
	 * Returns the meta object for class '{@link java_graph.SwitchCase <em>Switch Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Case</em>'.
	 * @see java_graph.SwitchCase
	 * @generated
	 */
	EClass getSwitchCase();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.SwitchCase#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Default</em>'.
	 * @see java_graph.SwitchCase#getDefault()
	 * @see #getSwitchCase()
	 * @generated
	 */
	EAttribute getSwitchCase_Default();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.SwitchCase#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expression</em>'.
	 * @see java_graph.SwitchCase#getExpression()
	 * @see #getSwitchCase()
	 * @generated
	 */
	EReference getSwitchCase_Expression();

	/**
	 * Returns the meta object for class '{@link java_graph.SwitchStatement <em>Switch Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Statement</em>'.
	 * @see java_graph.SwitchStatement
	 * @generated
	 */
	EClass getSwitchStatement();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.SwitchStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expression</em>'.
	 * @see java_graph.SwitchStatement#getExpression()
	 * @see #getSwitchStatement()
	 * @generated
	 */
	EReference getSwitchStatement_Expression();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.SwitchStatement#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Statements</em>'.
	 * @see java_graph.SwitchStatement#getStatements()
	 * @see #getSwitchStatement()
	 * @generated
	 */
	EReference getSwitchStatement_Statements();

	/**
	 * Returns the meta object for class '{@link java_graph.SynchronizedStatement <em>Synchronized Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronized Statement</em>'.
	 * @see java_graph.SynchronizedStatement
	 * @generated
	 */
	EClass getSynchronizedStatement();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.SynchronizedStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Body</em>'.
	 * @see java_graph.SynchronizedStatement#getBody()
	 * @see #getSynchronizedStatement()
	 * @generated
	 */
	EReference getSynchronizedStatement_Body();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.SynchronizedStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expression</em>'.
	 * @see java_graph.SynchronizedStatement#getExpression()
	 * @see #getSynchronizedStatement()
	 * @generated
	 */
	EReference getSynchronizedStatement_Expression();

	/**
	 * Returns the meta object for class '{@link java_graph.TagElement <em>Tag Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag Element</em>'.
	 * @see java_graph.TagElement
	 * @generated
	 */
	EClass getTagElement();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.TagElement#getTagName <em>Tag Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tag Name</em>'.
	 * @see java_graph.TagElement#getTagName()
	 * @see #getTagElement()
	 * @generated
	 */
	EAttribute getTagElement_TagName();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.TagElement#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fragments</em>'.
	 * @see java_graph.TagElement#getFragments()
	 * @see #getTagElement()
	 * @generated
	 */
	EReference getTagElement_Fragments();

	/**
	 * Returns the meta object for class '{@link java_graph.TextElement <em>Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Element</em>'.
	 * @see java_graph.TextElement
	 * @generated
	 */
	EClass getTextElement();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.TextElement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Text</em>'.
	 * @see java_graph.TextElement#getText()
	 * @see #getTextElement()
	 * @generated
	 */
	EAttribute getTextElement_Text();

	/**
	 * Returns the meta object for class '{@link java_graph.ThisExpression <em>This Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>This Expression</em>'.
	 * @see java_graph.ThisExpression
	 * @generated
	 */
	EClass getThisExpression();

	/**
	 * Returns the meta object for class '{@link java_graph.ThrowStatement <em>Throw Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throw Statement</em>'.
	 * @see java_graph.ThrowStatement
	 * @generated
	 */
	EClass getThrowStatement();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.ThrowStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expression</em>'.
	 * @see java_graph.ThrowStatement#getExpression()
	 * @see #getThrowStatement()
	 * @generated
	 */
	EReference getThrowStatement_Expression();

	/**
	 * Returns the meta object for class '{@link java_graph.TryStatement <em>Try Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Try Statement</em>'.
	 * @see java_graph.TryStatement
	 * @generated
	 */
	EClass getTryStatement();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.TryStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Body</em>'.
	 * @see java_graph.TryStatement#getBody()
	 * @see #getTryStatement()
	 * @generated
	 */
	EReference getTryStatement_Body();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.TryStatement#getFinally <em>Finally</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Finally</em>'.
	 * @see java_graph.TryStatement#getFinally()
	 * @see #getTryStatement()
	 * @generated
	 */
	EReference getTryStatement_Finally();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.TryStatement#getCatchClauses <em>Catch Clauses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Catch Clauses</em>'.
	 * @see java_graph.TryStatement#getCatchClauses()
	 * @see #getTryStatement()
	 * @generated
	 */
	EReference getTryStatement_CatchClauses();

	/**
	 * Returns the meta object for class '{@link java_graph.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see java_graph.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.Type#getUsagesInTypeAccess <em>Usages In Type Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usages In Type Access</em>'.
	 * @see java_graph.Type#getUsagesInTypeAccess()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_UsagesInTypeAccess();

	/**
	 * Returns the meta object for class '{@link java_graph.TypeAccess <em>Type Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Access</em>'.
	 * @see java_graph.TypeAccess
	 * @generated
	 */
	EClass getTypeAccess();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.TypeAccess#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see java_graph.TypeAccess#getType()
	 * @see #getTypeAccess()
	 * @generated
	 */
	EReference getTypeAccess_Type();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.TypeAccess#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Qualifier</em>'.
	 * @see java_graph.TypeAccess#getQualifier()
	 * @see #getTypeAccess()
	 * @generated
	 */
	EReference getTypeAccess_Qualifier();

	/**
	 * Returns the meta object for class '{@link java_graph.TypeDeclaration <em>Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Declaration</em>'.
	 * @see java_graph.TypeDeclaration
	 * @generated
	 */
	EClass getTypeDeclaration();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.TypeDeclaration#getTypeParameters <em>Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type Parameters</em>'.
	 * @see java_graph.TypeDeclaration#getTypeParameters()
	 * @see #getTypeDeclaration()
	 * @generated
	 */
	EReference getTypeDeclaration_TypeParameters();

	/**
	 * Returns the meta object for class '{@link java_graph.TypeDeclarationStatement <em>Type Declaration Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Declaration Statement</em>'.
	 * @see java_graph.TypeDeclarationStatement
	 * @generated
	 */
	EClass getTypeDeclarationStatement();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.TypeDeclarationStatement#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Declaration</em>'.
	 * @see java_graph.TypeDeclarationStatement#getDeclaration()
	 * @see #getTypeDeclarationStatement()
	 * @generated
	 */
	EReference getTypeDeclarationStatement_Declaration();

	/**
	 * Returns the meta object for class '{@link java_graph.TypeLiteral <em>Type Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Literal</em>'.
	 * @see java_graph.TypeLiteral
	 * @generated
	 */
	EClass getTypeLiteral();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.TypeLiteral#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see java_graph.TypeLiteral#getType()
	 * @see #getTypeLiteral()
	 * @generated
	 */
	EReference getTypeLiteral_Type();

	/**
	 * Returns the meta object for class '{@link java_graph.TypeParameter <em>Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Parameter</em>'.
	 * @see java_graph.TypeParameter
	 * @generated
	 */
	EClass getTypeParameter();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.TypeParameter#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bounds</em>'.
	 * @see java_graph.TypeParameter#getBounds()
	 * @see #getTypeParameter()
	 * @generated
	 */
	EReference getTypeParameter_Bounds();

	/**
	 * Returns the meta object for class '{@link java_graph.UnresolvedItem <em>Unresolved Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved Item</em>'.
	 * @see java_graph.UnresolvedItem
	 * @generated
	 */
	EClass getUnresolvedItem();

	/**
	 * Returns the meta object for class '{@link java_graph.UnresolvedItemAccess <em>Unresolved Item Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved Item Access</em>'.
	 * @see java_graph.UnresolvedItemAccess
	 * @generated
	 */
	EClass getUnresolvedItemAccess();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.UnresolvedItemAccess#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Element</em>'.
	 * @see java_graph.UnresolvedItemAccess#getElement()
	 * @see #getUnresolvedItemAccess()
	 * @generated
	 */
	EReference getUnresolvedItemAccess_Element();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.UnresolvedItemAccess#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Qualifier</em>'.
	 * @see java_graph.UnresolvedItemAccess#getQualifier()
	 * @see #getUnresolvedItemAccess()
	 * @generated
	 */
	EReference getUnresolvedItemAccess_Qualifier();

	/**
	 * Returns the meta object for class '{@link java_graph.UnresolvedAnnotationDeclaration <em>Unresolved Annotation Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved Annotation Declaration</em>'.
	 * @see java_graph.UnresolvedAnnotationDeclaration
	 * @generated
	 */
	EClass getUnresolvedAnnotationDeclaration();

	/**
	 * Returns the meta object for class '{@link java_graph.UnresolvedAnnotationTypeMemberDeclaration <em>Unresolved Annotation Type Member Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved Annotation Type Member Declaration</em>'.
	 * @see java_graph.UnresolvedAnnotationTypeMemberDeclaration
	 * @generated
	 */
	EClass getUnresolvedAnnotationTypeMemberDeclaration();

	/**
	 * Returns the meta object for class '{@link java_graph.UnresolvedClassDeclaration <em>Unresolved Class Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved Class Declaration</em>'.
	 * @see java_graph.UnresolvedClassDeclaration
	 * @generated
	 */
	EClass getUnresolvedClassDeclaration();

	/**
	 * Returns the meta object for class '{@link java_graph.UnresolvedEnumDeclaration <em>Unresolved Enum Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved Enum Declaration</em>'.
	 * @see java_graph.UnresolvedEnumDeclaration
	 * @generated
	 */
	EClass getUnresolvedEnumDeclaration();

	/**
	 * Returns the meta object for class '{@link java_graph.UnresolvedInterfaceDeclaration <em>Unresolved Interface Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved Interface Declaration</em>'.
	 * @see java_graph.UnresolvedInterfaceDeclaration
	 * @generated
	 */
	EClass getUnresolvedInterfaceDeclaration();

	/**
	 * Returns the meta object for class '{@link java_graph.UnresolvedLabeledStatement <em>Unresolved Labeled Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved Labeled Statement</em>'.
	 * @see java_graph.UnresolvedLabeledStatement
	 * @generated
	 */
	EClass getUnresolvedLabeledStatement();

	/**
	 * Returns the meta object for class '{@link java_graph.UnresolvedMethodDeclaration <em>Unresolved Method Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved Method Declaration</em>'.
	 * @see java_graph.UnresolvedMethodDeclaration
	 * @generated
	 */
	EClass getUnresolvedMethodDeclaration();

	/**
	 * Returns the meta object for class '{@link java_graph.UnresolvedSingleVariableDeclaration <em>Unresolved Single Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved Single Variable Declaration</em>'.
	 * @see java_graph.UnresolvedSingleVariableDeclaration
	 * @generated
	 */
	EClass getUnresolvedSingleVariableDeclaration();

	/**
	 * Returns the meta object for class '{@link java_graph.UnresolvedType <em>Unresolved Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved Type</em>'.
	 * @see java_graph.UnresolvedType
	 * @generated
	 */
	EClass getUnresolvedType();

	/**
	 * Returns the meta object for class '{@link java_graph.UnresolvedTypeDeclaration <em>Unresolved Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved Type Declaration</em>'.
	 * @see java_graph.UnresolvedTypeDeclaration
	 * @generated
	 */
	EClass getUnresolvedTypeDeclaration();

	/**
	 * Returns the meta object for class '{@link java_graph.UnresolvedVariableDeclarationFragment <em>Unresolved Variable Declaration Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved Variable Declaration Fragment</em>'.
	 * @see java_graph.UnresolvedVariableDeclarationFragment
	 * @generated
	 */
	EClass getUnresolvedVariableDeclarationFragment();

	/**
	 * Returns the meta object for class '{@link java_graph.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration</em>'.
	 * @see java_graph.VariableDeclaration
	 * @generated
	 */
	EClass getVariableDeclaration();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.VariableDeclaration#getExtraArrayDimensions <em>Extra Array Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Extra Array Dimensions</em>'.
	 * @see java_graph.VariableDeclaration#getExtraArrayDimensions()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EAttribute getVariableDeclaration_ExtraArrayDimensions();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.VariableDeclaration#getInitializer <em>Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Initializer</em>'.
	 * @see java_graph.VariableDeclaration#getInitializer()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EReference getVariableDeclaration_Initializer();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.VariableDeclaration#getUsageInVariableAccess <em>Usage In Variable Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usage In Variable Access</em>'.
	 * @see java_graph.VariableDeclaration#getUsageInVariableAccess()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EReference getVariableDeclaration_UsageInVariableAccess();

	/**
	 * Returns the meta object for class '{@link java_graph.VariableDeclarationExpression <em>Variable Declaration Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration Expression</em>'.
	 * @see java_graph.VariableDeclarationExpression
	 * @generated
	 */
	EClass getVariableDeclarationExpression();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.VariableDeclarationExpression#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modifier</em>'.
	 * @see java_graph.VariableDeclarationExpression#getModifier()
	 * @see #getVariableDeclarationExpression()
	 * @generated
	 */
	EReference getVariableDeclarationExpression_Modifier();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.VariableDeclarationExpression#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotations</em>'.
	 * @see java_graph.VariableDeclarationExpression#getAnnotations()
	 * @see #getVariableDeclarationExpression()
	 * @generated
	 */
	EReference getVariableDeclarationExpression_Annotations();

	/**
	 * Returns the meta object for class '{@link java_graph.VariableDeclarationFragment <em>Variable Declaration Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration Fragment</em>'.
	 * @see java_graph.VariableDeclarationFragment
	 * @generated
	 */
	EClass getVariableDeclarationFragment();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.VariableDeclarationFragment#getVariablesContainer <em>Variables Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variables Container</em>'.
	 * @see java_graph.VariableDeclarationFragment#getVariablesContainer()
	 * @see #getVariableDeclarationFragment()
	 * @generated
	 */
	EReference getVariableDeclarationFragment_VariablesContainer();

	/**
	 * Returns the meta object for class '{@link java_graph.VariableDeclarationStatement <em>Variable Declaration Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration Statement</em>'.
	 * @see java_graph.VariableDeclarationStatement
	 * @generated
	 */
	EClass getVariableDeclarationStatement();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.VariableDeclarationStatement#getExtraArrayDimensions <em>Extra Array Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Extra Array Dimensions</em>'.
	 * @see java_graph.VariableDeclarationStatement#getExtraArrayDimensions()
	 * @see #getVariableDeclarationStatement()
	 * @generated
	 */
	EAttribute getVariableDeclarationStatement_ExtraArrayDimensions();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.VariableDeclarationStatement#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modifier</em>'.
	 * @see java_graph.VariableDeclarationStatement#getModifier()
	 * @see #getVariableDeclarationStatement()
	 * @generated
	 */
	EReference getVariableDeclarationStatement_Modifier();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.VariableDeclarationStatement#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotations</em>'.
	 * @see java_graph.VariableDeclarationStatement#getAnnotations()
	 * @see #getVariableDeclarationStatement()
	 * @generated
	 */
	EReference getVariableDeclarationStatement_Annotations();

	/**
	 * Returns the meta object for class '{@link java_graph.WildCardType <em>Wild Card Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wild Card Type</em>'.
	 * @see java_graph.WildCardType
	 * @generated
	 */
	EClass getWildCardType();

	/**
	 * Returns the meta object for the attribute list '{@link java_graph.WildCardType#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Upper Bound</em>'.
	 * @see java_graph.WildCardType#getUpperBound()
	 * @see #getWildCardType()
	 * @generated
	 */
	EAttribute getWildCardType_UpperBound();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.WildCardType#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bound</em>'.
	 * @see java_graph.WildCardType#getBound()
	 * @see #getWildCardType()
	 * @generated
	 */
	EReference getWildCardType_Bound();

	/**
	 * Returns the meta object for class '{@link java_graph.WhileStatement <em>While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Statement</em>'.
	 * @see java_graph.WhileStatement
	 * @generated
	 */
	EClass getWhileStatement();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.WhileStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expression</em>'.
	 * @see java_graph.WhileStatement#getExpression()
	 * @see #getWhileStatement()
	 * @generated
	 */
	EReference getWhileStatement_Expression();

	/**
	 * Returns the meta object for the reference list '{@link java_graph.WhileStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Body</em>'.
	 * @see java_graph.WhileStatement#getBody()
	 * @see #getWhileStatement()
	 * @generated
	 */
	EReference getWhileStatement_Body();

	/**
	 * Returns the meta object for enum '{@link java_graph.AssignmentKind <em>Assignment Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Assignment Kind</em>'.
	 * @see java_graph.AssignmentKind
	 * @generated
	 */
	EEnum getAssignmentKind();

	/**
	 * Returns the meta object for enum '{@link java_graph.InfixExpressionKind <em>Infix Expression Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Infix Expression Kind</em>'.
	 * @see java_graph.InfixExpressionKind
	 * @generated
	 */
	EEnum getInfixExpressionKind();

	/**
	 * Returns the meta object for enum '{@link java_graph.InheritanceKind <em>Inheritance Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Inheritance Kind</em>'.
	 * @see java_graph.InheritanceKind
	 * @generated
	 */
	EEnum getInheritanceKind();

	/**
	 * Returns the meta object for enum '{@link java_graph.PostfixExpressionKind <em>Postfix Expression Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Postfix Expression Kind</em>'.
	 * @see java_graph.PostfixExpressionKind
	 * @generated
	 */
	EEnum getPostfixExpressionKind();

	/**
	 * Returns the meta object for enum '{@link java_graph.PrefixExpressionKind <em>Prefix Expression Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Prefix Expression Kind</em>'.
	 * @see java_graph.PrefixExpressionKind
	 * @generated
	 */
	EEnum getPrefixExpressionKind();

	/**
	 * Returns the meta object for enum '{@link java_graph.VisibilityKind <em>Visibility Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility Kind</em>'.
	 * @see java_graph.VisibilityKind
	 * @generated
	 */
	EEnum getVisibilityKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Java_graphFactory getJava_graphFactory();

} //Java_graphPackage

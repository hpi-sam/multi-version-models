/**
 */
package java_graph.impl;

import java_graph.Annotation;
import java_graph.AnnotationMemberValuePair;
import java_graph.AnnotationTypeDeclaration;
import java_graph.AnnotationTypeMemberDeclaration;
import java_graph.AnonymousClassDeclaration;
import java_graph.Archive;
import java_graph.ArrayAccess;
import java_graph.ArrayCreation;
import java_graph.ArrayInitializer;
import java_graph.ArrayLengthAccess;
import java_graph.ArrayType;
import java_graph.AssertStatement;
import java_graph.Assignment;
import java_graph.AssignmentKind;
import java_graph.Block;
import java_graph.BlockComment;
import java_graph.BooleanLiteral;
import java_graph.BreakStatement;
import java_graph.CastExpression;
import java_graph.CatchClause;
import java_graph.CharacterLiteral;
import java_graph.ClassDeclaration;
import java_graph.ClassFile;
import java_graph.ClassInstanceCreation;
import java_graph.CompilationUnit;
import java_graph.ConditionalExpression;
import java_graph.ConstructorDeclaration;
import java_graph.ConstructorInvocation;
import java_graph.ContinueStatement;
import java_graph.DoStatement;
import java_graph.EmptyStatement;
import java_graph.EnhancedForStatement;
import java_graph.EnumConstantDeclaration;
import java_graph.EnumDeclaration;
import java_graph.ExpressionStatement;
import java_graph.FieldAccess;
import java_graph.FieldDeclaration;
import java_graph.ForStatement;
import java_graph.IfStatement;
import java_graph.ImportDeclaration;
import java_graph.InfixExpression;
import java_graph.InfixExpressionKind;
import java_graph.InheritanceKind;
import java_graph.Initializer;
import java_graph.InstanceofExpression;
import java_graph.InterfaceDeclaration;
import java_graph.Java_graphFactory;
import java_graph.Java_graphPackage;
import java_graph.Javadoc;
import java_graph.LabeledStatement;
import java_graph.LineComment;
import java_graph.Manifest;
import java_graph.ManifestAttribute;
import java_graph.ManifestEntry;
import java_graph.MemberRef;
import java_graph.MethodDeclaration;
import java_graph.MethodInvocation;
import java_graph.MethodRef;
import java_graph.MethodRefParameter;
import java_graph.Model;
import java_graph.Modifier;
import java_graph.NullLiteral;
import java_graph.NumberLiteral;
import java_graph.PackageAccess;
import java_graph.ParameterizedType;
import java_graph.ParenthesizedExpression;
import java_graph.PostfixExpression;
import java_graph.PostfixExpressionKind;
import java_graph.PrefixExpression;
import java_graph.PrefixExpressionKind;
import java_graph.PrimitiveType;
import java_graph.PrimitiveTypeBoolean;
import java_graph.PrimitiveTypeByte;
import java_graph.PrimitiveTypeChar;
import java_graph.PrimitiveTypeDouble;
import java_graph.PrimitiveTypeFloat;
import java_graph.PrimitiveTypeInt;
import java_graph.PrimitiveTypeLong;
import java_graph.PrimitiveTypeShort;
import java_graph.PrimitiveTypeVoid;
import java_graph.ReturnStatement;
import java_graph.SingleVariableAccess;
import java_graph.SingleVariableDeclaration;
import java_graph.StringLiteral;
import java_graph.SuperConstructorInvocation;
import java_graph.SuperFieldAccess;
import java_graph.SuperMethodInvocation;
import java_graph.SwitchCase;
import java_graph.SwitchStatement;
import java_graph.SynchronizedStatement;
import java_graph.TagElement;
import java_graph.TextElement;
import java_graph.ThisExpression;
import java_graph.ThrowStatement;
import java_graph.TryStatement;
import java_graph.TypeAccess;
import java_graph.TypeDeclarationStatement;
import java_graph.TypeLiteral;
import java_graph.TypeParameter;
import java_graph.UnresolvedAnnotationDeclaration;
import java_graph.UnresolvedAnnotationTypeMemberDeclaration;
import java_graph.UnresolvedClassDeclaration;
import java_graph.UnresolvedEnumDeclaration;
import java_graph.UnresolvedInterfaceDeclaration;
import java_graph.UnresolvedItem;
import java_graph.UnresolvedItemAccess;
import java_graph.UnresolvedLabeledStatement;
import java_graph.UnresolvedMethodDeclaration;
import java_graph.UnresolvedSingleVariableDeclaration;
import java_graph.UnresolvedType;
import java_graph.UnresolvedTypeDeclaration;
import java_graph.UnresolvedVariableDeclarationFragment;
import java_graph.VariableDeclarationExpression;
import java_graph.VariableDeclarationFragment;
import java_graph.VariableDeclarationStatement;
import java_graph.VisibilityKind;
import java_graph.WhileStatement;
import java_graph.WildCardType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Java_graphFactoryImpl extends EFactoryImpl implements Java_graphFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Java_graphFactory init() {
		try {
			Java_graphFactory theJava_graphFactory = (Java_graphFactory)EPackage.Registry.INSTANCE.getEFactory(Java_graphPackage.eNS_URI);
			if (theJava_graphFactory != null) {
				return theJava_graphFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Java_graphFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java_graphFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Java_graphPackage.ANNOTATION: return createAnnotation();
			case Java_graphPackage.ARCHIVE: return createArchive();
			case Java_graphPackage.ASSERT_STATEMENT: return createAssertStatement();
			case Java_graphPackage.ANNOTATION_MEMBER_VALUE_PAIR: return createAnnotationMemberValuePair();
			case Java_graphPackage.ANNOTATION_TYPE_DECLARATION: return createAnnotationTypeDeclaration();
			case Java_graphPackage.ANNOTATION_TYPE_MEMBER_DECLARATION: return createAnnotationTypeMemberDeclaration();
			case Java_graphPackage.ANONYMOUS_CLASS_DECLARATION: return createAnonymousClassDeclaration();
			case Java_graphPackage.ARRAY_ACCESS: return createArrayAccess();
			case Java_graphPackage.ARRAY_CREATION: return createArrayCreation();
			case Java_graphPackage.ARRAY_INITIALIZER: return createArrayInitializer();
			case Java_graphPackage.ARRAY_LENGTH_ACCESS: return createArrayLengthAccess();
			case Java_graphPackage.ARRAY_TYPE: return createArrayType();
			case Java_graphPackage.ASSIGNMENT: return createAssignment();
			case Java_graphPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
			case Java_graphPackage.BLOCK_COMMENT: return createBlockComment();
			case Java_graphPackage.BLOCK: return createBlock();
			case Java_graphPackage.BREAK_STATEMENT: return createBreakStatement();
			case Java_graphPackage.CAST_EXPRESSION: return createCastExpression();
			case Java_graphPackage.CATCH_CLAUSE: return createCatchClause();
			case Java_graphPackage.CHARACTER_LITERAL: return createCharacterLiteral();
			case Java_graphPackage.CLASS_FILE: return createClassFile();
			case Java_graphPackage.CLASS_INSTANCE_CREATION: return createClassInstanceCreation();
			case Java_graphPackage.CONSTRUCTOR_DECLARATION: return createConstructorDeclaration();
			case Java_graphPackage.CONDITIONAL_EXPRESSION: return createConditionalExpression();
			case Java_graphPackage.CONSTRUCTOR_INVOCATION: return createConstructorInvocation();
			case Java_graphPackage.CLASS_DECLARATION: return createClassDeclaration();
			case Java_graphPackage.COMPILATION_UNIT: return createCompilationUnit();
			case Java_graphPackage.CONTINUE_STATEMENT: return createContinueStatement();
			case Java_graphPackage.DO_STATEMENT: return createDoStatement();
			case Java_graphPackage.EMPTY_STATEMENT: return createEmptyStatement();
			case Java_graphPackage.ENHANCED_FOR_STATEMENT: return createEnhancedForStatement();
			case Java_graphPackage.ENUM_CONSTANT_DECLARATION: return createEnumConstantDeclaration();
			case Java_graphPackage.ENUM_DECLARATION: return createEnumDeclaration();
			case Java_graphPackage.EXPRESSION_STATEMENT: return createExpressionStatement();
			case Java_graphPackage.FIELD_ACCESS: return createFieldAccess();
			case Java_graphPackage.FIELD_DECLARATION: return createFieldDeclaration();
			case Java_graphPackage.FOR_STATEMENT: return createForStatement();
			case Java_graphPackage.IF_STATEMENT: return createIfStatement();
			case Java_graphPackage.IMPORT_DECLARATION: return createImportDeclaration();
			case Java_graphPackage.INFIX_EXPRESSION: return createInfixExpression();
			case Java_graphPackage.INITIALIZER: return createInitializer();
			case Java_graphPackage.INSTANCEOF_EXPRESSION: return createInstanceofExpression();
			case Java_graphPackage.INTERFACE_DECLARATION: return createInterfaceDeclaration();
			case Java_graphPackage.JAVADOC: return createJavadoc();
			case Java_graphPackage.LABELED_STATEMENT: return createLabeledStatement();
			case Java_graphPackage.LINE_COMMENT: return createLineComment();
			case Java_graphPackage.MANIFEST: return createManifest();
			case Java_graphPackage.MANIFEST_ATTRIBUTE: return createManifestAttribute();
			case Java_graphPackage.MANIFEST_ENTRY: return createManifestEntry();
			case Java_graphPackage.MEMBER_REF: return createMemberRef();
			case Java_graphPackage.METHOD_DECLARATION: return createMethodDeclaration();
			case Java_graphPackage.METHOD_INVOCATION: return createMethodInvocation();
			case Java_graphPackage.METHOD_REF: return createMethodRef();
			case Java_graphPackage.METHOD_REF_PARAMETER: return createMethodRefParameter();
			case Java_graphPackage.MODEL: return createModel();
			case Java_graphPackage.MODIFIER: return createModifier();
			case Java_graphPackage.NUMBER_LITERAL: return createNumberLiteral();
			case Java_graphPackage.NULL_LITERAL: return createNullLiteral();
			case Java_graphPackage.PACKAGE: return createPackage();
			case Java_graphPackage.PACKAGE_ACCESS: return createPackageAccess();
			case Java_graphPackage.PARAMETERIZED_TYPE: return createParameterizedType();
			case Java_graphPackage.PARENTHESIZED_EXPRESSION: return createParenthesizedExpression();
			case Java_graphPackage.POSTFIX_EXPRESSION: return createPostfixExpression();
			case Java_graphPackage.PREFIX_EXPRESSION: return createPrefixExpression();
			case Java_graphPackage.PRIMITIVE_TYPE: return createPrimitiveType();
			case Java_graphPackage.PRIMITIVE_TYPE_BOOLEAN: return createPrimitiveTypeBoolean();
			case Java_graphPackage.PRIMITIVE_TYPE_BYTE: return createPrimitiveTypeByte();
			case Java_graphPackage.PRIMITIVE_TYPE_CHAR: return createPrimitiveTypeChar();
			case Java_graphPackage.PRIMITIVE_TYPE_DOUBLE: return createPrimitiveTypeDouble();
			case Java_graphPackage.PRIMITIVE_TYPE_SHORT: return createPrimitiveTypeShort();
			case Java_graphPackage.PRIMITIVE_TYPE_FLOAT: return createPrimitiveTypeFloat();
			case Java_graphPackage.PRIMITIVE_TYPE_INT: return createPrimitiveTypeInt();
			case Java_graphPackage.PRIMITIVE_TYPE_LONG: return createPrimitiveTypeLong();
			case Java_graphPackage.PRIMITIVE_TYPE_VOID: return createPrimitiveTypeVoid();
			case Java_graphPackage.RETURN_STATEMENT: return createReturnStatement();
			case Java_graphPackage.SINGLE_VARIABLE_ACCESS: return createSingleVariableAccess();
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION: return createSingleVariableDeclaration();
			case Java_graphPackage.STRING_LITERAL: return createStringLiteral();
			case Java_graphPackage.SUPER_CONSTRUCTOR_INVOCATION: return createSuperConstructorInvocation();
			case Java_graphPackage.SUPER_FIELD_ACCESS: return createSuperFieldAccess();
			case Java_graphPackage.SUPER_METHOD_INVOCATION: return createSuperMethodInvocation();
			case Java_graphPackage.SWITCH_CASE: return createSwitchCase();
			case Java_graphPackage.SWITCH_STATEMENT: return createSwitchStatement();
			case Java_graphPackage.SYNCHRONIZED_STATEMENT: return createSynchronizedStatement();
			case Java_graphPackage.TAG_ELEMENT: return createTagElement();
			case Java_graphPackage.TEXT_ELEMENT: return createTextElement();
			case Java_graphPackage.THIS_EXPRESSION: return createThisExpression();
			case Java_graphPackage.THROW_STATEMENT: return createThrowStatement();
			case Java_graphPackage.TRY_STATEMENT: return createTryStatement();
			case Java_graphPackage.TYPE_ACCESS: return createTypeAccess();
			case Java_graphPackage.TYPE_DECLARATION_STATEMENT: return createTypeDeclarationStatement();
			case Java_graphPackage.TYPE_LITERAL: return createTypeLiteral();
			case Java_graphPackage.TYPE_PARAMETER: return createTypeParameter();
			case Java_graphPackage.UNRESOLVED_ITEM: return createUnresolvedItem();
			case Java_graphPackage.UNRESOLVED_ITEM_ACCESS: return createUnresolvedItemAccess();
			case Java_graphPackage.UNRESOLVED_ANNOTATION_DECLARATION: return createUnresolvedAnnotationDeclaration();
			case Java_graphPackage.UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION: return createUnresolvedAnnotationTypeMemberDeclaration();
			case Java_graphPackage.UNRESOLVED_CLASS_DECLARATION: return createUnresolvedClassDeclaration();
			case Java_graphPackage.UNRESOLVED_ENUM_DECLARATION: return createUnresolvedEnumDeclaration();
			case Java_graphPackage.UNRESOLVED_INTERFACE_DECLARATION: return createUnresolvedInterfaceDeclaration();
			case Java_graphPackage.UNRESOLVED_LABELED_STATEMENT: return createUnresolvedLabeledStatement();
			case Java_graphPackage.UNRESOLVED_METHOD_DECLARATION: return createUnresolvedMethodDeclaration();
			case Java_graphPackage.UNRESOLVED_SINGLE_VARIABLE_DECLARATION: return createUnresolvedSingleVariableDeclaration();
			case Java_graphPackage.UNRESOLVED_TYPE: return createUnresolvedType();
			case Java_graphPackage.UNRESOLVED_TYPE_DECLARATION: return createUnresolvedTypeDeclaration();
			case Java_graphPackage.UNRESOLVED_VARIABLE_DECLARATION_FRAGMENT: return createUnresolvedVariableDeclarationFragment();
			case Java_graphPackage.VARIABLE_DECLARATION_EXPRESSION: return createVariableDeclarationExpression();
			case Java_graphPackage.VARIABLE_DECLARATION_FRAGMENT: return createVariableDeclarationFragment();
			case Java_graphPackage.VARIABLE_DECLARATION_STATEMENT: return createVariableDeclarationStatement();
			case Java_graphPackage.WILD_CARD_TYPE: return createWildCardType();
			case Java_graphPackage.WHILE_STATEMENT: return createWhileStatement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Java_graphPackage.ASSIGNMENT_KIND:
				return createAssignmentKindFromString(eDataType, initialValue);
			case Java_graphPackage.INFIX_EXPRESSION_KIND:
				return createInfixExpressionKindFromString(eDataType, initialValue);
			case Java_graphPackage.INHERITANCE_KIND:
				return createInheritanceKindFromString(eDataType, initialValue);
			case Java_graphPackage.POSTFIX_EXPRESSION_KIND:
				return createPostfixExpressionKindFromString(eDataType, initialValue);
			case Java_graphPackage.PREFIX_EXPRESSION_KIND:
				return createPrefixExpressionKindFromString(eDataType, initialValue);
			case Java_graphPackage.VISIBILITY_KIND:
				return createVisibilityKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Java_graphPackage.ASSIGNMENT_KIND:
				return convertAssignmentKindToString(eDataType, instanceValue);
			case Java_graphPackage.INFIX_EXPRESSION_KIND:
				return convertInfixExpressionKindToString(eDataType, instanceValue);
			case Java_graphPackage.INHERITANCE_KIND:
				return convertInheritanceKindToString(eDataType, instanceValue);
			case Java_graphPackage.POSTFIX_EXPRESSION_KIND:
				return convertPostfixExpressionKindToString(eDataType, instanceValue);
			case Java_graphPackage.PREFIX_EXPRESSION_KIND:
				return convertPrefixExpressionKindToString(eDataType, instanceValue);
			case Java_graphPackage.VISIBILITY_KIND:
				return convertVisibilityKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Archive createArchive() {
		ArchiveImpl archive = new ArchiveImpl();
		return archive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssertStatement createAssertStatement() {
		AssertStatementImpl assertStatement = new AssertStatementImpl();
		return assertStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValuePair createAnnotationMemberValuePair() {
		AnnotationMemberValuePairImpl annotationMemberValuePair = new AnnotationMemberValuePairImpl();
		return annotationMemberValuePair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationTypeDeclaration createAnnotationTypeDeclaration() {
		AnnotationTypeDeclarationImpl annotationTypeDeclaration = new AnnotationTypeDeclarationImpl();
		return annotationTypeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationTypeMemberDeclaration createAnnotationTypeMemberDeclaration() {
		AnnotationTypeMemberDeclarationImpl annotationTypeMemberDeclaration = new AnnotationTypeMemberDeclarationImpl();
		return annotationTypeMemberDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousClassDeclaration createAnonymousClassDeclaration() {
		AnonymousClassDeclarationImpl anonymousClassDeclaration = new AnonymousClassDeclarationImpl();
		return anonymousClassDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayAccess createArrayAccess() {
		ArrayAccessImpl arrayAccess = new ArrayAccessImpl();
		return arrayAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayCreation createArrayCreation() {
		ArrayCreationImpl arrayCreation = new ArrayCreationImpl();
		return arrayCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayInitializer createArrayInitializer() {
		ArrayInitializerImpl arrayInitializer = new ArrayInitializerImpl();
		return arrayInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayLengthAccess createArrayLengthAccess() {
		ArrayLengthAccessImpl arrayLengthAccess = new ArrayLengthAccessImpl();
		return arrayLengthAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayType createArrayType() {
		ArrayTypeImpl arrayType = new ArrayTypeImpl();
		return arrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanLiteral createBooleanLiteral() {
		BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
		return booleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockComment createBlockComment() {
		BlockCommentImpl blockComment = new BlockCommentImpl();
		return blockComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BreakStatement createBreakStatement() {
		BreakStatementImpl breakStatement = new BreakStatementImpl();
		return breakStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CastExpression createCastExpression() {
		CastExpressionImpl castExpression = new CastExpressionImpl();
		return castExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CatchClause createCatchClause() {
		CatchClauseImpl catchClause = new CatchClauseImpl();
		return catchClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterLiteral createCharacterLiteral() {
		CharacterLiteralImpl characterLiteral = new CharacterLiteralImpl();
		return characterLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassFile createClassFile() {
		ClassFileImpl classFile = new ClassFileImpl();
		return classFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassInstanceCreation createClassInstanceCreation() {
		ClassInstanceCreationImpl classInstanceCreation = new ClassInstanceCreationImpl();
		return classInstanceCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstructorDeclaration createConstructorDeclaration() {
		ConstructorDeclarationImpl constructorDeclaration = new ConstructorDeclarationImpl();
		return constructorDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalExpression createConditionalExpression() {
		ConditionalExpressionImpl conditionalExpression = new ConditionalExpressionImpl();
		return conditionalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstructorInvocation createConstructorInvocation() {
		ConstructorInvocationImpl constructorInvocation = new ConstructorInvocationImpl();
		return constructorInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDeclaration createClassDeclaration() {
		ClassDeclarationImpl classDeclaration = new ClassDeclarationImpl();
		return classDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompilationUnit createCompilationUnit() {
		CompilationUnitImpl compilationUnit = new CompilationUnitImpl();
		return compilationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinueStatement createContinueStatement() {
		ContinueStatementImpl continueStatement = new ContinueStatementImpl();
		return continueStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoStatement createDoStatement() {
		DoStatementImpl doStatement = new DoStatementImpl();
		return doStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmptyStatement createEmptyStatement() {
		EmptyStatementImpl emptyStatement = new EmptyStatementImpl();
		return emptyStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnhancedForStatement createEnhancedForStatement() {
		EnhancedForStatementImpl enhancedForStatement = new EnhancedForStatementImpl();
		return enhancedForStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumConstantDeclaration createEnumConstantDeclaration() {
		EnumConstantDeclarationImpl enumConstantDeclaration = new EnumConstantDeclarationImpl();
		return enumConstantDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumDeclaration createEnumDeclaration() {
		EnumDeclarationImpl enumDeclaration = new EnumDeclarationImpl();
		return enumDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionStatement createExpressionStatement() {
		ExpressionStatementImpl expressionStatement = new ExpressionStatementImpl();
		return expressionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldAccess createFieldAccess() {
		FieldAccessImpl fieldAccess = new FieldAccessImpl();
		return fieldAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldDeclaration createFieldDeclaration() {
		FieldDeclarationImpl fieldDeclaration = new FieldDeclarationImpl();
		return fieldDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForStatement createForStatement() {
		ForStatementImpl forStatement = new ForStatementImpl();
		return forStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfStatement createIfStatement() {
		IfStatementImpl ifStatement = new IfStatementImpl();
		return ifStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportDeclaration createImportDeclaration() {
		ImportDeclarationImpl importDeclaration = new ImportDeclarationImpl();
		return importDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfixExpression createInfixExpression() {
		InfixExpressionImpl infixExpression = new InfixExpressionImpl();
		return infixExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Initializer createInitializer() {
		InitializerImpl initializer = new InitializerImpl();
		return initializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstanceofExpression createInstanceofExpression() {
		InstanceofExpressionImpl instanceofExpression = new InstanceofExpressionImpl();
		return instanceofExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceDeclaration createInterfaceDeclaration() {
		InterfaceDeclarationImpl interfaceDeclaration = new InterfaceDeclarationImpl();
		return interfaceDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Javadoc createJavadoc() {
		JavadocImpl javadoc = new JavadocImpl();
		return javadoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledStatement createLabeledStatement() {
		LabeledStatementImpl labeledStatement = new LabeledStatementImpl();
		return labeledStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineComment createLineComment() {
		LineCommentImpl lineComment = new LineCommentImpl();
		return lineComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Manifest createManifest() {
		ManifestImpl manifest = new ManifestImpl();
		return manifest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManifestAttribute createManifestAttribute() {
		ManifestAttributeImpl manifestAttribute = new ManifestAttributeImpl();
		return manifestAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManifestEntry createManifestEntry() {
		ManifestEntryImpl manifestEntry = new ManifestEntryImpl();
		return manifestEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemberRef createMemberRef() {
		MemberRefImpl memberRef = new MemberRefImpl();
		return memberRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodDeclaration createMethodDeclaration() {
		MethodDeclarationImpl methodDeclaration = new MethodDeclarationImpl();
		return methodDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodInvocation createMethodInvocation() {
		MethodInvocationImpl methodInvocation = new MethodInvocationImpl();
		return methodInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodRef createMethodRef() {
		MethodRefImpl methodRef = new MethodRefImpl();
		return methodRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodRefParameter createMethodRefParameter() {
		MethodRefParameterImpl methodRefParameter = new MethodRefParameterImpl();
		return methodRefParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modifier createModifier() {
		ModifierImpl modifier = new ModifierImpl();
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberLiteral createNumberLiteral() {
		NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
		return numberLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NullLiteral createNullLiteral() {
		NullLiteralImpl nullLiteral = new NullLiteralImpl();
		return nullLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public java_graph.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageAccess createPackageAccess() {
		PackageAccessImpl packageAccess = new PackageAccessImpl();
		return packageAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterizedType createParameterizedType() {
		ParameterizedTypeImpl parameterizedType = new ParameterizedTypeImpl();
		return parameterizedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParenthesizedExpression createParenthesizedExpression() {
		ParenthesizedExpressionImpl parenthesizedExpression = new ParenthesizedExpressionImpl();
		return parenthesizedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostfixExpression createPostfixExpression() {
		PostfixExpressionImpl postfixExpression = new PostfixExpressionImpl();
		return postfixExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrefixExpression createPrefixExpression() {
		PrefixExpressionImpl prefixExpression = new PrefixExpressionImpl();
		return prefixExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeBoolean createPrimitiveTypeBoolean() {
		PrimitiveTypeBooleanImpl primitiveTypeBoolean = new PrimitiveTypeBooleanImpl();
		return primitiveTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeByte createPrimitiveTypeByte() {
		PrimitiveTypeByteImpl primitiveTypeByte = new PrimitiveTypeByteImpl();
		return primitiveTypeByte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeChar createPrimitiveTypeChar() {
		PrimitiveTypeCharImpl primitiveTypeChar = new PrimitiveTypeCharImpl();
		return primitiveTypeChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeDouble createPrimitiveTypeDouble() {
		PrimitiveTypeDoubleImpl primitiveTypeDouble = new PrimitiveTypeDoubleImpl();
		return primitiveTypeDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeShort createPrimitiveTypeShort() {
		PrimitiveTypeShortImpl primitiveTypeShort = new PrimitiveTypeShortImpl();
		return primitiveTypeShort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeFloat createPrimitiveTypeFloat() {
		PrimitiveTypeFloatImpl primitiveTypeFloat = new PrimitiveTypeFloatImpl();
		return primitiveTypeFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeInt createPrimitiveTypeInt() {
		PrimitiveTypeIntImpl primitiveTypeInt = new PrimitiveTypeIntImpl();
		return primitiveTypeInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeLong createPrimitiveTypeLong() {
		PrimitiveTypeLongImpl primitiveTypeLong = new PrimitiveTypeLongImpl();
		return primitiveTypeLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeVoid createPrimitiveTypeVoid() {
		PrimitiveTypeVoidImpl primitiveTypeVoid = new PrimitiveTypeVoidImpl();
		return primitiveTypeVoid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnStatement createReturnStatement() {
		ReturnStatementImpl returnStatement = new ReturnStatementImpl();
		return returnStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleVariableAccess createSingleVariableAccess() {
		SingleVariableAccessImpl singleVariableAccess = new SingleVariableAccessImpl();
		return singleVariableAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleVariableDeclaration createSingleVariableDeclaration() {
		SingleVariableDeclarationImpl singleVariableDeclaration = new SingleVariableDeclarationImpl();
		return singleVariableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringLiteral createStringLiteral() {
		StringLiteralImpl stringLiteral = new StringLiteralImpl();
		return stringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperConstructorInvocation createSuperConstructorInvocation() {
		SuperConstructorInvocationImpl superConstructorInvocation = new SuperConstructorInvocationImpl();
		return superConstructorInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperFieldAccess createSuperFieldAccess() {
		SuperFieldAccessImpl superFieldAccess = new SuperFieldAccessImpl();
		return superFieldAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperMethodInvocation createSuperMethodInvocation() {
		SuperMethodInvocationImpl superMethodInvocation = new SuperMethodInvocationImpl();
		return superMethodInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SwitchCase createSwitchCase() {
		SwitchCaseImpl switchCase = new SwitchCaseImpl();
		return switchCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SwitchStatement createSwitchStatement() {
		SwitchStatementImpl switchStatement = new SwitchStatementImpl();
		return switchStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SynchronizedStatement createSynchronizedStatement() {
		SynchronizedStatementImpl synchronizedStatement = new SynchronizedStatementImpl();
		return synchronizedStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TagElement createTagElement() {
		TagElementImpl tagElement = new TagElementImpl();
		return tagElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextElement createTextElement() {
		TextElementImpl textElement = new TextElementImpl();
		return textElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThisExpression createThisExpression() {
		ThisExpressionImpl thisExpression = new ThisExpressionImpl();
		return thisExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThrowStatement createThrowStatement() {
		ThrowStatementImpl throwStatement = new ThrowStatementImpl();
		return throwStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TryStatement createTryStatement() {
		TryStatementImpl tryStatement = new TryStatementImpl();
		return tryStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeAccess createTypeAccess() {
		TypeAccessImpl typeAccess = new TypeAccessImpl();
		return typeAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeDeclarationStatement createTypeDeclarationStatement() {
		TypeDeclarationStatementImpl typeDeclarationStatement = new TypeDeclarationStatementImpl();
		return typeDeclarationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeLiteral createTypeLiteral() {
		TypeLiteralImpl typeLiteral = new TypeLiteralImpl();
		return typeLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeParameter createTypeParameter() {
		TypeParameterImpl typeParameter = new TypeParameterImpl();
		return typeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedItem createUnresolvedItem() {
		UnresolvedItemImpl unresolvedItem = new UnresolvedItemImpl();
		return unresolvedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedItemAccess createUnresolvedItemAccess() {
		UnresolvedItemAccessImpl unresolvedItemAccess = new UnresolvedItemAccessImpl();
		return unresolvedItemAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedAnnotationDeclaration createUnresolvedAnnotationDeclaration() {
		UnresolvedAnnotationDeclarationImpl unresolvedAnnotationDeclaration = new UnresolvedAnnotationDeclarationImpl();
		return unresolvedAnnotationDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedAnnotationTypeMemberDeclaration createUnresolvedAnnotationTypeMemberDeclaration() {
		UnresolvedAnnotationTypeMemberDeclarationImpl unresolvedAnnotationTypeMemberDeclaration = new UnresolvedAnnotationTypeMemberDeclarationImpl();
		return unresolvedAnnotationTypeMemberDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedClassDeclaration createUnresolvedClassDeclaration() {
		UnresolvedClassDeclarationImpl unresolvedClassDeclaration = new UnresolvedClassDeclarationImpl();
		return unresolvedClassDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedEnumDeclaration createUnresolvedEnumDeclaration() {
		UnresolvedEnumDeclarationImpl unresolvedEnumDeclaration = new UnresolvedEnumDeclarationImpl();
		return unresolvedEnumDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedInterfaceDeclaration createUnresolvedInterfaceDeclaration() {
		UnresolvedInterfaceDeclarationImpl unresolvedInterfaceDeclaration = new UnresolvedInterfaceDeclarationImpl();
		return unresolvedInterfaceDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedLabeledStatement createUnresolvedLabeledStatement() {
		UnresolvedLabeledStatementImpl unresolvedLabeledStatement = new UnresolvedLabeledStatementImpl();
		return unresolvedLabeledStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedMethodDeclaration createUnresolvedMethodDeclaration() {
		UnresolvedMethodDeclarationImpl unresolvedMethodDeclaration = new UnresolvedMethodDeclarationImpl();
		return unresolvedMethodDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedSingleVariableDeclaration createUnresolvedSingleVariableDeclaration() {
		UnresolvedSingleVariableDeclarationImpl unresolvedSingleVariableDeclaration = new UnresolvedSingleVariableDeclarationImpl();
		return unresolvedSingleVariableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedType createUnresolvedType() {
		UnresolvedTypeImpl unresolvedType = new UnresolvedTypeImpl();
		return unresolvedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedTypeDeclaration createUnresolvedTypeDeclaration() {
		UnresolvedTypeDeclarationImpl unresolvedTypeDeclaration = new UnresolvedTypeDeclarationImpl();
		return unresolvedTypeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedVariableDeclarationFragment createUnresolvedVariableDeclarationFragment() {
		UnresolvedVariableDeclarationFragmentImpl unresolvedVariableDeclarationFragment = new UnresolvedVariableDeclarationFragmentImpl();
		return unresolvedVariableDeclarationFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclarationExpression createVariableDeclarationExpression() {
		VariableDeclarationExpressionImpl variableDeclarationExpression = new VariableDeclarationExpressionImpl();
		return variableDeclarationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclarationFragment createVariableDeclarationFragment() {
		VariableDeclarationFragmentImpl variableDeclarationFragment = new VariableDeclarationFragmentImpl();
		return variableDeclarationFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclarationStatement createVariableDeclarationStatement() {
		VariableDeclarationStatementImpl variableDeclarationStatement = new VariableDeclarationStatementImpl();
		return variableDeclarationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WildCardType createWildCardType() {
		WildCardTypeImpl wildCardType = new WildCardTypeImpl();
		return wildCardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhileStatement createWhileStatement() {
		WhileStatementImpl whileStatement = new WhileStatementImpl();
		return whileStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentKind createAssignmentKindFromString(EDataType eDataType, String initialValue) {
		AssignmentKind result = AssignmentKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssignmentKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfixExpressionKind createInfixExpressionKindFromString(EDataType eDataType, String initialValue) {
		InfixExpressionKind result = InfixExpressionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInfixExpressionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritanceKind createInheritanceKindFromString(EDataType eDataType, String initialValue) {
		InheritanceKind result = InheritanceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInheritanceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostfixExpressionKind createPostfixExpressionKindFromString(EDataType eDataType, String initialValue) {
		PostfixExpressionKind result = PostfixExpressionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPostfixExpressionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrefixExpressionKind createPrefixExpressionKindFromString(EDataType eDataType, String initialValue) {
		PrefixExpressionKind result = PrefixExpressionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrefixExpressionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind createVisibilityKindFromString(EDataType eDataType, String initialValue) {
		VisibilityKind result = VisibilityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Java_graphPackage getJava_graphPackage() {
		return (Java_graphPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Java_graphPackage getPackage() {
		return Java_graphPackage.eINSTANCE;
	}

} //Java_graphFactoryImpl

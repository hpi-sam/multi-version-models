/**
 */
package java_graph.util;

import java_graph.ASTNode;
import java_graph.AbstractMethodDeclaration;
import java_graph.AbstractMethodInvocation;
import java_graph.AbstractTypeDeclaration;
import java_graph.AbstractTypeQualifiedExpression;
import java_graph.AbstractVariablesContainer;
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
import java_graph.Block;
import java_graph.BlockComment;
import java_graph.BodyDeclaration;
import java_graph.BooleanLiteral;
import java_graph.BreakStatement;
import java_graph.CastExpression;
import java_graph.CatchClause;
import java_graph.CharacterLiteral;
import java_graph.ClassDeclaration;
import java_graph.ClassFile;
import java_graph.ClassInstanceCreation;
import java_graph.Comment;
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
import java_graph.Expression;
import java_graph.ExpressionStatement;
import java_graph.FieldAccess;
import java_graph.FieldDeclaration;
import java_graph.ForStatement;
import java_graph.IfStatement;
import java_graph.ImportDeclaration;
import java_graph.InfixExpression;
import java_graph.Initializer;
import java_graph.InstanceofExpression;
import java_graph.InterfaceDeclaration;
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
import java_graph.NamedElement;
import java_graph.NamespaceAccess;
import java_graph.NullLiteral;
import java_graph.NumberLiteral;
import java_graph.PackageAccess;
import java_graph.ParameterizedType;
import java_graph.ParenthesizedExpression;
import java_graph.PostfixExpression;
import java_graph.PrefixExpression;
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
import java_graph.Statement;
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
import java_graph.Type;
import java_graph.TypeAccess;
import java_graph.TypeDeclaration;
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
import java_graph.VariableDeclaration;
import java_graph.VariableDeclarationExpression;
import java_graph.VariableDeclarationFragment;
import java_graph.VariableDeclarationStatement;
import java_graph.WhileStatement;
import java_graph.WildCardType;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see java_graph.Java_graphPackage
 * @generated
 */
public class Java_graphSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Java_graphPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java_graphSwitch() {
		if (modelPackage == null) {
			modelPackage = Java_graphPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Java_graphPackage.ABSTRACT_METHOD_DECLARATION: {
				AbstractMethodDeclaration abstractMethodDeclaration = (AbstractMethodDeclaration)theEObject;
				T result = caseAbstractMethodDeclaration(abstractMethodDeclaration);
				if (result == null) result = caseBodyDeclaration(abstractMethodDeclaration);
				if (result == null) result = caseNamedElement(abstractMethodDeclaration);
				if (result == null) result = caseASTNode(abstractMethodDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.ABSTRACT_METHOD_INVOCATION: {
				AbstractMethodInvocation abstractMethodInvocation = (AbstractMethodInvocation)theEObject;
				T result = caseAbstractMethodInvocation(abstractMethodInvocation);
				if (result == null) result = caseASTNode(abstractMethodInvocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.ABSTRACT_TYPE_DECLARATION: {
				AbstractTypeDeclaration abstractTypeDeclaration = (AbstractTypeDeclaration)theEObject;
				T result = caseAbstractTypeDeclaration(abstractTypeDeclaration);
				if (result == null) result = caseBodyDeclaration(abstractTypeDeclaration);
				if (result == null) result = caseType(abstractTypeDeclaration);
				if (result == null) result = caseNamedElement(abstractTypeDeclaration);
				if (result == null) result = caseASTNode(abstractTypeDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.ABSTRACT_TYPE_QUALIFIED_EXPRESSION: {
				AbstractTypeQualifiedExpression abstractTypeQualifiedExpression = (AbstractTypeQualifiedExpression)theEObject;
				T result = caseAbstractTypeQualifiedExpression(abstractTypeQualifiedExpression);
				if (result == null) result = caseExpression(abstractTypeQualifiedExpression);
				if (result == null) result = caseASTNode(abstractTypeQualifiedExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.ABSTRACT_VARIABLES_CONTAINER: {
				AbstractVariablesContainer abstractVariablesContainer = (AbstractVariablesContainer)theEObject;
				T result = caseAbstractVariablesContainer(abstractVariablesContainer);
				if (result == null) result = caseASTNode(abstractVariablesContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = caseExpression(annotation);
				if (result == null) result = caseASTNode(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.ARCHIVE: {
				Archive archive = (Archive)theEObject;
				T result = caseArchive(archive);
				if (result == null) result = caseNamedElement(archive);
				if (result == null) result = caseASTNode(archive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.ASSERT_STATEMENT: {
				AssertStatement assertStatement = (AssertStatement)theEObject;
				T result = caseAssertStatement(assertStatement);
				if (result == null) result = caseStatement(assertStatement);
				if (result == null) result = caseASTNode(assertStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.AST_NODE: {
				ASTNode astNode = (ASTNode)theEObject;
				T result = caseASTNode(astNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.ANNOTATION_MEMBER_VALUE_PAIR: {
				AnnotationMemberValuePair annotationMemberValuePair = (AnnotationMemberValuePair)theEObject;
				T result = caseAnnotationMemberValuePair(annotationMemberValuePair);
				if (result == null) result = caseNamedElement(annotationMemberValuePair);
				if (result == null) result = caseASTNode(annotationMemberValuePair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.ANNOTATION_TYPE_DECLARATION: {
				AnnotationTypeDeclaration annotationTypeDeclaration = (AnnotationTypeDeclaration)theEObject;
				T result = caseAnnotationTypeDeclaration(annotationTypeDeclaration);
				if (result == null) result = caseAbstractTypeDeclaration(annotationTypeDeclaration);
				if (result == null) result = caseBodyDeclaration(annotationTypeDeclaration);
				if (result == null) result = caseType(annotationTypeDeclaration);
				if (result == null) result = caseNamedElement(annotationTypeDeclaration);
				if (result == null) result = caseASTNode(annotationTypeDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.ANNOTATION_TYPE_MEMBER_DECLARATION: {
				AnnotationTypeMemberDeclaration annotationTypeMemberDeclaration = (AnnotationTypeMemberDeclaration)theEObject;
				T result = caseAnnotationTypeMemberDeclaration(annotationTypeMemberDeclaration);
				if (result == null) result = caseBodyDeclaration(annotationTypeMemberDeclaration);
				if (result == null) result = caseNamedElement(annotationTypeMemberDeclaration);
				if (result == null) result = caseASTNode(annotationTypeMemberDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.ANONYMOUS_CLASS_DECLARATION: {
				AnonymousClassDeclaration anonymousClassDeclaration = (AnonymousClassDeclaration)theEObject;
				T result = caseAnonymousClassDeclaration(anonymousClassDeclaration);
				if (result == null) result = caseASTNode(anonymousClassDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.ARRAY_ACCESS: {
				ArrayAccess arrayAccess = (ArrayAccess)theEObject;
				T result = caseArrayAccess(arrayAccess);
				if (result == null) result = caseExpression(arrayAccess);
				if (result == null) result = caseASTNode(arrayAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.ARRAY_CREATION: {
				ArrayCreation arrayCreation = (ArrayCreation)theEObject;
				T result = caseArrayCreation(arrayCreation);
				if (result == null) result = caseExpression(arrayCreation);
				if (result == null) result = caseASTNode(arrayCreation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.ARRAY_INITIALIZER: {
				ArrayInitializer arrayInitializer = (ArrayInitializer)theEObject;
				T result = caseArrayInitializer(arrayInitializer);
				if (result == null) result = caseExpression(arrayInitializer);
				if (result == null) result = caseASTNode(arrayInitializer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.ARRAY_LENGTH_ACCESS: {
				ArrayLengthAccess arrayLengthAccess = (ArrayLengthAccess)theEObject;
				T result = caseArrayLengthAccess(arrayLengthAccess);
				if (result == null) result = caseExpression(arrayLengthAccess);
				if (result == null) result = caseASTNode(arrayLengthAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.ARRAY_TYPE: {
				ArrayType arrayType = (ArrayType)theEObject;
				T result = caseArrayType(arrayType);
				if (result == null) result = caseType(arrayType);
				if (result == null) result = caseNamedElement(arrayType);
				if (result == null) result = caseASTNode(arrayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.ASSIGNMENT: {
				Assignment assignment = (Assignment)theEObject;
				T result = caseAssignment(assignment);
				if (result == null) result = caseExpression(assignment);
				if (result == null) result = caseASTNode(assignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.BODY_DECLARATION: {
				BodyDeclaration bodyDeclaration = (BodyDeclaration)theEObject;
				T result = caseBodyDeclaration(bodyDeclaration);
				if (result == null) result = caseNamedElement(bodyDeclaration);
				if (result == null) result = caseASTNode(bodyDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.BOOLEAN_LITERAL: {
				BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
				T result = caseBooleanLiteral(booleanLiteral);
				if (result == null) result = caseExpression(booleanLiteral);
				if (result == null) result = caseASTNode(booleanLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.BLOCK_COMMENT: {
				BlockComment blockComment = (BlockComment)theEObject;
				T result = caseBlockComment(blockComment);
				if (result == null) result = caseComment(blockComment);
				if (result == null) result = caseASTNode(blockComment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = caseStatement(block);
				if (result == null) result = caseASTNode(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.BREAK_STATEMENT: {
				BreakStatement breakStatement = (BreakStatement)theEObject;
				T result = caseBreakStatement(breakStatement);
				if (result == null) result = caseStatement(breakStatement);
				if (result == null) result = caseASTNode(breakStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.CAST_EXPRESSION: {
				CastExpression castExpression = (CastExpression)theEObject;
				T result = caseCastExpression(castExpression);
				if (result == null) result = caseExpression(castExpression);
				if (result == null) result = caseASTNode(castExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.CATCH_CLAUSE: {
				CatchClause catchClause = (CatchClause)theEObject;
				T result = caseCatchClause(catchClause);
				if (result == null) result = caseStatement(catchClause);
				if (result == null) result = caseASTNode(catchClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.CHARACTER_LITERAL: {
				CharacterLiteral characterLiteral = (CharacterLiteral)theEObject;
				T result = caseCharacterLiteral(characterLiteral);
				if (result == null) result = caseExpression(characterLiteral);
				if (result == null) result = caseASTNode(characterLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.CLASS_FILE: {
				ClassFile classFile = (ClassFile)theEObject;
				T result = caseClassFile(classFile);
				if (result == null) result = caseNamedElement(classFile);
				if (result == null) result = caseASTNode(classFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.CLASS_INSTANCE_CREATION: {
				ClassInstanceCreation classInstanceCreation = (ClassInstanceCreation)theEObject;
				T result = caseClassInstanceCreation(classInstanceCreation);
				if (result == null) result = caseExpression(classInstanceCreation);
				if (result == null) result = caseAbstractMethodInvocation(classInstanceCreation);
				if (result == null) result = caseASTNode(classInstanceCreation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.CONSTRUCTOR_DECLARATION: {
				ConstructorDeclaration constructorDeclaration = (ConstructorDeclaration)theEObject;
				T result = caseConstructorDeclaration(constructorDeclaration);
				if (result == null) result = caseAbstractMethodDeclaration(constructorDeclaration);
				if (result == null) result = caseBodyDeclaration(constructorDeclaration);
				if (result == null) result = caseNamedElement(constructorDeclaration);
				if (result == null) result = caseASTNode(constructorDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.CONDITIONAL_EXPRESSION: {
				ConditionalExpression conditionalExpression = (ConditionalExpression)theEObject;
				T result = caseConditionalExpression(conditionalExpression);
				if (result == null) result = caseExpression(conditionalExpression);
				if (result == null) result = caseASTNode(conditionalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.CONSTRUCTOR_INVOCATION: {
				ConstructorInvocation constructorInvocation = (ConstructorInvocation)theEObject;
				T result = caseConstructorInvocation(constructorInvocation);
				if (result == null) result = caseStatement(constructorInvocation);
				if (result == null) result = caseAbstractMethodInvocation(constructorInvocation);
				if (result == null) result = caseASTNode(constructorInvocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.CLASS_DECLARATION: {
				ClassDeclaration classDeclaration = (ClassDeclaration)theEObject;
				T result = caseClassDeclaration(classDeclaration);
				if (result == null) result = caseTypeDeclaration(classDeclaration);
				if (result == null) result = caseAbstractTypeDeclaration(classDeclaration);
				if (result == null) result = caseBodyDeclaration(classDeclaration);
				if (result == null) result = caseType(classDeclaration);
				if (result == null) result = caseNamedElement(classDeclaration);
				if (result == null) result = caseASTNode(classDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.COMMENT: {
				Comment comment = (Comment)theEObject;
				T result = caseComment(comment);
				if (result == null) result = caseASTNode(comment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.COMPILATION_UNIT: {
				CompilationUnit compilationUnit = (CompilationUnit)theEObject;
				T result = caseCompilationUnit(compilationUnit);
				if (result == null) result = caseNamedElement(compilationUnit);
				if (result == null) result = caseASTNode(compilationUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.CONTINUE_STATEMENT: {
				ContinueStatement continueStatement = (ContinueStatement)theEObject;
				T result = caseContinueStatement(continueStatement);
				if (result == null) result = caseStatement(continueStatement);
				if (result == null) result = caseASTNode(continueStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.DO_STATEMENT: {
				DoStatement doStatement = (DoStatement)theEObject;
				T result = caseDoStatement(doStatement);
				if (result == null) result = caseStatement(doStatement);
				if (result == null) result = caseASTNode(doStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.EMPTY_STATEMENT: {
				EmptyStatement emptyStatement = (EmptyStatement)theEObject;
				T result = caseEmptyStatement(emptyStatement);
				if (result == null) result = caseStatement(emptyStatement);
				if (result == null) result = caseASTNode(emptyStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.ENHANCED_FOR_STATEMENT: {
				EnhancedForStatement enhancedForStatement = (EnhancedForStatement)theEObject;
				T result = caseEnhancedForStatement(enhancedForStatement);
				if (result == null) result = caseStatement(enhancedForStatement);
				if (result == null) result = caseASTNode(enhancedForStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.ENUM_CONSTANT_DECLARATION: {
				EnumConstantDeclaration enumConstantDeclaration = (EnumConstantDeclaration)theEObject;
				T result = caseEnumConstantDeclaration(enumConstantDeclaration);
				if (result == null) result = caseBodyDeclaration(enumConstantDeclaration);
				if (result == null) result = caseVariableDeclaration(enumConstantDeclaration);
				if (result == null) result = caseNamedElement(enumConstantDeclaration);
				if (result == null) result = caseASTNode(enumConstantDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.ENUM_DECLARATION: {
				EnumDeclaration enumDeclaration = (EnumDeclaration)theEObject;
				T result = caseEnumDeclaration(enumDeclaration);
				if (result == null) result = caseAbstractTypeDeclaration(enumDeclaration);
				if (result == null) result = caseBodyDeclaration(enumDeclaration);
				if (result == null) result = caseType(enumDeclaration);
				if (result == null) result = caseNamedElement(enumDeclaration);
				if (result == null) result = caseASTNode(enumDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseASTNode(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.EXPRESSION_STATEMENT: {
				ExpressionStatement expressionStatement = (ExpressionStatement)theEObject;
				T result = caseExpressionStatement(expressionStatement);
				if (result == null) result = caseStatement(expressionStatement);
				if (result == null) result = caseASTNode(expressionStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.FIELD_ACCESS: {
				FieldAccess fieldAccess = (FieldAccess)theEObject;
				T result = caseFieldAccess(fieldAccess);
				if (result == null) result = caseExpression(fieldAccess);
				if (result == null) result = caseASTNode(fieldAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.FIELD_DECLARATION: {
				FieldDeclaration fieldDeclaration = (FieldDeclaration)theEObject;
				T result = caseFieldDeclaration(fieldDeclaration);
				if (result == null) result = caseBodyDeclaration(fieldDeclaration);
				if (result == null) result = caseAbstractVariablesContainer(fieldDeclaration);
				if (result == null) result = caseNamedElement(fieldDeclaration);
				if (result == null) result = caseASTNode(fieldDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.FOR_STATEMENT: {
				ForStatement forStatement = (ForStatement)theEObject;
				T result = caseForStatement(forStatement);
				if (result == null) result = caseStatement(forStatement);
				if (result == null) result = caseASTNode(forStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.IF_STATEMENT: {
				IfStatement ifStatement = (IfStatement)theEObject;
				T result = caseIfStatement(ifStatement);
				if (result == null) result = caseStatement(ifStatement);
				if (result == null) result = caseASTNode(ifStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.IMPORT_DECLARATION: {
				ImportDeclaration importDeclaration = (ImportDeclaration)theEObject;
				T result = caseImportDeclaration(importDeclaration);
				if (result == null) result = caseASTNode(importDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.INFIX_EXPRESSION: {
				InfixExpression infixExpression = (InfixExpression)theEObject;
				T result = caseInfixExpression(infixExpression);
				if (result == null) result = caseExpression(infixExpression);
				if (result == null) result = caseASTNode(infixExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.INITIALIZER: {
				Initializer initializer = (Initializer)theEObject;
				T result = caseInitializer(initializer);
				if (result == null) result = caseBodyDeclaration(initializer);
				if (result == null) result = caseNamedElement(initializer);
				if (result == null) result = caseASTNode(initializer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.INSTANCEOF_EXPRESSION: {
				InstanceofExpression instanceofExpression = (InstanceofExpression)theEObject;
				T result = caseInstanceofExpression(instanceofExpression);
				if (result == null) result = caseExpression(instanceofExpression);
				if (result == null) result = caseASTNode(instanceofExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.INTERFACE_DECLARATION: {
				InterfaceDeclaration interfaceDeclaration = (InterfaceDeclaration)theEObject;
				T result = caseInterfaceDeclaration(interfaceDeclaration);
				if (result == null) result = caseTypeDeclaration(interfaceDeclaration);
				if (result == null) result = caseAbstractTypeDeclaration(interfaceDeclaration);
				if (result == null) result = caseBodyDeclaration(interfaceDeclaration);
				if (result == null) result = caseType(interfaceDeclaration);
				if (result == null) result = caseNamedElement(interfaceDeclaration);
				if (result == null) result = caseASTNode(interfaceDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.JAVADOC: {
				Javadoc javadoc = (Javadoc)theEObject;
				T result = caseJavadoc(javadoc);
				if (result == null) result = caseComment(javadoc);
				if (result == null) result = caseASTNode(javadoc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.LABELED_STATEMENT: {
				LabeledStatement labeledStatement = (LabeledStatement)theEObject;
				T result = caseLabeledStatement(labeledStatement);
				if (result == null) result = caseNamedElement(labeledStatement);
				if (result == null) result = caseStatement(labeledStatement);
				if (result == null) result = caseASTNode(labeledStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.LINE_COMMENT: {
				LineComment lineComment = (LineComment)theEObject;
				T result = caseLineComment(lineComment);
				if (result == null) result = caseComment(lineComment);
				if (result == null) result = caseASTNode(lineComment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.MANIFEST: {
				Manifest manifest = (Manifest)theEObject;
				T result = caseManifest(manifest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.MANIFEST_ATTRIBUTE: {
				ManifestAttribute manifestAttribute = (ManifestAttribute)theEObject;
				T result = caseManifestAttribute(manifestAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.MANIFEST_ENTRY: {
				ManifestEntry manifestEntry = (ManifestEntry)theEObject;
				T result = caseManifestEntry(manifestEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.MEMBER_REF: {
				MemberRef memberRef = (MemberRef)theEObject;
				T result = caseMemberRef(memberRef);
				if (result == null) result = caseASTNode(memberRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.METHOD_DECLARATION: {
				MethodDeclaration methodDeclaration = (MethodDeclaration)theEObject;
				T result = caseMethodDeclaration(methodDeclaration);
				if (result == null) result = caseAbstractMethodDeclaration(methodDeclaration);
				if (result == null) result = caseBodyDeclaration(methodDeclaration);
				if (result == null) result = caseNamedElement(methodDeclaration);
				if (result == null) result = caseASTNode(methodDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.METHOD_INVOCATION: {
				MethodInvocation methodInvocation = (MethodInvocation)theEObject;
				T result = caseMethodInvocation(methodInvocation);
				if (result == null) result = caseExpression(methodInvocation);
				if (result == null) result = caseAbstractMethodInvocation(methodInvocation);
				if (result == null) result = caseASTNode(methodInvocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.METHOD_REF: {
				MethodRef methodRef = (MethodRef)theEObject;
				T result = caseMethodRef(methodRef);
				if (result == null) result = caseASTNode(methodRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.METHOD_REF_PARAMETER: {
				MethodRefParameter methodRefParameter = (MethodRefParameter)theEObject;
				T result = caseMethodRefParameter(methodRefParameter);
				if (result == null) result = caseASTNode(methodRefParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.MODIFIER: {
				Modifier modifier = (Modifier)theEObject;
				T result = caseModifier(modifier);
				if (result == null) result = caseASTNode(modifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = caseASTNode(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.NAMESPACE_ACCESS: {
				NamespaceAccess namespaceAccess = (NamespaceAccess)theEObject;
				T result = caseNamespaceAccess(namespaceAccess);
				if (result == null) result = caseASTNode(namespaceAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.NUMBER_LITERAL: {
				NumberLiteral numberLiteral = (NumberLiteral)theEObject;
				T result = caseNumberLiteral(numberLiteral);
				if (result == null) result = caseExpression(numberLiteral);
				if (result == null) result = caseASTNode(numberLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.NULL_LITERAL: {
				NullLiteral nullLiteral = (NullLiteral)theEObject;
				T result = caseNullLiteral(nullLiteral);
				if (result == null) result = caseExpression(nullLiteral);
				if (result == null) result = caseASTNode(nullLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.PACKAGE: {
				java_graph.Package package_ = (java_graph.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = caseNamedElement(package_);
				if (result == null) result = caseASTNode(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.PACKAGE_ACCESS: {
				PackageAccess packageAccess = (PackageAccess)theEObject;
				T result = casePackageAccess(packageAccess);
				if (result == null) result = caseNamespaceAccess(packageAccess);
				if (result == null) result = caseASTNode(packageAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.PARAMETERIZED_TYPE: {
				ParameterizedType parameterizedType = (ParameterizedType)theEObject;
				T result = caseParameterizedType(parameterizedType);
				if (result == null) result = caseType(parameterizedType);
				if (result == null) result = caseNamedElement(parameterizedType);
				if (result == null) result = caseASTNode(parameterizedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.PARENTHESIZED_EXPRESSION: {
				ParenthesizedExpression parenthesizedExpression = (ParenthesizedExpression)theEObject;
				T result = caseParenthesizedExpression(parenthesizedExpression);
				if (result == null) result = caseExpression(parenthesizedExpression);
				if (result == null) result = caseASTNode(parenthesizedExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.POSTFIX_EXPRESSION: {
				PostfixExpression postfixExpression = (PostfixExpression)theEObject;
				T result = casePostfixExpression(postfixExpression);
				if (result == null) result = caseExpression(postfixExpression);
				if (result == null) result = caseASTNode(postfixExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.PREFIX_EXPRESSION: {
				PrefixExpression prefixExpression = (PrefixExpression)theEObject;
				T result = casePrefixExpression(prefixExpression);
				if (result == null) result = caseExpression(prefixExpression);
				if (result == null) result = caseASTNode(prefixExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.PRIMITIVE_TYPE: {
				PrimitiveType primitiveType = (PrimitiveType)theEObject;
				T result = casePrimitiveType(primitiveType);
				if (result == null) result = caseType(primitiveType);
				if (result == null) result = caseNamedElement(primitiveType);
				if (result == null) result = caseASTNode(primitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.PRIMITIVE_TYPE_BOOLEAN: {
				PrimitiveTypeBoolean primitiveTypeBoolean = (PrimitiveTypeBoolean)theEObject;
				T result = casePrimitiveTypeBoolean(primitiveTypeBoolean);
				if (result == null) result = casePrimitiveType(primitiveTypeBoolean);
				if (result == null) result = caseType(primitiveTypeBoolean);
				if (result == null) result = caseNamedElement(primitiveTypeBoolean);
				if (result == null) result = caseASTNode(primitiveTypeBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.PRIMITIVE_TYPE_BYTE: {
				PrimitiveTypeByte primitiveTypeByte = (PrimitiveTypeByte)theEObject;
				T result = casePrimitiveTypeByte(primitiveTypeByte);
				if (result == null) result = casePrimitiveType(primitiveTypeByte);
				if (result == null) result = caseType(primitiveTypeByte);
				if (result == null) result = caseNamedElement(primitiveTypeByte);
				if (result == null) result = caseASTNode(primitiveTypeByte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.PRIMITIVE_TYPE_CHAR: {
				PrimitiveTypeChar primitiveTypeChar = (PrimitiveTypeChar)theEObject;
				T result = casePrimitiveTypeChar(primitiveTypeChar);
				if (result == null) result = casePrimitiveType(primitiveTypeChar);
				if (result == null) result = caseType(primitiveTypeChar);
				if (result == null) result = caseNamedElement(primitiveTypeChar);
				if (result == null) result = caseASTNode(primitiveTypeChar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.PRIMITIVE_TYPE_DOUBLE: {
				PrimitiveTypeDouble primitiveTypeDouble = (PrimitiveTypeDouble)theEObject;
				T result = casePrimitiveTypeDouble(primitiveTypeDouble);
				if (result == null) result = casePrimitiveType(primitiveTypeDouble);
				if (result == null) result = caseType(primitiveTypeDouble);
				if (result == null) result = caseNamedElement(primitiveTypeDouble);
				if (result == null) result = caseASTNode(primitiveTypeDouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.PRIMITIVE_TYPE_SHORT: {
				PrimitiveTypeShort primitiveTypeShort = (PrimitiveTypeShort)theEObject;
				T result = casePrimitiveTypeShort(primitiveTypeShort);
				if (result == null) result = casePrimitiveType(primitiveTypeShort);
				if (result == null) result = caseType(primitiveTypeShort);
				if (result == null) result = caseNamedElement(primitiveTypeShort);
				if (result == null) result = caseASTNode(primitiveTypeShort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.PRIMITIVE_TYPE_FLOAT: {
				PrimitiveTypeFloat primitiveTypeFloat = (PrimitiveTypeFloat)theEObject;
				T result = casePrimitiveTypeFloat(primitiveTypeFloat);
				if (result == null) result = casePrimitiveType(primitiveTypeFloat);
				if (result == null) result = caseType(primitiveTypeFloat);
				if (result == null) result = caseNamedElement(primitiveTypeFloat);
				if (result == null) result = caseASTNode(primitiveTypeFloat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.PRIMITIVE_TYPE_INT: {
				PrimitiveTypeInt primitiveTypeInt = (PrimitiveTypeInt)theEObject;
				T result = casePrimitiveTypeInt(primitiveTypeInt);
				if (result == null) result = casePrimitiveType(primitiveTypeInt);
				if (result == null) result = caseType(primitiveTypeInt);
				if (result == null) result = caseNamedElement(primitiveTypeInt);
				if (result == null) result = caseASTNode(primitiveTypeInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.PRIMITIVE_TYPE_LONG: {
				PrimitiveTypeLong primitiveTypeLong = (PrimitiveTypeLong)theEObject;
				T result = casePrimitiveTypeLong(primitiveTypeLong);
				if (result == null) result = casePrimitiveType(primitiveTypeLong);
				if (result == null) result = caseType(primitiveTypeLong);
				if (result == null) result = caseNamedElement(primitiveTypeLong);
				if (result == null) result = caseASTNode(primitiveTypeLong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.PRIMITIVE_TYPE_VOID: {
				PrimitiveTypeVoid primitiveTypeVoid = (PrimitiveTypeVoid)theEObject;
				T result = casePrimitiveTypeVoid(primitiveTypeVoid);
				if (result == null) result = casePrimitiveType(primitiveTypeVoid);
				if (result == null) result = caseType(primitiveTypeVoid);
				if (result == null) result = caseNamedElement(primitiveTypeVoid);
				if (result == null) result = caseASTNode(primitiveTypeVoid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.RETURN_STATEMENT: {
				ReturnStatement returnStatement = (ReturnStatement)theEObject;
				T result = caseReturnStatement(returnStatement);
				if (result == null) result = caseStatement(returnStatement);
				if (result == null) result = caseASTNode(returnStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.SINGLE_VARIABLE_ACCESS: {
				SingleVariableAccess singleVariableAccess = (SingleVariableAccess)theEObject;
				T result = caseSingleVariableAccess(singleVariableAccess);
				if (result == null) result = caseExpression(singleVariableAccess);
				if (result == null) result = caseASTNode(singleVariableAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.SINGLE_VARIABLE_DECLARATION: {
				SingleVariableDeclaration singleVariableDeclaration = (SingleVariableDeclaration)theEObject;
				T result = caseSingleVariableDeclaration(singleVariableDeclaration);
				if (result == null) result = caseVariableDeclaration(singleVariableDeclaration);
				if (result == null) result = caseNamedElement(singleVariableDeclaration);
				if (result == null) result = caseASTNode(singleVariableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T result = caseStatement(statement);
				if (result == null) result = caseASTNode(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.STRING_LITERAL: {
				StringLiteral stringLiteral = (StringLiteral)theEObject;
				T result = caseStringLiteral(stringLiteral);
				if (result == null) result = caseExpression(stringLiteral);
				if (result == null) result = caseASTNode(stringLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.SUPER_CONSTRUCTOR_INVOCATION: {
				SuperConstructorInvocation superConstructorInvocation = (SuperConstructorInvocation)theEObject;
				T result = caseSuperConstructorInvocation(superConstructorInvocation);
				if (result == null) result = caseStatement(superConstructorInvocation);
				if (result == null) result = caseAbstractMethodInvocation(superConstructorInvocation);
				if (result == null) result = caseASTNode(superConstructorInvocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.SUPER_FIELD_ACCESS: {
				SuperFieldAccess superFieldAccess = (SuperFieldAccess)theEObject;
				T result = caseSuperFieldAccess(superFieldAccess);
				if (result == null) result = caseAbstractTypeQualifiedExpression(superFieldAccess);
				if (result == null) result = caseExpression(superFieldAccess);
				if (result == null) result = caseASTNode(superFieldAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.SUPER_METHOD_INVOCATION: {
				SuperMethodInvocation superMethodInvocation = (SuperMethodInvocation)theEObject;
				T result = caseSuperMethodInvocation(superMethodInvocation);
				if (result == null) result = caseAbstractTypeQualifiedExpression(superMethodInvocation);
				if (result == null) result = caseAbstractMethodInvocation(superMethodInvocation);
				if (result == null) result = caseExpression(superMethodInvocation);
				if (result == null) result = caseASTNode(superMethodInvocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.SWITCH_CASE: {
				SwitchCase switchCase = (SwitchCase)theEObject;
				T result = caseSwitchCase(switchCase);
				if (result == null) result = caseStatement(switchCase);
				if (result == null) result = caseASTNode(switchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.SWITCH_STATEMENT: {
				SwitchStatement switchStatement = (SwitchStatement)theEObject;
				T result = caseSwitchStatement(switchStatement);
				if (result == null) result = caseStatement(switchStatement);
				if (result == null) result = caseASTNode(switchStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.SYNCHRONIZED_STATEMENT: {
				SynchronizedStatement synchronizedStatement = (SynchronizedStatement)theEObject;
				T result = caseSynchronizedStatement(synchronizedStatement);
				if (result == null) result = caseStatement(synchronizedStatement);
				if (result == null) result = caseASTNode(synchronizedStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.TAG_ELEMENT: {
				TagElement tagElement = (TagElement)theEObject;
				T result = caseTagElement(tagElement);
				if (result == null) result = caseASTNode(tagElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.TEXT_ELEMENT: {
				TextElement textElement = (TextElement)theEObject;
				T result = caseTextElement(textElement);
				if (result == null) result = caseASTNode(textElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.THIS_EXPRESSION: {
				ThisExpression thisExpression = (ThisExpression)theEObject;
				T result = caseThisExpression(thisExpression);
				if (result == null) result = caseAbstractTypeQualifiedExpression(thisExpression);
				if (result == null) result = caseExpression(thisExpression);
				if (result == null) result = caseASTNode(thisExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.THROW_STATEMENT: {
				ThrowStatement throwStatement = (ThrowStatement)theEObject;
				T result = caseThrowStatement(throwStatement);
				if (result == null) result = caseStatement(throwStatement);
				if (result == null) result = caseASTNode(throwStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.TRY_STATEMENT: {
				TryStatement tryStatement = (TryStatement)theEObject;
				T result = caseTryStatement(tryStatement);
				if (result == null) result = caseStatement(tryStatement);
				if (result == null) result = caseASTNode(tryStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseNamedElement(type);
				if (result == null) result = caseASTNode(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.TYPE_ACCESS: {
				TypeAccess typeAccess = (TypeAccess)theEObject;
				T result = caseTypeAccess(typeAccess);
				if (result == null) result = caseExpression(typeAccess);
				if (result == null) result = caseNamespaceAccess(typeAccess);
				if (result == null) result = caseASTNode(typeAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.TYPE_DECLARATION: {
				TypeDeclaration typeDeclaration = (TypeDeclaration)theEObject;
				T result = caseTypeDeclaration(typeDeclaration);
				if (result == null) result = caseAbstractTypeDeclaration(typeDeclaration);
				if (result == null) result = caseBodyDeclaration(typeDeclaration);
				if (result == null) result = caseType(typeDeclaration);
				if (result == null) result = caseNamedElement(typeDeclaration);
				if (result == null) result = caseASTNode(typeDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.TYPE_DECLARATION_STATEMENT: {
				TypeDeclarationStatement typeDeclarationStatement = (TypeDeclarationStatement)theEObject;
				T result = caseTypeDeclarationStatement(typeDeclarationStatement);
				if (result == null) result = caseStatement(typeDeclarationStatement);
				if (result == null) result = caseASTNode(typeDeclarationStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.TYPE_LITERAL: {
				TypeLiteral typeLiteral = (TypeLiteral)theEObject;
				T result = caseTypeLiteral(typeLiteral);
				if (result == null) result = caseExpression(typeLiteral);
				if (result == null) result = caseASTNode(typeLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.TYPE_PARAMETER: {
				TypeParameter typeParameter = (TypeParameter)theEObject;
				T result = caseTypeParameter(typeParameter);
				if (result == null) result = caseType(typeParameter);
				if (result == null) result = caseNamedElement(typeParameter);
				if (result == null) result = caseASTNode(typeParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.UNRESOLVED_ITEM: {
				UnresolvedItem unresolvedItem = (UnresolvedItem)theEObject;
				T result = caseUnresolvedItem(unresolvedItem);
				if (result == null) result = caseNamedElement(unresolvedItem);
				if (result == null) result = caseASTNode(unresolvedItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.UNRESOLVED_ITEM_ACCESS: {
				UnresolvedItemAccess unresolvedItemAccess = (UnresolvedItemAccess)theEObject;
				T result = caseUnresolvedItemAccess(unresolvedItemAccess);
				if (result == null) result = caseExpression(unresolvedItemAccess);
				if (result == null) result = caseNamespaceAccess(unresolvedItemAccess);
				if (result == null) result = caseASTNode(unresolvedItemAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.UNRESOLVED_ANNOTATION_DECLARATION: {
				UnresolvedAnnotationDeclaration unresolvedAnnotationDeclaration = (UnresolvedAnnotationDeclaration)theEObject;
				T result = caseUnresolvedAnnotationDeclaration(unresolvedAnnotationDeclaration);
				if (result == null) result = caseAnnotationTypeDeclaration(unresolvedAnnotationDeclaration);
				if (result == null) result = caseUnresolvedItem(unresolvedAnnotationDeclaration);
				if (result == null) result = caseAbstractTypeDeclaration(unresolvedAnnotationDeclaration);
				if (result == null) result = caseBodyDeclaration(unresolvedAnnotationDeclaration);
				if (result == null) result = caseType(unresolvedAnnotationDeclaration);
				if (result == null) result = caseNamedElement(unresolvedAnnotationDeclaration);
				if (result == null) result = caseASTNode(unresolvedAnnotationDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION: {
				UnresolvedAnnotationTypeMemberDeclaration unresolvedAnnotationTypeMemberDeclaration = (UnresolvedAnnotationTypeMemberDeclaration)theEObject;
				T result = caseUnresolvedAnnotationTypeMemberDeclaration(unresolvedAnnotationTypeMemberDeclaration);
				if (result == null) result = caseAnnotationTypeMemberDeclaration(unresolvedAnnotationTypeMemberDeclaration);
				if (result == null) result = caseUnresolvedItem(unresolvedAnnotationTypeMemberDeclaration);
				if (result == null) result = caseBodyDeclaration(unresolvedAnnotationTypeMemberDeclaration);
				if (result == null) result = caseNamedElement(unresolvedAnnotationTypeMemberDeclaration);
				if (result == null) result = caseASTNode(unresolvedAnnotationTypeMemberDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.UNRESOLVED_CLASS_DECLARATION: {
				UnresolvedClassDeclaration unresolvedClassDeclaration = (UnresolvedClassDeclaration)theEObject;
				T result = caseUnresolvedClassDeclaration(unresolvedClassDeclaration);
				if (result == null) result = caseClassDeclaration(unresolvedClassDeclaration);
				if (result == null) result = caseUnresolvedItem(unresolvedClassDeclaration);
				if (result == null) result = caseTypeDeclaration(unresolvedClassDeclaration);
				if (result == null) result = caseAbstractTypeDeclaration(unresolvedClassDeclaration);
				if (result == null) result = caseBodyDeclaration(unresolvedClassDeclaration);
				if (result == null) result = caseType(unresolvedClassDeclaration);
				if (result == null) result = caseNamedElement(unresolvedClassDeclaration);
				if (result == null) result = caseASTNode(unresolvedClassDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.UNRESOLVED_ENUM_DECLARATION: {
				UnresolvedEnumDeclaration unresolvedEnumDeclaration = (UnresolvedEnumDeclaration)theEObject;
				T result = caseUnresolvedEnumDeclaration(unresolvedEnumDeclaration);
				if (result == null) result = caseEnumDeclaration(unresolvedEnumDeclaration);
				if (result == null) result = caseUnresolvedItem(unresolvedEnumDeclaration);
				if (result == null) result = caseAbstractTypeDeclaration(unresolvedEnumDeclaration);
				if (result == null) result = caseBodyDeclaration(unresolvedEnumDeclaration);
				if (result == null) result = caseType(unresolvedEnumDeclaration);
				if (result == null) result = caseNamedElement(unresolvedEnumDeclaration);
				if (result == null) result = caseASTNode(unresolvedEnumDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.UNRESOLVED_INTERFACE_DECLARATION: {
				UnresolvedInterfaceDeclaration unresolvedInterfaceDeclaration = (UnresolvedInterfaceDeclaration)theEObject;
				T result = caseUnresolvedInterfaceDeclaration(unresolvedInterfaceDeclaration);
				if (result == null) result = caseInterfaceDeclaration(unresolvedInterfaceDeclaration);
				if (result == null) result = caseUnresolvedItem(unresolvedInterfaceDeclaration);
				if (result == null) result = caseTypeDeclaration(unresolvedInterfaceDeclaration);
				if (result == null) result = caseAbstractTypeDeclaration(unresolvedInterfaceDeclaration);
				if (result == null) result = caseBodyDeclaration(unresolvedInterfaceDeclaration);
				if (result == null) result = caseType(unresolvedInterfaceDeclaration);
				if (result == null) result = caseNamedElement(unresolvedInterfaceDeclaration);
				if (result == null) result = caseASTNode(unresolvedInterfaceDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.UNRESOLVED_LABELED_STATEMENT: {
				UnresolvedLabeledStatement unresolvedLabeledStatement = (UnresolvedLabeledStatement)theEObject;
				T result = caseUnresolvedLabeledStatement(unresolvedLabeledStatement);
				if (result == null) result = caseLabeledStatement(unresolvedLabeledStatement);
				if (result == null) result = caseUnresolvedItem(unresolvedLabeledStatement);
				if (result == null) result = caseNamedElement(unresolvedLabeledStatement);
				if (result == null) result = caseStatement(unresolvedLabeledStatement);
				if (result == null) result = caseASTNode(unresolvedLabeledStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.UNRESOLVED_METHOD_DECLARATION: {
				UnresolvedMethodDeclaration unresolvedMethodDeclaration = (UnresolvedMethodDeclaration)theEObject;
				T result = caseUnresolvedMethodDeclaration(unresolvedMethodDeclaration);
				if (result == null) result = caseMethodDeclaration(unresolvedMethodDeclaration);
				if (result == null) result = caseUnresolvedItem(unresolvedMethodDeclaration);
				if (result == null) result = caseAbstractMethodDeclaration(unresolvedMethodDeclaration);
				if (result == null) result = caseBodyDeclaration(unresolvedMethodDeclaration);
				if (result == null) result = caseNamedElement(unresolvedMethodDeclaration);
				if (result == null) result = caseASTNode(unresolvedMethodDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.UNRESOLVED_SINGLE_VARIABLE_DECLARATION: {
				UnresolvedSingleVariableDeclaration unresolvedSingleVariableDeclaration = (UnresolvedSingleVariableDeclaration)theEObject;
				T result = caseUnresolvedSingleVariableDeclaration(unresolvedSingleVariableDeclaration);
				if (result == null) result = caseSingleVariableDeclaration(unresolvedSingleVariableDeclaration);
				if (result == null) result = caseUnresolvedItem(unresolvedSingleVariableDeclaration);
				if (result == null) result = caseVariableDeclaration(unresolvedSingleVariableDeclaration);
				if (result == null) result = caseNamedElement(unresolvedSingleVariableDeclaration);
				if (result == null) result = caseASTNode(unresolvedSingleVariableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.UNRESOLVED_TYPE: {
				UnresolvedType unresolvedType = (UnresolvedType)theEObject;
				T result = caseUnresolvedType(unresolvedType);
				if (result == null) result = caseType(unresolvedType);
				if (result == null) result = caseUnresolvedItem(unresolvedType);
				if (result == null) result = caseNamedElement(unresolvedType);
				if (result == null) result = caseASTNode(unresolvedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.UNRESOLVED_TYPE_DECLARATION: {
				UnresolvedTypeDeclaration unresolvedTypeDeclaration = (UnresolvedTypeDeclaration)theEObject;
				T result = caseUnresolvedTypeDeclaration(unresolvedTypeDeclaration);
				if (result == null) result = caseAbstractTypeDeclaration(unresolvedTypeDeclaration);
				if (result == null) result = caseUnresolvedItem(unresolvedTypeDeclaration);
				if (result == null) result = caseBodyDeclaration(unresolvedTypeDeclaration);
				if (result == null) result = caseType(unresolvedTypeDeclaration);
				if (result == null) result = caseNamedElement(unresolvedTypeDeclaration);
				if (result == null) result = caseASTNode(unresolvedTypeDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.UNRESOLVED_VARIABLE_DECLARATION_FRAGMENT: {
				UnresolvedVariableDeclarationFragment unresolvedVariableDeclarationFragment = (UnresolvedVariableDeclarationFragment)theEObject;
				T result = caseUnresolvedVariableDeclarationFragment(unresolvedVariableDeclarationFragment);
				if (result == null) result = caseVariableDeclarationFragment(unresolvedVariableDeclarationFragment);
				if (result == null) result = caseUnresolvedItem(unresolvedVariableDeclarationFragment);
				if (result == null) result = caseVariableDeclaration(unresolvedVariableDeclarationFragment);
				if (result == null) result = caseNamedElement(unresolvedVariableDeclarationFragment);
				if (result == null) result = caseASTNode(unresolvedVariableDeclarationFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.VARIABLE_DECLARATION: {
				VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
				T result = caseVariableDeclaration(variableDeclaration);
				if (result == null) result = caseNamedElement(variableDeclaration);
				if (result == null) result = caseASTNode(variableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.VARIABLE_DECLARATION_EXPRESSION: {
				VariableDeclarationExpression variableDeclarationExpression = (VariableDeclarationExpression)theEObject;
				T result = caseVariableDeclarationExpression(variableDeclarationExpression);
				if (result == null) result = caseExpression(variableDeclarationExpression);
				if (result == null) result = caseAbstractVariablesContainer(variableDeclarationExpression);
				if (result == null) result = caseASTNode(variableDeclarationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.VARIABLE_DECLARATION_FRAGMENT: {
				VariableDeclarationFragment variableDeclarationFragment = (VariableDeclarationFragment)theEObject;
				T result = caseVariableDeclarationFragment(variableDeclarationFragment);
				if (result == null) result = caseVariableDeclaration(variableDeclarationFragment);
				if (result == null) result = caseNamedElement(variableDeclarationFragment);
				if (result == null) result = caseASTNode(variableDeclarationFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.VARIABLE_DECLARATION_STATEMENT: {
				VariableDeclarationStatement variableDeclarationStatement = (VariableDeclarationStatement)theEObject;
				T result = caseVariableDeclarationStatement(variableDeclarationStatement);
				if (result == null) result = caseStatement(variableDeclarationStatement);
				if (result == null) result = caseAbstractVariablesContainer(variableDeclarationStatement);
				if (result == null) result = caseASTNode(variableDeclarationStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.WILD_CARD_TYPE: {
				WildCardType wildCardType = (WildCardType)theEObject;
				T result = caseWildCardType(wildCardType);
				if (result == null) result = caseType(wildCardType);
				if (result == null) result = caseNamedElement(wildCardType);
				if (result == null) result = caseASTNode(wildCardType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_graphPackage.WHILE_STATEMENT: {
				WhileStatement whileStatement = (WhileStatement)theEObject;
				T result = caseWhileStatement(whileStatement);
				if (result == null) result = caseStatement(whileStatement);
				if (result == null) result = caseASTNode(whileStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Method Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Method Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMethodDeclaration(AbstractMethodDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Method Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Method Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMethodInvocation(AbstractMethodInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Type Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTypeDeclaration(AbstractTypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Type Qualified Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Type Qualified Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTypeQualifiedExpression(AbstractTypeQualifiedExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Variables Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Variables Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractVariablesContainer(AbstractVariablesContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Archive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Archive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchive(Archive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assert Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assert Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertStatement(AssertStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AST Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AST Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASTNode(ASTNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Member Value Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Member Value Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMemberValuePair(AnnotationMemberValuePair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Type Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationTypeDeclaration(AnnotationTypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Type Member Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Type Member Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationTypeMemberDeclaration(AnnotationTypeMemberDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Class Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Class Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousClassDeclaration(AnonymousClassDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayAccess(ArrayAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Creation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Creation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayCreation(ArrayCreation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Initializer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayInitializer(ArrayInitializer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Length Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Length Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayLengthAccess(ArrayLengthAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayType(ArrayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignment(Assignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyDeclaration(BodyDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanLiteral(BooleanLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockComment(BlockComment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Break Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Break Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreakStatement(BreakStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cast Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cast Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCastExpression(CastExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catch Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catch Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatchClause(CatchClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacterLiteral(CharacterLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassFile(ClassFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Instance Creation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Instance Creation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassInstanceCreation(ClassInstanceCreation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorDeclaration(ConstructorDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalExpression(ConditionalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorInvocation(ConstructorInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDeclaration(ClassDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compilation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compilation Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompilationUnit(CompilationUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continue Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continue Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinueStatement(ContinueStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Do Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Do Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoStatement(DoStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empty Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empty Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmptyStatement(EmptyStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enhanced For Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enhanced For Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnhancedForStatement(EnhancedForStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Constant Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Constant Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumConstantDeclaration(EnumConstantDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumDeclaration(EnumDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionStatement(ExpressionStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldAccess(FieldAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldDeclaration(FieldDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForStatement(ForStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfStatement(IfStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportDeclaration(ImportDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infix Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infix Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfixExpression(InfixExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initializer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitializer(Initializer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instanceof Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instanceof Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceofExpression(InstanceofExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceDeclaration(InterfaceDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Javadoc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Javadoc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavadoc(Javadoc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labeled Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labeled Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabeledStatement(LabeledStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineComment(LineComment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manifest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manifest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManifest(Manifest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manifest Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manifest Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManifestAttribute(ManifestAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manifest Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manifest Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManifestEntry(ManifestEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemberRef(MemberRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodDeclaration(MethodDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodInvocation(MethodInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodRef(MethodRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Ref Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Ref Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodRefParameter(MethodRefParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifier(Modifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespaceAccess(NamespaceAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberLiteral(NumberLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullLiteral(NullLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(java_graph.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageAccess(PackageAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterized Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterized Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterizedType(ParameterizedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parenthesized Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parenthesized Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParenthesizedExpression(ParenthesizedExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postfix Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postfix Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostfixExpression(PostfixExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prefix Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prefix Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrefixExpression(PrefixExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveType(PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeBoolean(PrimitiveTypeBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Byte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Byte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeByte(PrimitiveTypeByte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Char</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Char</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeChar(PrimitiveTypeChar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeDouble(PrimitiveTypeDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Short</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Short</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeShort(PrimitiveTypeShort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Float</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Float</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeFloat(PrimitiveTypeFloat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeInt(PrimitiveTypeInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Long</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Long</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeLong(PrimitiveTypeLong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Void</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Void</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeVoid(PrimitiveTypeVoid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnStatement(ReturnStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Variable Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Variable Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleVariableAccess(SingleVariableAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleVariableDeclaration(SingleVariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringLiteral(StringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Constructor Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Constructor Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperConstructorInvocation(SuperConstructorInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Field Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Field Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperFieldAccess(SuperFieldAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Method Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Method Invocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperMethodInvocation(SuperMethodInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchCase(SwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchStatement(SwitchStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronized Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronized Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronizedStatement(SynchronizedStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagElement(TagElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextElement(TextElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>This Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>This Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThisExpression(ThisExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Throw Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throw Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThrowStatement(ThrowStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Try Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Try Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTryStatement(TryStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAccess(TypeAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDeclaration(TypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Declaration Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Declaration Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDeclarationStatement(TypeDeclarationStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeLiteral(TypeLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeParameter(TypeParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedItem(UnresolvedItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Item Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Item Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedItemAccess(UnresolvedItemAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Annotation Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Annotation Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedAnnotationDeclaration(UnresolvedAnnotationDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Annotation Type Member Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Annotation Type Member Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedAnnotationTypeMemberDeclaration(UnresolvedAnnotationTypeMemberDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Class Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Class Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedClassDeclaration(UnresolvedClassDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Enum Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Enum Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedEnumDeclaration(UnresolvedEnumDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Interface Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Interface Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedInterfaceDeclaration(UnresolvedInterfaceDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Labeled Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Labeled Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedLabeledStatement(UnresolvedLabeledStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Method Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Method Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedMethodDeclaration(UnresolvedMethodDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Single Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Single Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedSingleVariableDeclaration(UnresolvedSingleVariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedType(UnresolvedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Type Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedTypeDeclaration(UnresolvedTypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Variable Declaration Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Variable Declaration Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedVariableDeclarationFragment(UnresolvedVariableDeclarationFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclaration(VariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclarationExpression(VariableDeclarationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclarationFragment(VariableDeclarationFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclarationStatement(VariableDeclarationStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wild Card Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wild Card Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWildCardType(WildCardType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhileStatement(WhileStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Java_graphSwitch

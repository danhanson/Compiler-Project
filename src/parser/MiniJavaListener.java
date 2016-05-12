// Generated from MiniJava.g4 by ANTLR 4.5.2

    package parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaParser}.
 */
public interface MiniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MiniJavaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MiniJavaParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(MiniJavaParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(MiniJavaParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#inherits}.
	 * @param ctx the parse tree
	 */
	void enterInherits(MiniJavaParser.InheritsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#inherits}.
	 * @param ctx the parse tree
	 */
	void exitInherits(MiniJavaParser.InheritsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(MiniJavaParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(MiniJavaParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(MiniJavaParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(MiniJavaParser.MemberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normalMethod}
	 * labeled alternative in {@link MiniJavaParser#method}.
	 * @param ctx the parse tree
	 */
	void enterNormalMethod(MiniJavaParser.NormalMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normalMethod}
	 * labeled alternative in {@link MiniJavaParser#method}.
	 * @param ctx the parse tree
	 */
	void exitNormalMethod(MiniJavaParser.NormalMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mainMethod}
	 * labeled alternative in {@link MiniJavaParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMainMethod(MiniJavaParser.MainMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mainMethod}
	 * labeled alternative in {@link MiniJavaParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMainMethod(MiniJavaParser.MainMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MiniJavaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MiniJavaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(MiniJavaParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(MiniJavaParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(MiniJavaParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(MiniJavaParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(MiniJavaParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(MiniJavaParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(MiniJavaParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(MiniJavaParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MiniJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MiniJavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(MiniJavaParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(MiniJavaParser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(MiniJavaParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(MiniJavaParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MiniJavaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MiniJavaParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MiniJavaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MiniJavaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(MiniJavaParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(MiniJavaParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(MiniJavaParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(MiniJavaParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(MiniJavaParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(MiniJavaParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(MiniJavaParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(MiniJavaParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(MiniJavaParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(MiniJavaParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void enterIfBody(MiniJavaParser.IfBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void exitIfBody(MiniJavaParser.IfBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#elseBody}.
	 * @param ctx the parse tree
	 */
	void enterElseBody(MiniJavaParser.ElseBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#elseBody}.
	 * @param ctx the parse tree
	 */
	void exitElseBody(MiniJavaParser.ElseBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(MiniJavaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(MiniJavaParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(MiniJavaParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(MiniJavaParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code null}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNull(MiniJavaParser.NullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code null}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNull(MiniJavaParser.NullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code this}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThis(MiniJavaParser.ThisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code this}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThis(MiniJavaParser.ThisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthExpression(MiniJavaParser.ParenthExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthExpression(MiniJavaParser.ParenthExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integer}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInteger(MiniJavaParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInteger(MiniJavaParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperation(MiniJavaParser.BinaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperation(MiniJavaParser.BinaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryOperation}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperation(MiniJavaParser.UnaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryOperation}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperation(MiniJavaParser.UnaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code invokeMethod}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInvokeMethod(MiniJavaParser.InvokeMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code invokeMethod}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInvokeMethod(MiniJavaParser.InvokeMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instantiation}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInstantiation(MiniJavaParser.InstantiationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instantiation}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInstantiation(MiniJavaParser.InstantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#booleanExp}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExp(MiniJavaParser.BooleanExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#booleanExp}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExp(MiniJavaParser.BooleanExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(MiniJavaParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(MiniJavaParser.ParamsContext ctx);
}
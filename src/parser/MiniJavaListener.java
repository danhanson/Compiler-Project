// Generated from MiniJava.g by ANTLR 4.5.2

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
	 * Enter a parse tree produced by {@link MiniJavaParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(MiniJavaParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(MiniJavaParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(MiniJavaParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(MiniJavaParser.ArgumentContext ctx);
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
	 * Enter a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MiniJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MiniJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MiniJavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MiniJavaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expression7}.
	 * @param ctx the parse tree
	 */
	void enterExpression7(MiniJavaParser.Expression7Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expression7}.
	 * @param ctx the parse tree
	 */
	void exitExpression7(MiniJavaParser.Expression7Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expression6}.
	 * @param ctx the parse tree
	 */
	void enterExpression6(MiniJavaParser.Expression6Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expression6}.
	 * @param ctx the parse tree
	 */
	void exitExpression6(MiniJavaParser.Expression6Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expression5}.
	 * @param ctx the parse tree
	 */
	void enterExpression5(MiniJavaParser.Expression5Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expression5}.
	 * @param ctx the parse tree
	 */
	void exitExpression5(MiniJavaParser.Expression5Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expression4}.
	 * @param ctx the parse tree
	 */
	void enterExpression4(MiniJavaParser.Expression4Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expression4}.
	 * @param ctx the parse tree
	 */
	void exitExpression4(MiniJavaParser.Expression4Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expression3}.
	 * @param ctx the parse tree
	 */
	void enterExpression3(MiniJavaParser.Expression3Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expression3}.
	 * @param ctx the parse tree
	 */
	void exitExpression3(MiniJavaParser.Expression3Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expression2}.
	 * @param ctx the parse tree
	 */
	void enterExpression2(MiniJavaParser.Expression2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expression2}.
	 * @param ctx the parse tree
	 */
	void exitExpression2(MiniJavaParser.Expression2Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expression1}.
	 * @param ctx the parse tree
	 */
	void enterExpression1(MiniJavaParser.Expression1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expression1}.
	 * @param ctx the parse tree
	 */
	void exitExpression1(MiniJavaParser.Expression1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#terminal}.
	 * @param ctx the parse tree
	 */
	void enterTerminal(MiniJavaParser.TerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#terminal}.
	 * @param ctx the parse tree
	 */
	void exitTerminal(MiniJavaParser.TerminalContext ctx);
}
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
	 * Enter a parse tree produced by {@link MiniJavaParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(MiniJavaParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(MiniJavaParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(MiniJavaParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(MiniJavaParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(MiniJavaParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(MiniJavaParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(MiniJavaParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(MiniJavaParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(MiniJavaParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(MiniJavaParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#product}.
	 * @param ctx the parse tree
	 */
	void enterProduct(MiniJavaParser.ProductContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#product}.
	 * @param ctx the parse tree
	 */
	void exitProduct(MiniJavaParser.ProductContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(MiniJavaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(MiniJavaParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#access}.
	 * @param ctx the parse tree
	 */
	void enterAccess(MiniJavaParser.AccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#access}.
	 * @param ctx the parse tree
	 */
	void exitAccess(MiniJavaParser.AccessContext ctx);
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
package typechecker.statements;

import codegeneration.Code;
import parser.MiniJavaParser.ExpressionStatementContext;
import parser.MiniJavaParser.StatementContext;
import typechecker.expressions.Expression;
import typechecker.scope.ExecutionScope;

public class ExpressionStatement extends Statement {

	private final Expression exp;

	public static ExpressionStatement fromStatementContext(StatementContext con, ExecutionScope scope){
		ExpressionStatementContext esc = (ExpressionStatementContext) con;
		Expression exp = Expression.fromExpressionContext(esc.expression(), scope);
		return new ExpressionStatement(exp);
	}

	public ExpressionStatement(Expression exp) {
		this.exp = exp;
	}

	@Override
	public boolean checkTypes() {
		return exp.checkTypes();
	}

	@Override
	public Code generateCode(Code insts) {
		return exp.generateCode(insts);
	}

}

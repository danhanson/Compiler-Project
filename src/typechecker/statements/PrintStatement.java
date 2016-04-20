package typechecker.statements;

import parser.MiniJavaParser.PrintStatementContext;
import parser.MiniJavaParser.StatementContext;
import typechecker.ExecutionScope;
import typechecker.expressions.Expression;

public class PrintStatement extends Statement {

	private final Expression exp;
	
	PrintStatement(Expression exp) {
		this.exp = exp;
	}

	public static PrintStatement fromStatementContext(StatementContext con, ExecutionScope scope){
		PrintStatementContext psc = (PrintStatementContext) con;
		Expression exp = Expression.fromExpressionContext(psc.expression(), scope);
		return new PrintStatement(exp);
	}

	@Override
	public void resolveTypes() {
		exp.resolveTypes();
	}
}

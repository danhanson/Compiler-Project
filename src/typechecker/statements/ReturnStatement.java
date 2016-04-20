package typechecker.statements;

import parser.MiniJavaParser.ReturnStatementContext;
import parser.MiniJavaParser.StatementContext;
import typechecker.ExecutionScope;
import typechecker.TypeMismatchException;
import typechecker.expressions.Expression;

public class ReturnStatement extends Statement {

	private final Expression exp;
	
	ReturnStatement(Expression exp){
		this.exp = exp;
	}

	public static ReturnStatement fromStatementContext(StatementContext con, ExecutionScope scope){
		ReturnStatementContext rsc = (ReturnStatementContext) con;
		return new ReturnStatement(Expression.fromExpressionContext(rsc.expression(), scope));
	}

	@Override
	public void resolveTypes() {
		exp.resolveTypes();
		if(exp.scope().returnType() != exp.returnType()) {
			throw new TypeMismatchException("invalid return type");
		}
	}
}

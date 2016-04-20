package typechecker.statements;

import parser.MiniJavaParser.StatementContext;
import parser.MiniJavaParser.WhileStatementContext;
import typechecker.ExecutionScope;
import typechecker.Primitive;
import typechecker.TypeMismatchException;
import typechecker.expressions.Expression;

public class WhileStatement extends Statement {

	private final Expression conditional;
	private final Statement body;
	
	WhileStatement(Expression conditional, Statement body) {
		this.conditional = conditional;
		this.body = body;
	}

	public static WhileStatement fromStatementContext(StatementContext con, ExecutionScope scope){
		WhileStatementContext wsc = (WhileStatementContext) con;
		Expression conditional = Expression.fromExpressionContext(wsc.expression(), scope);
		Statement body = Statement.fromStatementContext(wsc.statement(), scope);
		return new WhileStatement(conditional, body);
	}

	@Override
	public void resolveTypes() {
		conditional.resolveTypes();
		if(conditional.returnType() != Primitive.BOOLEAN){
			throw new TypeMismatchException("Conditional requires boolean type");
		}
		body.resolveTypes();
	}
}

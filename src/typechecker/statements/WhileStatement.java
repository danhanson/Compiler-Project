package typechecker.statements;

import parser.MiniJavaParser.StatementContext;
import parser.MiniJavaParser.WhileStatementContext;
import typechecker.exceptions.TypeMismatchException;
import typechecker.expressions.Expression;
import typechecker.scope.ExecutionScope;
import typechecker.types.Primitive;

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
	public boolean checkTypes() {
		conditional.checkTypes();
		if(conditional.returnType() != Primitive.Boolean){
			System.err.println("Type Mismatch");
			throw new TypeMismatchException("Conditional requires boolean type");
		}
		if(!body.checkTypes()){
			return false;
		}
		return true;
	}
}

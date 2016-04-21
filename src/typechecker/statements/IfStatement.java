package typechecker.statements;

import parser.MiniJavaParser.ElseBodyContext;
import parser.MiniJavaParser.IfBodyContext;
import parser.MiniJavaParser.IfStatementContext;
import parser.MiniJavaParser.StatementContext;
import typechecker.exceptions.TypeMismatchException;
import typechecker.expressions.Expression;
import typechecker.scope.ExecutionScope;
import typechecker.types.Primitive;

public class IfStatement extends Statement {

	private final Expression conditional;
	private final Statement ifBody;
	private final Statement elseBody;
	
	IfStatement(Expression conditional, Statement ifBody, Statement elseBody) {
		this.conditional = conditional;
		this.ifBody = ifBody;
		this.elseBody = elseBody;
	}

	public static IfStatement fromStatementContext(StatementContext con, ExecutionScope scope){
		IfStatementContext ifc = (IfStatementContext) con;
		IfBodyContext ifb = ifc.ifBody();
		Expression conditional = Expression.fromExpressionContext(ifb.expression(), scope);
		Statement body = Statement.fromStatementContext(ifb.statement(), scope);
		Statement elseStatement;
		ElseBodyContext ebc = ifc.elseBody();
		if(ebc == null){
			elseStatement = null;
		} else {
			elseStatement = Statement.fromStatementContext(ebc.statement(), scope);
		}
		return new IfStatement(conditional, body, elseStatement);
	}

	@Override
	public boolean checkTypes() {
		conditional.checkTypes();
		if(conditional.returnType() != Primitive.Boolean){
			throw new TypeMismatchException("if conditional requires boolean");
		}
		ifBody.checkTypes();
		if(elseBody != null)
			elseBody.checkTypes();
		return true;
	}
}

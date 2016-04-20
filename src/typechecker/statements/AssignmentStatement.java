package typechecker.statements;

import parser.MiniJavaParser.AssignmentStatementContext;
import parser.MiniJavaParser.StatementContext;
import typechecker.ExecutionScope;
import typechecker.Variable;
import typechecker.expressions.Expression;

public class AssignmentStatement extends Statement {

	private final Variable assignee;
	private final Expression exp;
	
	AssignmentStatement(Variable assignee, Expression exp) {
		this.assignee = assignee;
		this.exp = exp;
	}

	public static AssignmentStatement fromStatementContext(StatementContext con, ExecutionScope scope){
		AssignmentStatementContext asc = (AssignmentStatementContext) con;
		String varId = asc.ID().getText();
		Variable var = scope.resolveVariable(varId);
		if(var == null){
			throw new RuntimeException("No variable with id:" + varId);
		}
		Expression exp = Expression.fromExpressionContext(asc.expression(), scope);
		return new AssignmentStatement(var, exp);
	}

	@Override
	public void resolveTypes(){
		exp.resolveTypes();
		if(exp.returnType() != assignee.type()){
			throw new RuntimeException("Type Mismatch");
		}
	}
}

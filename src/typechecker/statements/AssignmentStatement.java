package typechecker.statements;

import parser.MiniJavaParser.AssignmentStatementContext;
import parser.MiniJavaParser.StatementContext;
import typechecker.expressions.Expression;
import typechecker.scope.ExecutionScope;
import typechecker.scope.Variable;

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
		
		Variable var = scope.resolveVariable(varId).get();
		
		
		
		Expression exp = Expression.fromExpressionContext(asc.expression(), scope);
		return new AssignmentStatement(var, exp);
	}

	@Override
	public boolean checkTypes(){
		exp.checkTypes();
		if(exp.returnType() != assignee.type()){
			throw new RuntimeException("Type Mismatch");
		}
		return true;
	}
}

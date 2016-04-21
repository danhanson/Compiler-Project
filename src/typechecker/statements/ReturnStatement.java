package typechecker.statements;

import parser.MiniJavaParser.ReturnStatementContext;
import parser.MiniJavaParser.StatementContext;
import typechecker.exceptions.TypeMismatchException;
import typechecker.expressions.Expression;
import typechecker.scope.ExecutionScope;
import typechecker.types.Void;

public class ReturnStatement extends Statement {

	private final Expression exp;
	private final ExecutionScope scope;
	
	ReturnStatement(Expression exp, ExecutionScope scope){
		this.exp = exp;
		this.scope = scope;
	}

	public static ReturnStatement fromStatementContext(StatementContext con, ExecutionScope scope){
		ReturnStatementContext rsc = (ReturnStatementContext) con;
		Expression exp;
		if(rsc.expression() != null){
			exp = Expression.fromExpressionContext(rsc.expression(), scope);
		} else {
			exp = null;
		}
		return new ReturnStatement(exp, scope);
	}

	@Override
	public boolean checkTypes() {
		if(exp == null){
			if(scope.returnType() != Void.instance()){
				throw new TypeMismatchException("Returns void but function has type: " + scope.returnType().id());
			}
			return true;
		} else {
			boolean isGood = true;
			if(!exp.checkTypes()){
				isGood =  false;
			}
			if(!exp.returnType().isSubTypeOf(exp.scope().returnType())) {
				System.err.println("RETURN 70: BAD RETURN TYPE");
				isGood = false;
			}
			return isGood;
		}
	}
}

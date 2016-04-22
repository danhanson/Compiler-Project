package typechecker.statements;

import parser.MiniJavaParser.ReturnStatementContext;
import parser.MiniJavaParser.StatementContext;
import typechecker.expressions.Expression;
import typechecker.scope.ExecutionScope;
import typechecker.types.Void;

public class ReturnStatement extends Statement {

    private final Expression exp;
    private final ExecutionScope scope;

    ReturnStatement(Expression exp, ExecutionScope scope) {
        this.exp = exp;
        this.scope = scope;
    }

	@Override
	public boolean checkTypes() {
		if(exp == null){
			if(scope.returnType() != Void.instance()){
				System.err.println("Empty return statement in method "+scope.callee().functionSignature().id());
				return false;
			}
			return true;
		} else {
			if(exp.checkTypes()){
				if(!exp.scope().returnType().isSubType(exp.returnType())) {
					System.err.println("Actual return type "+exp.returnType().id()+" of method "+scope.callee().functionSignature().id()+
							" does not match declared type "+scope.returnType().id()+".");
					return false;
				}
				return true;
			}
			return false;
		}
	}

	public static ReturnStatement fromStatementContext(StatementContext con,
            ExecutionScope scope) {
        ReturnStatementContext rsc = (ReturnStatementContext) con;
        Expression exp;
        if (rsc.expression() != null) {
            exp = Expression.fromExpressionContext(rsc.expression(), scope);
        } else {
            exp = null;
        }
        return new ReturnStatement(exp, scope);
    }
}

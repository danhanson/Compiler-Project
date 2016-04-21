package typechecker.statements;

import parser.MiniJavaParser.DeclarationStatementContext;
import parser.MiniJavaParser.StatementContext;
import typechecker.exceptions.TypeMismatchException;
import typechecker.expressions.Expression;
import typechecker.scope.ExecutionScope;
import typechecker.scope.Variable;

public class DeclarationStatement extends Statement {

	private final Variable variable;
	private final Expression exp;
	
	DeclarationStatement(Variable var, Expression exp){
		this.variable = var;
		this.exp = exp;
	}
	
	public static DeclarationStatement fromStatementContext(StatementContext con, ExecutionScope scope){
		DeclarationStatementContext ds = (DeclarationStatementContext) con;
		Variable v = Variable.fromDeclarationContext(ds.declaration(), scope);
		scope.addVariable(v);
		Expression exp = Expression.fromExpressionContext(ds.expression(), scope);
		return new DeclarationStatement(v, exp);
	}

	@Override
	public boolean checkTypes() {
		if(!variable.resolveType()){
			return false;
		}
		if(exp != null){
			exp.checkTypes();
			if(exp.returnType() != variable.type()){
				throw new TypeMismatchException("Types not matching: " + exp.returnType().id() + " and " + variable.typeId());
			}
		}
		return true;
	}
}

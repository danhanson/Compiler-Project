package typechecker.expressions;

import parser.MiniJavaParser.ExpressionContext;
import parser.MiniJavaParser.IdentifierContext;
import typechecker.scope.ExecutionScope;
import typechecker.scope.Variable;
import typechecker.types.Type;

public class Identifier extends Expression {

	private final Variable var;
	
	Identifier(Variable var, ExecutionScope scope) {
		super(scope);
		this.var = var;
	}

	public static Identifier fromExpressionContext(ExpressionContext con, ExecutionScope scope){
		IdentifierContext ic = (IdentifierContext) con;
		String id = ic.ID().getText();
		return new Identifier(scope.resolveVariable(id), scope);
	}

	@Override
	public Type returnType() {
		return var.type();
	}
	
	// we do not check the type here, it should be checked when the variable is declared
}

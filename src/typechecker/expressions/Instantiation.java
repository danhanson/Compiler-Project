package typechecker.expressions;

import parser.MiniJavaParser.ExpressionContext;
import typechecker.scope.ExecutionScope;
import typechecker.types.Type;

public class Instantiation extends Expression {

	public static Instantiation fromExpressionContext(ExpressionContext con, ExecutionScope scope){
		return null;
	}

	Instantiation(ExecutionScope scope) {
		super(scope);
	}

	@Override
	public Type returnType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void resolveTypes() {
		// TODO Auto-generated method stub

	}

}

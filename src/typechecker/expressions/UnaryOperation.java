package typechecker.expressions;

import parser.MiniJavaParser.ExpressionContext;
import typechecker.scope.ExecutionScope;
import typechecker.types.Type;

public class UnaryOperation extends Expression {

	public UnaryOperation(ExecutionScope scope) {
		super(scope);
		// TODO Auto-generated constructor stub
	}

	public static UnaryOperation fromExpressionContext(ExpressionContext con, ExecutionScope scope){
		return null;
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

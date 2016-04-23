package typechecker.expressions;

import parser.MiniJavaParser.ExpressionContext;
import typechecker.scope.ExecutionScope;
import typechecker.types.Null;
import typechecker.types.Type;

public final class NullExp extends Expression {

	public NullExp(ExecutionScope scope) {
		super(scope);
	}

	public static NullExp fromExpressionContext(ExpressionContext con, ExecutionScope scope){
		return new NullExp(scope);
	}

	@Override
	public Type returnType() {
		return Null.instance();
	}
}

package typechecker.expressions;

import parser.MiniJavaParser.ExpressionContext;
import typechecker.scope.ExecutionScope;
import typechecker.types.Primitive;
import typechecker.types.Type;

public final class IntegerExp extends Expression {
	
	IntegerExp(ExecutionScope scope) {
		super(scope);
	}

	public static IntegerExp fromExpressionContext(ExpressionContext con, ExecutionScope scope){
		return new IntegerExp(scope);
	}

	@Override
	public Type returnType() {
		return Primitive.Integer;
	}
}

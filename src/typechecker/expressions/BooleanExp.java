package typechecker.expressions;

import parser.MiniJavaParser.ExpressionContext;
import typechecker.scope.ExecutionScope;
import typechecker.types.Type;
import typechecker.types.Primitive;

public class BooleanExp extends Expression {

	BooleanExp(ExecutionScope scope) {
		super(scope);
	}

	public static BooleanExp fromExpressionContext(ExpressionContext con, ExecutionScope scope){
		return new BooleanExp(scope);
	}

	@Override
	public Type returnType() {
		return Primitive.Boolean;
	}
}

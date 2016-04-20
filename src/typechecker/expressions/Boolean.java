package typechecker.expressions;

import parser.MiniJavaParser.ExpressionContext;
import typechecker.scope.ExecutionScope;
import typechecker.types.Primitive;
import typechecker.types.Type;

public class Boolean extends Expression {

	private final boolean value;
	
	Boolean(boolean value, ExecutionScope scope) {
		super(scope);
		this.value = value;
	}

	public static Boolean fromExpressionContext(ExpressionContext con, ExecutionScope scope){
		return null;
	}

	@Override
	public Type returnType() {
		return Primitive.BOOLEAN;
	}

	@Override
	public void resolveTypes() {
		// do nothing
	}

}

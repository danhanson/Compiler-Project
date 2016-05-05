package typechecker.expressions;

import codegeneration.Code;
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

	@Override
	public Code generateCode(Code block) {
		// TODO Auto-generated method stub
		return null;
	}

}

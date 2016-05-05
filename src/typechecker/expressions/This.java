package typechecker.expressions;

import codegeneration.Code;
import parser.MiniJavaParser.ExpressionContext;
import typechecker.scope.ExecutionScope;
import typechecker.types.Type;

public final class This extends Expression {

	This(ExecutionScope scope) {
		super(scope);
	}

	public static This fromExpressionContext(ExpressionContext con, ExecutionScope scope){
		return new This(scope);
	}
	@Override
	public Type returnType() {
		return scope().thisClass();
	}

	@Override
	public Code generateCode(Code block) {
		// TODO Auto-generated method stub
		return null;
	}

}

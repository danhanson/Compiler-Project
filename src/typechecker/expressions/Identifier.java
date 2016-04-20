package typechecker.expressions;

import parser.MiniJavaParser.ExpressionContext;
import typechecker.ExecutionScope;
import typechecker.Type;

public class Identifier extends Expression {

	Identifier(ExecutionScope scope) {
		super(scope);
	}

	public static Identifier fromExpressionContext(ExpressionContext con, ExecutionScope scope){
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

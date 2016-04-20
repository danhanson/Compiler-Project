package typechecker.expressions;

import parser.MiniJavaParser.ExpressionContext;
import typechecker.ExecutionScope;
import typechecker.Type;

public class BinaryOperation extends Expression {

	public static BinaryOperation fromExpressionContext(ExpressionContext con, ExecutionScope scope){
		return null;
	}

	public BinaryOperation(ExecutionScope scope) {
		super(scope);
		// TODO Auto-generated constructor stub
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

package typechecker.expressions;

import parser.MiniJavaParser.ExpressionContext;
import typechecker.ExecutionScope;
import typechecker.Type;

public class Null extends Expression {

	public Null(ExecutionScope scope) {
		super(scope);
	}

	public static Null fromExpressionContext(ExpressionContext con, ExecutionScope scope){
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

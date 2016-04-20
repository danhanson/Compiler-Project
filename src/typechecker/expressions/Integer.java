package typechecker.expressions;

import parser.MiniJavaParser.ExpressionContext;
import typechecker.ExecutionScope;
import typechecker.Type;

public class Integer extends Expression {

	public Integer(ExecutionScope scope) {
		super(scope);
		// TODO Auto-generated constructor stub
	}
	
	public static Integer fromExpressionContext(ExpressionContext con, ExecutionScope scope){
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

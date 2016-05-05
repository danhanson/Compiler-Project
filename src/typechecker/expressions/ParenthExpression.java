package typechecker.expressions;

import codegeneration.Code;
import parser.MiniJavaParser.ExpressionContext;
import parser.MiniJavaParser.ParenthExpressionContext;
import typechecker.scope.ExecutionScope;
import typechecker.types.Type;

public final class ParenthExpression extends Expression {

	private final Expression exp;
	
	ParenthExpression(Expression exp, ExecutionScope scope) {
		super(scope);
		this.exp = exp;
	}

	public static ParenthExpression fromExpressionContext(ExpressionContext con, ExecutionScope scope){
		ParenthExpressionContext pec = (ParenthExpressionContext) con;
		return new ParenthExpression(Expression.fromExpressionContext(pec.expression(), scope), scope);
	}

	@Override
	public Type returnType() {
		return exp.returnType();
	}

	@Override
	public boolean checkTypes() {
		return exp.checkTypes();
	}

	@Override
	public Code generateCode(Code block) {
		// TODO Auto-generated method stub
		return null;
	}

}

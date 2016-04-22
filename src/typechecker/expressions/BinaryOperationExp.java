package typechecker.expressions;

import parser.MiniJavaParser.BinaryOperationContext;
import parser.MiniJavaParser.ExpressionContext;
import typechecker.operations.BinaryOperation;
import typechecker.scope.ExecutionScope;
import typechecker.types.Type;

public class BinaryOperationExp extends Expression {

	public static BinaryOperationExp fromExpressionContext(ExpressionContext con, ExecutionScope scope){
		BinaryOperationContext boc = (BinaryOperationContext) con;
		String sym = boc.getChild(1).getText();
		Expression exp1 = Expression.fromExpressionContext(boc.expression(0), scope);
		Expression exp2 = Expression.fromExpressionContext(boc.expression(1), scope);
		return new BinaryOperationExp(sym, exp1, exp2, scope);
	}

	private final String symbol;
	private final Expression arg1;
	private final Expression arg2;
	private BinaryOperation op;
	
	public BinaryOperationExp(String symbol, Expression arg1, Expression arg2, ExecutionScope scope) {
		super(scope);
		this.symbol = symbol;
		this.arg1 = arg1;
		this.arg2 = arg2;
	}

	@Override
	public Type returnType() {
		return op.returnType();
	}
	
	@Override
	public boolean checkTypes() {
		if(!arg1.checkTypes() || !arg2.checkTypes()){
			return false;
		}
		op = BinaryOperation.get(symbol, arg1.returnType(), arg2.returnType());
		return op != null;
	}
}

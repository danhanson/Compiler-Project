package typechecker.expressions;

import codegeneration.Code;
import parser.MiniJavaParser.ExpressionContext;
import parser.MiniJavaParser.UnaryOperationContext;
import typechecker.operations.UnaryOperation;
import typechecker.scope.ExecutionScope;
import typechecker.types.Type;

public final class UnaryOperationExp extends Expression {

	private final String symbol;
	private final Expression exp;
	private UnaryOperation op;

	UnaryOperationExp(String symbol, Expression exp, ExecutionScope scope) {
		super(scope);
		this.symbol = symbol;
		this.exp = exp;
	}

	public static UnaryOperationExp fromExpressionContext(ExpressionContext con, ExecutionScope scope){
		UnaryOperationContext uoc = (UnaryOperationContext) con;
		Expression exp = Expression.fromExpressionContext(uoc.expression(), scope);
		return new UnaryOperationExp(uoc.getChild(0).getText(), exp, scope);
	}

	@Override
	public Type returnType() {
		return op.returnType();
	}

	@Override
	public boolean checkTypes() {
		if(!exp.checkTypes()){
			return false;
		}
		op = UnaryOperation.get(symbol, exp.returnType());
		if(op == null){
			return false;
		}
		return true;
	}

	@Override
	public Code generateCode(Code block) {
		return op.generateCode(block, exp);
	}


}

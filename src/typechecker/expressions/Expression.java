package typechecker.expressions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

import codegeneration.Code;
import parser.MiniJavaParser.BinaryOperationContext;
import parser.MiniJavaParser.BooleanContext;
import parser.MiniJavaParser.ExpressionContext;
import parser.MiniJavaParser.IdentifierContext;
import parser.MiniJavaParser.InstantiationContext;
import parser.MiniJavaParser.IntegerContext;
import parser.MiniJavaParser.InvokeMethodContext;
import parser.MiniJavaParser.NullContext;
import parser.MiniJavaParser.ParenthExpressionContext;
import parser.MiniJavaParser.ThisContext;
import parser.MiniJavaParser.UnaryOperationContext;
import typechecker.scope.ExecutionScope;
import typechecker.types.Type;

public abstract class Expression {
	
	private static final Map<Class<? extends ExpressionContext>, BiFunction<ExpressionContext, ExecutionScope, ? extends Expression>> factoryLookup = new HashMap<>();
	
	static {
		factoryLookup.put(InstantiationContext.class, Instantiation::fromExpressionContext);
		factoryLookup.put(ThisContext.class, This::fromExpressionContext);
		factoryLookup.put(BooleanContext.class, BooleanExp::fromExpressionContext);
		factoryLookup.put(ParenthExpressionContext.class, ParenthExpression::fromExpressionContext);
		factoryLookup.put(IdentifierContext.class, Identifier::fromExpressionContext);
		factoryLookup.put(IntegerContext.class, IntegerExp::fromExpressionContext);
		factoryLookup.put(InvokeMethodContext.class, InvokeMethod::fromExpressionContext);
		factoryLookup.put(NullContext.class, NullExp::fromExpressionContext);
		factoryLookup.put(UnaryOperationContext.class, UnaryOperationExp::fromExpressionContext);
		factoryLookup.put(BinaryOperationContext.class, BinaryOperationExp::fromExpressionContext);
	}

	public static Expression fromExpressionContext(ExpressionContext expression, ExecutionScope scope) {
		return factoryLookup.get(expression.getClass()).apply(expression, scope);
	}

	private final ExecutionScope scope;

	Expression(ExecutionScope scope){
		this.scope = scope;
	}

	public abstract Type returnType();

	public boolean checkTypes(){
		return true;
	}

	public ExecutionScope scope() {
		return scope;
	}

	public abstract Code generateCode(Code c);
}

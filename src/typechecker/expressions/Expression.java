package typechecker.expressions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

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
		factoryLookup.put(BooleanContext.class, Boolean::fromExpressionContext);
		factoryLookup.put(ParenthExpressionContext.class, ParenthExpression::fromExpressionContext);
		factoryLookup.put(IdentifierContext.class, Identifier::fromExpressionContext);
		factoryLookup.put(IntegerContext.class, Integer::fromExpressionContext);
		factoryLookup.put(InvokeMethodContext.class, InvokeMethod::fromExpressionContext);
		factoryLookup.put(NullContext.class, Null::fromExpressionContext);
		factoryLookup.put(UnaryOperationContext.class, UnaryOperation::fromExpressionContext);
		factoryLookup.put(BinaryOperationContext.class, BinaryOperation::fromExpressionContext);
	}

	public static Expression fromExpressionContext(ExpressionContext expression, ExecutionScope scope) {
		return null;
	}

	private final ExecutionScope scope;

	Expression(ExecutionScope scope){
		this.scope = scope;
	}

	public abstract Type returnType();

	public abstract void resolveTypes();

	public ExecutionScope scope() {
		return scope;
	}
}

package typechecker.expressions;

import java.util.ArrayList;
import java.util.List;

import parser.MiniJavaParser.ExpressionContext;
import parser.MiniJavaParser.InvokeMethodContext;
import parser.MiniJavaParser.ParamsContext;
import typechecker.functions.Function;
import typechecker.functions.FunctionSignature;
import typechecker.scope.ExecutionScope;
import typechecker.types.Type;
import typechecker.types.Class;
import typechecker.exceptions.NoSuchMethodException;

public class InvokeMethod extends Expression {

	private final String methodId;
	private final Expression getObject;
	private final List<Expression> args;
	private Function method;

	public InvokeMethod(String id, Expression object, List<Expression> args, ExecutionScope scope) {
		super(scope);
		this.methodId = id;
		this.getObject = object;
		this.args = args;
	}

	public static InvokeMethod fromExpressionContext(ExpressionContext con, ExecutionScope scope){
		InvokeMethodContext imc = (InvokeMethodContext) con;
		Expression exp = Expression.fromExpressionContext(imc.expression(), scope);
		String methodId = imc.ID().getText();
		List<Expression> args = new ArrayList<>();
		ParamsContext params = imc.params();
		while(params != null && params.expression() != null){
			args.add(Expression.fromExpressionContext(params.expression(), scope));
			params = params.params();
		}
		return new InvokeMethod(methodId, exp, args, scope);
	}

	@Override
	public Type returnType() {
		return method.returnType();
	}

	@Override
	public void resolveTypes() {
		getObject.resolveTypes();
		Class c;
		Type t = getObject.returnType();
		if(t instanceof Class){
			c = (Class) t;
		} else {
			throw new NoSuchMethodException("Not an object");
		}
		List<Type> argList = new ArrayList<Type>();
		for(Expression exp : args){
			exp.resolveTypes();
			argList.add(exp.returnType());
		}
		this.method = c.resolveMethod(new FunctionSignature(methodId, argList));
	}
}

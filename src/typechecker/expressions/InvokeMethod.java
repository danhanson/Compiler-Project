package typechecker.expressions;

import java.util.ArrayList;
import java.util.List;

import codegeneration.Code;
import parser.MiniJavaParser.ExpressionContext;
import parser.MiniJavaParser.InvokeMethodContext;
import parser.MiniJavaParser.ParamsContext;
import typechecker.functions.Function;
import typechecker.functions.FunctionSignature;
import typechecker.scope.ExecutionScope;
import typechecker.types.Type;
import typechecker.types.Class;

public final class InvokeMethod extends Expression {

    private final String methodId;
    private final Expression getObject;
    private final List<Expression> args;
    private Function method;

    public InvokeMethod(String id, Expression object, List<Expression> args,
            ExecutionScope scope) {
        super(scope);
        this.methodId = id;
        this.getObject = object;
        this.args = args;
    }

    public static InvokeMethod fromExpressionContext(ExpressionContext con,
            ExecutionScope scope) {
        InvokeMethodContext imc = (InvokeMethodContext) con;
        Expression exp = Expression.fromExpressionContext(imc.expression(),
                scope);
        String methodId = imc.ID().getText();
        List<Expression> args = new ArrayList<>();
        ParamsContext params = imc.params();
        while (params != null && params.expression() != null) {
            args.add(Expression.fromExpressionContext(params.expression(),
                    scope));
            params = params.params();
        }
        return new InvokeMethod(methodId, exp, args, scope);
    }

    @Override
    public Type returnType() {
        return method.returnType();
    }

    @Override
    public boolean checkTypes() {
        if (!getObject.checkTypes()) {
            return false;
        }
        boolean isGood = true;
        Class c;
        Type t = getObject.returnType();
        if(!(t instanceof Class)) {
            System.err.println("Type "+t.id()+" has no method "+method.toString()+", "+t.id()+" is not a class.");
            isGood = false;
        }
        List<Type> argList = new ArrayList<Type>();
        for (Expression exp : args) {
            if (exp.checkTypes()) {
                argList.add(exp.returnType());
            } else{
                isGood = false;
            }
        }
        if (!isGood){
            return false;
        }
        c = (Class) t;
        FunctionSignature sig = new FunctionSignature(methodId, argList);
        return c.resolveMethod(sig).map(m -> {
        	this.method = m;
        	return true;	
        }).orElseGet(() -> {
        	System.err.println("Class "+scope().thisClass().id()+" has no method "+sig.toString());
        	return false;
        });
    }

	@Override
	public Code generateCode(Code block) {
		// TODO Auto-generated method stub
		return null;
	}

}

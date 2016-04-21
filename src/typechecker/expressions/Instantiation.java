package typechecker.expressions;

import java.util.Optional;

import parser.MiniJavaParser.ExpressionContext;
import parser.MiniJavaParser.InstantiationContext;
import typechecker.scope.ExecutionScope;
import typechecker.types.Type;
import typechecker.types.Class;

public class Instantiation extends Expression {

	private final String classId;
	private Class type;

	Instantiation(String classId, ExecutionScope scope) {
		super(scope);
		this.classId = classId;
	}

	public static Instantiation fromExpressionContext(ExpressionContext con, ExecutionScope scope){
		InstantiationContext ic = (InstantiationContext) con;
		return new Instantiation(ic.ID().getText(), scope);
	}

	@Override
	public Type returnType() {
		return type;
	}

	@Override
	public boolean checkTypes() {
		Optional<Type> opt = scope().resolveType(classId);
		if(!opt.isPresent()){
			System.err.println("No class "+classId+" found in scope.");
			return false;
		}
		Type t = opt.get();
		if(t instanceof Class){
			type = (Class) t;
			return true;
		}
		System.err.println("Type "+classId+" is not a class.");
		return false;
	}
}

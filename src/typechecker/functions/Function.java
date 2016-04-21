package typechecker.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import parser.MiniJavaParser.ArgumentsContext;
import parser.MiniJavaParser.NormalMethodContext;
import parser.MiniJavaParser.StatementContext;
import typechecker.exceptions.NoSuchTypeException;
import typechecker.scope.ExecutionScope;
import typechecker.scope.Variable;
import typechecker.statements.Statement;
import typechecker.types.Class;
import typechecker.types.Type;

public final class Function extends ExecutionScope{

	private FunctionSignature functionSignature;
	private final String id;
	private final String returnTypeId;
	private final List<Variable> args;
	private Type returnType = null;

	private Function(String id, String returnTypeId, List<Variable> args, Class parent){
		super(parent);
		this.id = id;
		for(Variable arg : args){
			addVariable(arg);
		}
		this.returnTypeId = returnTypeId;
		this.args = args;
	}

	public void resolveTypes() {
		super.resolveTypes();
		returnType = parent().resolveType(returnTypeId);
		if(returnType == null)
			throw new NoSuchTypeException(returnTypeId);
		List<Type> argTypes = new ArrayList<>();
		for(Variable v : args){
			argTypes.add(v.type());
		}
		this.functionSignature = new FunctionSignature(id, argTypes);
	}

	public FunctionSignature functionSignature() {
		return functionSignature;
	}

	public static Function fromMethodContext(NormalMethodContext method, Class c) {
		String id = method.ID().getText();
		String retType = method.returnType().getText();
		List<Variable> argList = new ArrayList<>();
		ArgumentsContext args = method.arguments();
		while(args != null && args.declaration() != null){
			argList.add(Variable.fromDeclarationContext(args.declaration(), c));
			args = args.arguments();
		}
		Function f = new Function(id, retType, argList, c);
		for(StatementContext statement : method.block().statement()){
			f.addStatement(Statement.fromStatementContext(statement, f));
		}
		return f;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, returnTypeId, super.hashCode());
	}

	@Override
	public Type returnType() {
		return returnType;
	}

	@Override
	public Type thisType() {
		return ((Class) parent()).thisType();
	}
}

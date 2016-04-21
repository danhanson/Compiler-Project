package typechecker.functions;

import java.util.ArrayList;
import java.util.List;

import parser.MiniJavaParser.ArgumentsContext;
import parser.MiniJavaParser.MethodContext;
import parser.MiniJavaParser.StatementContext;
import typechecker.exceptions.NoSuchTypeException;
import typechecker.scope.ExecutionScope;
import typechecker.scope.Variable;
import typechecker.statements.Statement;
import typechecker.types.Class;
import typechecker.types.Type;

public final class Function extends ExecutionScope{

	private FunctionSignature functionSignature;
	private final String returnTypeId;
	private List<Statement> statements;
	private Type returnType = null;

	private Function(String id, String returnTypeId, List<Variable> args, Class parent){
		super(parent);
		for(Variable arg : args){
			addVariable(arg);
		}
		statements = new ArrayList<>();
		this.returnTypeId = returnTypeId;
	}

	private void addStatement(Statement s){
		this.statements.add(s);
	}

	public void resolveTypes() throws NoSuchTypeException{
		super.resolveTypes();
		returnType = parent().resolveType(returnTypeId);
		if(returnType == null)
			throw new NoSuchTypeException(returnTypeId);
	}

	public FunctionSignature functionSignature() {
		return functionSignature;
	}

	public static Function fromMethodContext(MethodContext method, Class c) {
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
	public Type returnType() {
		return returnType;
	}

	@Override
	public Type thisType() {
		return ((Class) parent()).thisType();
	}
}

package typechecker;

import java.util.ArrayList;
import java.util.List;

import parser.MiniJavaParser.ArgumentsContext;
import parser.MiniJavaParser.MethodContext;

public class Function extends ExecutionScope{

	private final Signature signature;
	private final String returnTypeId;
	private Block body;
	private Type returnType = null;

	private Function(String id, String returnTypeId, List<Variable> args, Class parent){
		super(parent);
		for(Variable arg : args){
			addVariable(arg);
		}
		this.signature = new Signature(id, returnTypeId, args, parent);
		this.returnTypeId = returnTypeId;
	}

	private void setBody(Block body){
		this.body = body;
	}

	public void resolveTypes() throws NoSuchTypeException{
		returnType = parent().resolveType(returnTypeId);
		if(returnType == null)
			throw new NoSuchTypeException(returnTypeId);
		this.body.resolveTypes();
	}

	public Block body(){
		return body;
	}

	public Signature signature() {
		return signature;
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
		Block body = Block.fromBlockContext(method.block(), f);
		f.setBody(body);
		return f;
	}

	@Override
	public Type returnType() {
		return returnType;
	}

	@Override
	public Variable thisVar() {
		return ((Class) parent()).thisVar();
	}
}

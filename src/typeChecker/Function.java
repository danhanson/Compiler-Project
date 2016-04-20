package typeChecker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import parser.MiniJavaParser.ArgumentsContext;
import parser.MiniJavaParser.MethodContext;

public class Function extends AbstractScope{
	
	private final Signature signature;
	private final String returnTypeId;
	private final Block body;
	private final Map<String, Variable> arguments;
	private Type returnType = null;
	
	Function(String id, String returnTypeId, List<Variable> args, Scope parent){
		super(parent);
		this.arguments = new HashMap<String, Variable>();
		for(Variable arg : args){
			this.arguments.put(arg.id(), arg);
		}
		this.signature = new Signature(id, returnTypeId, args, parent);
		this.returnTypeId = returnTypeId;
		this.body = new Block(this);
	}
	
	public void checkTypes() throws NoSuchTypeException{
		for(Variable arg : arguments.values()){
			arg.resolveType();
		}
		returnType = parent().resolveType(returnTypeId);
		if(returnType == null)
			throw new NoSuchTypeException(returnTypeId);
		this.body.checkTypes();
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
		return new Function(id, retType, argList, c);
	}
}

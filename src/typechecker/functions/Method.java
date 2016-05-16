package typechecker.functions;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import codegeneration.Code;
import codegeneration.Instruction;
import codegeneration.constants.ConstantPool;
import parser.MiniJavaParser.ArgumentsContext;
import parser.MiniJavaParser.NormalMethodContext;
import parser.MiniJavaParser.StatementContext;
import typechecker.scope.ClassScope;
import typechecker.scope.ExecutionScope;
import typechecker.scope.Variable;
import typechecker.statements.Statement;
import typechecker.types.Type;
import typechecker.types.Void;
import typechecker.types.UndeclaredClass;

public class Method extends ExecutionScope{

	private MethodSignature methodSignature;
	private final String id;
	private final String returnTypeId;
	private List<Variable> args;
	private Type returnType = null;
	protected final Code code = new Code();

	public Method(String id, Type returnType, ClassScope parent){
		super(parent);
		this.args = Collections.emptyList();
		this.returnType = returnType;
		this.id = id;
		this.returnTypeId = returnType.id();
	}

	public Method(String id, String returnTypeId, ClassScope parent){
		super(parent);
		this.id = id;
		this.returnTypeId = returnTypeId;
	}

	public boolean resolveSignature() {
		boolean ret = true;
		if(Void.instance().id().equals(returnTypeId)){
			returnType = Void.instance();
		} else if(!parent().resolveType(returnTypeId).map(t -> this.returnType = t).isPresent()){
			returnType = new UndeclaredClass(returnTypeId);
			System.err.println("Cannot find class named " + this.returnTypeId);
			ret = false;
		}
		List<Type> types = new ArrayList<>(args.size());
		for(Variable v : args){
			if(!v.resolveType()){
				ret = false;
			}
			types.add(v.type());
		}
		if(!ret){
			return false;
		}
		methodSignature = new MethodSignature(id, types);
		return true;
	}

	public void setReturnType(Type returnType) {
		this.returnType = returnType;
	}

	public final boolean signatureResolved(){
		return methodSignature != null;
	}

	public MethodSignature methodSignature() {
		return methodSignature;
	}

	public static Method fromMethodContext(NormalMethodContext method, ClassScope c) {
		String id = method.ID().getText();
		String retType = method.returnType().getText();
		List<Variable> argList = new ArrayList<>();
		ArgumentsContext args = method.arguments();
		Method f = new Method(id, retType, c);
		while(args != null && args.declaration() != null){
			argList.add(Variable.fromDeclarationContext(args.declaration(), f, true));
			args = args.arguments();
		}
		f.addArguments(argList);
		for(StatementContext statement : method.block().statement()){
			f.addStatement(Statement.fromStatementContext(statement, f));
		}
		return f;
	}

	private void addArguments(List<Variable> argList) {
		boolean isGood = true;
		for(Variable arg : argList){
			if(resolveLocalVariable(arg.id()).isPresent()){
				System.err.println("Formal parameter named "+arg.id()+" duplicates the name of another formal parameter.");
				isGood = false;
			} else {
				addVariable(arg);
				arg.setDeclared(true);
			}
		}
		args = argList;
		if(!isGood){
			throw new IllegalArgumentException();
		}
	}

	public String id(){
		return id;
	}

	@Override
	public String toString() {
		return returnTypeId + " " + id + "(" + args.stream().map(Variable::toString).collect(Collectors.joining(", ")) + ")";
	}

	@Override
	public Type returnType() {
		return returnType;
	}

	@Override
	public Method callee() {
		return this;
	}

	public void generateCode(){
		code.localVariable(thisInstance());
		for(Variable arg : args){
			code.localVariable(arg);
		}
		for(Statement s : statements()){
			s.generateCode(code);
		}
		if(Void.instance().equals(returnType)){
			code.add(Instruction.RETURN);
		}
	}

	public void writeMethod(DataOutputStream out) throws IOException {
		ConstantPool pool = ((ClassScope) parent()).constantPool();
		out.writeShort(1); // public
		out.writeShort(pool.name(id()));
		out.writeShort(pool.descriptor(this));
		out.writeShort(1); // one attribute
		code.writeCode(out, pool);
	}

	public String descriptor() {
		return "(" + 
					args.stream()
							.map(Variable::type)
							.map(Type::descriptor)
							.collect(Collectors.joining()) +
				")" + returnType().descriptor();
	}

	public List<Variable> args() {
		return args;
	}

	boolean isCovariant(Method m){
		if(!m.methodSignature.isCovariant(methodSignature)){
			return false;
		}
		return returnType.isSubType(m.returnType);
	}
}

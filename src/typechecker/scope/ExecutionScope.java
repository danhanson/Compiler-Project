package typechecker.scope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import codegeneration.Code;
import codegeneration.constants.ConstantPool;
import typechecker.functions.Function;
import typechecker.functions.FunctionSignature;
import typechecker.statements.Statement;
import typechecker.types.Class;
import typechecker.types.Type;

/**
 * an execution scope is a scope that the program executes in, this
 * includes function and blocks. Unlike other scopes,
 * Execution Scopes have a return type that control what return
 * statements may return
 */
public abstract class ExecutionScope extends ClassScope {

	protected final Map<String, Variable> variables = new HashMap<>();
	protected final List<Statement> statements = new ArrayList<>();

	protected void addStatement(Statement s){
		statements.add(s);
	}
	
	public ExecutionScope(ClassScope parent) {
		super(parent);
	}

	public boolean addVariable(Variable v){
		return resolveLocalVariable(v.id()).map(past -> {
			if(past.declared()){
				System.err.println("the variable "+v.id()+" is already declared in the current scope");
				return false;
			} else {
				past.setDeclared(v.declared());
				return true;
			}
		}).orElseGet(() -> variables.put(v.id(), v) == null);
	}

	public Optional<Variable> resolveLocalVariable(String id){
		return Optional.ofNullable(variables.get(id));
	}

	public Optional<Variable> resolveVariable(String id){
		Variable var = variables.get(id);
		if(var == null){
			return ((ClassScope) parent()).resolveField(id).map(f -> (Variable) f);
		}
		return Optional.of(var);
	}

	public boolean checkTypes(){
		boolean ret = true;
		for(Statement s : statements){
			if(!s.checkTypes()){
				ret = false;
			}
		}
		return ret;
	}

	@Override
	public Optional<Function> resolveMethod(FunctionSignature fs) {
		return thisClass().resolveMethod(fs);
	}

	public final Collection<Variable> variables() {
		return variables.values();
	}

	@Override
	public Class thisClass() {
		return ((ClassScope) parent()).thisClass();
	}
	
	public abstract Function callee();

	public abstract Type returnType();

	@Override
	public Optional<Variable> resolveField(String v) {
		return ((ClassScope) parent()).resolveField(v);
	}

	@Override
	public ConstantPool constantPool() {
		return ((ClassScope) parent()).constantPool();
	}

	public List<Statement> statements() {
		return statements;
	}

	public Collection<Variable> localVariables(){
		return variables.values();
	}

	public Code generateCode(Code code){
		for(Statement s : statements){
			s.generateCode(code);
		}
		return code;
	}
}

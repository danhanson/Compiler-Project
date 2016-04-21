package typechecker.scope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import typechecker.exceptions.DuplicateDeclarationException;
import typechecker.functions.Function;
import typechecker.statements.Statement;
import typechecker.types.Type;

/**
 * an execution scope is a scope that the program executes in, this
 * includes function and blocks. Unlike other scopes,
 * Execution Scopes have a return type that control what return
 * statements may return
 */
public abstract class ExecutionScope extends ClassScope {

	private final Map<String, Variable> variables = new HashMap<>();
	private final List<Statement> statements = new ArrayList<>();

	protected void addStatement(Statement s){
		statements.add(s);
	}
	
	public ExecutionScope(ClassScope parent) {
		super(parent);
	}

	public boolean addVariable(Variable v){
		return variables.put(v.id(), v) == null;
	}

	public Type returnType(){
		return callee().returnType();
	}

	public abstract Function callee();

	public Type thisType(){
		return ((ClassScope) parent()).thisType();
	}

	@Override
	public Optional<Variable> resolveVariable(String id) {
		Variable var = variables.get(id);
		if(var == null){
			return parent().resolveVariable(id);
		}
		return Optional.of(var);
	}

	public boolean checkTypes(){
		boolean ret = true;
		for(Variable v : variables.values()){
			if(!v.resolveType()){
				ret = false;
			}
		}
		if(!ret){
			return false;
		}
		for(Statement s : statements){
			if(!s.checkTypes()){
				ret = false;
			}
		}
		return ret;
	}

	public final Collection<Variable> variables() {
		return Collections.unmodifiableCollection(variables.values());
	}
}

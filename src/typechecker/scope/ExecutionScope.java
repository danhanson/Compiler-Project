package typechecker.scope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import typechecker.exceptions.DuplicateDeclarationException;
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

	public void addVariable(Variable v){
		if(variables.put(v.id(), v) != null){
			throw new DuplicateDeclarationException(v.id());
		}
	}

	public abstract Type returnType();

	public Type thisType(){
		return ((ClassScope) parent()).thisType();
	}

	@Override
	public Variable resolveVariable(String id) {
		if(variables.containsKey(id)){
			return variables.get(id);
		}
		return super.resolveVariable(id);
	}
	
	public void resolveTypes(){
		for(Variable v : variables.values()){
			v.resolveType();
		}
		for(Statement s : statements){
			s.resolveTypes();
		}
	}

	public final Collection<Variable> variables() {
		return Collections.unmodifiableCollection(variables.values());
	}
}

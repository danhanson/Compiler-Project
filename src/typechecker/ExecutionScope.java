package typechecker;

import java.util.HashMap;
import java.util.Map;

/**
 * an execution scope is a scope that the program executes in, this
 * includes function and blocks. Unlike other scopes,
 * Execution Scopes have a return type that control what return
 * statements may return
 */
public abstract class ExecutionScope extends AbstractScope {

	private final Map<String, Variable> variables = new HashMap<>();

	public ExecutionScope(Scope parent) {
		super(parent);
	}

	public void addVariable(Variable v){
		if(variables.put(v.id(), v) != null){
			throw new DuplicateDeclarationException(v.id());
		}
	}

	public abstract Type returnType();

	public abstract Variable thisVar();

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
	}
}

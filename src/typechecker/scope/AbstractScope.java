package typechecker.scope;

import java.util.Optional;

import typechecker.functions.Function;
import typechecker.functions.FunctionSignature;
import typechecker.types.Type;

public abstract class AbstractScope implements Scope {

	private final Scope parent;
	
	public AbstractScope(Scope parent){
		this.parent = parent;
	}
	
	@Override
	public Optional<Type> resolveType(String id) {
		return parent().resolveType(id);
	}

	@Override
	public Optional<Variable> resolveVariable(String id) {
		return parent().resolveVariable(id);
	}

	@Override
	public Optional<Function> resolveFunction(FunctionSignature id) {
		return parent().resolveFunction(id);
	}

	public final Scope parent() {
		return parent;
	}

}

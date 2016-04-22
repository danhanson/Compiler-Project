package typechecker.scope;

import java.util.Optional;

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

	public final Scope parent() {
		return parent;
	}

}

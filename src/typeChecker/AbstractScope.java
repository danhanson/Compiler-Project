package typeChecker;

public abstract class AbstractScope implements Scope {

	private final Scope parent;
	
	public AbstractScope(Scope parent){
		this.parent = parent;
	}
	
	@Override
	public Type resolveType(String id) {
		return parentScope().resolveType(id);
	}

	@Override
	public Variable resolveVariable(String id) {
		return parentScope().resolveVariable(id);
	}

	@Override
	public Function resolveFunction(Signature id) {
		return parentScope().resolveFunction(id);
	}

	public final Scope parentScope() {
		return parent;
	}

}

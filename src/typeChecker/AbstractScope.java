package typeChecker;

public abstract class AbstractScope implements Scope {

	private final Scope parent;
	
	public AbstractScope(Scope parent){
		this.parent = parent;
	}
	
	@Override
	public Type resolveType(String id) {
		return parent().resolveType(id);
	}

	@Override
	public Variable resolveVariable(String id) {
		return parent().resolveVariable(id);
	}

	@Override
	public Function resolveFunction(Signature id) {
		return parent().resolveFunction(id);
	}

	public final Scope parent() {
		return parent;
	}

}

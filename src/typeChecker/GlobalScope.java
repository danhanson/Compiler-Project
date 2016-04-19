package typeChecker;

public class GlobalScope implements Scope {

	private GlobalScope(){ }
	
	private static final GlobalScope scope = new GlobalScope();
	
	public static GlobalScope instance(){
		return scope;
	}

	@Override
	public Type resolveType(String id) {
		return null;
	}

	@Override
	public Variable resolveVariable(String id) {
		return null;
	}

	@Override
	public Function resolveFunction(Signature id) {
		return null;
	}

}

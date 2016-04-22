package typechecker.types;

import typechecker.scope.GlobalScope;
import typechecker.scope.Scope;

public final class Null implements Type {

	private Null() { }
	
	@Override
	public String id() {
		return "Null";
	}

	@Override
	public Scope parent() {
		return GlobalScope.instance();
	}

	@Override
	public boolean isSubType(Type other) {
		return false;
	}

	private static final Null instance = new Null();

	public static Null instance(){
		return instance;
	}
}

package typechecker.types;

import typechecker.scope.GlobalScope;
import typechecker.scope.Scope;

public class Void implements Type {

	private Void() {
		// nothing
	}

	@Override
	public String id() {
		return "void";
	}

	@Override
	public Scope parent() {
		return GlobalScope.instance();
	}

	@Override
	public boolean isSubType(Type other) {
		return false;
	}

	private static final Void INSTANCE = new Void();

	public static Void instance(){
		return INSTANCE;
	}
}

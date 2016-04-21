package typechecker.types;

import java.util.HashMap;
import java.util.Map;

import typechecker.scope.GlobalScope;
import typechecker.scope.Scope;

public enum Primitive implements Type {

	Boolean("boolean"), Integer("int");

	private static Map<String, Primitive> byId = new HashMap<String, Primitive>();

	static {
		for(Primitive p : Primitive.values()){
			byId.put(p.id, p);
		}
	}

	public static Primitive withId(String id){
		return byId.get(id);
	}

	private final String id;

	Primitive(String id){
		this.id = id;
	}

	@Override
	public final String id() {
		return id;
	}

	@Override
	public final Scope parent() {
		return GlobalScope.instance();
	}

	@Override
	public boolean isSubType(Type other) {
		return other == this;
	}
}

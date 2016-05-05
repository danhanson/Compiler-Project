package typechecker.types;

import java.util.HashMap;
import java.util.Map;

import typechecker.scope.GlobalScope;
import typechecker.scope.Scope;

public enum Primitive implements Type {

	Boolean("boolean","Z"), Integer("int","I");

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
	private final String descriptor;

	Primitive(String id, String descriptor){
		this.id = id;
		this.descriptor = descriptor;
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
	public String descriptor() {
		return descriptor;
	}

	@Override
	public boolean isSubType(Type other) {
		return equals(other);
	}
}

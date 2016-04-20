package typechecker.types;

import typechecker.scope.GlobalScope;
import typechecker.scope.Scope;

public class Primitive implements Type {

	public static final Primitive BOOLEAN = new Primitive("boolean");
	public static final Primitive INT = new Primitive("int");

	private final String id;

	Primitive(String id){
		this.id = id;
	}

	@Override
	public String id() {
		return id;
	}

	@Override
	public Scope parent() {
		return GlobalScope.instance();
	}
}

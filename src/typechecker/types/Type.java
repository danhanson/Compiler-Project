package typechecker.types;

import typechecker.scope.Scope;

public interface Type {
	String id();
	Scope parent();
	boolean isSubType(Type other);
}

package typechecker.types;

import typechecker.scope.Scope;

public interface Type {
	String id();
	Scope parent();
	String descriptor();
	boolean isSubType(Type other);
	default int size(){
		return 1; // all sizes are 1 except for doubles and longs
	}
}

package typechecker.scope;

import typechecker.types.Type;

public abstract class ClassScope extends AbstractScope {

	public ClassScope(Scope parent) {
		super(parent);
	}

	public abstract Type thisType();
}

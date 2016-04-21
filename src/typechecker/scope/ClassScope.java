package typechecker.scope;

import typechecker.types.Type;

public abstract class ClassScope extends AbstractScope {

	public ClassScope(Scope parent) {
		super(parent);
		// TODO Auto-generated constructor stub
	}

	public abstract Type thisType();
}

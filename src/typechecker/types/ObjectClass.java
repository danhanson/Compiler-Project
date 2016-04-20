package typechecker.types;

import typechecker.exceptions.TypeException;
import typechecker.functions.Function;
import typechecker.functions.Signature;
import typechecker.scope.GlobalScope;
import typechecker.scope.Variable;

public final class ObjectClass extends Class {

	private ObjectClass() {
		super("Object", GlobalScope.instance());
		GlobalScope.instance().addType(this);
	}

	private static final ObjectClass INSTANCE = new ObjectClass();

	public static ObjectClass instance(){
		return INSTANCE;
	}

	@Override
	public Variable resolveField(String id) {
		return null;
	}

	@Override
	public Function resolveMethod(Signature id) {
		return null;
	}

	@Override
	public void resolveTypes() throws TypeException {
		// do nothing
	}
}

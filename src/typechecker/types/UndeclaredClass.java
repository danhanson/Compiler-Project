package typechecker.types;

import java.util.Optional;

import typechecker.functions.Function;
import typechecker.functions.FunctionSignature;
import typechecker.scope.Variable;

public final class UndeclaredClass extends Class {

	public UndeclaredClass(String id) {
		super(id, ObjectClass.instance());
	}

	@Override
	public boolean isSubType(Type other) {
		return other.id().equals(this.id());
	}

	@Override
	public Optional<Variable> resolveField(String id) {
		return ObjectClass.instance().resolveField(id);
	}

	@Override
	public Optional<Function> resolveMethod(FunctionSignature id) {
		return ObjectClass.instance().resolveMethod(id);
	}

}

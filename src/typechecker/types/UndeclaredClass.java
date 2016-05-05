package typechecker.types;

import java.util.Optional;

import typechecker.functions.Function;
import typechecker.functions.FunctionSignature;
import typechecker.scope.Scope;
import typechecker.scope.Variable;

public final class UndeclaredClass implements Class {

	private final String id;

	public UndeclaredClass(String id) {
		this.id = id;
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

	@Override
	public Scope parent() {
		return ObjectClass.instance();
	}

	@Override
	public String id() {
		return id;
	}

	@Override
	public Optional<Type> resolveType(String id) {
		return ObjectClass.instance().resolveType(id);
	}
}

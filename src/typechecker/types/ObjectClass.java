package typechecker.types;

import java.util.Optional;

import typechecker.functions.Function;
import typechecker.functions.FunctionSignature;
import typechecker.scope.GlobalScope;
import typechecker.scope.Scope;
import typechecker.scope.Variable;

public final class ObjectClass implements Scope, Class {

	private ObjectClass() {
		GlobalScope.instance().addType(this);
	}

	private static final ObjectClass INSTANCE = new ObjectClass();

	public static ObjectClass instance(){
		return INSTANCE;
	}

	@Override
	public Optional<Variable> resolveField(String id) {
		return Optional.empty();
	}

	@Override
	public Optional<Function> resolveMethod(FunctionSignature id) {
		return Optional.empty();
	}

	@Override
	public boolean isSubType(Type other) {
		return other == this;
	}

	@Override
	public Scope parent() {
		return GlobalScope.instance();
	}

	@Override
	public String id() {
		return "Object";
	}

	@Override
	public Optional<Type> resolveType(String id) {
		return GlobalScope.instance().resolveType(id);
	}
}

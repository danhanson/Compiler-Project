package typechecker.types;

import java.util.Optional;

import typechecker.functions.Method;
import typechecker.functions.MethodSignature;
import typechecker.scope.GlobalScope;
import typechecker.scope.Scope;
import typechecker.scope.Variable;

public final class Null implements Class {

	private Null() {
	}
	
	@Override
	public String id() {
		return "Null";
	}

	@Override
	public boolean isSubType(Type other) {
		return other == this;
	}

	private static final Null instance = new Null();

	public static Null instance(){
		return instance;
	}

	@Override
	public Optional<Variable> resolveField(String id) {
		return Optional.empty();
	}

	@Override
	public Optional<Method> resolveMethod(MethodSignature id) {
		return Optional.empty();
	}

	@Override
	public Scope parent() {
		return GlobalScope.instance();
	}

	@Override
	public Optional<Type> resolveType(String id) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String descriptor() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Method constructor() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String binaryName() {
		throw new UnsupportedOperationException();
	}
}

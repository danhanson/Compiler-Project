package typechecker.types;

import java.util.Optional;

import typechecker.functions.Function;
import typechecker.functions.FunctionSignature;
import typechecker.scope.GlobalScope;
import typechecker.scope.Variable;

public final class Null extends Class {

	private Null() {
		super("Null", GlobalScope.instance());
	}
	
	@Override
	public String id() {
		return "Null";
	}

	@Override
	public boolean isSubType(Type other) {
		return false;
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
	public Optional<Function> resolveMethod(FunctionSignature id) {
		return Optional.empty();
	}
}

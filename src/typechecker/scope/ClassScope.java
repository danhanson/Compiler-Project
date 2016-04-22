package typechecker.scope;

import java.util.Optional;

import typechecker.functions.Function;
import typechecker.functions.FunctionSignature;
import typechecker.types.Class;;

public abstract class ClassScope extends AbstractScope {

	public ClassScope(Scope parent) {
		super(parent);
	}

	public abstract Optional<Function> resolveMethod(FunctionSignature fs);

	public abstract Optional<Variable> resolveField(String v);

	public abstract Class thisClass();
}

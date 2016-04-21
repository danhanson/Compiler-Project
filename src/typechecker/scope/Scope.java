package typechecker.scope;

import java.util.Optional;

import typechecker.exceptions.NoSuchTypeException;
import typechecker.functions.Function;
import typechecker.functions.FunctionSignature;
import typechecker.types.Type;

public interface Scope {
	Optional<Type> resolveType(String id) throws NoSuchTypeException;
	Optional<Variable> resolveVariable(String id);
	Optional<Function> resolveFunction(FunctionSignature id);
}

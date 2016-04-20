package typechecker.scope;

import typechecker.exceptions.NoSuchTypeException;
import typechecker.functions.Function;
import typechecker.functions.Signature;
import typechecker.types.Type;

public interface Scope {
	Type resolveType(String id) throws NoSuchTypeException;
	Variable resolveVariable(String id);
	Function resolveFunction(Signature id);
}

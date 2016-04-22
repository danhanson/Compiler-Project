package typechecker.scope;

import java.util.Optional;

import typechecker.types.Type;

public interface Scope {
	Optional<Type> resolveType(String id);
}

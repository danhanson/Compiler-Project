package typeChecker;

public interface Scope {
	Type resolveType(String id) throws NoSuchTypeException;
	Variable resolveVariable(String id);
	Function resolveFunction(Signature id);
}

package typeChecker;

public interface Scope {
	Type resolveType(String id);
	Variable resolveVariable(String id);
	Function resolveFunction(Signature id);
}

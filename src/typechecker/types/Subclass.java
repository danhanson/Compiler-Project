package typechecker.types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import typechecker.exceptions.DuplicateDeclarationException;
import typechecker.functions.Function;
import typechecker.functions.FunctionSignature;
import typechecker.scope.Variable;

public final class Subclass extends Class {

	private final Map<String, Variable> fields = new HashMap<>();
	private final List<Function> unresolvedMethods = new ArrayList<>();
	private final Map<FunctionSignature, Function> methods = new HashMap<>();

	Subclass(Class parent, String id){
		super(id, parent);
	}

	public void resolveTypes() {
		for(Variable v : fields.values()){
			v.resolveType();
		}
		for(Function f : unresolvedMethods){
			f.resolveTypes();
			if(methods.put(f.functionSignature(), f) != null){
				throw new DuplicateDeclarationException("Duplicated declarations for " + f.toString());
			}
		}
		return;
	}

	@Override
	public Type resolveType(String id) {
		if(id == this.id()){
			return this;
		}
		return super.resolveType(id);
	}

	@Override
	public Variable resolveVariable(String id) {
		if(fields.containsKey(id)){
			return fields.get(id);
		}
		return super.resolveVariable(id);
	}

	@Override
	public Function resolveFunction(FunctionSignature id) {
		if(methods.containsKey(id)){
			return methods.get(id);
		}
		return super.resolveFunction(id);
	}

	@Override
	public Variable resolveField(String id) {
		if(fields.containsKey(id)){
			return fields.get(id);
		}
		return this.superClass().resolveField(id);
	}

	@Override
	public Function resolveMethod(FunctionSignature id) {
		if(methods.containsKey(id)){
			return methods.get(id);
		}
		return this.superClass().resolveMethod(id);
	}
	
	public Class superClass(){
		return (Class) this.parent();
	}
	
	public void addField(Variable v){
		if(fields.put(v.id(), v) != null){
			throw new DuplicateDeclarationException("Duplicated declarations for " + v.id());
		}
	}

	public void addMethod(Function f){
		unresolvedMethods.add(f);
	}

	@Override
	public boolean isSubType(Type other) {
		return this == other || ((Type) this.parent()).isSubType(other);
	}
}

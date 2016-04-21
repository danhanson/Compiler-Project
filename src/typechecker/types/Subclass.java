package typechecker.types;

import java.util.HashMap;
import java.util.Map;

import typechecker.exceptions.DuplicateDeclarationException;
import typechecker.exceptions.NoSuchTypeException;
import typechecker.functions.Function;
import typechecker.functions.FunctionSignature;
import typechecker.scope.Variable;

public final class Subclass extends Class {

	private final Map<String, Variable> fields;
	private final Map<FunctionSignature, Function> methods; // We might need to deal with covariance somehow

	Subclass(Class parent, String id){
		super(id, parent);
		this.methods = new HashMap<>();
		this.fields = new HashMap<>();
	}

	public void resolveTypes() throws NoSuchTypeException{
		for(Variable f : fields.values()){
			f.resolveType();
		}
		return;
	}

	@Override
	public Type resolveType(String id) throws NoSuchTypeException {
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
		if(methods.put(f.functionSignature(), f) != null){
			throw new DuplicateDeclarationException("Duplicated declarations for " + f.functionSignature());
		}
	}

	@Override
	public boolean isSubType(Type other) {
		return this == other || ((Type) this.parent()).isSubType(other);
	}
}

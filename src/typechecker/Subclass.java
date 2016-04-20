package typechecker;

import java.util.HashMap;
import java.util.Map;

public final class Subclass extends Class {

	private final Map<String, Variable> fields;
	private final Map<Signature, Function> methods; // We might need to deal with covariance somehow

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
	public Function resolveFunction(Signature id) {
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
	public Function resolveMethod(Signature id) {
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
		if(methods.put(f.signature(), f) != null){
			throw new DuplicateDeclarationException("Duplicated declarations for " + f.signature());
		}
	}
}

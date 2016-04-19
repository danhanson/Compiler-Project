package typeChecker;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SubClass extends Class {

	private final Map<String, Variable> fields;
	private final Map<Signature, Function> methods;
	private final Class parent;

	SubClass(Class parent, String id, Collection<Function> methods, Collection<Variable> fields){
		super(parent);
		this.id = id;
		this.parent = parent;
		Map<Signature, Function> methodMap = new HashMap<>();
		for(Function m : methods) {
			methodMap.put(m.signature(), m);
		}
		Map<String, Variable> fieldMap = new HashMap<>();
		for(Variable f : fields) {
			fieldMap.put(f.id, f);
		}
		this.fields = Collections.unmodifiableMap(fieldMap);
		this.methods = Collections.unmodifiableMap(methodMap);
	}

	public final String id;

	public Type asType(){
		return null;
	}

	@Override
	public Type resolveType(String id) {
		if(id == this.id){
			return this.asType();
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
		return this.parent.resolveField(id);
	}

	@Override
	public Function resolveMethod(Signature id) {
		if(methods.containsKey(id)){
			return methods.get(id);
		}
		return this.parent.resolveMethod(id);
	}
}

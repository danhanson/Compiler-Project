package typechecker;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GlobalScope implements Scope {

	private final Map<String, Type> types;

	private GlobalScope(){ 
		types = new HashMap<String, Type>();
		addType(Primitive.INT);
		addType(Primitive.BOOLEAN);
	}
	
	private static final GlobalScope scope = new GlobalScope();

	public static GlobalScope instance(){
		return scope;
	}

	@Override
	public Type resolveType(String id) throws NoSuchTypeException {
		if(types.containsKey(id)){
			return types.get(id);
		}
		throw new NoSuchTypeException(id);
	}

	@Override
	public Variable resolveVariable(String id) {
		return null;
	}

	@Override
	public Function resolveFunction(Signature id) {
		return null;
	}

	public boolean addType(Type c) {
		return types.put(c.id(), c) == null;
	}
	
	public Map<String, Type> getTypes() {
		return Collections.unmodifiableMap(types);
	}
	
	public void checkTypes() throws TypeException{
		for(Type t : types.values()){
			if(t instanceof Class){
				((Class) t).resolveTypes();
			}
		}
	}
}

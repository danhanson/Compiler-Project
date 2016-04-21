package typechecker.scope;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import typechecker.exceptions.NoSuchFunctionException;
import typechecker.exceptions.NoSuchTypeException;
import typechecker.exceptions.NoSuchVariableException;
import typechecker.exceptions.TypeException;
import typechecker.functions.Function;
import typechecker.functions.FunctionSignature;
import typechecker.types.Class;
import typechecker.types.Primitive;
import typechecker.types.Type;

public class GlobalScope implements Scope {

	private final Map<String, Type> types;

	private GlobalScope(){ 
		types = new HashMap<String, Type>();
		for(Primitive p : Primitive.values()){
			addType(p);
		}
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
		throw new NoSuchVariableException(id);
	}

	@Override
	public Function resolveFunction(FunctionSignature id) {
		throw new NoSuchFunctionException(id.id());
	}

	public boolean addType(Type c) {
		return types.put(c.id(), c) == null;
	}
	
	public Map<String, Type> getTypes() {
		return Collections.unmodifiableMap(types);
	}
	
	public void resolveTypes() throws TypeException{
		for(Type t : types.values()){
			if(t instanceof Class){
				((Class) t).resolveTypes();
			}
		}
	}
}

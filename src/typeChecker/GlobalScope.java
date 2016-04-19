package typeChecker;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GlobalScope implements Scope {

	private final Map<String, Class> classes;

	private GlobalScope(){ 
		classes = new HashMap<String, Class>();
	}
	
	private static final GlobalScope scope = new GlobalScope();

	public static GlobalScope instance(){
		return scope;
	}

	@Override
	public Type resolveType(String id) {
		return null;
	}

	@Override
	public Variable resolveVariable(String id) {
		return null;
	}

	@Override
	public Function resolveFunction(Signature id) {
		return null;
	}

	public boolean addClass(Class c) {
		return classes.put(c.id(), c) == null;
	}
	
	public Map<String, Class> getClasses() {
		return Collections.unmodifiableMap(classes);
	}
}

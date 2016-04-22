package typechecker.scope;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import typechecker.functions.MainMethod;
import typechecker.types.Primitive;
import typechecker.types.Subclass;
import typechecker.types.Type;

public class GlobalScope implements Scope {

	private final Map<String, Type> types;
	private MainMethod main;

	private GlobalScope(){ 
		types = new LinkedHashMap<String, Type>();
		for(Primitive p : Primitive.values()){
			addType(p);
		}
	}

	private static final GlobalScope scope = new GlobalScope();

	public static GlobalScope instance(){
		return scope;
	}

	@Override
	public Optional<Type> resolveType(String id) {
		return Optional.ofNullable(types.get(id));
	}

	public boolean addType(Type c) {
		if(types.put(c.id(), c) != null){
			System.err.println("Class named " + c.id() + " already exists.");
			return false;
		}
		return true;
	}

	public Map<String, Type> getTypes() {
		return Collections.unmodifiableMap(types);
	}

	public boolean checkTypes(){
		List<Subclass> classes = types.values().stream().filter(t -> t instanceof Subclass).map(t -> (Subclass) t).collect(Collectors.toList());
		classes.stream().forEach(Subclass::checkMembers);
		classes.stream().forEach(Subclass::checkMethodBodies);
		boolean isGood = classes.stream().allMatch(Subclass::status);
		if(!main.checkTypes()){
			isGood = false;
		}
		return isGood;
	}

	public void setMainMethod(MainMethod b){
		if(main != null){
			throw new IllegalStateException("Two main functions in global scope");
		}
		main = b;
	}

	public MainMethod getMainMethod(){
		return main;
	}
}

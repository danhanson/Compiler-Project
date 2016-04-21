package typechecker.scope;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import typechecker.exceptions.DuplicateDeclarationException;
import typechecker.exceptions.NoSuchTypeException;
import typechecker.functions.Function;
import typechecker.functions.FunctionSignature;
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
	public Optional<Type> resolveType(String id) throws NoSuchTypeException {
		return Optional.ofNullable(types.get(id));
	}

	@Override
	public Optional<Variable> resolveVariable(String id) {
		return Optional.empty();
	}

	@Override
	public Optional<Function> resolveFunction(FunctionSignature id) {
		return Optional.empty();
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
		return classes.stream().filter(Subclass::checkMembers)
				.collect(Collectors.toList())
				.stream().filter(Subclass::membersChecked)
				.filter(Subclass::checkMethodBodies)
				.count() == classes.size();
	}

	public void setMainMethod(MainMethod b){
		if(main != null){
			throw new DuplicateDeclarationException("Two Main Functions");
		}
		main = b;
	}
	
	public MainMethod getMainMethod(){
		return main;
	}
}

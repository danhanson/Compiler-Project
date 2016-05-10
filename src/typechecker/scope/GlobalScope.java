package typechecker.scope;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
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
	private List<Subclass> classes;

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
		classes = types.values().stream().filter(t -> t instanceof Subclass).map(t -> (Subclass) t).collect(Collectors.toList());
		classes.stream().forEach(Subclass::checkMembers);
		classes.stream().forEach(Subclass::checkMethodBodies);
		return classes.stream().allMatch(Subclass::status);
	}

	public void generateCode(){
		classes.forEach(Subclass::generateCode);
	}

	public void writeCode(Path p) throws IOException {
		p.toFile().mkdirs();
		for(Subclass c : classes){
			File f = p.resolve(c.id() + ".class").toFile();
			f.delete();
			f.createNewFile();
			DataOutputStream out = new DataOutputStream(new FileOutputStream(f));
			c.writeBytecode(out);
			out.close();
		}
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

package typechecker.types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import typechecker.functions.Function;
import typechecker.functions.FunctionSignature;
import typechecker.scope.Variable;

public final class Subclass extends Class {

	private final Map<String, Variable> fields = new HashMap<>();
	private final List<Function> methods = new ArrayList<>();
	private final Map<FunctionSignature, Function> resolvedMethods = new HashMap<>();
	private boolean classIsGood = true;

	Subclass(Class parent, String id){
		super(id, parent);
	}

	private boolean addResolvedMethod(Function method){
		if(resolvedMethods.containsKey(method.functionSignature())){
			System.err.println("Cannot redeclare method "+method.functionSignature()+
					". Method "+method.functionSignature()+" is already declared in class "+id()+".");
			return false;
		}
		return ((Class) parent()).resolveMethod(method.functionSignature()).map( superFun -> {
			if(!superFun.returnType().isSubType(method.returnType())){
				System.err.println(
					"Cannot overload methods. Method "+method.id()+" has different type signature than inherited method of the same name. "
					+ "Actual return type "+method.returnType().id()+" of method start does not match declared type "+superFun.returnType().id()
				);
				return false;
			}
			resolvedMethods.put(method.functionSignature(), method);
			return true;
		}).orElseGet(() -> {
			resolvedMethods.put(method.functionSignature(), method);
			return true;
		});
	}

	public boolean checkMembers() {
		boolean ret = true;
		
		// resolve the field types
		for(Variable v : fields.values()){
			if(!v.resolveType()){
				ret = false;
			}
		}

		// resolve method signatures
		for(Function f : methods){
			if(f.resolveSignature()){
				if(!addResolvedMethod(f)){
					ret = false;
				}
			} else {
				ret = false;
			}
		}
		updateStatus(ret);
		return ret;
	}

	public boolean checkMethodBodies(){
		boolean ret = true;

		// resolve method bodies
		for(Function f : methods){
			if(!f.checkTypes()){
				ret = false;
			}
		}
		updateStatus(ret);
		return ret;
	}

	@Override
	public Optional<Type> resolveType(String id) {
		if(id == this.id()){
			return Optional.of(this);
		}
		return super.resolveType(id);
	}

	@Override
	public Optional<Variable> resolveField(String id) {
		Variable local = fields.get(id);
		if(local == null){
			return superClass().resolveField(id);
		}
		return Optional.of(local);
	}

	@Override
	public Optional<Function> resolveMethod(FunctionSignature id) {
		Function local = resolvedMethods.get(id);
		if(local == null){
			return superClass().resolveMethod(id);
		}
		return Optional.of(local);
	}
	
	public Class superClass(){
		return (Class) this.parent();
	}
	
	public boolean addField(Variable v){
		v.setDeclared(true);
		if(superClass().resolveField(v.id()).isPresent()){
			System.err.println("The class variable "+v.id()+" is already declared. Redeclaration and shadowing are not allowed.");
			return false;
		}
		if(fields.put(v.id(), v) != null){
			System.err.println("The class variable "+v.id()+" is already declared. Redeclaration and shadowing fields are not allowed.");
			return false;
		}
		return true;
	}

	public void addMethod(Function f){
		methods.add(f);
	}

	@Override
	public boolean isSubType(Type other) {
		if(this == other || other == Null.instance()){
			return true;
		}
		if(other instanceof Subclass){
			return isSubType(((Subclass) other).superClass());
		}
		return false;
	}

	public boolean status(){
		return classIsGood && superClass().status();
	}

	public void updateStatus(boolean stat){
		if(!stat){
			this.classIsGood = false;
		}
	}
}

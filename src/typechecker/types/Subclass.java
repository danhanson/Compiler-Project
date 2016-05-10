package typechecker.types;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import codegeneration.constants.ConstantPool;
import typechecker.functions.Constructor;
import typechecker.functions.Method;
import typechecker.functions.MethodSignature;
import typechecker.scope.ClassScope;
import typechecker.scope.Variable;

public final class Subclass extends ClassScope implements Class {

	private final Map<String, Variable> fields = new HashMap<>();
	private final List<Method> methods = new ArrayList<>();
	private final Map<MethodSignature, Method> resolvedMethods = new HashMap<>();
	private final String id;
	private final ConstantPool constants = new ConstantPool();
	private final Method constructor = new Constructor(this);
	private final Variable thisInstance;

	private boolean classIsGood = true;

	Subclass(Class parent, String id){
		super(parent);
		this.id = id;
		thisInstance = new Variable(this, "this", this, true);
	}

	private boolean addResolvedMethod(Method method){
		if(resolvedMethods.containsKey(method.methodSignature())){
			System.err.println("Cannot redeclare method "+method.methodSignature()+
					". Method "+method.methodSignature()+" is already declared in class "+id()+".");
			return false;
		}
		return ((Class) parent()).resolveMethod(method.methodSignature()).map( superFun -> {
			if(!superFun.returnType().isSubType(method.returnType())){
				System.err.println(
					"Cannot overload methods. Method "+method.id()+" has different type signature than inherited method of the same name. "
					+ "Actual return type "+method.returnType().id()+" of method start does not match declared type "+superFun.returnType().id()
				);
				return false;
			}
			resolvedMethods.put(method.methodSignature(), method);
			return true;
		}).orElseGet(() -> {
			resolvedMethods.put(method.methodSignature(), method);
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
		for(Method f : methods){
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
		for(Method f : methods){
			if(!f.checkTypes()){
				ret = false;
			}
		}
		updateStatus(ret);
		return ret;
	}

	public Optional<Type> resolveType(String id) {
		if(id == this.id()){
			return Optional.of(this);
		}
		return parent().resolveType(id);
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
	public Optional<Method> resolveMethod(MethodSignature id) {
		Method local = resolvedMethods.get(id);
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

	public void addMethod(Method f){
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
		return classIsGood;
	}

	public final Class thisClass() {
		return this;
	}

	public void updateStatus(boolean stat){
		if(!stat){
			this.classIsGood = false;
		}
	}

	public void generateCode(){
		constants.classRef(this); // this class
		constants.classRef(superClass()); // super class
		constants.name("Code");
		for(Variable v : fields.values()){
			constants.descriptor(v.type());
			constants.name(v.id());
		}
		constants.name(constructor.id());
		constants.descriptor(constructor);
		for(Method m : methods){
			constants.descriptor(m);
			constants.name(m.id());
		}
		constructor.generateCode();
		for(Method m : methods){
			m.generateCode();
		}
	}

	public void writeBytecode(DataOutputStream out) throws IOException {
		out.writeInt(0xCAFEBABE); // magic
		out.writeShort(0); // class version is always 45.0
		out.writeShort(0x34);
		constants.writeConstants(out); // writes constant count and all constants
		out.writeShort(1); // access flag for public
		out.writeShort(constants.classRef(this)); // this class
		out.writeShort(constants.classRef(superClass())); // super class
		out.writeShort(0); // interface count is 0
		out.writeShort(fields.size()); // field count
		for(Variable field : fields.values()) {
			field.writeField(out);
		}
		out.writeShort(methods.size()+1);
		constructor.writeMethod(out);
		for(Method fun : methods) {
			fun.writeMethod(out);
		}
		out.writeShort(0); // no attributes
	}

	@Override
	public String id() {
		return id;
	}

	@Override
	public ConstantPool constantPool() {
		return constants;
	}

	@Override
	public Method constructor() {
		return constructor;
	}

	@Override
	public Variable thisInstance() {
		return thisInstance;
	}

	@Override
	public String binaryName() {
		return id;
	}
}

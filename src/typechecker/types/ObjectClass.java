package typechecker.types;

import java.util.Optional;

import codegeneration.constants.ConstantPool;
import typechecker.functions.Constructor;
import typechecker.functions.Method;
import typechecker.functions.MethodSignature;
import typechecker.scope.ClassScope;
import typechecker.scope.GlobalScope;
import typechecker.scope.Variable;

public final class ObjectClass extends ClassScope implements Type, Class {

	private final Variable instance = new Variable(this, id(), this, true);

	private ObjectClass() {
		super(GlobalScope.instance());
		GlobalScope.instance().addType(this);
	}

	private static final ObjectClass INSTANCE = new ObjectClass();

	public static ObjectClass instance(){
		return INSTANCE;
	}

	@Override
	public Optional<Variable> resolveField(String id) {
		return Optional.empty();
	}

	@Override
	public Optional<Method> resolveMethod(MethodSignature id) {
		return Optional.empty();
	}

	@Override
	public boolean isSubType(Type other) {
		return other == this;
	}

	@Override
	public String id() {
		return "Object";
	}

	@Override
	public Optional<Type> resolveType(String id) {
		return GlobalScope.instance().resolveType(id);
	}

	public String binaryName(){
		return "java/lang/Object";
	}

	private static final Method constructor = new Constructor(ObjectClass.instance());

	@Override
	public Method constructor() {
		return constructor;
	}

	@Override
	public Class thisClass() {
		return instance();
	}

	@Override
	public ConstantPool constantPool() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Variable thisInstance() {
		return instance;
	}
}

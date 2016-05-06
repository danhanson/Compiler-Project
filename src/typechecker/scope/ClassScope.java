package typechecker.scope;

import java.util.Optional;

import codegeneration.constants.ConstantPool;
import typechecker.functions.Method;
import typechecker.functions.MethodSignature;
import typechecker.types.Class;;

public abstract class ClassScope extends AbstractScope {

	public ClassScope(Scope parent) {
		super(parent);
	}

	public abstract Optional<Method> resolveMethod(MethodSignature fs);

	public abstract Optional<Variable> resolveField(String v);

	public abstract Class thisClass();

	public abstract Variable thisInstance();

	public abstract ConstantPool constantPool();
}

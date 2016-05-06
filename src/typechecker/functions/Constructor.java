package typechecker.functions;

import codegeneration.Code;
import codegeneration.Instruction;
import typechecker.scope.ClassScope;
import typechecker.types.Class;
import typechecker.types.Type;

public class Constructor extends Method {

	public Constructor(Type type, ClassScope parent) {
		super("<init>", type, parent);
	}

	public <T extends ClassScope & Type> Constructor(T sub) {
		this(sub, sub);
	}

	@Override
	public Code generateCode(Code code) {
		Method superCons = ((Class) parent()).constructor();
		code.add(Instruction.invokespecial(superCons, constantPool()));
		code.add(Instruction.RETURN);
		return code;
	}
}

package typechecker.functions;

import java.io.DataOutputStream;
import java.io.IOException;

import codegeneration.Instruction;
import codegeneration.constants.ConstantPool;
import typechecker.scope.ClassScope;
import typechecker.types.Subclass;
import typechecker.types.Void;

public class Constructor extends Method {

	public Constructor(ClassScope parent) {
		super("<init>", Void.instance(), parent);
	}

	@Override
	public void generateCode() {
		code.setLocals(1); // receives uninitializedThis
		Method superCons = ((Subclass) parent()).superClass().constructor();
		code.add(Instruction.ALOAD_0); // load uninitializeThis to pass it into super constructor
		code.add(Instruction.invokespecial(superCons, constantPool()));
		code.add(Instruction.RETURN);
	}

	@Override
	public void writeMethod(DataOutputStream out) throws IOException {
		ConstantPool pool = ((ClassScope) parent()).constantPool();
		out.writeShort(1); // public
		out.writeShort(pool.name(id()));
		out.writeShort(pool.descriptor(this));
		out.writeShort(1); // one attribute
		code.writeCode(out, pool);
	}
}

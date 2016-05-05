package codegeneration.constants;

import java.io.DataOutputStream;
import java.io.IOException;

public class MethodInfo extends ConstantInfo {

	final String className;
	final String descriptor;

	public MethodInfo(String className, String descriptor) {
		this.className = className;
		this.descriptor = descriptor;
	}

	@Override
	public Tag tag() {
		return Tag.Method;
	}

	public ClassInfo classInfo(){
		return new ClassInfo(className);
	}

	public Utf8Info descriptor(){
		return new Utf8Info(descriptor);
	}

	@Override
	public void write(DataOutputStream out, ConstantPool constants) throws IOException {
		out.write(tag().value);
		out.writeShort(constants.classInfo(classInfo()));
		out.writeShort(constants.utf8(descriptor()));
	}
}

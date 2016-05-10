package codegeneration.constants;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Objects;

public class MethodInfo extends ConstantInfo {

	final String className;
	final String name;
	final String descriptor;

	public MethodInfo(String className, String name, String descriptor) {
		this.className = className;
		this.name = name;
		this.descriptor = descriptor;
	}

	@Override
	public Tag tag() {
		return Tag.Method;
	}

	public ClassInfo classInfo(){
		return new ClassInfo(className);
	}

	public NameAndTypeInfo nameAndTypeInfo(){
		return new NameAndTypeInfo(name, descriptor);
	}

	@Override
	public void write(DataOutputStream out, ConstantPool constants) throws IOException {
		out.write(tag().value);
		out.writeShort(constants.classInfo(classInfo()));
		out.writeShort(constants.nameAndType(nameAndTypeInfo()));
	}

	@Override
	public int hashCode() {
		return Objects.hash(className, name, descriptor);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MethodInfo){
			MethodInfo o = (MethodInfo) obj;
			return className.equals(o.className) &&
					name.equals(o.name) &&
					descriptor.equals(o.descriptor);
		}
		return false;
	}
}

package codegeneration.constants;

import java.io.DataOutputStream;
import java.io.IOException;

public class ClassInfo extends ConstantInfo {

	final String name;

	ClassInfo(String name){
		this.name = name;
	}

	@Override
	public Tag tag() {
		return Tag.Class;
	}

	@Override
	public int hashCode() {
		return ~name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ClassInfo){
			return name.equals(((ClassInfo) obj).name);
		}
		return false;
	}

	public Utf8Info utf8Info(){
		return new Utf8Info(name);
	}

	@Override
	public void write(DataOutputStream out, ConstantPool constants) throws IOException {
		out.write(tag().value);
		out.writeShort(constants.name(name));
	}
}

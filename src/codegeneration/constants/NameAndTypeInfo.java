package codegeneration.constants;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Objects;

public class NameAndTypeInfo extends ConstantInfo {

	final String name;
	final String type;

	public NameAndTypeInfo(String name, String type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public Tag tag() {
		return Tag.NameAndType;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof NameAndTypeInfo){
			NameAndTypeInfo info = (NameAndTypeInfo) obj;
			return name.equals(info.name) && type.equals(info.type);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, type);
	}

	public Utf8Info nameInfo(){
		return new Utf8Info(name);
	}

	public Utf8Info descriptor(){
		return new Utf8Info(type);
	}

	@Override
	public void write(DataOutputStream out, ConstantPool constants) throws IOException {
		out.write(tag().value);
		out.writeShort(constants.utf8(nameInfo()));
		out.writeShort(constants.utf8(descriptor()));
	}
}

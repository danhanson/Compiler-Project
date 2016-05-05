package codegeneration.constants;

import java.io.DataOutputStream;
import java.io.IOException;

final class IntegerInfo extends ConstantInfo {

	final int value;

	public IntegerInfo(int value) {
		this.value = value;
	}

	@Override
	public Tag tag() {
		return Tag.Integer;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof IntegerInfo){
			return value == ((IntegerInfo) obj).value;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Integer.hashCode(value);
	}

	@Override
	public void write(DataOutputStream out, ConstantPool constants) throws IOException {
		out.write(tag().value);
		out.writeInt(value);
	}
}

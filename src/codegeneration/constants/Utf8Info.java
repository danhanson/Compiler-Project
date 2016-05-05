package codegeneration.constants;

import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

final class Utf8Info extends ConstantInfo {

	final String value;

	public Utf8Info(String value) {
		if(value.length() > Short.MAX_VALUE){
			throw new IllegalArgumentException("NAME: \""+value+"\" is too large, max length is "+Short.MAX_VALUE);
		}
		this.value = value;
	}

	@Override
	public Tag tag() {
		return Tag.Utf8;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Utf8Info){
			return value.equals(((Utf8Info) obj).value);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	@Override
	public void write(DataOutputStream out, ConstantPool constants) throws IOException {
		out.write(tag().value);
		out.writeShort(value.length());
		out.write(value.getBytes(StandardCharsets.UTF_8));
	}
}
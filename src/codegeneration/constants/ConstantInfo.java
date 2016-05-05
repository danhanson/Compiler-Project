package codegeneration.constants;

import java.io.DataOutputStream;
import java.io.IOException;

abstract class ConstantInfo {
	public abstract Tag tag();
	public abstract void write(DataOutputStream out, ConstantPool constants) throws IOException;
}
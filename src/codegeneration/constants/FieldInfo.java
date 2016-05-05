package codegeneration.constants;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Objects;

import typechecker.scope.Variable;

final class FieldInfo extends ConstantInfo {

	final String className;
	final String field;
	final String type;

	FieldInfo(Variable v) {
		this(v.scope().thisClass().id(), v.id(), v.type().descriptor());
	}

	FieldInfo(String name, String field, String type) {
		this.className = name;
		this.field = field;
		this.type = type;
	}

	@Override
	public Tag tag() {
		return Tag.Field;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ClassInfo) {
			FieldInfo ref = (FieldInfo) obj;
			return className.equals(ref.className) && field.equals(ref.field) && type.equals(ref.type);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(className, field, type);
	}

	public ClassInfo classInfo(){
		return new ClassInfo(className);
	}

	public NameAndTypeInfo nameAndTypeInfo(){
		return new NameAndTypeInfo(field, type);
	}

	@Override
	public void write(DataOutputStream out, ConstantPool constants) throws IOException {
		out.write(tag().value);
		out.writeShort(constants.classInfo(classInfo()));
		out.writeShort(constants.nameAndType(nameAndTypeInfo()));
	}
}

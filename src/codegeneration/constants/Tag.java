package codegeneration.constants;

public enum Tag {
	Class(7), Field(9), Method(10), Integer(3), Utf8(1), NameAndType(12);

	public final int value;
	Tag(int value) {
		this.value = value;
	}
}
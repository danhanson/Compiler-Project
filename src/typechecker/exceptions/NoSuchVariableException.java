package typechecker.exceptions;

public class NoSuchVariableException extends TypeException {

	private static final long serialVersionUID = 6567340547736064257L;

	public NoSuchVariableException(String string) {
		super(string);
	}

}

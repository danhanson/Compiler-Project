package typechecker.exceptions;

public class NoSuchFunctionException extends TypeException {

	private static final long serialVersionUID = 1775448451836122402L;

	public NoSuchFunctionException(String string) {
		super(string);
	}

}

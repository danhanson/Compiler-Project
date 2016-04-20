package typechecker.exceptions;

public class DuplicateDeclarationException extends TypeException {

	private static final long serialVersionUID = -7763978450197249321L;

	public DuplicateDeclarationException(String string) {
		super(string);
	}
}

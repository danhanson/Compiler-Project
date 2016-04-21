package parser;

import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Token;

public class MiniJavaErrorStrategy extends DefaultErrorStrategy {

	@Override
	protected void reportNoViableAlternative(Parser arg0, NoViableAltException arg1) {
		Token bad = arg1.getOffendingToken();
		arg0.consume();
		System.err.println(
			"line " + bad.getLine() + ":" + bad.getCharPositionInLine() + " unexpected token '" + arg1.getOffendingToken().getText() + "'"
		);
	}

}

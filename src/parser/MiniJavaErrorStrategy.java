package parser;

import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Token;

public class MiniJavaErrorStrategy extends DefaultErrorStrategy {
	@Override
	protected void reportFailedPredicate(Parser recognizer, FailedPredicateException e) {
		// TODO Auto-generated method stub
		super.reportFailedPredicate(recognizer, e);
	}
	
	@Override
	protected void reportInputMismatch(Parser recognizer, InputMismatchException e) {
		// TODO Auto-generated method stub
		super.reportInputMismatch(recognizer, e);
	}
	
	@Override
	protected void reportMissingToken(Parser recognizer) {
		// TODO Auto-generated method stub
		super.reportMissingToken(recognizer);
	}
	
	@Override
	protected void reportNoViableAlternative(Parser arg0, NoViableAltException arg1) {
		Token bad = arg1.getOffendingToken();
		arg0.consume();
		System.err.println(
			"line " + bad.getLine() + ":" + bad.getCharPositionInLine() + " unexpected token '" + arg1.getOffendingToken().getText() + "'"
		);
	}
	
	@Override
	protected void reportUnwantedToken(Parser recognizer) {
		// TODO Auto-generated method stub
		super.reportUnwantedToken(recognizer);
	}
}

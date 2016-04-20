package typechecker.statements;

import parser.MiniJavaParser.StatementContext;
import typechecker.ExecutionScope;

public class EmptyStatement extends Statement {

	public static EmptyStatement fromStatementContext(StatementContext con, ExecutionScope scope){
		return new EmptyStatement();
	}

	@Override
	public void resolveTypes() {
		// do nothing
	}

}

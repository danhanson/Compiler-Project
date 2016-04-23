package typechecker.statements;

import parser.MiniJavaParser.StatementContext;
import typechecker.scope.ExecutionScope;

public final class EmptyStatement extends Statement {
	
	public static EmptyStatement fromStatementContext(StatementContext con, ExecutionScope scope){
		return new EmptyStatement();
	}

	@Override
	public boolean checkTypes() {
		return true;
	}
}

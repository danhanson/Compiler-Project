package typechecker.statements;

import codegeneration.Code;
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

	@Override
	public Code generateCode(Code insts) {
		return insts;
	}
}

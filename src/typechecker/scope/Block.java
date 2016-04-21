package typechecker.scope;

import parser.MiniJavaParser.BlockContext;
import parser.MiniJavaParser.StatementContext;
import typechecker.functions.Function;
import typechecker.statements.Statement;
import typechecker.types.Type;

public class Block extends ExecutionScope {

	private Block(ExecutionScope parent) {
		super(parent);
	}

	public static Block fromBlockContext(BlockContext block, ExecutionScope parent) {
		Block b = new Block(parent);
		for(StatementContext statement : block.statement()){
			b.addStatement(Statement.fromStatementContext(statement, b));
		}
		return b;
	}

	@Override
	public Type returnType() {
		return ((ExecutionScope) parent()).returnType();
	}

	@Override
	public Type thisType() {
		return ((ExecutionScope) parent()).thisType();
	}

	@Override
	public Function callee() {
		return ((ExecutionScope) parent()).callee();
	}
}

package typechecker.statements;

import parser.MiniJavaParser.BlockStatementContext;
import parser.MiniJavaParser.StatementContext;
import typechecker.Block;
import typechecker.ExecutionScope;

public class BlockStatement extends Statement {
	
	private final Block block;
	
	BlockStatement(Block b){
		this.block = b;
	}

	public static BlockStatement fromStatementContext(StatementContext con, ExecutionScope scope){
		BlockStatementContext bc = (BlockStatementContext) con;
		Block b = Block.fromBlockContext(bc.block(), scope);
		return new BlockStatement(b);
	}
	
	@Override
	public void resolveTypes() {
		block.resolveTypes();
	}

}

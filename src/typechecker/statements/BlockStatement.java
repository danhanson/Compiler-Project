package typechecker.statements;

import codegeneration.Code;
import parser.MiniJavaParser.BlockStatementContext;
import parser.MiniJavaParser.StatementContext;
import typechecker.scope.Block;
import typechecker.scope.ExecutionScope;

public final class BlockStatement extends Statement {
	
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
	public boolean checkTypes() {
		return block.checkTypes();
	}

	@Override
	public Code generateCode(Code insts) {
		Code blockCode = new Code(insts);
		block.generateCode(blockCode);
		insts.addBlock(blockCode);
		return insts;
	}

}

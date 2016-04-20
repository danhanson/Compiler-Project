package typechecker;

import java.util.ArrayList;
import java.util.List;

import parser.MiniJavaParser.BlockContext;
import parser.MiniJavaParser.StatementContext;
import typechecker.statements.Statement;

public class Block extends ExecutionScope {

	private final List<Statement> statements;

	private Block(ExecutionScope parent) {
		super(parent);
		this.statements = new ArrayList<>();
	}

	void addStatement(Statement s){
		statements.add(s);
	}

	@Override
	public void resolveTypes() {
		for(Statement s : statements){
			s.resolveTypes(); // each of these could mutate this block's scope
		}
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
	public Variable thisVar() {
		return ((ExecutionScope) parent()).thisVar();
	}
}

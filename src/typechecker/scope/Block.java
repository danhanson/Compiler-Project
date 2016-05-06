package typechecker.scope;

import java.util.Optional;

import parser.MiniJavaParser.BlockContext;
import parser.MiniJavaParser.StatementContext;
import typechecker.functions.Method;
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
	public Method callee() {
		return ((ExecutionScope) parent()).callee();
	}

	@Override
	public Optional<Variable> resolveField(String v) {
		return ((ExecutionScope) parent()).resolveField(v);
	}


	public Optional<Variable> resolveLocalVariable(String id){
		Variable var = variables.get(id);
		if(var == null){
			return ((ExecutionScope) parent()).resolveLocalVariable(id);
		}
		return Optional.of(var);
	}

	@Override
	public Optional<Variable> resolveVariable(String id){
		Variable var = variables.get(id);
		if(var == null){
			return ((ExecutionScope) parent()).resolveVariable(id);
		}
		return Optional.of(var);
	}
}

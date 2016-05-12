package typechecker.statements;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

import codegeneration.Code;
import parser.MiniJavaParser.AssignmentStatementContext;
import parser.MiniJavaParser.BlockStatementContext;
import parser.MiniJavaParser.DeclarationStatementContext;
import parser.MiniJavaParser.EmptyStatementContext;
import parser.MiniJavaParser.ExpressionStatementContext;
import parser.MiniJavaParser.IfStatementContext;
import parser.MiniJavaParser.PrintStatementContext;
import parser.MiniJavaParser.ReturnStatementContext;
import parser.MiniJavaParser.StatementContext;
import parser.MiniJavaParser.WhileStatementContext;
import typechecker.scope.ExecutionScope;

public abstract class Statement {

	private static final Map<Class<? extends StatementContext>, BiFunction<StatementContext, ExecutionScope, ? extends Statement>> factoryLookup = new HashMap<>();
	
	static {
		factoryLookup.put(DeclarationStatementContext.class, DeclarationStatement::fromStatementContext);
		factoryLookup.put(BlockStatementContext.class, BlockStatement::fromStatementContext);
		factoryLookup.put(IfStatementContext.class, IfStatement::fromStatementContext);
		factoryLookup.put(WhileStatementContext.class, WhileStatement::fromStatementContext);
		factoryLookup.put(PrintStatementContext.class, PrintStatement::fromStatementContext);
		factoryLookup.put(AssignmentStatementContext.class, AssignmentStatement::fromStatementContext);
		factoryLookup.put(ReturnStatementContext.class, ReturnStatement::fromStatementContext);
		factoryLookup.put(EmptyStatementContext.class, EmptyStatement::fromStatementContext);
		factoryLookup.put(ExpressionStatementContext.class, ExpressionStatement::fromStatementContext);
	}

	public static Statement fromStatementContext(StatementContext s, ExecutionScope parent) {
		return factoryLookup.get(s.getClass()).apply(s, parent);
	}

	public abstract boolean checkTypes();

	public abstract Code generateCode(Code insts);
}

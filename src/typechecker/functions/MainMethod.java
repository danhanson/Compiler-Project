package typechecker.functions;

import parser.MiniJavaParser.MainMethodContext;
import parser.MiniJavaParser.StatementContext;
import typechecker.scope.ClassScope;
import typechecker.scope.ExecutionScope;
import typechecker.statements.Statement;
import typechecker.types.Type;
import typechecker.types.Void;

public class MainMethod extends ExecutionScope {
	
	public static MainMethod fromMainMethodContext(MainMethodContext con, ClassScope parent){
		MainMethod m = new MainMethod(parent);
		for(StatementContext s : con.block().statement()){
			m.addStatement(Statement.fromStatementContext(s, m));
		}
		return m;
	}
	
	MainMethod(ClassScope parent) {
		super(parent);
	}

	@Override
	public Type thisType() {
		return ((ClassScope) parent()).thisType();
	}

	@Override
	public Type returnType() {
		return Void.instance();
	}
}

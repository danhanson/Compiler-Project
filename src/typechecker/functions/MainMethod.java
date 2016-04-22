package typechecker.functions;

import parser.MiniJavaParser.MainMethodContext;
import parser.MiniJavaParser.StatementContext;
import typechecker.statements.Statement;
import typechecker.types.Type;
import typechecker.types.Void;
import typechecker.types.Class;

public final class MainMethod extends Function {
	
	public static MainMethod fromMainMethodContext(MainMethodContext con, Class parent){
		MainMethod m = new MainMethod(parent);
		for(StatementContext s : con.block().statement()){
			m.addStatement(Statement.fromStatementContext(s, m));
		}
		return m;
	}

	MainMethod(Class parent) {
		super("main", Void.instance(), parent);
	}

	@Override
	public Type returnType() {
		return Void.instance();
	}
}

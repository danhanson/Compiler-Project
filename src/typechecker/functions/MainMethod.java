package typechecker.functions;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.stream.Collectors;

import codegeneration.constants.ConstantPool;
import parser.MiniJavaParser.MainMethodContext;
import parser.MiniJavaParser.StatementContext;
import typechecker.scope.ClassScope;
import typechecker.scope.Variable;
import typechecker.statements.Statement;
import typechecker.types.Type;
import typechecker.types.Void;

public final class MainMethod extends Function {
	
	public static MainMethod fromMainMethodContext(MainMethodContext con, ClassScope parent){
		MainMethod m = new MainMethod(parent);
		for(StatementContext s : con.block().statement()){
			m.addStatement(Statement.fromStatementContext(s, m));
		}
		return m;
	}

	MainMethod(ClassScope parent) {
		super("main", Void.instance(), parent);
	}

	@Override
	public Type returnType() {
		return Void.instance();
	}

	public void writeMethod(DataOutputStream out) throws IOException {
		ConstantPool pool = ((ClassScope) parent()).constantPool();
		out.writeShort(1); // public
		out.writeShort(pool.name(id()));
		out.writeShort(pool.descriptor(this));
		out.writeShort(1); // one attribute
		//code.writeCode(out, pool);
	}

	public String descriptor() {
		return "(" + 
					args().stream()
							.map(Variable::type)
							.map(Type::descriptor)
							.collect(Collectors.joining()) +
				")" + returnType().descriptor();
	}
}

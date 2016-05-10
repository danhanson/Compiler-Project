package typechecker.functions;

import static codegeneration.Instruction.RETURN;

import java.io.DataOutputStream;
import java.io.IOException;

import codegeneration.constants.ConstantPool;
import parser.MiniJavaParser.MainMethodContext;
import parser.MiniJavaParser.StatementContext;
import typechecker.scope.ClassScope;
import typechecker.statements.Statement;
import typechecker.types.Type;
import typechecker.types.Void;

public final class MainMethod extends Method {
	
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
	public String descriptor(){
		return "([Ljava/lang/String;)V";
	}

	@Override
	public Type returnType() {
		return Void.instance();
	}

	@Override
	public void generateCode() {
		code.setLocals(1);
		for(Statement s : statements()){
			s.generateCode(code);
		}
		code.add(RETURN);
	}

	public void writeMethod(DataOutputStream out) throws IOException {
		ConstantPool pool = ((ClassScope) parent()).constantPool();
		out.writeShort(1 | 8); // public and static
		out.writeShort(pool.name(id()));
		out.writeShort(pool.descriptor(this));
		out.writeShort(1); // one attribute
		code.writeCode(out, pool);
	}
}

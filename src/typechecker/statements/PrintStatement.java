package typechecker.statements;

import codegeneration.Code;
import codegeneration.constants.ConstantPool;
import parser.MiniJavaParser.PrintStatementContext;
import parser.MiniJavaParser.StatementContext;
import typechecker.expressions.Expression;
import typechecker.scope.ExecutionScope;
import typechecker.types.Primitive;
import static codegeneration.Instruction.*;

public final class PrintStatement extends Statement {

	private final Expression exp;

	PrintStatement(Expression exp) {
		this.exp = exp;
	}

	public static PrintStatement fromStatementContext(StatementContext con, ExecutionScope scope){
		PrintStatementContext psc = (PrintStatementContext) con;
		Expression exp = Expression.fromExpressionContext(psc.expression(), scope);
		return new PrintStatement(exp);
	}

	@Override
	public boolean checkTypes() {
		if(exp.checkTypes()){
			if(exp.returnType() != Primitive.Integer){
				System.err.println("System.out.println() requires integer as an argument");
				return false;
			}
			return true;
		}
		return false;
	}

	@Override
	public Code generateCode(Code block) {
		ConstantPool constants = exp.scope().constantPool();
		block.add(getstatic(constants.systemOut()));
		exp.generateCode(block);
		block.add(invokevirtual(constants.println(),1, false));
		return block;
	}
}

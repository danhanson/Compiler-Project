package typechecker.expressions;

import codegeneration.Code;
import codegeneration.Instruction;
import parser.MiniJavaParser.ExpressionContext;
import parser.MiniJavaParser.IdentifierContext;
import typechecker.scope.ExecutionScope;
import typechecker.scope.Variable;
import typechecker.types.Type;

public final class Identifier extends Expression {

	private final String varId;
	private Variable var;
	
	Identifier(String varId, ExecutionScope scope) {
		super(scope);
		this.varId = varId;
	}

	public static Identifier fromExpressionContext(ExpressionContext con, ExecutionScope scope){
		IdentifierContext ic = (IdentifierContext) con;
		String id = ic.ID().getText();
		return new Identifier(id, scope);
	}

	@Override
	public Type returnType() {
		return var.type();
	}

	@Override
	public boolean checkTypes() {
		return scope().resolveVariable(varId).map(v -> {
			var = v;
			return true;
		}).orElseGet(() -> {
			System.err.println("Variable "+varId+" is not declared");
			return false;
		});
	}

	@Override
	public Code generateCode(Code block) {
		if(var.isField()){
			block.add(Instruction.load(scope().thisClass(), block.localVariable(scope().thisInstance())));
			return block.add(Instruction.getfield(var, scope().constantPool()));
		} else {
			return block.add(Instruction.load(var.type(), block.localVariable(var)));
		}
	}
}

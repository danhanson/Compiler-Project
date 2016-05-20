package typechecker.expressions;

import codegeneration.Code;
import codegeneration.Instruction;
import parser.MiniJavaParser.BooleanContext;
import parser.MiniJavaParser.ExpressionContext;
import typechecker.scope.ExecutionScope;
import typechecker.types.Type;
import typechecker.types.Primitive;

public final class BooleanExp extends Expression {

	private final boolean value;

	BooleanExp(ExecutionScope scope, boolean value) {
		super(scope);
		this.value = value;
	}

	public static BooleanExp fromExpressionContext(ExpressionContext con, ExecutionScope scope){
		return new BooleanExp(scope,  ((BooleanContext) con).booleanExp().TRUE() != null);
	}

	@Override
	public Type returnType() {
		return Primitive.Boolean;
	}

	@Override
	public Code generateCode(Code block) {
		if(value){
			block.add(Instruction.iconst_1);
		} else {
			block.add(Instruction.iconst_0);
		}
		return block;
	}

}

package typechecker.expressions;

import parser.MiniJavaParser.ExpressionContext;
import parser.MiniJavaParser.IntegerContext;
import typechecker.scope.ExecutionScope;
import typechecker.types.Primitive;
import typechecker.types.Type;
import static codegeneration.Instruction.*;

import codegeneration.Code;

public final class IntegerExp extends Expression {

	private final int value;

	IntegerExp(ExecutionScope scope, int value) {
		super(scope);
		this.value = value;
	}

	public static IntegerExp fromExpressionContext(ExpressionContext con, ExecutionScope scope){
		return new IntegerExp(scope, Integer.decode(((IntegerContext) con).INTEGER().getText()));
	}

	@Override
	public Type returnType() {
		return Primitive.Integer;
	}

	@Override
	public Code generateCode(Code insts){
		switch(value) {
		case -1: insts.add(iconst_m1); break;
		case 0: insts.add(iconst_0); break;
		case 1: insts.add(iconst_1); break;
		case 2: insts.add(iconst_2); break;
		case 3: insts.add(iconst_3); break;
		case 4: insts.add(iconst_4); break;
		case 5: insts.add(iconst_5); break;
		default:
			if(value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE){
				insts.add(bipush((byte) value));
			} else if(value >= Short.MIN_VALUE && value <= Short.MAX_VALUE){
				insts.add(sipush((short) value));
			} else {
				int ref = scope().constantPool().integer(value);
				if(ref <= Byte.MAX_VALUE){
					insts.add(ldc((byte) value));
				} else {
					insts.add(ldc_w((short) value));
				}
			}
			break;
		}
		return insts;
	}
}

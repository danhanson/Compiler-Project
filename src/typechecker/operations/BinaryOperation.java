package typechecker.operations;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import codegeneration.Code;
import codegeneration.Instruction;
import typechecker.types.ObjectClass;
import typechecker.types.Primitive;
import typechecker.types.Type;
import typechecker.expressions.Expression;
import typechecker.types.Class;
import static codegeneration.Instruction.*;

public enum BinaryOperation {
	DIV("/", Primitive.Integer, Primitive.Integer, Primitive.Integer),
	MULT("*", Primitive.Integer, Primitive.Integer, Primitive.Integer),
	ADD("+", Primitive.Integer, Primitive.Integer, Primitive.Integer),
	SUB("-", Primitive.Integer, Primitive.Integer, Primitive.Integer),
	LT("<", Primitive.Integer, Primitive.Integer, Primitive.Boolean),
	GT(">", Primitive.Integer, Primitive.Integer, Primitive.Boolean),
	LTE("<=", Primitive.Integer, Primitive.Integer, Primitive.Boolean),
	GTE(">=", Primitive.Integer, Primitive.Integer, Primitive.Boolean),
	IntEQ("==", Primitive.Integer, Primitive.Integer, Primitive.Boolean),
	BoolEQ("==", Primitive.Boolean, Primitive.Boolean, Primitive.Boolean),
	ObjEQ("==", ObjectClass.instance(), ObjectClass.instance(), Primitive.Boolean),
	IntNEQ("!=", Primitive.Integer, Primitive.Integer, Primitive.Boolean),
	BoolNEQ("!=", Primitive.Boolean, Primitive.Boolean, Primitive.Boolean),
	ObjNEQ("!=", ObjectClass.instance(), ObjectClass.instance(), Primitive.Boolean),
	AND("&&", Primitive.Boolean, Primitive.Boolean, Primitive.Boolean),
	OR("||", Primitive.Boolean, Primitive.Boolean, Primitive.Boolean);

	private static final Map<Signature, BinaryOperation> ops = new HashMap<>();
	private static final Type OBJECT = ObjectClass.instance();
	
	static {
		for(BinaryOperation op : BinaryOperation.values()){
			ops.put(op.signature, op);
		}
	}

	public static BinaryOperation get(String symbol, Type t1, Type t2){
		if(t1 instanceof Class){
			t1 = OBJECT;
		}
		if(t2 instanceof Class){
			t2 = OBJECT;
		}
		BinaryOperation op = ops.get(new Signature(symbol, t1, t2));
		if(op == null){
		    System.err.println("Operator " + symbol + " does not exist for types " + t1.id() + " and " + t2.id());
		}
		return op;
	}

	private final Signature signature;
	private final Type returnType;
	
	BinaryOperation(String symbol, Type t1, Type t2, Type ret){
		this.signature = new Signature(symbol, t1, t2);
		returnType = ret;
	}

	public static class Signature {
		public final String symbol;
		public final Type type1;
		public final Type type2;
		public Signature(String symbol, Type type1, Type type2){
			this.symbol = symbol;
			this.type1 = type1;
			this.type2 = type2;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(symbol, type1, type2);
		}
	
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Signature){
				Signature other = (Signature) obj;
				return this.symbol.equals(other.symbol) &&
						this.type1.equals(other.type1) &&
						this.type2.equals(other.type2);
			}
			return false;
		}
	}

	public Type returnType(){
		return returnType;		
	}

	public Code generateCode(Code c, Expression arg1, Expression arg2) {
		switch(this){
		case DIV:
		case MULT:
		case ADD:
		case SUB:
		case LT:
		case GT:
		case LTE:
		case GTE:
		case IntEQ:
		case BoolEQ:
		case ObjEQ:
		case IntNEQ:
		case BoolNEQ:
		case ObjNEQ:
			arg1.generateCode(c);
			arg2.generateCode(c);
			switch(this){
			case DIV: c.add(IDIV); return c;
			case MULT: c.add(IMUL); return c;
			case ADD: c.add(IADD); return c;
			case SUB: c.add(ISUB); return c;
			default:
				Instruction cmp;
				switch(this){
				case LT: cmp = if_icmplt(7); break;
				case GT: cmp = if_icmpgt(7); break;
				case LTE: cmp = if_icmple(7); break;
				case GTE: cmp = if_icmpgt(7); break;
				case IntEQ: cmp = if_icmpeq(7); break;
				case BoolEQ: cmp = if_icmpeq(7); break;
				case ObjEQ: cmp = if_acmpeq(7); break;
				case IntNEQ: cmp = if_icmpne(7); break;
				case BoolNEQ: cmp = if_icmpne(7); break;
				case ObjNEQ: cmp = if_acmpne(7); break;
				default: throw new IllegalStateException("BAD SWITCH STATEMENT");
				}
				c.add(cmp);
				c.add(iconst_0); // false
				c.add(gotoInst(4)); // skip setting to true
				c.add(iconst_1); // true
				return c;
			}
		default: // AND and OR
			arg1.generateCode(c); // puts true or false on stack
			Code rest = new Code(c);
			arg2.generateCode(rest);
			rest.add(gotoInst(2)); // to jump over iconst if no short ciruiting occurs
			switch(this) {
			case AND:
				c.add(IAND);
				c.add(ifeq(rest.getSize()+1)); // if false, skip rest to short circuit
				c.addBlock(rest); // this puts a boolean value on the stack and jumps over the next instruction
				c.add(iconst_0);
				break;
			case OR:
				c.add(IOR);
				c.add(ifne(rest.getSize()+1)); // if true, skip rest to short circuit;
				c.addBlock(rest);
				c.add(iconst_1);
				break;
			default: throw new IllegalStateException("BAD SWITCH STATEMENT");	
			}
			return c;
		}
	}
}

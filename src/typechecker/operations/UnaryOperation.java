package typechecker.operations;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import codegeneration.Code;
import codegeneration.Instruction;
import typechecker.expressions.Expression;
import typechecker.types.Primitive;
import typechecker.types.Type;

public enum UnaryOperation {
	Not("!", Primitive.Boolean, Primitive.Boolean),
	Negate("-", Primitive.Integer, Primitive.Integer);

	private static final Map<Signature, UnaryOperation> ops = new HashMap<>();
	
	static {
		for(UnaryOperation op : UnaryOperation.values()){
			ops.put(op.signature, op);
		}
	}

	public static class Signature {
		public final String symbol;
		public final Type type;
		public Signature(String symbol, Type type){
			this.symbol = symbol;
			this.type = type;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(symbol, type);
		}
	
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Signature){
				Signature other = (Signature) obj;
				return this.symbol.equals(other.symbol) && this.type.equals(other.type);
			}
			return false;
		}
	}

	public static UnaryOperation get(String symbol, Type type){
		UnaryOperation res = ops.get(new Signature(symbol, type));
		if(res == null) {
		    System.err.println("Operator " + symbol + " does not exist for type " + type.id());
		}
		return res;
	}

	private final Type returnType;
	private final Signature signature;

	UnaryOperation(String symbol, Type arg, Type returnType){
		this.signature = new Signature(symbol, arg);
		this.returnType = returnType;
	}

	public Type returnType(){
		return returnType;
	}

	public Code generateCode(Code c, Expression exp) {
		exp.generateCode(c);
		switch(this) {
		case Not:
			c.add(Instruction.iconst_1);
			c.add(Instruction.IXOR);
			return c;
		case Negate:
			c.add(Instruction.INEG);
			return c;
		default:
			throw new IllegalStateException("BAD SWITCH STATEMENT");
		}
	}
}

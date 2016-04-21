package typechecker.operations;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import typechecker.exceptions.NoSuchOperationException;
import typechecker.types.ObjectClass;
import typechecker.types.Primitive;
import typechecker.types.Type;

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
		if(t1.isSubTypeOf(OBJECT)){
			t1 = OBJECT;
		}
		if(t2.isSubTypeOf(OBJECT)){
			t2 = OBJECT;
		}
		BinaryOperation op = ops.get(new Signature(symbol, t1, t2));
		if(op == null){
			throw new NoSuchOperationException("No Operation");
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
}

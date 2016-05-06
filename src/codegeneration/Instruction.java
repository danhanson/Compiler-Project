package codegeneration;

import java.nio.ByteBuffer;

import codegeneration.constants.ConstantPool;
import typechecker.functions.Method;
import typechecker.scope.Variable;
import typechecker.types.Primitive;
import typechecker.types.Type;
import typechecker.types.Void;
import typechecker.types.Class;

public class Instruction {

	protected final String mem;
	protected final byte[] bytes;
	protected final int stackAmt;

	public static final Instruction iconst_m1 = new Instruction("iconst_m1", 0x02, 1);

	public static final Instruction iconst_0 = new Instruction("iconst_0", 0x03, 1);

	public static final Instruction iconst_1 = new Instruction("iconst_1", 0x04, 1);

	public static final Instruction iconst_2 = new Instruction("iconst_2", 0x05, 1);

	public static final Instruction iconst_3 = new Instruction("iconst_3", 0x06, 1);

	public static final Instruction iconst_4 = new Instruction("iconst_4", 0x07, 1);

	public static final Instruction iconst_5 = new Instruction("iconst_5", 0x08, 1);

	static Instruction byteInstruction(String mem, int opcode, int b, int stack){
		byte[] bytes = ByteBuffer.allocate(2*Byte.BYTES).put((byte) opcode).put((byte) b).array();
		return new Instruction(mem, bytes, stack);
	}

	static Instruction shortInstruction(String mem, int opcode, int s, int stack){
		byte[] bytes = ByteBuffer.allocate(Byte.BYTES + Short.BYTES).put((byte) opcode).putShort((short) s).array();
		return new Instruction(mem, bytes, stack);
	}

	public static Instruction bipush(int b){
		byte[] bytes = new byte[2];
		bytes[0] = 0x10;
		bytes[1] = (byte) b;
		return new Instruction("bipush", bytes, 1);
	}

	public static Instruction sipush(int s) {
		return shortInstruction("sipush", 0x11, s, 1);
	}

	public static Instruction ldc(int b) {
		return byteInstruction("ldc", 0x12, b, 1);
	}

	public static Instruction ldc_w(int s) {
		return shortInstruction("ldc_w", 0x13, s, 1);
	}

	public static Instruction getstatic(int ref) {
		return shortInstruction("getstatic", 0xb2, ref, 1);
	}

	public static Instruction invokevirtual(int ref, int argsLen, boolean notVoid) {
		return shortInstruction("invokevirtual", 0xb6, ref, argsLen - (notVoid ? 1 : 0));
	}

	public static Instruction invokevirtual(Method f, ConstantPool pool) {
		return invokevirtual(pool.method(f), 1 + f.args().size(), !Void.instance().equals(f.returnType()));
	}

	public static Instruction invokespecial(int ref, int argsLen, boolean notVoid) {
		return shortInstruction("invokespecial", 0xb7, ref, argsLen - (notVoid ? 1 : 0));
	}

	public static Instruction invokespecial(Method f, ConstantPool pool) {
		return invokevirtual(pool.method(f), 1 + f.args().size(), !Void.instance().equals(f.returnType()));
	}

	Instruction(String mem, byte[] bytes, int stack){
		this.stackAmt = stack;
		this.mem = mem;
		this.bytes = bytes;
	}

	Instruction(String mem, int opcode, int stack){
		this.stackAmt = stack;
		this.mem = mem;
		this.bytes = ByteBuffer.allocate(Byte.BYTES).put((byte)opcode).array();
	}

	public String mnemonic(){
		return mem;
	}

	public byte[] bytes() {
		return bytes;
	}

	@Override
	public String toString() {
		return mem;
	}

	public int stackAmount() {
		return stackAmt;
	}

	public final static Instruction ILOAD_0 = new Instruction("iload_0", 0x1a, 1);
	public final static Instruction ILOAD_1 = new Instruction("iload_1", 0x1b, 1);
	public final static Instruction ILOAD_2 = new Instruction("iload_2", 0x1c, 1);
	public final static Instruction ILOAD_3 = new Instruction("iload_3", 0x1d, 1);

	public static Instruction iload(int index){
		switch(index){
		case 0: return ILOAD_0;
		case 1: return ILOAD_1;
		case 2: return ILOAD_2;
		case 3: return ILOAD_3;
		default:
				return byteInstruction("iload", 0x15, index, 1);
		}
	}

	public final static Instruction ALOAD_0 = new Instruction("aload_0", 0x2a, 1);
	public final static Instruction ALOAD_1 = new Instruction("aload_1", 0x2b, 1);
	public final static Instruction ALOAD_2 = new Instruction("aload_2", 0x2c, 1);
	public final static Instruction ALOAD_3 = new Instruction("aload_3", 0x2d, 1);

	public static Instruction aload(int index){
		switch(index){
		case 0: return ALOAD_0;
		case 1: return ALOAD_1;
		case 2: return ALOAD_2;
		case 3: return ALOAD_3;
		default:
				return byteInstruction("aload", 0x19, index, 1);
		}
	}

	public static Instruction load(Type t, int index){
		if(t instanceof Primitive){
			return iload(index);
		}
		return aload(index);
	}

	public final static Instruction ISTORE_0 = new Instruction("istore_0", 0x3b, -1);
	public final static Instruction ISTORE_1 = new Instruction("istore_1", 0x3c, -1);
	public final static Instruction ISTORE_2 = new Instruction("istore_2", 0x3d, -1);
	public final static Instruction ISTORE_3 = new Instruction("istore_3", 0x3e, -1);

	public static Instruction istore(int index) {
		switch(index){
		case 0: return ISTORE_0;
		case 1: return ISTORE_1;
		case 2: return ISTORE_2;
		case 3: return ISTORE_3;
		default:
			return byteInstruction("istore", 0x36, index, -1);
		}
	}

	public final static Instruction ASTORE_0 = new Instruction("astore_0", 0x4b, -1);
	public final static Instruction ASTORE_1 = new Instruction("astore_0", 0x4c, -1);
	public final static Instruction ASTORE_2 = new Instruction("astore_0", 0x4d, -1);
	public final static Instruction ASTORE_3 = new Instruction("astore_0", 0x4e, -1);

	public static Instruction astore(int index) {
		switch(index){
		case 0: return ASTORE_0;
		case 1: return ASTORE_1;
		case 2: return ASTORE_2;
		case 3: return ASTORE_3;
		default:
			byte[] bytes = ByteBuffer.allocate(Byte.BYTES * 2).put((byte) 0x3a).put((byte) index).array();
			return new Instruction("astore", bytes, -1);
		}
	}

	public static Instruction store(Type t, int index) {
		if(t instanceof Primitive){
			return istore(index);
		}
		return astore(index);
	}

	public static Instruction POP = new Instruction("pop", 0x57, -1);

	public static final Instruction IXOR = new Instruction("ixor", 0x82, -1);


	public static Instruction ifeq(int offset){
		return shortInstruction("ifeq", 0x99, offset, -1);
	}

	public static Instruction ifne(int offset){
		return shortInstruction("ifne", 0x9a, offset, -1);
	}

	public static Instruction gotoInst(int offset){
		return shortInstruction("goto", 0xa7, offset, 0);
	}

	public final static Instruction IADD = new Instruction("iadd", 0x60, -1);
	public final static Instruction ISUB = new Instruction("isub", 0x64, -1);
	public final static Instruction IMUL = new Instruction("imul", 0x68, -1);
	public final static Instruction IDIV = new Instruction("idiv", 0x6c, -1);
	public final static Instruction INEG = new Instruction("ineg", 0x74, 0);
	public final static Instruction IAND = new Instruction("iand", 0x7e, -1);
	public final static Instruction IOR = new Instruction("ior", 0x80, -1);

	public static Instruction if_icmpeq(int offset) {
		return shortInstruction("if_icmpeq", 0x9f, offset, -2);
	}
	public static Instruction if_icmpne(int offset) {
		return shortInstruction("if_icmpne", 0xa0, offset, -2);
	}
	public static Instruction if_icmplt(int offset) {
		return shortInstruction("if_icmplt", 0xa1, offset, -2);
	}
	public static Instruction if_icmpge(int offset) {
		return shortInstruction("if_icmpge", 0xa2, offset, -2);
	}
	public static Instruction if_icmpgt(int offset) {
		return shortInstruction("if_icmpgt", 0xa3, offset, -2);
	}
	public static Instruction if_icmple(int offset) {
		return shortInstruction("if_icmple", 0xa4, offset, -2);
	}
	public static Instruction if_acmpeq(int offset) {
		return shortInstruction("if_acmpeq", 0xa5, offset, -2);
	}
	public static Instruction if_acmpne(int offset) {
		return shortInstruction("if_acmpne", 0xa6, offset, -2);
	}

	public static final Instruction RETURN = new Instruction("return", 0xb1, 0);
	public static final Instruction IRETURN = new Instruction("ireturn", 0xac, -1);
	public static final Instruction ARETURN = new Instruction("areturn", 0xb0, -1);

	public static Instruction returnInst(Type t){
		if(Void.instance().equals(t)){
			return RETURN;
		}
		if(t instanceof Primitive){
			return IRETURN;
		}
		return ARETURN;
	}

	public static Instruction getfield(int index) {
		return shortInstruction("getfield", 0xb4, index, 1);
	}

	public static Instruction getfield(Variable var, ConstantPool pool) {
		return getfield(pool.field(var));
	}

	public static Instruction newObj(int index) {
		return shortInstruction("new", 0xbb, index, 1);
	}

	public static Instruction newObj(Class c, ConstantPool pool){
		return newObj(pool.classRef(c));
	}
}

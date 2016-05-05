package codegeneration;

import java.nio.ByteBuffer;

import codegeneration.constants.ConstantPool;
import typechecker.functions.Function;
import typechecker.types.Primitive;
import typechecker.types.Type;
import typechecker.types.Void;

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

	public static Instruction invokevirtual(Function f, ConstantPool pool) {
		return invokevirtual(pool.method(f), f.args().size(), !Void.instance().equals(f.returnType()));
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

	public static Instruction ISTORE_0 = new Instruction("istore_0", 0x3b, -1);
	public static Instruction ISTORE_1 = new Instruction("istore_1", 0x3c, -1);
	public static Instruction ISTORE_2 = new Instruction("istore_2", 0x3d, -1);
	public static Instruction ISTORE_3 = new Instruction("istore_3", 0x3e, -1);

	public static Instruction istore(int index) {
		switch(index){
		case 0: return ISTORE_0;
		case 1: return ISTORE_1;
		case 2: return ISTORE_2;
		case 3: return ISTORE_3;
		default:
			byte[] bytes = ByteBuffer.allocate(Byte.BYTES * 2).put((byte) 0x36).put((byte) index).array();
			return new Instruction("istore", bytes, -1);
		}
	}

	public static Instruction ASTORE_0 = new Instruction("astore_0", 0x4b, -1);
	public static Instruction ASTORE_1 = new Instruction("astore_0", 0x4c, -1);
	public static Instruction ASTORE_2 = new Instruction("astore_0", 0x4d, -1);
	public static Instruction ASTORE_3 = new Instruction("astore_0", 0x4e, -1);

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

	public static Instruction ifeq(int offset){
		return shortInstruction("ifeq", 0x99, offset, -1);
	}

	public static Instruction gotoI(int offset){
		return shortInstruction("goto", 0xa7, offset, 0);
	}
}

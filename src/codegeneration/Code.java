package codegeneration;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import codegeneration.constants.ConstantPool;
import typechecker.expressions.Expression;
import typechecker.scope.Variable;

public class Code {
	private int size = 0;
	private int stack = 0;
	private int maxStack = 0;
	private int maxLocals = 0;
	private Map<Variable, Integer> localVariables;
	private List<Instruction> instructions;

	public Code() {
		localVariables = new HashMap<Variable, Integer>();
	}

	public Code(Code parent){
		localVariables = new HashMap<>(parent.localVariables);
	}

	public Code add(Instruction inst){
		size += inst.bytes.length;
		stack += inst.stackAmt;
		instructions.add(inst);
		if(stack > maxStack){
			maxStack = stack;
		}
		return this;
	}

	public int localVariable(Variable var) {
		return localVariables.computeIfAbsent(var,v -> { maxLocals++; return localVariables.size(); });
	}

	public int getMaxStack() {
		return stack;
	}

	public List<Instruction> getInstructions() {
		return instructions;
	}
	
	public int getSize() {
		return size;
	}

	public int localVariableCount() {
		return localVariables.size();
	}

	public void addBlock(Code block) {
		instructions.addAll(block.instructions);
		stack += block.stack;
		if(stack > maxStack){
			maxStack = stack;
		}
		size += block.size;
		maxLocals += block.maxLocals;
	}

	public void addIfElse(Expression condition, Code ifBranch, Code elseBranch){
		condition.generateCode(this);
		add(Instruction.ifeq(ifBranch.size+1)); // if condition is equal to 0, skip the if block
		ifBranch.add(Instruction.gotoInst(elseBranch.getSize())); // skip else block after finishing if block
		stack += (ifBranch.stack > elseBranch.stack) ? ifBranch.stack : elseBranch.stack;
		if(stack > maxStack){
			maxStack = stack;
		}
		maxLocals += (ifBranch.maxLocals > elseBranch.maxLocals) ? ifBranch.maxLocals : elseBranch.maxLocals;
		size += ifBranch.size + elseBranch.size;
		instructions.addAll(ifBranch.instructions);
		instructions.addAll(elseBranch.instructions);
	}

	public void addIf(Expression condition, Code ifBranch) {
		condition.generateCode(this);
		add(Instruction.ifeq(ifBranch.size+1));
		addBlock(ifBranch);
	}

	public void writeCode(DataOutputStream out, ConstantPool pool) throws IOException {
		out.writeShort(pool.name("Code"));
		out.writeInt(12 + size); // attribute length
		out.writeShort(maxStack);
		out.writeShort(maxLocals);
		out.writeInt(size);
		for(Instruction inst : instructions){
			out.write(inst.bytes);
		}
		out.writeShort(0);
		out.writeShort(0);
	}

	public void setStack(int i){
		stack = i;
		if(i > maxStack){
			maxStack = i;
		}
	}
}

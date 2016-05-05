package codegeneration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import typechecker.expressions.Expression;
import typechecker.scope.Variable;

public class Code {
	private int size = 0;
	private int stack = 0;
	private int localArgs = 0;
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
		return this;
	}

	public int localVariable(Variable var) {
		return localVariables.computeIfAbsent(var,v -> { localArgs++; return localVariables.size(); });
	}

	public int getStack() {
		return stack;
	}
	
	public void setStack(int stack) {
		this.stack = stack;
	}

	public List<Instruction> getInstructions() {
		return instructions;
	}

	public void setInstructions(List<Instruction> instructions) {
		this.instructions = instructions;
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
		size += block.size;
		localArgs += block.localArgs;
	}

	public void addIfElse(Expression condition, Code ifBranch, Code elseBranch){
		condition.generateCode(this);
		int offset = ifBranch.getSize();
		add(Instruction.ifeq(offset)); // if condition is equal to 0, skip the if block
		ifBranch.add(Instruction.gotoI(elseBranch.getSize())); // skip else block after finishing if block
		stack += (ifBranch.stack > elseBranch.stack) ? ifBranch.stack : elseBranch.stack;
		localArgs += (ifBranch.localArgs > elseBranch.localArgs) ? ifBranch.localArgs : elseBranch.localArgs;
		size += ifBranch.size + elseBranch.size;
		instructions.addAll(ifBranch.instructions);
		instructions.addAll(elseBranch.instructions);
	}

	public void addIf(Expression condition, Code ifBranch) {
		condition.generateCode(this);
		add(Instruction.ifeq(ifBranch.size));
		addBlock(ifBranch);
	}
}

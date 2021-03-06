package typechecker.statements;

import java.util.Optional;

import codegeneration.Code;
import codegeneration.Instruction;
import parser.MiniJavaParser.AssignmentStatementContext;
import parser.MiniJavaParser.StatementContext;
import typechecker.expressions.Expression;
import typechecker.scope.ExecutionScope;
import typechecker.scope.Variable;

public final class AssignmentStatement extends Statement {

	private Variable assignee;
	private final String assigneeId;
	private final Expression exp;
	
	AssignmentStatement(String assigneeId, Expression exp) {
		this.assigneeId = assigneeId;
		this.exp = exp;
	}

	public static AssignmentStatement fromStatementContext(StatementContext con, ExecutionScope scope){
		AssignmentStatementContext asc = (AssignmentStatementContext) con;
		String varId = asc.ID().getText();
		Expression exp = Expression.fromExpressionContext(asc.expression(), scope);
		return new AssignmentStatement(varId, exp);
	}

	@Override
	public boolean checkTypes(){
		boolean isGood = true;
		Optional<Variable> opt = exp.scope().resolveVariable(assigneeId);
		if(opt.isPresent()){
			assignee = opt.get();
		} else {
			System.err.println("No variable named "+assigneeId+" exists in the current scope.");
			isGood = false;
		}
		if(!exp.checkTypes()){
			isGood = false;
		} else if(isGood){
			if(!assignee.type().isSubType(exp.returnType())){
				System.err.println("Cannot assign type "+exp.returnType().id()+" to variable "+assignee.id()+" of type "+assignee.typeId());
				return false;
			}
			return true;
		} else { // this statement could have intended to be a bad declaration
			Variable v = new Variable(exp.returnType(), assigneeId, exp.scope(), false);
			exp.scope().addVariable(v);
		}
		return false;
	}

	public Variable assignee(){
		return assignee;
	}

	@Override
	public Code generateCode(Code insts) {
		if(assignee.isField()){
			Variable thisInstance = exp.scope().thisInstance();
			insts.add(Instruction.load(thisInstance.type(), insts.localVariable(thisInstance)));
			exp.generateCode(insts);
			return insts.add(Instruction.putfield(exp.scope().constantPool().field(assignee)));
		}
		exp.generateCode(insts);
		return insts.add(Instruction.store(assignee.type(), insts.localVariable(assignee)));
	}
}

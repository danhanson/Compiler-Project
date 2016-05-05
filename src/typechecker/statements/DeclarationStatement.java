package typechecker.statements;

import codegeneration.Code;
import codegeneration.Instruction;
import parser.MiniJavaParser.DeclarationStatementContext;
import parser.MiniJavaParser.StatementContext;
import typechecker.expressions.Expression;
import typechecker.scope.ExecutionScope;
import typechecker.scope.Variable;

public final class DeclarationStatement extends Statement {

	private final ExecutionScope scope;
	private final Variable variable;
	private final Expression exp;
	
	DeclarationStatement(ExecutionScope scope, Variable var, Expression exp){
		this.scope = scope;
		this.variable = var;
		this.exp = exp;
	}
	
	public static DeclarationStatement fromStatementContext(StatementContext con, ExecutionScope scope){
		DeclarationStatementContext ds = (DeclarationStatementContext) con;
		Variable v = Variable.fromDeclarationContext(ds.declaration(), scope, true);
		Expression exp;
		if(ds.expression() != null){
			exp = Expression.fromExpressionContext(ds.expression(), scope);
		} else {
			exp = null;
		}
		return new DeclarationStatement(scope, v, exp);
	}

	@Override
	public boolean checkTypes() {
		if(!scope.addVariable(variable)){
			return false;
		}
		if(!variable.resolveType()){
			if(exp.checkTypes()){
				if(!variable.typeId().equals(exp.returnType().id())){
					System.err.println("Cannot assign type "+exp.returnType().id()+" to variable "+variable.id()+" of type "+variable.typeId());
				}
			}
			return false;
		}
		if(exp != null){
			if(!exp.checkTypes()){
				return false;
			}
			if(!variable.type().isSubType(exp.returnType())){
				System.err.println("Cannot assign type "+exp.returnType().id()+" to variable "+variable.id()+" of type "+variable.typeId());
				return false;
			}
		}
		return true;
	}

	@Override
	public Code generateCode(Code insts) {
		if(exp != null){
			exp.generateCode(insts);
			insts.add(Instruction.store(variable.type(), insts.localVariable(variable)));
		} else {
			insts.localVariable(variable); // just add the variable to local scope
		}
		return insts;
	}

}

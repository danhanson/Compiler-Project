package typechecker.types;

import java.util.Optional;

import parser.MiniJavaParser.ClassDeclContext;
import parser.MiniJavaParser.MainMethodContext;
import parser.MiniJavaParser.MemberContext;
import parser.MiniJavaParser.NormalMethodContext;
import typechecker.functions.Function;
import typechecker.functions.FunctionSignature;
import typechecker.functions.MainMethod;
import typechecker.scope.GlobalScope;
import typechecker.scope.Scope;
import typechecker.scope.Variable;

public interface Class extends Scope, Type {
	
	public static Class fromClassDecl(ClassDeclContext con, Scope scope) {
		String id = con.ID().getText();
		Class superClass;
		boolean isGood;
		if(con.inherits() == null){
			superClass = ObjectClass.instance();
			isGood = true;
		} else {
			isGood = false;
			String superId = con.inherits().ID().getText();
			Optional<Type> opt = scope.resolveType(superId);
			if(opt.isPresent()){
				Type t = opt.get();
				if(t instanceof Class) {
					isGood = true;
					superClass = (Class) t;
				} else {
					System.err.println("type: " + t.id() + " is not a class");
					superClass = ObjectClass.instance();
				}
			} else {
				System.err.println("Superclass name "+superId+" not in scope");
				superClass = ObjectClass.instance();
			}
		}
		Subclass newClass = new Subclass(superClass, id);
		newClass.updateStatus(isGood);
		for(MemberContext mem : con.classBody().member()){
			if(mem.method() != null){
				if(mem.method() instanceof NormalMethodContext){
					NormalMethodContext method = (NormalMethodContext) mem.method();
					try {
						newClass.addMethod(Function.fromMethodContext(method, newClass));
					} catch(IllegalArgumentException e){
						newClass.updateStatus(false);
					}
				} else {
					MainMethodContext mmc = (MainMethodContext) mem.method();
					MainMethod main = MainMethod.fromMainMethodContext(mmc, newClass);
					GlobalScope.instance().setMainMethod(main);
				}
			} else if(mem.field() != null){
				if(!newClass.addField(Variable.fromDeclarationContext(mem.field().declaration(), newClass, true))){
					newClass.updateStatus(false);
				}
			} else {
				throw new IllegalArgumentException("What happened?");
			}
		}
		return newClass;
	}

	String id();

	abstract Optional<Variable> resolveField(String id);

	abstract Optional<Function> resolveMethod(FunctionSignature id);

	@Override
	default String descriptor() {
		return "L"+id()+";";
	}
}

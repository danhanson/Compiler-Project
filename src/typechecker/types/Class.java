package typechecker.types;

import java.util.Optional;

import parser.MiniJavaParser.ClassDeclContext;
import parser.MiniJavaParser.MainMethodContext;
import parser.MiniJavaParser.MemberContext;
import parser.MiniJavaParser.NormalMethodContext;
import typechecker.exceptions.TypeMismatchException;
import typechecker.functions.Function;
import typechecker.functions.FunctionSignature;
import typechecker.functions.MainMethod;
import typechecker.scope.ClassScope;
import typechecker.scope.GlobalScope;
import typechecker.scope.Scope;
import typechecker.scope.Variable;

public abstract class Class extends ClassScope implements Type {
	
	private final String id;
	
	public static Optional<Class> fromClassDecl(ClassDeclContext con, Scope scope) {
		String id = con.ID().getText();
		Class superClass;
		if(con.inherits() == null){
			superClass = ObjectClass.instance();
		} else {
			Optional<Type> opt = scope.resolveType(con.inherits().ID().getText());
			if(!opt.isPresent()){
				System.err.println("Superclass name " + con.inherits().ID().getText() + " not in scope");
				return Optional.empty();
			}
			Type t = opt.get();
			if(!(t instanceof Class)) {
				System.err.println("type: " + t.id() + " is not a class");
				return Optional.empty();
			}
			superClass = (Class) t;
		}
		Subclass newClass = superClass.extend(id);
		boolean isGood = true;
		for(MemberContext mem : con.classBody().member()){
			if(mem.method() != null){
				if(mem.method() instanceof NormalMethodContext){
					NormalMethodContext method = (NormalMethodContext) mem.method();
					try {
						newClass.addMethod(Function.fromMethodContext(method, newClass));
					} catch(IllegalArgumentException e){
						isGood = false;
					}
				} else {
					MainMethodContext mmc = (MainMethodContext) mem.method();
					MainMethod main = MainMethod.fromMainMethodContext(mmc, newClass);
					GlobalScope.instance().setMainMethod(main);
				}
			} else if(mem.field() != null){
				if(!newClass.addField(Variable.fromDeclarationContext(mem.field().declaration(), newClass))){
					isGood = false;
				}
			} else {
				throw new IllegalArgumentException("What happened?");
			}
		}
		if(!isGood){
			return Optional.empty();
		}
		return Optional.of(newClass);
	}

	public Class(String id, Scope parent) {
		super(parent);
		this.id = id;
	}

	public String id(){
		return this.id;
	}

	public abstract Optional<Variable> resolveField(String id);

	public abstract Optional<Function> resolveMethod(FunctionSignature id);

	public final Subclass extend(String id) {
		return new Subclass(this, id);
	}

	public final Type thisType() {
		return this;
	}

	public abstract boolean membersChecked();
	
	public abstract boolean bodiesChecked();
}

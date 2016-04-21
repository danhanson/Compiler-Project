package typechecker.types;

import parser.MiniJavaParser.ClassDeclContext;
import parser.MiniJavaParser.MainMethodContext;
import parser.MiniJavaParser.MemberContext;
import parser.MiniJavaParser.NormalMethodContext;
import typechecker.exceptions.NoSuchTypeException;
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
	
	public static Class fromClassDecl(ClassDeclContext con, Scope scope) {
		String id = con.ID().getText();
		Class superClass;
		if(con.inherits() == null){
			superClass = ObjectClass.instance();
		} else {
			Type t = scope.resolveType(con.inherits().ID().getText());
			if(t == null)
				throw new NoSuchTypeException(con.inherits().ID().getText());
			if(!(t instanceof Class))
				throw new TypeMismatchException("type: " + t.id() + " is not a class");
			superClass = (Class) t;
		}
		Subclass newClass = superClass.extend(id);
		for(MemberContext mem : con.classBody().member()){
			if(mem.method() != null){
				if(mem.method() instanceof NormalMethodContext){
					NormalMethodContext method = (NormalMethodContext) mem.method();
					newClass.addMethod(Function.fromMethodContext(method, newClass));
				} else {
					MainMethodContext mmc = (MainMethodContext) mem.method();
					MainMethod main = MainMethod.fromMainMethodContext(mmc, newClass);
					GlobalScope.instance().setMainMethod(main);
				}
			} else if(mem.field() != null){
				newClass.addField(Variable.fromDeclarationContext(mem.field().declaration(), newClass));
			} else {
				throw new IllegalArgumentException("What happened?");
			}
		}
		return newClass;
	}

	public Class(String id, Scope parent) {
		super(parent);
		this.id = id;
	}

	public String id(){
		return this.id;
	}

	public abstract Variable resolveField(String id);

	public abstract Function resolveMethod(FunctionSignature id);

	public abstract void resolveTypes();

	public final Subclass extend(String id) {
		return new Subclass(this, id);
	}

	public final Type thisType() {
		return this;
	}
}

package typechecker.types;

import parser.MiniJavaParser.ClassDeclContext;
import parser.MiniJavaParser.MemberContext;
import typechecker.exceptions.NoSuchTypeException;
import typechecker.exceptions.TypeException;
import typechecker.exceptions.TypeMismatchException;
import typechecker.functions.Function;
import typechecker.functions.Signature;
import typechecker.scope.AbstractScope;
import typechecker.scope.Scope;
import typechecker.scope.Variable;

public abstract class Class extends AbstractScope implements Type {
	
	private final String id;
	private final Variable thisVar;
	
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
				newClass.addMethod(Function.fromMethodContext(mem.method(), newClass));
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
		this.thisVar = new Variable(this, "this", this);
	}

	public String id(){
		return this.id;
	}

	public abstract Variable resolveField(String id);

	public abstract Function resolveMethod(Signature id);

	public abstract void resolveTypes() throws TypeException;

	public final Subclass extend(String id) {
		return new Subclass(this, id);
	}

	public final Variable thisVar() {
		return thisVar;
	}
}

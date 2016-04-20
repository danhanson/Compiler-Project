package typeChecker;

import parser.MiniJavaParser.ClassDeclContext;
import parser.MiniJavaParser.MemberContext;

public abstract class Class extends AbstractScope implements Type {
	
	private final String id;
	
	public static Class fromClassDecl(ClassDeclContext con, Scope scope) throws TypeException {
		String id = con.ID().getText();
		Class superClass;
		if(con.inherits() == null){
			superClass = ObjectClass.instance();
		} else {
			Type t = scope.resolveType(con.inherits().ID().getText());
			if(t == null)
				throw new NoSuchTypeException(con.inherits().ID().getText());
			if(!(t instanceof Class))
				throw new TypeException("type: " + t.id() + " is not a class");
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
	}

	public String id(){
		return this.id;
	}
	
	public abstract Variable resolveField(String id);

	public abstract Function resolveMethod(Signature id);

	public abstract void checkTypes() throws TypeException;
	
	public final Subclass extend(String id) {
		return new Subclass(this, id);
	}
	
	public final Block block(){
		return new Block(this);
	}
}

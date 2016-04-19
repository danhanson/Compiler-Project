package typeChecker;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.antlr.v4.runtime.tree.ParseTree;

import parser.MiniJavaParser.ClassDeclContext;
import parser.MiniJavaParser.MemberContext;

public abstract class Class extends AbstractScope {
	
	private final String id;
	
	public static Class fromClassDecl(ClassDeclContext con, Scope scope){
		String id = con.getChild(1).getText();
		Class superClass;
		int bodyI;
		if(con.children.size() == 5){
			// look it up
			bodyI = 4;
			throw new UnsupportedOperationException("extends not supported");
		} else {
			superClass = ObjectClass.instance();
			bodyI = 2;
		}
		Subclass newClass = superClass.extend(id);
		ParseTree members = con.getChild(bodyI);
		for(int i = 1; i < members.getChildCount()-1; i++){
			MemberContext mem = (MemberContext) members.getChild(i);
			System.out.println("Method: " + mem.method());
			System.out.println("Field: " + mem.field());
			if(mem.field() == null){
				newClass.addMethod(Function.fromMethodContext(mem.method(), newClass));
			}
		}
		return null;
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

	public final Subclass extend(String id) {
		return new Subclass(this, id);
	}
	
	public final Block block(){
		return new Block(this);
	}
}

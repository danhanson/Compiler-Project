package typechecker.scope;

import java.util.Objects;

import parser.MiniJavaParser.DeclarationContext;
import typechecker.types.Type;
import typechecker.types.UndeclaredClass;

public class Variable {

	private final String id;
	private final Scope scope;
	private final String typeId;
	private Type type = null;
	private boolean declared;
	
	public static final Variable fromDeclarationContext(DeclarationContext field, Scope c, boolean declared){
		String typeName = field.type().getText();
		String id = field.ID().getText();
		return new Variable(typeName, id, c, declared);
	}

	/**
	 * Variables should be resolved once all classes are added to the scope
	 */
	public boolean resolveType() {
		return scope.resolveType(typeId).map(type -> {
			this.type = type;
			return true;
		}).orElseGet(() -> {
			this.type = new UndeclaredClass(typeId);
			System.err.println("Cannot find class named "+typeId);
			return false;
		});
	}

	public Variable(Type type, String id, Scope scope, boolean declared){
		this.id = id;
		this.scope = scope;
		this.type = type;
		this.typeId = type.id();
		this.declared = declared;
	}

	public Variable(String typeName, String id, Scope scope, boolean declared){
		this.id = id;
		this.scope = scope;
		this.typeId = typeName;
		this.declared = true;
	}
	
	public String id(){
		return id;
	}

	public Type type(){
		return type;
	}
	
	public String typeId(){
		return typeId;
	}
	
	public Scope scope(){
		return scope;
	}

	public void setDeclared(boolean d){
		this.declared = d;
	}
	
	public boolean declared(){
		return declared;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, scope, typeId);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Variable){
			Variable other = (Variable) obj;
			return other.id == this.id && other.scope == this.scope && this.typeId == other.typeId;
		}
		return false;
	}

	@Override
	public String toString() {
		return typeId+" "+id;
	}
}

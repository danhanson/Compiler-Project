package typeChecker;

import java.util.Objects;

import parser.MiniJavaParser.DeclarationContext;
import parser.MiniJavaParser.FieldContext;

public class Variable {

	private final String id;
	private final Scope scope;
	private final String typeId;
	private Type type = null;

	static final Variable fromDeclarationContext(DeclarationContext field, Class c){
		String typeName = field.type().getText();
		String id = field.ID().getText();
		return new Variable(typeName, id, c);
	}

	/**
	 * Variables should be resolved once all classes are added to the scope
	 * @throws NoSuchTypeException 
	 */
	public boolean resolveType() throws NoSuchTypeException{
		if(this.type != null)
			return false;
		this.type = scope.resolveType(typeId);
		return this.type != null;
	}

	Variable(String typeName, String id, Scope scope){
		this.id = id;
		this.scope = scope;
		this.typeId = typeName;
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
}

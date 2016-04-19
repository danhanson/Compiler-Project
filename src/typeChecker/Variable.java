package typeChecker;

import java.util.Objects;

import parser.MiniJavaParser.FieldContext;

public class Variable {

	private final String id;
	private final Scope scope;
	private final String typeName;
	private Type type = null;

	static final Variable fromFieldContext(FieldContext field, Class c){
		field.type();
		return null;
	}

	/**
	 * Variables should be resolved once all classes are added to the scope
	 */
	public boolean resolveType(){
		if(this.type != null)
			return false;
		this.type = scope.resolveType(typeName);
		return this.type != null;
	}

	Variable(String typeName, String id, Scope scope){
		this.id = id;
		this.scope = scope;
		this.typeName = typeName;
	}
	
	public String id(){
		return id;
	}

	public Type type(){
		return type;
	}
	
	public Scope scope(){
		return scope;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, scope, type);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Variable){
			Variable other = (Variable) obj;
			return other.id == this.id && other.scope == this.scope && this.type == other.type;
		}
		return false;
	}
}

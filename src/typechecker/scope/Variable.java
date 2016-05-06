package typechecker.scope;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Objects;

import codegeneration.constants.ConstantPool;
import parser.MiniJavaParser.DeclarationContext;
import typechecker.types.Type;
import typechecker.types.Class;
import typechecker.types.UndeclaredClass;

public class Variable {

	public static Variable fromDeclarationContext(DeclarationContext var, ClassScope c, boolean declared){
		String typeName = var.type().getText();
		String id = var.ID().getText();
		return new Variable(typeName, id, c, declared);
	}

	private final String id;
	private final ClassScope scope;
	private final String typeId;
	private Type type = null;
	private boolean declared;

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

	public Variable(Type type, String id, ClassScope scope, boolean declared){
		this.id = id;
		this.scope = scope;
		this.type = type;
		this.typeId = type.id();
		this.declared = declared;
	}

	public Variable(String typeName, String id, ClassScope scope, boolean declared){
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
	
	public ClassScope scope(){
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

	public boolean isField(){
		return scope instanceof Class;
	}

	public void writeField(DataOutputStream out) throws IOException{
		ConstantPool pool = scope().constantPool();
		out.writeShort(1); // public
		out.writeShort(pool.name(id()));
		out.writeShort(pool.descriptor(type()));
		out.writeShort(0); // no attributes
	}
}

package typeChecker;

import java.util.Collection;

public abstract class Class extends AbstractScope {

	public Class(Scope parent) {
		super(parent);
	}

	public abstract Variable resolveField(String id);

	public abstract Function resolveMethod(Signature id);

	public final SubClass extend(String id, Collection<Function> methods, Collection<Variable> fields) {
		return new SubClass(this, id, methods, fields);
	}
	
	public final Block block(){
		return new Block(this);
	}
}

package typeChecker;

public class Primitive implements Type {

	private final String id;

	Primitive(String id){
		this.id = id;
	}

	@Override
	public String id() {
		return id;
	}

	@Override
	public Scope parent() {
		return null;
	}
}

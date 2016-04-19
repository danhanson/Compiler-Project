package typeChecker;

import java.util.HashMap;
import java.util.Map;

public class Block extends AbstractScope {

	private final Map<String,Variable> variables;

	Block(Scope parent) {
		super(parent);
		variables = new HashMap<String, Variable>();
	}
	
	public Block extend(){
		return new Block(this);
	}

	public boolean addVariable(Variable v){
		return variables.put(v.id(), v) != null;
	}

	@Override
	public Variable resolveVariable(String id) {
		if(variables.containsKey(id)){
			return variables.get(id);
		}
		return super.resolveVariable(id);
	}
}

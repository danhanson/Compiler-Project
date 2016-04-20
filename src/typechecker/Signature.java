package typechecker;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public final class Signature {

	private final String id;
	private final String[] argTypeIds;
	private final Scope scope;
	private final String returnTypeId;

	public String id(){
		return id;
	}

	Signature(String id, String returnTypeId, List<Variable> vars, Scope scope){
		this.id = id;
		this.returnTypeId = returnTypeId;
		this.scope = scope;
		this.argTypeIds = new String[vars.size()];
		for(int i = 0; i < vars.size(); i++){
			this.argTypeIds[i] = vars.get(i).typeId();
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(scope, id, returnTypeId, Arrays.hashCode(argTypeIds));
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Signature){
			Signature other = (Signature) obj;
			return id == other.id &&
					returnTypeId == other.returnTypeId &&
					scope == other.scope &&
					Arrays.equals(argTypeIds, other.argTypeIds);
		}
		return false;
	}
}

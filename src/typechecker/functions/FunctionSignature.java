package typechecker.functions;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import typechecker.types.Type;

public final class FunctionSignature {

	private final String id;
	private final Type[] argTypes;

	public String id(){
		return id;
	}

	public FunctionSignature(String id, List<Type> args){
		this.id = id;
		this.argTypes = new Type[args.size()];
		for(int i = 0; i < args.size(); i++){
			this.argTypes[i] = args.get(i);
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, Arrays.hashCode(argTypes));
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof FunctionSignature){
			FunctionSignature other = (FunctionSignature) obj;
			return id == other.id && Arrays.equals(argTypes, other.argTypes);
		}
		return false;
	}
}

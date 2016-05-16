package typechecker.functions;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import typechecker.types.Type;

public final class MethodSignature {

	private final String id;
	private final Type[] argTypes;

	public String id(){
		return id;
	}

	public MethodSignature(String id, List<Type> args){
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
		if(obj instanceof MethodSignature){
			MethodSignature other = (MethodSignature) obj;
			return id.equals(other.id) && Arrays.equals(argTypes, other.argTypes);
		}
		return false;
	}

	@Override
	public String toString() {
		if(argTypes.length == 0){
			return id()+"(void)";
		}
		return id()+"("+Arrays.stream(argTypes).map(Type::id).collect(Collectors.joining(", "))+")";
	}

	public Type[] argTypes() {
		return argTypes;
	}

	public boolean isCovariant(MethodSignature sig){
		if(!id.equals(sig.id)){
			return false;
		}
		if(argTypes.length != sig.argTypes.length){
			return false;
		}
		for(int i = 0; i < argTypes.length; i++){
			if(!argTypes[i].isSubType(sig.argTypes[i])){
				return false;
			}
		}
		return true;
	}
}

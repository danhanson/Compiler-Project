package typechecker.functions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import typechecker.types.Class;

public class MethodResolver {

	private final Map<String, List<Method>> methods;
	private final Class parent;

	public MethodResolver(Class parent) {
		methods = new HashMap<String, List<Method>>();
		this.parent = parent;
	}

	public Optional<Method> resolveMethod(MethodSignature sig){
		List<Method> overloads = methods.getOrDefault(sig.id(), Collections.emptyList());
		for(Method m : overloads){
			if(m.methodSignature().isCovariant(sig)){
				return Optional.of(m);
			}
		}
		return parent.resolveMethod(sig);
	}

	public Optional<Method> putMethod(Method m){
		List<Method> overloads = methods.computeIfAbsent(m.id(), obj -> new ArrayList<Method>());
		for(Method other : overloads){
			if(m.methodSignature().isAmbiguous(other.methodSignature())){
				return Optional.of(other);
			}
		}
		return parent.resolveMethod(m.methodSignature()).map(superMethod -> {
			if(superMethod.isCovariant(m)){
				overloads.add(m);
				return Optional.<Method>empty();
			} else {
				return Optional.of(superMethod);
			}
		}).orElseGet(() -> {
			overloads.add(m);
			return Optional.<Method>empty();
		});
	}

	public boolean containsSignature(MethodSignature m){
		for(Method other : methods.getOrDefault(m.id(), Collections.emptyList())){
			if(other.methodSignature().equals(m)){
				return true;
			}
		}
		return false;
	}
}

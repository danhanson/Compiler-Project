package codegeneration.constants;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import typechecker.functions.Method;
import typechecker.scope.Variable;
import typechecker.types.Class;
import typechecker.types.Type;

public class ConstantPool {

	private final Map<ConstantInfo, Short> constants = new HashMap<>();

	public short integer(int value){
		IntegerInfo info = new IntegerInfo(value);
		return constants.computeIfAbsent(info, i -> nextIndex());
	}

	short utf8(Utf8Info u){
		return constants.computeIfAbsent(u, o -> nextIndex());
	}

	public short name(String name){
		return utf8(new Utf8Info(name));
	}

	short classInfo(ClassInfo c){
		Short ret = constants.get(c);
		if(ret == null){
			utf8(c.utf8Info());
			ret = nextIndex();
			constants.put(c, ret);
		}
		return ret;
	}

	short nameAndType(NameAndTypeInfo n){
		Short ret = constants.get(n);
		if(ret == null){
			utf8(n.nameInfo());
			utf8(n.descriptor());
			ret = nextIndex();
			constants.put(n, ret);
		}
		return ret;
	}

	short fieldInfo(FieldInfo fi){
		Short ret = constants.get(fi);
		if(ret == null){
			classInfo(fi.classInfo());
			nameAndType(fi.nameAndTypeInfo());
			ret = nextIndex();
			constants.put(fi, ret);
		}
		return ret;
	}

	public short systemOut(){
		FieldInfo fi = new FieldInfo("java/lang/System","out","Ljava/io/PrintStream;");
		
		return fieldInfo(fi);
	}

	public short method(Method f) {
		MethodInfo method = new MethodInfo(f.thisClass().binaryName(), f.id(), f.descriptor());
		return methodInfo(method);
	}

	short methodInfo(MethodInfo method){
		Short ret = constants.get(method);
		if(ret == null){
			classInfo(method.classInfo());
			nameAndType(method.nameAndTypeInfo());
			ret = nextIndex();
			constants.put(method, ret);
		}
		return ret;
	}

	public short println(){
		MethodInfo method = new MethodInfo("java/io/PrintStream", "println", "(I)V");
		return methodInfo(method);
	}

	public short count(){
		return (short) constants.size();
	}

	private short nextIndex(){
		return (short) (count() + 1);
	}

	public void writeConstants(DataOutputStream out) throws IOException {
		out.writeShort(constants.size()+1); // constant count
		ConstantInfo[] cs = new ConstantInfo[constants.size()];
		constants.forEach((k,v) -> cs[v-1] = k);
		for(ConstantInfo ci : cs){
			ci.write(out, this);
		}
	}

	public short field(Variable variable) {
		FieldInfo fi = new FieldInfo(variable);
		return fieldInfo(fi);
	}

	public short descriptor(Type type) {
		return utf8(new Utf8Info(type.descriptor()));
	}

	public short descriptor(Method method) {
		return utf8(new Utf8Info(method.descriptor()));
	}

	public short classRef(Class c) {
		return classInfo(new ClassInfo(c.binaryName()));
	}
}

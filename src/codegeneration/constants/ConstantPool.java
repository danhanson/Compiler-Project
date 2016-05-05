package codegeneration.constants;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import typechecker.functions.Function;
import typechecker.scope.Variable;
import typechecker.types.Type;

public class ConstantPool {

	private final Map<ConstantInfo, Short> constants = new LinkedHashMap<>();

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
		return constants.computeIfAbsent(c, o -> {
			utf8(c.utf8Info());
			return nextIndex();
		});
	}

	short nameAndType(NameAndTypeInfo n){
		return constants.computeIfAbsent(n, o -> {
			utf8(n.nameInfo());
			utf8(n.descriptor());
			return nextIndex();
		});
	}

	short fieldInfo(FieldInfo fi){
		return constants.computeIfAbsent(fi, o -> {
			classInfo(fi.classInfo());
			nameAndType(fi.nameAndTypeInfo());
			return nextIndex();
		});
	}

	public short systemOut(){
		FieldInfo fri = new FieldInfo("java/lang/system","Out","Ljava/io/PrintStream;");
		return constants.computeIfAbsent(fri, obj -> {
			classInfo(fri.classInfo());
			nameAndType(fri.nameAndTypeInfo());
			return nextIndex();
		});
	}

	public short method(Function f) {
		MethodInfo method = new MethodInfo(f.thisClass().id(), f.descriptor());
		return methodInfo(method);
	}

	short methodInfo(MethodInfo method){
		return constants.computeIfAbsent(method, obj -> {
			classInfo(method.classInfo());
			utf8(method.descriptor());
			return nextIndex();
		});
	}

	public short println(){
		MethodInfo method = new MethodInfo("java/io/PrintStream.println", "(I)V");
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
		for(ConstantInfo con : constants.keySet()){
			con.write(out, this);
		}
	}

	public short field(Variable variable) {
		FieldInfo fi = new FieldInfo(variable);
		return fieldInfo(fi);
	}

	public short descriptor(Type type) {
		return utf8(new Utf8Info(type.descriptor()));
	}

	public short descriptor(Function function) {
		return utf8(new Utf8Info(function.descriptor()));
	}
}

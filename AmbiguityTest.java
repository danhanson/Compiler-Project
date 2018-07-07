
class AmbiguityTest {
	
	public static void main(String[] argv){
	 System.out.println(0);
	}

	Parent testReturn(Child c){
		System.out.println(c.value());
		return new Parent();
	}

	Parent testReturn(Parent c){
		return c;
	}
}


class Parent {
	int x;
	void init(){
		x = 10;
	}
	
	int value(){
		return x;
	}
}

class Child extends Parent {

	void init(){
		x = 11;
	}
}
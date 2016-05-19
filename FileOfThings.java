// This program includes a lot of stuff -- a bunch of precedence testing, a
// useful math library, bitwise operations, and a lot of code!

class BigMain {
    public static void main(String[] ArgumentsToTheProgram) {
    	/*int x;
    	x = 3;
    	if(x == 2){
    		System.out.println(2);
    	} else {
    		System.out.println(3);
    	}
    	int t = 0;
    	while(t < 10) {
    		System.out.println(t / 2);
    		t = t + 1;
    	}*/
    	OtherClass o;
    	System.out.println(1);
    	o = new OtherClass();
    	System.out.println(2);
    	System.out.println(-o.fact(5));
    	
    	System.out.println(o.returnY());
    	
    	o.setY(11);
    	System.out.println(o.returnY());
    	
    	Parent p1 = new OtherClass();
    	Parent p2 = new Parent();
    	Child c = new Child();
    	OtherClass o2 = new OtherClass();
    	Parent p3 = c;
   
    	System.out.println(p1.number());
    	System.out.println(p2.number());
    	System.out.println(c.number());
    	System.out.println(o2.number());
    	System.out.println(p3.number());
    	
    	Caller caller = new Caller();
    	caller.call(p1);
    	caller.call(p2);
    	caller.call(c);
    	caller.call(o2);
    	caller.call(p3);
    }
}

class Parent {
	int number(){
		return -1;
	}
}

class OtherClass extends Parent {
	
	int y = 0;
	
	int fact(int x){
		if(x == 1){
			return 1;
		}
		return x * this.fact(x-1);
	}

	void setY(int x){
		y = x;
	}

	int returnY(){
		return y;
	}
}

class Child extends Parent {
	int number(){
		return 1;
	}
}

class Caller {
	int call(Parent p){
		System.out.println(p.number());
		return p.number();
	}
}

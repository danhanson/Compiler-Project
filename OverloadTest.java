
class OverloadTest {
	public static void main(String[] argv) {
		Box b = new Box();
		b.setX(9);
		Overloads o = new Overloads();
		System.out.println(o.overload(11));
		System.out.println(o.overload(b));
		
		CovarianceTest ct = new CovarianceTest();
		CovarianceTestChild ctc = new CovarianceTestChild();
		CovarianceTest ct2 = ctc;
	
		Parent p = new Parent();
		Child c = new Child();

		p.init();
		c.init();
		System.out.println(0);
		ctc.test(c);
		ct2.test(c);
		System.out.println(0);
		ctc.test(p);
		ctc.test(c);
		System.out.println(0);
		ct.testReturn(c);
		ctc.testReturn(p);
		ctc.testReturn(c);
		System.out.println(0);
		Fact1 fact1 = new Fact1();
		System.out.println(fact1.fact(5));
		Fact2 fact2 = new Fact2();
		System.out.println(fact2.fact(6));
		System.out.println(0);
		boolean test;
		test = true;
		if(test){
			System.out.println(1);
		} else {
			System.out.println(5);
		}
		System.out.println(0);
		boolean x = true;
		boolean y = x || false;
		if(y){
			System.out.println(1);
		}
		System.out.println(0);
		
		ShortCircuitTest sct = new ShortCircuitTest();
		if(sct.print(1, false) && sct.print(2,true) && sct.print(3,true)){
			sct.print(4,true);
		}

		if(sct.print(1,  true) || sct.print(2, false)){
			sct.print(3, true);
		}
	}
}

class Overloads {
	int overload(int x){
		return x;
	}

	int overload(Box b){
		return b.value();
	}
}

class Box {
	int x;

	int value(){
		return x;
	}

	void setX(int arg){
		x = arg;
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

class CovarianceTest {
	void test(Child p){
		System.out.println(p.value());
	}

	Parent testReturn(Child c){
		System.out.println(c.value());
		return new Parent();
	}
}

class CovarianceTestChild extends CovarianceTest {
	void test(Parent p){
		System.out.println(p.value());
		System.out.println(101);
	}

	Child testReturn(Parent p){
		System.out.println(p.value());
		return new Child();
	}
}

class Fact1 {
	int fact(int x){
		if(x == 1){
			return 1;
		}
		return x*this.fact(x-1);
	}
}

class Fact2 {
	int fact(int x){
		int res = 1;
		while(x > 1){
			res = res * x;
			x = x - 1;
		}
		return res;
	}
}


class ShortCircuitTest {
	boolean print(int val, boolean x){
		System.out.println(val);
		return x;
	}
}


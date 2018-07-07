
class OperatorTest {
	public static void main(String[] args){
		boolean x = true;
		boolean y = x || false;
		if(y){
			System.out.println(1);
		}
		System.out.println(0);
		
		ShortCircuitTest test = new ShortCircuitTest();
		if(test.print(1, false) && test.print(2,true) && test.print(3,true)){
			test.print(4,true);
		}

		if(test.print(1,  true) || test.print(2, false)){
			test.print(3, true);
		}
	}
}

class ShortCircuitTest {
	boolean print(int val, boolean x){
		System.out.println(val);
		return x;
	}
}
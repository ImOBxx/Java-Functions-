
public class OverloadingMethod2 {
	
	void test() {
		System.out.println("No Parameters");
		
	}
			void test(int a) {
				System.out.println("a: " + a);
			}
			
			void test (int a, int b) {
				System.out.println("a and b: " + a + " " + b);
			}
			double test (double a) {
				System.out.println("double a: " + a);
				return a*a;
			}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
	OverloadingMethod2 ob = new OverloadingMethod2();
			double result;
	       ob.test();
	       ob.test(10);
	       ob.test(10, 20);
	       result = ob.test(123.25);
	       System.out.print("Result of ob.test(123.25): " + result);
		

	}

}



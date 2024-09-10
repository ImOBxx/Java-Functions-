
public class OverloadingMethods3 {

	
		void test() {
			System.out.println("No Parameters");
		}
		void test(int a, int b) {
			System.out.println("a and b: " + a + " " + a);
		}
	    void test(double a) {
	    	System.out.println("Inside test (double) a: " + a);
	    }
	
public static void main(String[] args) {
	OverloadingMethods3 ob = new OverloadingMethods3();
	int i = 88;
	ob.test();
	ob.test(10, 20);
	ob.test(i);
	ob.test(123.2);
	
	
		}

}

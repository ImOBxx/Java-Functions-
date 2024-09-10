import java.util.Scanner;

public class PentArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double n, x;
		PentArea o = new  PentArea();
		System.out.println("Enter Number Sides: ");
		n = in.nextDouble();
		System.out.println("Enter Side: ");
		x = in.nextDouble();
		System.out.println("Area Of The Pentagon: " + Math.round(o.areapent(n, x)));
	}
	
	public static double areapent(double n, double x)
	{
		return (n * x * x) / (4 * Math.tan(Math.PI / n));
	}

}

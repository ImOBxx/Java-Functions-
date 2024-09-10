import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double a, b, c;
		System.out.println("Enter First Number: ");
		a = in .nextDouble();
		System.out.print("Enter Second Number: ");
		b = in.nextDouble();
		System.out.println("Enter Third Number: ");
		c = in.nextDouble();
		System.out.println("The Smallest Number: " + smallest(a, b, c));
	}	
		
	public static double smallest(double a, double b, double c)
	{
		if (a < b && a < c)
		{
			return a;
		}
		else if (b < a &&  b < c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
}



import java.util.Scanner;

public class AverageOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double a, b, c;
		final double x = 20;
		System.out.println("Enter First Number: ");
		a = in.nextDouble();
		System.out.println("Enter Second Number: ");
		b = in.nextDouble();
		System.out.println("Enter Third Number: ");
		c = in.nextDouble();
		System.out.println("Average Of Three Numbers: " + average(a, b, c));
		
		}
	
	public static double average(double a, double b, double c)
	{
		return ((a + b + c) / 3);
	}

}

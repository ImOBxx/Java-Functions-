import java.util.Scanner;

public class CalcTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double a, b, c;
		CalcTriangle o = new CalcTriangle();
		System.out.println("Enter Side 1: ");
		a = in.nextDouble();
		System.out.println("Enter Side 2: ");
		b = in.nextDouble();
		System.out.println("Enter Side 3: ");
		c = in.nextDouble();
		System.out.println("Area Of The Triangle Is: " + o.areacalc(a, b, c));
	}
		
	public double areacalc(double a, double b, double c)
	{
	    double s;
		s = (a + b + c) / 2.0;
		double area;
		area = Math.round(Math.sqrt(s * (s - a) * (s - b) * (s - c)));
		return area;
	}
	}


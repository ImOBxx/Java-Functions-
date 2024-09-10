import java.util.Scanner;

public class LeapYearOnot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		LeapYearOnot o = new LeapYearOnot();
		int n;
		System.out.println("Enter Year: ");
		n = in.nextInt();
		System.out.println("The Year Is " + o.leap(n));
	}
	public static String leap(int n)
	{
		if ((n % 400 == 0 && n % 4 == 0) || (n % 100 != 0))
		{
			return ("A Leap Year");
		}
		else
		{
			return ("Not A Leap Year");
		}
	}
}


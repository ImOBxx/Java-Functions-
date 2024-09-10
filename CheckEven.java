import java.util.Scanner;

public class CheckEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int n;
		CheckEven o = new CheckEven();
		System.out.println("Enter Number: ");
		n = in.nextInt();
		System.out.println("Digits Even Checker: " + o.check(n));
		

	}
	
	public static int check(int n)
	{
		int r = 0;
		int count = 0;
		int o_count = 0;
		while (n > 0)
		{
			r = n % 10;
			if (r % 2 == 0)
			{
				System.out.println("The Digit Is Even.");
				count++;
			}
			else
			{
				System.out.println("The Digit Is Odd.");
				o_count++;
			}
			n = n / 10;
		}
		return count;
	}

}

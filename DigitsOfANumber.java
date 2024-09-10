import java.util.Scanner;

public class DigitsOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		DigitsOfANumber o = new DigitsOfANumber();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number: ");
		n = in.nextInt();
		System.out.println("Sum Of Digits: " + o.sdg(n));
	}
	public static int sdg(int n)
	{
		int sum = 0;
		int r;
		while (n > 0)
		{
		r = (n % 10);
		sum += r;
		n = n / 10;
		}
		return sum;
	}
	

}


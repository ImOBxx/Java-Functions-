import java.util.Scanner;

public class FirstDigitOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		FirstDigitOfANumber o = new FirstDigitOfANumber();
		int n;
		System.out.println("Enter Number: ");
		n = in.nextInt();
		System.out.println("First Digit Of The Number Is: " + o.digit_finder(n));
	}
	
	public static int digit_finder(int n) {
	
	{
		int r;
		int sum = 0;
		while (n > 0)
		{
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		int r1 = sum % 10;
		return r1;
		
		
	}

	}
}

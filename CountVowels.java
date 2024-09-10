import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Enter String: ");
		String str = in.nextLine();
		System.out.println("Number Of Vowels In the String: " + count_vowels(str));

	}
	
	public static int count_vowels(String str)
	{
		int count = 0;
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'i' || str.charAt(i) == 'A' || 
					str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' ||str.charAt(i) == 'U')
			{
				count++;
			}
		}
		return count;
	}

}

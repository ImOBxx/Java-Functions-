import java.util.Scanner;

public class MiddleCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		MiddleCharacter o = new MiddleCharacter();
		System.out.println("Input A String: ");
		String str = in.nextLine();
		System.out.println("The Middle Character:  " + o.mc(str));

	}
	
	public static String mc (String str) {
	
	{
		int pos;
		int length;
		System.out.println(str.length()); 
		if (str.length() % 2 == 0)
		{
			pos = str.length() / 2 - 1;
			length = 2;
			System.out.println(pos);
			System.out.println(length);
			

		}
		else 
		{
			pos = str.length() / 2;
			length = 1;
			System.out.println(pos);
			System.out.println(length);
		}
	   return str.substring(pos, pos + length);
	}
	

	}
}

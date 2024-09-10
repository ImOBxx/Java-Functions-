import java.util.Scanner;

public class OverloadingMethods {
	int a,b,c;
	
	OverloadingMethods()//construttor
	{
		
		a=0;
		b=0;
		c=0;
		System.out.println("Hello");
	}
	
	
	int add()
	{
		Scanner sc= new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter First Number");
		a=sc.nextInt();
		System.out.println("Enter Second Number");
		b=sc.nextInt();
		c=a+b;
		
		System.out.println("result in add" + c);
		return(c);
	}

	
	float sub()
	{
		Scanner sc= new Scanner(System.in);
		float a,b,c;
		System.out.println("Enter First Number");
		a=sc.nextFloat();
		System.out.println("Enter Second Number");
		b=sc.nextFloat();
		c=a-b;
		return(c);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingMethods o = new OverloadingMethods();
		int r;
		r=o.add();

		System.out.println("result in main" + r);
		
		float x=o.sub();
		System.out.println("subtract in main" + x);

	}

}

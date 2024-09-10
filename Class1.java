import java.util.Scanner;
public class Class1 {
	
	int a,b,c;
	
   Class1()
	{
		a=0;
		b=0;
		c=0;
		
	}
	
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		a=sc.nextInt();
		System.out.println("Enter Second Number");
		b=sc.nextInt();
		
	}
     
	void calc()
	{
		c=a+b;
		
		
	}
	
	void display()
	{
		System.out.println(c);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1 obj=new Class1();
		obj.input();
		obj.calc();
		obj.display();

	}

}

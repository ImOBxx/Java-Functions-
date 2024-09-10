
public class Methods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods2 o = new Methods2();
		int x = 5;
		int y = 10;
		System.out.println(o.getMax(x, y));

	}
	
	public static int getMax(int x, int y)
	{
		if (x < y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}

}

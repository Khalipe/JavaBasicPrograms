public class Addition
{
	public static void addition(int a,int b)
	{
	int result=a+b;
	System.out.println(result);
	}

	public static void substraction(int c, int d)
	{
	int result1=c-d;
	System.out.println(result1);
	}

	public static void main(String[] args)
	{
	System.out.println("main method started");
	addition(5,6);
	substraction(6,5);
	System.out.println("\t main method ended");
	}
}
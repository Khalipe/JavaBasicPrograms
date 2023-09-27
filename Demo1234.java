class Demo1234
{
	public static void addition(int a,int b)
	{
		int result = a+b;
		System.out.println("result"+result);
	}
	
	public static void substraction (int c, int d )
	{
		int result = c-d;
		System.out.println("result"+result);
	}
	
	public static void main(String[]args)
	{
		System.out.println("main method started");
		addition (6,5);
		substraction (20,30);
		System.out.println("main method ended");
	}
}
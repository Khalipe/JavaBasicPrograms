public class AreaOfCircle
{
	static float PI=3.14f;
	static double r = 7d;
	
	public static double AreaOfCircle( double r)
	{
		
	 return PI*r*r;
		
	}
	
	public static double CircumferenceOfCircle(double r)
	{
		return 2*PI*r;
		
	}
	
	
	public static void main(String[]args)
	{
		
		double area=AreaOfCircle(r);
		double cir=CircumferenceOfCircle(r);
		
		System.out.println("Area of circle is "+area);
		
		System.out.println("circumference of circle"+cir);
		
	}
}

		
		


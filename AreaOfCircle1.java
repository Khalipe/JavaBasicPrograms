import java.util.Scanner;
public class AreaOfCircle1
{
	public static void main(String[]args)
	{
		 float PI=3.14f;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter radius of circle");
		
		double radius = sc.nextDouble();
		
		double area= PI*radius*radius;
		
		double circumference =2*PI*radius;
		
		System.out.println("area of circle is"+area);
		System.out.println("circumference of circle is"+circumference);
	}
}
	
	
	
		
		
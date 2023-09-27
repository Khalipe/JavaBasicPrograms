import java.util.Scanner;

public class AreaOfRectangleCalculator
{
	public static void main(String [] args)
	{
		//take input command from scanner
		
		Scanner sc = new Scanner(System.in);
		
		//let one side of rectangle be side1
		
		double side1 = sc.nextDouble();
		
		//let other side of rectangle be side2
		
		double side2 = sc.nextDouble();
		
		//area of rectangle 
		
		double area = side1*side2;
		
		System.out.println("enter the length of side1"+side1);
		System.out.println("enter the length of side2"+side2);
		System.out.println("area of rectangle is:"+area);
	}
}

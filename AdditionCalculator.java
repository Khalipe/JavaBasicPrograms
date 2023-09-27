import java.util.Scanner;

public class Additioncalculator
{
	public static void main(String[] args)
	{
		//take input commanand from scanner
		
		Scanner sc = new Scanner(System.in);
		
		//eneter the first value
		
		System.out.println("enter the first value");
		
		double value1 = sc.nextDouble();
		
		// enter the second value
		
		System.out.println("enter the second value");
		
		double value2 = sc.nextDouble();
		
		double additionResult= value1 +value2;
		
		
		System.out.println("additionResult is"+additionResult);
	}
}

		
import java.util.Scanner;

public class BoxVolumeCalculator
{
	public static void main(String [] args)
	{
		
		// take input command from scanner
		
		Scanner sc = new Scanner(System.in);
		
		//enter lenght of box
		
		System.out.println("enter length of box");
		double length = sc.nextDouble();
		
		// enter height of box
		
		System.out.println("enter height of box");
		double height = sc.nextDouble();
		
		//enter breadth of box
		
		System.out.println("enter breadth of box");
		double breadth = sc.nextDouble();
		
		double volume = length*breadth*height;
		
		
		System.out.println("volume of box is"+volume);
	}
}

		

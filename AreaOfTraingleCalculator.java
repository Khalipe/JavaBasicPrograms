import java.util.Scanner;

public class AreaOfTraingleCalculator
{
	public static void main(String[] args)
	{
	// take input command from scanner
	Scanner sc = new Scanner(System.in);
	
	//base of traingle
	
	double base = sc.nextDouble();
	
	
	//height of traingle
	
	double height = sc.nextDouble();
	
	// area of traingle
	
	double area = 1/2d*base*height;
	
	System.out.println("enter base of traingle"+base);
	System.out.println("enter height of traingle"+height);
	System.out.println("area of traingle is"+area);
	}
}


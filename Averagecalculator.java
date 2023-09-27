import java.util.Scanner;

public class Averagecalculator
{
	public static void main(String [] args)
	{
		
		// input command from scanner
		
		Scanner sc = new Scanner(System.in);
		
		//subject1
	System.out.println("enter the subject1 marks");
	
	double subject1 = sc.nextDouble();
	
	//subject2
	System.out.println("enter subject2 marks");
	double subject2 = sc.nextDouble();
	
	
	//subject3
	System.out.println("enter subject3 marks");
	double subject3 = sc.nextDouble();
	
	//subject4
	System.out.println("enter subject4 marks");
	double subject4 = sc.nextDouble();
	
	
	//subject5
	System.out.println("enter subject5 marks");
	double subject5 = sc.nextDouble();
		
	double addition = subject1+subject2+subject3+subject4+subject5;
	
	double average = addition/5;
	
	System.out.println("addition result is"+addition);
	System.out.println("average result is"+average);
	}
}

		
		
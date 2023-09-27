import java.util.Scanner;

public class LoanAmountCalculator
{
	
	public static void main(String [] args)
	{
		
		//take input command from scannner
		
		Scanner sc = new Scanner(System.in);
		
		double loanAmount = sc.nextDouble();
		
		double interestRate=0.18;
		
		double interstAmount= loanAmount*0.18;
		
		double netAmount = loanAmount+interstAmount;
		
		System.out.println("enter the loan amount"+loanAmount);
		System.out.println("interstAmount is "+interstAmount);
		System.out.println("netAmount is"+netAmount);
	}
	
}
import java.util.Scanner;

public class DaysOfWeekSwitchCase
{
	public static void main(String[]args)
	{
		//take input command from scanner
		
		Scanner sc = new Scanner(System.in);
		
		//take input from users
		
		System.out.println("enter a number ");
		
		int dayNumber = sc.nextInt();
		
		String dayName;
		
		    switch(dayNumber)
		    {
			case 1:
			dayName="monday";
			break;
			
			case 2:
			dayName= "tuesday";
			break;
			
			case 3:
			dayName="wednesday";
			break;
			
			case 4:
			dayName="thursday";
			break;
			
			case 5:
			dayName="friday";
			break;
			
			case 6:
			dayName="saturday";
			break;
			
			case 7:
			dayName="sunday";
			break;
			
			default:
			dayName="invalid";
			
		}
		
		System.out.println("dayName is:"+dayName);
	}
	
}




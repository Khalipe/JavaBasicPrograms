public class ConditionalOperator
{

   public static void main(String[]args)
   {
   //int x=(10>20)?(30):((40>50)? 60 : 70);
    int num=11;
    String result = null;
		
	result = (num % 2 == 0) ? "Even!!" : "Not Even!!";
		
	System.out.println(result);
   
   //System.out.println("value of x"+x);
   
   }
   
 }
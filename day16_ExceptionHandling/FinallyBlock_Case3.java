package day16_ExceptionHandling;

public class FinallyBlock_Case3 {

	public static void main(String[] args) {
		System.out.println("Program is started...... ");
		
		String s="Welcome";
		
		try
		{
		System.out.println(s.length());  //ArithmaticException
		}
		
		catch(ArithmeticException e) {
			System.out.println("Handled Exception ....");
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("Entered finally block");
		}
		
		System.out.println("Program Finished .................."); 
	}

}

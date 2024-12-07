package day16_ExceptionHandling;

public class FinallyBlock_Case2 {

	public static void main(String[] args) {
		System.out.println("Program is started...... ");
		
		String s=null;
		
		try
		{
		System.out.println(s.length());  //ArithmaticException
		}
		
		catch(NullPointerException e) {
			System.out.println("Handled Exception ....");
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("Entered finally block");
		}

	}

}

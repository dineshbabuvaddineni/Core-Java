package day16_ExceptionHandling;

import java.util.Scanner;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		System.out.println("Program is started...... ");
		
		String s=null;
		
		try
		{
		System.out.println(s.length());  //ArithmaticException
		}
		/*catch(ArithmeticException e) {
			System.out.println("Handled Exception ....");
			System.out.println(e.getMessage());
		}
		
		catch(NullPointerException e) {
			System.out.println("Handled Exception ....");
			System.out.println(e.getMessage());
		}
		
		catch(NumberFormatException e) {
			System.out.println("Handled Exception ....");
			System.out.println(e.getMessage());
		}*/
		
		catch(Exception e) {
			System.out.println(e.getMessage() );
		}
		
		
		System.out.println("Proram is compiled... ");
		System.out.println("Program is exited.... ");
		
	}

}

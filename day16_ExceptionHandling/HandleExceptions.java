package day16_ExceptionHandling;

import java.util.Scanner;

public class HandleExceptions {

	public static void main(String[] args) {
		System.out.println("Program is started...... ");
		Scanner sc=new Scanner(System.in);
		
		//Example1
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		try
		{
		System.out.println(100/num);  //ArithmaticException
		}
		catch(ArithmeticException e) {
			System.out.println("Invalid data ....");	
		}
		System.out.println("Proram is compiled... ");
		System.out.println("Program is exited.... ");
		
	}

}

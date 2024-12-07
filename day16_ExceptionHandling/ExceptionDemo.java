package day16_ExceptionHandling;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Program is started...... ");
		Scanner sc=new Scanner(System.in);
		
		//Example1
		/*System.out.println("Enter a number:");
		int num=sc.nextInt();
		System.out.println(100/num);  //ArithmaticException
		System.out.println("Proram is compleed... ");
		System.out.println("Program is exited.... ");*/
		
		//Example2
		/*int a[]=new int[5];
		
		System.out.println("Enter the position(0-4): ");
		int pos=sc.nextInt();
		
		System.out.println("Enter a value: ");
		int value=sc.nextInt();
		
		a[pos]=value;  //ArrayIndexOutOfBoundsException
		System.out.println(a[pos]);
		
		System.out.println("program is completed");
		System.out.println("program is exited.. ");*/
		
		//Example3
		/*String s="Welcome";
		int num=Integer.parseInt(s);  //NumberFormatException
		System.out.println(num);
		
		System.out.println("Program is completed");
		System.out.println("Program is excuted");*/
		
		//Example 4
		String s=null;
		System.out.println(s.length()); //NullPointerException
		
		System.out.println("Program is completed");
		System.out.println("Program is excuted");
		
		
		
		
		
		
		
		
		
		

	}

}

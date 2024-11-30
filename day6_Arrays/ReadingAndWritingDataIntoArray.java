package day6_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndWritingDataIntoArray {

	public static void main(String[] args) {
		int a[]=new int[5];
		
		Scanner sc =new Scanner(System.in);
		
		for(int i=0; i<a.length; i++) {
			System.out.println("Enter a vlaue:");
			a[i]=sc.nextInt();
		}
		
		System.out.println("Printing array Elements.........");
		System.out.println(Arrays.toString(a));
		
		//1)Sorting elements using for loop
		//a= {50,20,0,10,100}
		
		//2)Finding missing number in array
		// 10 20 30 40 50
		
		//3)Find largest number in array
		
		//4) Find lowest number in array
		
		
	}
}

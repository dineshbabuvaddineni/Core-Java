 package day6_Arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		/*
		 * 1)Declare an array
		 * 2) Add Values in to array
		 * 3) Find Size of array
		 * 4) Read single value from an array
		 * 5)Read multiple values from an array
		 */
		//Approach1
		/*int a[]=new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		if we give array size as 5 and if we give only three values 
		*/
		
		//Approach2
		int a[]= {100,200,300,400,500};//more dynamic nature --> we can add any number of values at any time
		System.out.println("Lenghth of an array"+ a.length);
		
		//read single value from  an array
		System.out.println(a[4]);//here 4 is index
		System.out.println("--------------------------------------------------------------");
		
		//reading all the values from array
		//Normal for loop
		for(int i=0; i<=a.length-1; i++) { //i<=4 i<5 i<=a.length-1 i<a.length
			System.out.println(a[i]); //100
			
		}
		
		System.out.println("--------------------------------------------------------------");
		
		//Enhanced for loop/for each loop
		for(int x: a) {
			System.out.println(x);
		} 
	}
}

package day6_Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		/* Two dimensional Array
		 * rows index starts from zero and columns index also starts from zero.
		 * 1)Declare an array
		 * 2) Add Values in to array
		 * 3) Find Size of array
		 * 4) Read single value from an array
		 * 5)Read multiple values from an array
		 */
		
		// 1)Declaring Array
		// Approach 1
		/*int a[][]=new int[3][2];
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;*/
		
		//Approach2
		int a[][]= {{100,200},{300,400},{500,600}};
		
		// Find Size of array
		System.out.println("Length of rows: "+ a.length);
		System.out.println("Length of columns: "+a[0].length);
		
		//Read single value from an array
		//System.out.println(a[2][1]); //600
		
		//Normal for loop
		for(int r=0;r<=2; r++) {
			for(int c=0;c<=1; c++) {
				System.out.println(a[r][c]+" "); //100 200 300 00
			}
			System.out.println();
		}
		
		//Enhanced for loop
		
		for(int arr[]: a) {
			for(int x:arr) {
				System.out.println(x);
			}
		}
	}
}

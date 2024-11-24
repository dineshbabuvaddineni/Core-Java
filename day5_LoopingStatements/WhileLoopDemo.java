package day5_LoopingStatements;

public class WhileLoopDemo {

	public static void main(String[] args) {
		//Ex 1: Print 1........10 numbers
		
		/*int i=1; //initialization
		
		while(i<=10) //condition{
		{
			System.out.println(i);
			 i++; //increment
			
		}*/
		
		/*
		
		//Example2: Print Hello Message 10 times
		
		int i=1;
		
		while(i<=10){
			System.out.println("Hello");
			i++;
		}
		
		*/
		
		//Example3: rint even numbers between 1......10
		
		//Approach 1
		/*int i=2;
		while(i<=10) {
			System.out.println(i);
			i+=2; //i=i+2;
		}*/
		
		//Approach 2
		/*int i=1;
		
		while(i<=10) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}*/
		
		//Example4 : 1............10
		/*1 odd
		 * 2 even
		 * 3 odd
		 * 4 even
		 * 
		 * 
		 * 10 even
		 */
	
	/*int i=1;
	while(i<= 10) {
		if(i%2==0)
		{
			System.out.println(i + " Even");
		}
		else {
			System.out.println(i +" Odd");
		}
		i++;
	}*/
		// Example 5: Print 10 .........1
		
		int i=10;
		
		while(i>0) {
			System.out.println(i);
			i--; 
		} 
		
	
	}
}

package day5_LoopingStatements;

public class ForLoopDemo {

	public static void main(String[] args) {
		
		//Example 1: 1....... 10 numbers
		/*for(int i=1;i<=10;i++) {
			System.out.println(i);
		}*/
		
		//Example2: 1 ............10 even numbers
		/*for(int i=2;i<=10; i=i+2) {
			System.out.println(i);
		}*/
		
		//Example3
		/* 1 Odd
		 * 2 Even
		 * 3 Odd
		 * 4 Even
		 * 
		 * 
		 * 
		 * 10 Even
		 */
		
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i+ " Even");
			}
			else {
				System.out.println(i+ " Odd");
			}
		}

	}

}

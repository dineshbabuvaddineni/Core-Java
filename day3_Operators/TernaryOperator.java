package day3_Operators;

public class TernaryOperator {

	public static void main(String[] args) {
		// var =exp ? result1: result 2;
		
		//Example1
		/*int a=200, b=100;
		int x=(a>b)? a:b;
		System.out.println(x);*/
		
		//Example2
		//int x=(1==1)?100:200;
		//System.out.println(x);
		
		//Example3
		int person_age=18;
		String res=(person_age>=18)? "Eligible": "Not Eligible";
		System.out.println(res); 
		

	}

}

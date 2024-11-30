package day6_Arrays;

public class EvenAndOddNumbersInArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		for(int x:a) {
			if(x%2==0) {
				System.out.println("The Number is even: "+x);
			}
			else {
				System.out.println("The number is odd: "+x);
			}
		}

	}

}

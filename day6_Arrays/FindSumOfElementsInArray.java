package day6_Arrays;

public class FindSumOfElementsInArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int sum=0;
		for(int x: a) {
			sum=sum+x;
		}
		
		System.out.println("The sum is:"+sum);

	}

}

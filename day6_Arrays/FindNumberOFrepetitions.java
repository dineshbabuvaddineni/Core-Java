package day6_Arrays;

public class FindNumberOFrepetitions {

	public static void main(String[] args) {
		// Find Number of Repetitions
		int count=0;
		int search_num=10;
		
		int a[]= {10,20,10,10,30,40,10,10,10};
		
		for(int n :a) {
			if(n==search_num) {
				count++;
			}
		}
		System.out.println("Count:"+count);
		

	}

}

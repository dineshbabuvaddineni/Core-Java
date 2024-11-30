package day6_Arrays;

public class SearchAnElementInArray {

	public static void main(String[] args) {
		// 
		int search_num=200;
		
		int a[]= {400,500,200,600,700};
		
		boolean status=false;
		
		/*for(int i=0;i<a.length ;i++) {
			if(a[i]==search_num) {
				System.out.println("Element found");
				status=true;
				break;
			}
		}
		if(status==false) {
			System.out.println("Element Not Found");
		}*/
		
		for(int x: a) {
			if(x==search_num) {
				System.out.println("Element found");
				status=true;
				break;
			}
		}
		if(status==false) {
			System.out.println("Element Not Found");
		}
		
		

	}

}

package day7_Strings;

import java.util.Arrays;

public class MutablevsImmutable {

	public static void main(String[] args) {
		
		//mutable - we can change
		int a[]= {30,50,70,10,20,30};
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a); //mutable
		System.out.println(Arrays.toString(a));
		
		//immutable
		String s=new String("welcome");
		System.out.println(s);
		String concatstring=s.concat("to java");
		System.out.println(s); //welcome ---> immutable - we can not change
		
		System.out.println(concatstring);
		
		
		
		
		
	}

}

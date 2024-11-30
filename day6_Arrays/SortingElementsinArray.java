package day6_Arrays;

import java.util.Arrays;

public class SortingElementsinArray {

	public static void main(String[] args) {
		char s[]= {'D', 'C', 'B', 'A'};
		
		System.out.println("Before Sorting..... ");
		
		System.out.println(Arrays.toString(s)); //
		Arrays.sort(s); //sort elements in array
		
		System.out.println("After sorting ......");
		System.out.println(Arrays.toString(s));
	}

}

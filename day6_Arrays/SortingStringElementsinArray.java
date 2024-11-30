package day6_Arrays;

import java.util.Arrays;

public class SortingStringElementsinArray {

	public static void main(String[] args) {
		int a[]= {100,600,200,400,500};
		
		System.out.println("Before Sorting..... ");
		
		System.out.println(Arrays.toString(a)); //[100,600,200,400,500]
		Arrays.sort(a); //sort elements in array
		
		System.out.println("After sorting ......");
		System.out.println(Arrays.toString(a)); //[100,200,400,500,600]
	}

}

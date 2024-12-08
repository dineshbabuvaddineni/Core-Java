package day18_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetDemo {

	public static void main(String[] args) {
		
		//HashSet myset= new HashSet();
		//Set myset1= new HashSet();
		//HashSet<Integer> myset= new HashSet<Integer>();
		
		HashSet myset= new HashSet();
		//adding elements into hashset
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(true);
		myset.add('A');
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		//Printing hashset
		System.out.println(myset); 
		
		//size of hashset
		System.out.println("Size of hashset:" + myset.size()); //6
		
		//Removing element
		myset.remove(10.5); //10.5 is value(not an index)
		System.out.println("After removing:"+myset); //[null,A,100,welcome,true]
		
		//Inserting element -Not possible
		//Access specific element -Not possible
		
		//Convert Hashset-->ArrayList
		ArrayList a1=new ArrayList(myset);
		System.out.println(a1);		//[null, A, 100, welcome, true]
		System.out.println(a1.get(2));
		
		//Normal for loop will not work for hashset as we don't have 
		//Read all the elements using for each
		
		/*for(Object x:myset) {
			System.out.println(x);
		}*/
		
		
		//Using Iterator
		Iterator <Object> it=myset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//clearing all the elements in hashset.
		myset.clear();
		System.out.println(myset.isEmpty()); //true
		
		
		
		
		
		
		
		
		

	}

}

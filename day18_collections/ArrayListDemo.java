package day18_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Declaration
		ArrayList mylist = new ArrayList();
		//List mylist1=new ArrayList();
		//If you want to restrict the array list to store only string type of Data
		//ArrayList <String>mylist1=new ArrayList<String>();
		//ArrayList <Integer>mylist2=new ArrayList<Integer>();
		
		//Adding data into arraylist
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		//Size of arraylist
		System.out.println("Sizeof arraylist:"+mylist.size());  //8
		
		//Printing Arraylist
		System.out.println("Printing data from arrayList :"+mylist); //[100, 10.5, welcome, A, true, 100, null, null]
		
		//Remove element from arraylist
		mylist.remove(5);  //here 5 is index of element
		System.out.println("After removing :"+mylist);  //[100,10.5,welcome,A,true,null,null]
		
		//add method will add elements at the end of the array.
		
		//Insertion method will add the element at the specified index.
		//Insert element in the arraylist
		mylist.add(2,"java");  //[100, 10.5, java, welcome, A, true, null, null]
		System.out.println("After insertion:"+mylist);
		
		//Modify element in the arrayList(modify/replace/change)
		mylist.set(2, "python");
		System.out.println("After replacing:"+ mylist); //[100,10.5,python,welcome,A,true,null,null]
		
		//Access specific element from arrayList
		System.out.println(mylist.get(3));  //here 3 is index //welcome
		
		//Reading all the elements from arrayList
		
		//Using Normal "for loop".
		/* for(int i=0;i<mylist.size();i++) {
			System.out.println(mylist.get(i));
		} */
		
		//using for each loop
		/*for(Object x: mylist) {
			System.out.println(x);
		}*/
		
		//using iterator   --> this method we can only apply on collections concept like arrayList
		Iterator it =mylist.iterator();
		
		//System.out.println(it.next());
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		//Checking array list is empty or not
		System.out.println("Is arraylist empty?"+ mylist.isEmpty());
		
		//remove all the elements from array list
		ArrayList mylist2=new ArrayList();
		mylist2.add(100);
		mylist2.add("welcome");
		
		mylist.removeAll(mylist2);
		System.out.println("After removing multiplr elements:" +mylist); //[10.5, python, A, true, null, null]
		
		//remove all the elements/clear
		mylist.clear();
		System.out.println("Is arraylist empty?" + mylist.isEmpty()); //true
		
		 
		
		
		
		
		
		
		
		
		
				
		
		

	}

}

package day18_collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		//HashMap hm=new HashMap();
		//Map hm=new HashMap();
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(101, "Dinesh");
		hm.put(102, "Hari");
		hm.put(103, "Siva");
		hm.put(104,"Ram");
		
		System.out.println(hm); //{101=Dinesh, 102=Hari, 103=Siva, 104=Ram}
		
		System.out.println("Size of the map:" + hm.size()); //4
		
		//remove pair
		hm.remove(103); //103 is the key of the pair
		System.out.println("After removing pair:"+ hm); //{101=john,102=David,104=scott}
		
		//access value of the key
		System.out.println(102);  //102 is key //Hari
		
		//get all the keys from HashMap
		System.out.println(hm.keySet()); //[101, 102, 104]
		System.out.println(hm.values()); //[Dinesh, Hari, Ram]
		System.out.println(hm.entrySet());//[101=Dinesh, 102=Hari, 104=Ram]
		
		//Reading data from hashmap
		
		//Using for..each
		
		/*for(int k: hm.keySet()) {
			
			System.out.println(k+"   "+hm.get(k));
			
		}*/
		
		//Using Iterator
		
		Iterator<Entry<Integer,String>> it =hm.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry <Integer,String>entry=it.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		hm.clear();
		System.out.println(hm.isEmpty()); //true
		
		
		
		
		

	}

}

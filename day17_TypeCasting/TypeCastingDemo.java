package day17_TypeCasting;

//Upcasting  -- converting value from smaller -->larger

//int --> long
//float --> double

//Downcasting -- converting value from larger -->smaller

public class TypeCastingDemo {

	public static void main(String[] args) {
		//upcasting -automatic conversion --->smaller to larger
		
		/*
		int intvalue=100;
		long longvalue=intvalue;
		System.out.println(longvalue);
		*/
		
		/*float floatvalue=10.5F;
		double doubleValue=floatvalue;
		System.out.println(doubleValue);*/
		
		//downcasting -- manually  ---- larger to smaller
		
		//long longvalue =10000;
		//int intvalue  =(int)longvalue;
		
		//doublevalue=125.55;
		//float floatvalue= (float) doublevalue;
		
		//example1
		/*int i=100;
		double d=i;  //upcasting
		System.out.println(d); //100.0 */
		
		//example2
		
		double d=10.5;
		int i=(int)d; //downcasting
		
		System.out.println(i);
		
		
		
		
		

	}

}

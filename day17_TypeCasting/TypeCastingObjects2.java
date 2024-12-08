package day17_TypeCasting;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}



public class TypeCastingObjects2 {

	public static void main(String[] args) {
		
		//Cat ct= (Cat)an;
		//Cat-->a
		//ct--> b
		//(Cat) --> c
		//an -->d
		
		//Rule1 : Conversion is valid or not
		//The type of 'd' and 'c' must have some relationship(either parent to child or child to parent
		
			//Animal an =new Dog();
			//Cat ct= (Cat)an; //Valid as per rule1
			
			//Dog dg=new Dog();
			//Cat ct=(Cat)dg;   //invaid as per rule1
		
		//Rule2 :Assignment is valid or not
		// 'C' must be either same or child of 'A'
		
			//Animal an =new Dog();
			//Cat ct=new(Cat) an;  //valid as per rule2
		
			//Animal an =new Dog();
			//Cat ct=(Dog) an;     //invalid as per Rule2
		
		//Rule3 :
		//The underlying object type of 'd' must be either same or child of 'C'
		
		//Animal an =new Dog();
		//Cat ct=(Cat) an;       //invalid as per Rule3
		
		//Rule1, Rule2 Rule3
		Animal an =new Dog();
		Dog dg=(Dog)an; //Rule1-yes Rule2-yes Rule3=Yes
		
		
		
		
		
		
		
	

	}

}

 package day11_Oops_ThisAndStaticKeywords;

public class StaticDemo {
	
	static String college="ABC High School";
	int b=30;
	
	static void m1() {
		System.out.println("This is static method");	
	}
	
	void m2() {
		System.out.println("This is non -static method");
	}
	
	void m3() {
		System.out.println(college);
		System.out.println(b);
		m1();
		m2();
	}
	
	

	public static void main(String[] args) {
		
		//1)static methods can access static stuff directly(without object)
		System.out.println(college);
		m1();
		
		//System.out.println(b); //cannot access non-static stuff through object
		//m2(); //cannot access, m2() is non-static
		
		//2)Static methods can access non-static stuff through object
		StaticDemo sd=new StaticDemo();
		System.out.println(sd.b);
		sd.m2();
		
		//3)non static methods can access everything directly
		sd.m3();
		
		
		
		
		

	}

}

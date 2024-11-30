package day9_Oops_JavaMethods_Constructors;

public class Greetings {
	
	//1) No params     No return value
	
	void m1() {
		System.out.println("How are you?! ");
	}
	
	//2) No params Return value
	String m2() {
		return "Hello how are you?";
		
	}
	
	//3)Takes Params No return Value
	void m3(String name) {
		System.out.println("Hello! "+name);
		
	}
	
	String m4(String name) {
		return ("Hello! "+name);
	}

}

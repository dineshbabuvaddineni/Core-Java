package day14_Oops_AbstractionAndInterface;

interface shape{
	int length=10;
	int width=20;
	void circle(); //abstract method
	
	default void square() {
		System.out.println("This is square - default method");
	}
	
	static void rectangle() {
		System.out.println("This is rectangle - static method");
	}
}
  

public class InterfaceDemo implements shape {
	public void circle() {
		System.out.println("This is circle - abstrat method.. ");
	}
	
	void triangle() {
		System.out.println("This is triangle method");
	}

	public static void main(String[] args) {
		
		//scenario1
		//InterfaceDemo idobj = new InterfaceDemo();
		//idobj.square();
		//idobj.circle(); //abstract
		//shape.rectangle();
		//idobj.triangle()
		
		//sceanrio2
		shape sh= new InterfaceDemo();
		
		sh.circle(); //abstract
		sh.square(); //default
		shape.rectangle(); //static method can directly access from interface
		
		//sh.triangle(); //we cannot access as this method is not present in interface
		
		System.out.println(shape.length * shape.width); // accessing static variables directly
		//System.out.println(sh.x+sh.y);   //we cannot access
		
		
		
		

	}

	

}

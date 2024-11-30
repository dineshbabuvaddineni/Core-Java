package day9_Oops_JavaMethods_Constructors;

public class ConstructorDemo {
	int x, y;
	
	
	ConstructorDemo(){
		x=100;
		y=200;
		
	}
	
	ConstructorDemo(int a, int b){
		x=a;
		y=b;
		
	}
	
	void sum() {
		System.out.println("The sum is: "+(x+y));
	}
	
	

	public static void main(String[] args) {
		
		//ConstructorDemo cd=new ConstructorDemo();//invoke default constructor
		//cd.sum();
		ConstructorDemo cd=new ConstructorDemo(20,20);
		cd.sum();
		

	}

}

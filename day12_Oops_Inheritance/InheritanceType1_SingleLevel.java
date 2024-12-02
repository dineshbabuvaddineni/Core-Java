package day12_Oops_Inheritance;

class A{
	int a=100;
	void display() {
		System.out.println(a);
	}
}

class B extends A{
	int b=200;
	void show() {
		System.out.println(b);
	}
}

public class InheritanceType1_SingleLevel {

	public static void main(String[] args) {
		A a1=new A();
		System.out.println(a1.a);
		a1.display();
		//System.out.println(a1.b);
		//a1.show();
		
		B b1=new B();
		System.out.println(b1.b);
		b1.show();
		
		System.out.println(b1.a);
		b1.display();

	}

}

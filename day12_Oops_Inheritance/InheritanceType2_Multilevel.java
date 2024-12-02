package day12_Oops_Inheritance;

class A1{
	int a=100;
	void display() {
		System.out.println(a);
	}
}

class B1 extends A1{
	int b=200;
	void show() {
		System.out.println(b);
	}
}

class C1 extends B1{
	int c=300;
	void print() {
		System.out.println(c);
	}
}

public class InheritanceType2_Multilevel {

	public static void main(String[] args) {
		
		C1 cobj=new C1();
		System.out.println(cobj.a);
		System.out.println(cobj.b);
		System.out.println(cobj.c);
		
		cobj.display();
		cobj.show();
		cobj.print();
		

	}

}

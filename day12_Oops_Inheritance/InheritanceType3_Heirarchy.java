package day12_Oops_Inheritance;

class parent{
	void display(int a) {
		System.out.println(a);
	}
	
}

class child1 extends parent{
	void show(int b) {
		System.out.println(b);
	}
}

class child2 extends parent{
	void print(int c) {
		System.out.println(c);
		
	}
}

public class InheritanceType3_Heirarchy {

	public static void main(String[] args) {
		
		child1 c1=new child1();
		c1.display(10);
		c1.show(20);
		
		child2 c2=new child2();
		c2.display(30);
		c2.print(40);
		

	}

}

package day13_Oops_MethodOverridingFinalSuperKeywords;

public class Animal {
	String color="White";
	
	void eat() {
		System.out.println("Eating ..........");
	}
}

class Dog extends Animal {
	String color="black";
	void displayColor() {
		System.out.println(super.color);
	}
	void eat() {
		System.out.println("Eating bread ..........");
		super.eat();
	}
}

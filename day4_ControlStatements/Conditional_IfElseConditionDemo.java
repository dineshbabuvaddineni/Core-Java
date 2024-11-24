package day4_ControlStatements;

public class Conditional_IfElseConditionDemo {

	public static void main(String[] args) {
		int person_age=15;
		
		/*
		if(person_age>=18)
		{
			System.out.println("eligible for vote");
		}
		else {
			System.out.println("Not eligible for vote");
		}
		*/
		
		//if there is single statement under condition we no need to specify the braces
		if(person_age>=18)
			System.out.println("eligible for vote");
		else 
			System.out.println("Not eligible for vote");
	}

}

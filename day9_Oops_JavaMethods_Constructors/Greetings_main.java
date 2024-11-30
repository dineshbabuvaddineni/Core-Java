package day9_Oops_JavaMethods_Constructors;

public class Greetings_main {

	public static void main(String[] args) {
		
		Greetings g1=new Greetings();
		g1.m1(); //1
		
		String msg=g1.m2();
		System.out.println(msg);//2
		
		g1.m3("Dinesh"); //3
		
		String ms1=g1.m4("Hari");
		System.out.println(ms1);
		
		
		

	}

}

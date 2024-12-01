package day10_PolymorphismAndEncapuslation;

public class Encapsulation_main {

	public static void main(String[] args) {
		Encapsulation e1=new Encapsulation();
		e1.setAccno(121);
		e1.setBalance(5000);
		e1.setName("Dinesh");
		
		System.out.println(e1.getAccno());
		System.out.println(e1.getBalance());
		System.out.println(e1.getName());
		
		

	}

}

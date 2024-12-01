package day10_PolymorphismAndEncapuslation;

public class AdderMain {

	public static void main(String[] args) {
		
		Adder addobj=new Adder();
		
		addobj.sum(); //1
		
		addobj.sum(100,200); //2
		
		addobj.sum(100,20.0);//3
		
		addobj.sum(100.5,15);//4
		
		addobj.sum(200,300,400); //5
		
		//addobj.sum(10.5,20.5,15.0); //invalid
		
		

	}

}

package day17_TypeCasting;


public class TypeCastingObjects3 {

	public static void main(String[] args) {
		
		//Ex1: 
		//Object o=new String("Welcome");
		//StringBuffer sb=new (StringBuffer) o; //Rule1-yes Rule2 -Yes Rule3- Failed
		
		//Ex2:
		//String s=ne String("Welcome");
		//StringBuffer sb=(StringBuffer) s; //Rule1 -failed
		
		//Ex3:
		//Object o=new String("Welcome");  
		//StringBuffer sb=(String) o;     //Rule1-pssed Rule2-failed
		
		//Ex4:	
		//String s=new String("Welcome");
		//StringBuffer sb=(String)s;      //Rue1-passed Rule2-Passed Rule3 -Failed
		
		//Ex5:
		Object o =new String("Welcome");
		String s=(String)o; //Rule1-passed Rule2-passed Rule3-passed
		
		System.out.println(s);
		
		
	}

}

package day7_Strings;

public class StringComparision {

	public static void main(String[] args) {
		//Sc1
		/*String s1="welcome";
		String s2="welcome";
		System.out.println(s1==s2);       //true
		System.out.println(s1.equals(s2));//true */
		
		//Case2
		/*String s1=new String("welcome");
		String s2=new String("welcome");
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1==s2); //false //to compare the objects
		System.out.println(s1.equals(s2)); //true //to compare values of object*/
		
		//Case 3
		/*String s1= "abc";
		String s2=new String("abc");
		
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2)); //true
		*/
		
		//Case4
		String s1="abc";
		String s2=new String("abc");
		String s3=s2;
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2==s3); 
		
		
		

	}

}

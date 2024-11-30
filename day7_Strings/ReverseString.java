package day7_Strings;

public class ReverseString {

	public static void main(String[] args) {
		
		//Approach 1
		/*String name="ram";
		String rev ="";
		
		for(int i=name.length()-1; i>=0;i--) {
			rev=rev+name.charAt(i);
			
		}
		
		System.out.println(rev);*/
		
		//Approach 2
		/*String s="Ram";
		String rev="";
		
		char a[]=s.toCharArray();
		
		for(int i=a.length-1; i>=0;i--) {
			rev=rev+a[i];
		}
		
		System.out.println("Revers a string is : "+rev);*/
		
		//Approach 3: Using StringBuffer Class
		StringBuffer s=new StringBuffer("welcome");
		System.out.println("Revers a string is "+s.reverse());
		
		//Approach 4: Using StringBuilder class
		StringBuilder s1 =new StringBuilder("Welcome");
		System.out.println("Reverse string is:"+s1.reverse());
	}

} 

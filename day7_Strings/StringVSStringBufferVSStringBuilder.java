package day7_Strings;

public class StringVSStringBufferVSStringBuilder {

	public static void main(String[] args) {
		//String - immutable
		/*String s="Welcome";
		s.concat("to java");
		System.out.println(s); //immutable, cnanot change original value of s */
		
		//StringBuffer - mutable
		/*StringBuffer s=new StringBuffer("welcome ");
		s.append("to java");
		System.out.println(s);*/
		
		//StringBuilder - mutable
		StringBuilder s=new StringBuilder("welcome");
		s.append(" to java");
		System.out.println(s);
		
		
		

	}

}

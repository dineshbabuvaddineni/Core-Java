package day7_Strings;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		//String s ="welcome";
		//String s =new String("welcome");
		//System.out.println(s);
		
		//length() - returns length of a string(number of characters)
		String s="welcome";
		s.length();
		System.out.println(s.length()); //7
		System.out.println("welcome".length());
		
		//concat - joining strings
		String s1= "Welcome";
		String s2="to java";
		String s3= " Automation";
		
		System.out.println(s1+s2); //welcome to java
		System.out.println(s1.concat(s2)); //welcome to java
		
		System.out.println(s1+s2+s3);//welcome to java automation
		System.out.println(s1.concat(s2).concat(s3)); 
		System.out.println(s1.concat(s2+s3)); //welcome to java automation
		
		System.out.println("welcome"+"to java");// welcome to java
		System.out.println("welcome".concat("to java")); //welcome to java
		
		//trim()- removes spaces right and left side
		s= "   welcome   ";
		System.out.println(s); //print string along with spaces
		System.out.println(s.trim().length());
		
		//charAt() - return a character from a string based on index
		//index starts from zero
		s="welcome";
		System.out.println(s.charAt(3)); //c
		System.out.println(s.charAt(0)); //w
		
		//contains() - returns true/false
		//checks string is part of main string or not
		
		System.out.println(s.contains("wel")); //true
		System.out.println(s.contains("come"));//true
		System.out.println(s.contains("well"));//false
		System.out.println(s.concat("come"));//false
		
		//equals(), equalsIgnoreCase() - compare strings
		s1="welcome";
		s2="welcome";
		
		System.out.println(s1==s2);  //true
		System.out.println(s1.equals(s2)); //true
		System.out.println(s.equals("Welcome")); //false
		System.out.println(s1.equalsIgnoreCase("Welcome"));
		
		//replace() - replace single/multiple/(sequence) of characters in a string
		s="Welcome to selenium java selenium python selenium c#";
		System.out.println(s.replace('e', 'X'));
		System.out.println(s.replace("selenium", "playwright")); // welcome to playwright
		
		//substring() - extract substring from main string
		//starting index - 0
		//ending index  - 1
		s="Selenium";
		System.out.println(s.substring(1,5)); //element
		System.out.println(s.substring(0,3)); //Selenium
		
		//toUpperCase() toLowerCase()
		s="Welcome";
		System.out.println(s.toUpperCase());  //Welcome
		System.out.println(s.toLowerCase());  //welcome
		
		//toUpperCase() toLowerCase()
		s="welcome";
		System.out.println(s.toUpperCase()); //Welcome
		System.out.println(s.toLowerCase()); //welcome
		
		//split() - split the string in to multiple parts based on delimiter
		s="dinesh@gmail.com";
		String a[]=s.split("@");
		System.out.println(a[0]); //abc
		System.out.println(a[1]); //@gmail.com
		
		System.out.println(Arrays.toString(a)); //[abc , gmail.com]
		
		System.out.println(a[0]); //abc
		System.out.println(a[1]); //@gmail.com
		
		//ex1
		String amount="$15,20,55"; //exp 152055 
		System.out.println(amount.replace("$", "")); //152055 
		System.out.println(amount.replace("$", "").replace(",","")); //152055
		
		//ex2
		s="abc,123@xyz"; //abc 123 xyz
		
		String arr1[]=s.split(","); //abc 123@xyz
		System.out.println(Arrays.toString(arr1)); //[abc, 123@xyz]
		
		String arr2[]=arr1[1].split("@");
		System.out.println(Arrays.toString(arr2)); //[123,  xyz]
		
		System.out.println(arr1[0]); //abc
		System.out.println(arr2[0]); //123
		System.out.println(arr2[1]); //xyz
		
		//ex3
		s="abc 123 xyz";
		String ar[]= s.split(" ");
		System.out.println(Arrays.toString(ar)); //[abc, 123, zyz]
		
		// * % ^ & ( ) - you cannot use as delimiters
		
		//ex4
		String name= "John Kennedy";
		//System.out.println(name.contains("john")); //false
		
		System.out.println(name.replace('J', 'j').contains("john")); //true
		
		System.out.println(name.toLowerCase().contains("john")) ; //true
		
		
	}

}

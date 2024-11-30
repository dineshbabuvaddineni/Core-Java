 package day9_Oops_JavaMethods_Constructors;

public class StudentMain {

	public static void main(String[] args) {
		
		//1) Using Object reference variable
		//Student s1=new Student();
		/*s1.sid=121;
		s1.sname="Dinesh";
		s1.grad='A';
		s1.printStudentData(); */
		
		//2) using method
		//s1.setStudentData(101,"David",'A');
		//s1.printStudentData();
		
		//3) Using Constructor
		Student s=new Student(121,"Dinesh",'C');
		s.printStudentData();
		
		  
		
		
	}
	
	

}

package day8_Oops_class_object_methods;

public class Student_Main {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.sid=120;
		//s1.section="Gandhi";
		s1.sname="Rahul";
		s1.age=24;
		s1.display();
		
		System.out.println("***********************************************");
		
		Student s2=new Student();
		s2.sid=121;
		//s2.section="Netaji";
		s2.sname="Sam";
		s2.age=26;
		s2.display();
			
	}

}

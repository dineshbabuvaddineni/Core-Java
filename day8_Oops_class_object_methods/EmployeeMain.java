package day8_Oops_class_object_methods;

public class EmployeeMain {
	public static void main(String[] args) {
		EmployeeClass emp1=new EmployeeClass();
		emp1.eid=121;
		emp1.ename="Dinesh";
		emp1.ejob="QE";
		emp1.salary=28000;
		emp1.display();
		
		EmployeeClass emp2=new EmployeeClass();
		emp2.eid=122;
		emp2.ename="Hari";
		emp2.ejob="Dev";
		emp2.salary=29000;
		emp2.display();
	}

}

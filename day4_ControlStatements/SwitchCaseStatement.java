package day4_ControlStatements;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		int weekno=2;
		
		/*switch(weekno)
		{
		case 1: System.out.println("Sunday");break;
		case 2: System.out.println("Monday");break;
		case 3: System.out.println("Tuesday");break;
		case 4: System.out.println("Wednesday");break;
		case 5: System.out.println("Thursday");break;
		case 6: System.out.println("Friday");break;
		case 7: System.out.println("Saturday");break;
		default :System.out.println("Invalid Week Number");
		}
		*/
		
		switch(weekno)
		{
		
		case 1: System.out.println("Sunday");break;
		case 2: System.out.println("Monday");
		case 3: System.out.println("Tuesday");break;
		case 4: System.out.println("Wednesday");break;
		case 5: System.out.println("Thursday");break;
		case 6: System.out.println("Friday");break;
		case 7: System.out.println("Saturday");break;
		default :System.out.println("Invalid Week Number");
		
		}
		
		switch(weekno)
		{
		
		case 1: System.out.println("Sunday");break;
		case 2: System.out.println("Monday");
		default :System.out.println("Invalid Week Number");
		case 3: System.out.println("Tuesday");break;
		case 4: System.out.println("Wednesday");break;
		case 5: System.out.println("Thursday");break;
		case 6: System.out.println("Friday");break;
		case 7: System.out.println("Saturday");break;
		
		
		}
		
		
		

	}

}
package day2_dataTypesAndVariables;

public class DataTypesDemo {
	public static void main(String[] args) {
		//Numeric data types
		int a=100, b=200;
		System.out.println("The value of a is :"+a);
		System.out.println("the value of b is:"+b);
		System.out.println(a+b);
		
		System.out.println("The sum of a and  is:"+(a+b));
		
		byte by=125;
		System.out.println(by);
		
		short sh=3535;
		System.out.println(sh);
		
		long l=123456589l;
		System.out.println(l); //literal is needed L/l
		
		
		//Decimal numbers- float, double
		
		float item_price=15.5F;	//literal is needed F/f
		System.out.println(item_price);
		
		double dbl=1234.4343412;
		System.out.println(dbl);
		
		char grad='A';
		System.out.println(grad);
		
		String name="Dinesh";
		System.out.println(name);
		
		//char ch='ABC'; //invalid
		//String ch='ABC'; //invalid
		//String ch='A'; //invalid
		//String ch="A";  //valid
		
		boolean bl=true;      //allows only true/false
		System.out.println(bl); 
		
		//boolean bl="true";  //invalid
		//boolean bl="false"; //invalid
		//String bl=false;    //invalid
		
		
		
		}

}

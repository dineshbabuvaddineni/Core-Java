package day16_ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		System.out.println("Program started");
		System.out.println("Program in Progress");
		
		Thread.sleep(5000);
		FileInputStream f=new FileInputStream("D://f1.txt");
		
		/*try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
		}*/
		
		System.out.println("Program Finished....");
		System.out.println("Program exited.....");

	}

}

package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import oops.polymorphism.Smartphone;

public class ExceptionTypes {

	
	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		int a=10;
		int b=0;		
		
		//Example 1 - ArithmeticException
		//System.out.println(a/b);
		
		//Example 2 - StringIndexOutOfBoundsException
		String name="anand";
		//System.out.println(name.charAt(10));
		
		//Example 3 - ArrayIndexOutOfBoundsException
		String[] arr=name.split("n");
		//System.out.println(arr[4]);
		
		//Example 4 - NullPointerException
		Smartphone phone=null;
		//phone.calling();
		
		System.out.println("anand");
		
		//Example 5 - InterruptedException
		Thread.sleep(5000);
		System.out.println("Techbodhi");		
		
		//Example 6 - FileNotFoundException
		FileInputStream file= new FileInputStream("");
		
		//Checked Exceptions - Example 5 & 6
		//Unchecked Exceptions - Example 1-4

	}

}

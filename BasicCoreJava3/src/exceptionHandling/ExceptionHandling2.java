package exceptionHandling;

import oops.polymorphism.Smartphone;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		int a=10;
		int b=10;	
		
		try {
		//Example 1 - ArithmeticException
		System.out.println(a/b);
		
		//Example 2 - StringIndexOutOfBoundsException
		String name="anand";
		System.out.println(name.charAt(2));
		
		
		//Example 3 - ArrayIndexOutOfBoundsException
		String[] arr=name.split("n");
		System.out.println(arr[4]);
		
		//Example 4 - NullPointerException
		Smartphone phone=null;
		phone.calling();
		}catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}

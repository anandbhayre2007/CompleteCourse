package exceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;	
		
		try {
		//Example 1 - ArithmeticException
		System.out.println(a/b);
		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		try {
		//Example 2 - StringIndexOutOfBoundsException
		String name="anand";
		System.out.println(name.charAt(10));
		}catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}

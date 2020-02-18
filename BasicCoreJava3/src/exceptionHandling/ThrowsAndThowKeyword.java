package exceptionHandling;

public class ThrowsAndThowKeyword {

	public static void main(String[] args) {
		sum(10,20);
		
		temp();
		
		try {
			pause(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void pause(long miliSeconds) throws InterruptedException
	{
		Thread.sleep(miliSeconds);
	}
	
	public static void sum(int a, int b) throws ArithmeticException
	{
		System.out.println(a+b);
	}
	
	public static void temp()
	{
		throw new ArithmeticException();
	}
}

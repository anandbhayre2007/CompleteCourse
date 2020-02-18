package exceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		
		try {
			System.out.println(10/1);
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Finally block");
		}

	}

}

package basicAnnotations;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGClass1 {
	
	@Test
	public void test1()
	{
		System.out.println("Test case 1");		
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test case 2");	
		throw new ArithmeticException();
	}
	
	@Test
	public void test3()
	{
		System.out.println("Test case 3");	
		throw new SkipException("Testing skip exception");
	}

}

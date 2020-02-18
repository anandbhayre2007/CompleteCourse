package module1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2Module1 {


	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class Test2Module1");	
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class Test2Module1");
	}
	
	@BeforeMethod
	public void launchBrowser()
	{
		System.out.println("Launch browser");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("Close browser");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Test2Module1 test case 1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test2Module1 test case 2");
	}
}

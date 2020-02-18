package module3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1Module3 {

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class Test1Module3");	
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class Test1Module3");
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
		System.out.println("Test1Module3 test case 1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test1Module3 test case 2");
	}
}

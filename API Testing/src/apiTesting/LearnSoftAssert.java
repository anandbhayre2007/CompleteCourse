package apiTesting;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearnSoftAssert {
	
	@Test
	public void test1()
	{
		SoftAssert asser= new SoftAssert();
		
		//verification 1
		asser.assertEquals(10, 20);
		
		//Verification 2
		asser.assertEquals(10, 40);
		
		//Verification 3
		asser.assertEquals(10, 30);
		
		asser.assertAll();
		
	}
	

}

package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {
	
	@Test(dataProvider="getData1")
	public void test1(String username, String password)
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get("http://newtours.demoaut.com/mercuryreservation.php?osCsid=a903c37c3be8a3133df53f49c38a9a50");
		
		dr.findElement(By.name("userName")).sendKeys(username);
		dr.findElement(By.name("password")).sendKeys(password);
		dr.findElement(By.name("login")).click();
		
		
		
	}
	
	@DataProvider
	public String[][] getData()
	{
		String[][] data= new String[3][2];		
		//Row 1
		data[0][0]="mercury";
		data[0][1]="mercury";
		
		//Row 2
		data[1][0]="mercury1";
		data[1][1]="mercury1";
		
		//Row 2
		data[2][0]="mercury";
		data[2][1]="mercury";
		
		return data;		
	}

	@DataProvider
	public String[][] getData1() throws IOException
	{
		Xls_Reader xl= new Xls_Reader("D:\\12012019Automation\\TestNGProject2\\src\\test\\TestData.xlsx");
		
		int rows=xl.getRowCount("Sheet1");	
		int cols=xl.getColumnCount("Sheet1");
		
		String[][] data= new String[rows-1][cols];
		
		for(int r=2; r<=rows; r++)
		{
			for(int c=1; c<=cols; c++)
			{
				data[r-2][c-1]=xl.getCellData("Sheet1", r, c);
			}
		}		
		return data;
	}

}

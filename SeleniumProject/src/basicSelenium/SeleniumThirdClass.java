package basicSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumThirdClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://newtours.demoaut.com/mercuryreservation.php?osCsid=a903c37c3be8a3133df53f49c38a9a50");
		
		dr.findElement(By.name("findFlights")).click();
		
		WebElement text=dr.findElement(By.xpath("//font[@face='Arial, Helvetica, sans-serif'][@size='2']"));
		
		System.out.println(text.getText());
		
		dr.findElement(By.name("reserveFlights")).click();
		
		dr.findElement(By.name("ticketLess")).click();
		
		dr.findElement(By.xpath("(//input[@name='ticketLess'])[2]")).click();
		
		WebElement country=dr.findElement(By.name("delCountry"));
		
		Select sel= new Select(country);
		
		sel.selectByVisibleText("INDIA");
		
		Alert alt=dr.switchTo().alert();
		
		System.out.println(alt.getText());
		
		alt.dismiss();
		
	}

}

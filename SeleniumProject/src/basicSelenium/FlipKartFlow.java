package basicSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipKartFlow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		
		//Implicit wait
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		dr.get("https://www.flipkart.com/");
		
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		Actions act= new Actions(dr);
		
		act.moveToElement(dr.findElement(By.xpath("//span[text()='Men']"))).build().perform();
		
		
		//Explicit Wait
		WebDriverWait wait= new WebDriverWait(dr,10);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Shirts']")));
		
		dr.findElement(By.xpath("//a[text()='Shirts']")).click();
		
		act.dragAndDropBy(dr.findElement(By.xpath("//div[@class='_3G9WVX oVjMho']/div[@class='_3aQU3C']")), 50, 0).build().perform();
		
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("//img[@class='_3togXc']")).click();
		
		String parent=dr.getWindowHandle();
		Set<String> wins=dr.getWindowHandles();
		
		for(String s:wins)
		{
			if(!s.equals(parent)) {
				dr.switchTo().window(s);
				break;
			}
		}
		
		dr.findElement(By.xpath("//input[@placeholder='Enter delivery pincode']")).sendKeys("412207");
	}

}

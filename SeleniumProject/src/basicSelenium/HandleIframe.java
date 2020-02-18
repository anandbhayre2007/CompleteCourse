package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIframe {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.get("https://paytm.com/");
		
		Thread.sleep(5000);
		
		dr.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();

		Thread.sleep(3000);
		
		dr.switchTo().frame(dr.findElement(By.tagName("iframe")));
		dr.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();
	}

}

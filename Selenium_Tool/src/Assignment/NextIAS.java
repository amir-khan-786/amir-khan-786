package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NextIAS {

	
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.nextias.com");
		
		driver.findElement(By.xpath("(//span[text()='×'])[2]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Live/Online Class')]")).click();;
		driver.findElement(By.id("emailLog")).sendKeys("deepak@appsquadz.com");
		driver.findElement(By.id("passLog")).sendKeys("Deep@123");
		driver.findElement(By.xpath("//a[text()='SignIn']")).click();
		//driver.findElement(By.className("logout-btn")).click();
	}
}

package Assignment;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {


	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://65.0.58.104/index.php/web_new/home");
		
JavascriptExecutor jse = (JavascriptExecutor)driver;

Thread.sleep(2000);
//jse.executeScript("window.scrollBy(0,8000);");

WebElement cNews = driver.findElement(By.xpath("(//h1[text()='Current News'])[1]"));
int yaxis = cNews.getLocation().getY();

jse.executeScript("window.scrollBy(0,"+yaxis+")");

	

}
}


package Sam_Samayik.generics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scroll {

	public  static WebDriver driver;

	public static void scrollDownByAxies( String location ) throws InterruptedException
	{
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		Thread.sleep(2000);
		jse.executeScript(location);

	
	}
	
	
	public static void scrollDownByElementLocation( String pathvalue) throws InterruptedException
	{
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		Thread.sleep(1000);
		
		WebElement cNews = driver.findElement(By.xpath(pathvalue));
		
		int yaxis = cNews.getLocation().getY();

		jse.executeScript("window.scrollBy(0,"+yaxis+")");

	}

	
}

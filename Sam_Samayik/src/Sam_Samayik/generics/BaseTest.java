package Sam_Samayik.generics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

abstract public class BaseTest implements IAutoConstant
{
	static
	{
		System.setProperty(CHROM_KEY,CHROM_VALUE);
		System.setProperty(GECKO_KEY,GECKO_VALUE);
	}
	
	public static WebDriver driver;
	
	public static void openBrowser(String sBrowser)
	{
		if(sBrowser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(sBrowser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(sBrowser.equals("ie"))
		{
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
	

	public static void screenShot(String fileName) throws IOException
	{

		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File desc = new File(fileName);
		
		FileUtils.copyFile(src, desc);
	}
	

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

	
	
	
	
	
	public static void closeBrowser()
	{
		driver.close();
	}

}

package Assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllTHeBrowser2 {


	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com");
		
		String pwhs = driver.getWindowHandle();
		Set<String> whs = driver.getWindowHandles();
		
		int count = whs.size();
		
		System.out.println(count);
		
		for(String windows:whs)
		{
			driver.switchTo().window(windows);
		
			if(windows.equals(pwhs))
			{
			
		    String title = driver.getTitle();
		    System.out.println(title);
		}
			
			else
			{
				
			
	driver.close();
}
		}

	}
}

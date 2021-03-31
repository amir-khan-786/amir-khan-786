
package Sam_Samayik.scripts;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import Sam_Samayik.generics.FWUtils;
import Sam_Samayik.generics.baseClass;
import Sam_Samayik.pages.HomePage;
import Sam_Samayik.pages.LoginPage;
import io.appium.java_client.MobileElement;

public class TestValidUserLogin  extends baseClass{


	public static void main(String[] args) throws MalformedURLException,  InterruptedException, AWTException {
		
		
		baseMethod();
		String context = driver.getContext();
		
		
		System.out.println(context);
		
		System.out.println(driver.getStatus());
		
		Map<String, Object> s = driver.getSessionDetails();
		
		System.out.println(s);
		
		
		driver.findElement(By.id("com.google.android.gms:id/cancel")).click();
		
		driver.findElement(By.id("com.ssgcp.app:id/on_home_register")).click();
		
		driver.findElement(By.id("com.ssgcp.app:id/login_number")).sendKeys("9971808064");
		
		driver.findElement(By.id("com.ssgcp.app:id/login_password")).sendKeys("12345678");
		driver.findElement(By.id("com.ssgcp.app:id/login_done")).click();
		
		URL l = driver.getRemoteAddress();
		System.out.println(l);
		
		System.out.println("driver.getCommandExecutor()");
		

	}
	
}


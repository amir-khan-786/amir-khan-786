package Appium;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.remote.MobileCapabilityType;

public class DemoSamSamayik2 {

    public static void main(String[] args) throws MalformedURLException, AWTException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");

		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
	
		dc.setCapability("appPackage","com.ssgcp.app");
		dc.setCapability("appActivity","com.sam.samayik.ui.child.dashboard.DashBoardActivity");
		
		
		
		URL url = new URL(" http://localhost:4723/wd/hub");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,dc);
		
		
		
		Robot r = new Robot();
		Thread.sleep(1000);
		
		
		
		
		driver.findElement(By.id("com.google.android.gms:id/cancel")).click();
		
		driver.findElement(By.id("com.ssgcp.app:id/on_home_register")).click();
		
		driver.findElement(By.id("com.ssgcp.app:id/login_number")).sendKeys("9971808064");
		
		driver.findElement(By.id("com.ssgcp.app:id/login_password")).sendKeys("12345678");
		driver.findElement(By.id("com.ssgcp.app:id/login_done")).click();
	
//	r.keyPress(KeyEvent.VK_ENTER);
//
//	r.keyRelease(KeyEvent.VK_ENTER);

	}
}

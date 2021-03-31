package Sam_Samayik.generics;

import java.awt.AWTException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public abstract class baseClass {

	public static AndroidDriver<WebElement> driver;
    public static void baseMethod() throws MalformedURLException, AWTException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");

		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
	
		dc.setCapability("appPackage","com.ssgcp.app");
		dc.setCapability("appActivity","com.sam.samayik.ui.child.dashboard.DashBoardActivity");
		
		Thread.sleep(1000);
		
		URL url = new URL("http://localhost:4723/wd/hub");
		
		
		 driver=new AndroidDriver<WebElement>(url,dc);
		
		Thread.sleep(2000);
		
}
}

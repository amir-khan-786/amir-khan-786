package Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DemoSamSamayik {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");

		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		

		dc.setCapability("appPackage","com.ssgcp.app");
		dc.setCapability("appActivity","com.sam.samayik.ui.child.dashboard.DashBoardActivity");
		
		Thread.sleep(1000);
		URL url = new URL(" http://localhost:4723/wd/hub");
		
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,dc);

		System.out.println("Test case is Pass !");
	}
}

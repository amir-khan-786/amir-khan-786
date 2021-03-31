package Appium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DemoOpenSamSamayik {

    public static void main(String[] args) throws MalformedURLException, InterruptedException, AWTException {
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");

		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		
		dc.setCapability("appPackage","com.ssgcp.app");
		dc.setCapability("appActivity","com.sam.samayik.ui.child.dashboard.DashBoardActivity");
		Thread.sleep(10000);
		
		
		URL url = new URL(" http://localhost:4723/wd/hub");
		Thread.sleep(10000);
		
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(url,dc);
        Thread.sleep(5000);
        Actions a =new Actions(driver);
        a.click();
	}
}

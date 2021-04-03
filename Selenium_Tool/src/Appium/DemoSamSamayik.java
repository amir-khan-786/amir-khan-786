package Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DemoSamSamayik {

    public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");

		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		
		dc.setCapability(MobileCapabilityType.APP, "G:\\SamQuiz.apk");
		
		URL url = new URL(" http://localhost:4723/wd/hub");
		
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,dc);

		
	}
}

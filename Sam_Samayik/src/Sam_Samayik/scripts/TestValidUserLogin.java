
package Sam_Samayik.scripts;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Sam_Samayik.generics.BaseTest;
import Sam_Samayik.generics.FWUtils;
import Sam_Samayik.pages.HomePage;
import Sam_Samayik.pages.LoginPage;

public class TestValidUserLogin  extends BaseTest{
@Test
public static void valid_User_Login() throws InterruptedException, IOException {
	
	openBrowser("chrome");
	
	
	FWUtils.verifyURL(driver, "http://65.0.58.104:8777/index.php/web_new/home");
	screenShot("./photo/homePage.png");
	scrollDownByAxies("window.scrollBy(0,9000);");
	
	scrollDownByAxies("window.scrollBy(0,-9000);");
	
	
	  
	  HomePage home= new HomePage(driver); home.Sign_IN();
	  
	  
	  
	  LoginPage lp = new LoginPage(driver);
	  
		screenShot("./photo/LoginPage.png");

	  
	  lp.EnteruserName("9971808064"); 
	  lp.enterPassword("12345678");
	  Thread.sleep(1000);
	  lp.clickOnContinueBTN(); 
	  System.out.println("Title of Login Page ");

		FWUtils.verifyURL(driver, "http://65.0.58.104:8777/index.php/web_new/home");
	  home.clickONGuestName();
	  Thread.sleep(500);
	  home.clickOnLogoutBTN();
	
	  System.out.println("Test Case is Pass Enjoy");
	  Thread.sleep(500);

		FWUtils.verifyURL(driver, "http://65.0.58.104:8777/index.php/web_new/home");
		  Thread.sleep(500);

	  closeBrowser();
	 
}
}

package Sam_Samayik.scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Sam_Samayik.generics.BaseTest;
import Sam_Samayik.generics.FWUtils;
import Sam_Samayik.pages.HomePage;
import Sam_Samayik.pages.LoginPage;

public class TestLoginPage extends BaseTest{

	@Test
	public static void test_Login_Page() throws InterruptedException, IOException {
		
		openBrowser("chrome");
		Thread.sleep(1000);
		FWUtils.verifyURL(driver,"http://65.0.58.104/index.php/web_new/Home");
		screenShot("./photo/homePage.png");
		scrollDownByAxies("window.scrollBy(0,9000);");
		
		scrollDownByAxies("window.scrollBy(0,-9000);");
	

		HomePage home= new HomePage(driver);
		home.Sign_IN();
       
		LoginPage lp = new LoginPage(driver);
		Thread.sleep(500);
	    lp.SizeOF_userNameTextBox();
		Thread.sleep(500);

	     lp.SizeOF_passwordTextBox();
	     
		lp.EnteruserName("9971808064");
		lp.enterPassword("12345678");
		Thread.sleep(500);
		
		lp.clickOnContinueBTN();
	
		FWUtils.verifyURL(driver,"http://65.0.58.104/index.php/web_new/Home");
		
		
	   
}
}
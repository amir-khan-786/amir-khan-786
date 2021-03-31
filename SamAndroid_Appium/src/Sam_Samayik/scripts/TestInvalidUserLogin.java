package Sam_Samayik.scripts;



import java.util.Scanner;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Sam_Samayik.generics.BaseTest;
import Sam_Samayik.generics.FWUtils;
import Sam_Samayik.pages.HomePage;
import Sam_Samayik.pages.LoginPage;

public class TestInvalidUserLogin extends BaseTest {

public static void main(String[]args) throws InterruptedException {


	openBrowser("chrome");
	FWUtils.verifyPageTitle(driver, "Sam Samayik: Ghatna Chakra");
	Thread.sleep(1000);
	
	FWUtils.verifyURL(driver,"http://65.0.58.104/index.php/web_new/Home");
	
	HomePage home= new HomePage(driver);
	home.Sign_IN();
	
	
	
	LoginPage lp = new LoginPage(driver);
	lp.clickOnContinueBTN();
   
   

	lp.EnteruserName("987180806");
	lp.clickOnContinueBTN();
	
	lp.clearusernameandpassword();
	System.out.println("Invalid username and id ");
	
	
	

	lp.EnteruserName("9871808064");
	lp.enterPassword("123456789");
	lp.clickOnContinueBTN();
	lp.clickONOKBTN();
	lp.clearusernameandpassword();

	System.out.println("Invalid username and id ");
	
	
	

	lp.EnteruserName("997808064");
	lp.enterPassword("12345678");
	lp.clickOnContinueBTN();
	lp.clickONOKBTN();
	lp.clearusernameandpassword();

	System.out.println("Invalid username and id ");
	
	

	lp.EnteruserName("Amir");
	lp.enterPassword("12345678");
	lp.clickOnContinueBTN();
	lp.clickONOKBTN();
	lp.clearusernameandpassword();

	System.out.println("Invalid username and id ");
	
	

	lp.EnteruserName(" Amir");
	lp.enterPassword(" Amir");
	lp.clickOnContinueBTN();
	lp.clickONOKBTN();
	lp.clearusernameandpassword();

	System.out.println("Invalid username and id ");
	

	lp.EnteruserName("12345678");
	lp.enterPassword("9971808064");
	lp.clickOnContinueBTN();
	lp.clickONOKBTN();
	lp.clearusernameandpassword();

	System.out.println("Invalid username and id ");
	
	
	
	FWUtils.verifyURL(driver,"http://65.0.58.104/index.php/web_new/home");

	
	
	System.out.println("Title of Login Page ");
	
	System.out.println("Test case is Pass ");
	
    System.out.println("Please Create Account First ");
	
	driver.close();

}


}

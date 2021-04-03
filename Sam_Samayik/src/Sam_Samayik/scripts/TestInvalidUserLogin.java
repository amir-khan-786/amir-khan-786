package Sam_Samayik.scripts;






import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Sam_Samayik.generics.BaseTest;
import Sam_Samayik.generics.FWUtils;
import Sam_Samayik.pages.HomePage;
import Sam_Samayik.pages.LoginPage;

public class TestInvalidUserLogin extends BaseTest {

	@Test
public static void test_InvalidUserLogin() throws InterruptedException {
	openBrowser("chrome");
	
	Thread.sleep(1000);
	
	
	FWUtils.verifyURL(driver,"http://65.0.58.104/index.php/web_new/Home");
	
	HomePage home= new HomePage(driver);
	home.Sign_IN();

	LoginPage lp = new LoginPage(driver);
	Thread.sleep(500);
	lp.clickOnContinueBTN();
   
	Thread.sleep(500);


	lp.EnteruserName("987180806");
	lp.clickOnContinueBTN();
	Thread.sleep(500);

	lp.clearusernameandpassword();
	System.out.println("Invalid username and id ");
	
	Thread.sleep(500);

	

	lp.EnteruserName("9871808064");
	lp.enterPassword("123456789");
	lp.clickOnContinueBTN();
	Thread.sleep(500);

	lp.clickONOKBTN();
	lp.clearusernameandpassword();

	System.out.println("Invalid username and id ");
	
	
	
	Thread.sleep(500);

	lp.EnteruserName("997808064");
	lp.enterPassword("12345678");
	lp.clickOnContinueBTN();
	Thread.sleep(500);

	lp.clickONOKBTN();
	lp.clearusernameandpassword();

	System.out.println("Invalid username and id ");
	
	
	Thread.sleep(500);

	lp.EnteruserName("Amir");
	lp.enterPassword("12345678");
	lp.clickOnContinueBTN();
	Thread.sleep(500);

	lp.clickONOKBTN();
	lp.clearusernameandpassword();

	System.out.println("Invalid username and id ");
	
	Thread.sleep(500);


	lp.EnteruserName(" Amir");
	lp.enterPassword(" Amir");
	lp.clickOnContinueBTN();
	Thread.sleep(500);

	lp.clickONOKBTN();
	lp.clearusernameandpassword();
	Thread.sleep(500);

	System.out.println("Invalid username and id ");
	

	lp.EnteruserName("12345678");
	lp.enterPassword("9971808064");
	lp.clickOnContinueBTN();
	Thread.sleep(500);

	lp.clickONOKBTN();
	lp.clearusernameandpassword();

	System.out.println("Invalid username and id ");
	
	
	Thread.sleep(500);

	FWUtils.verifyURL(driver,"http://65.0.58.104/index.php/web_new/home");

	Thread.sleep(500);

	
	System.out.println("Test case is Pass ");
	
    System.out.println("Please Create Account First ");
	Thread.sleep(500);

	driver.close();

}


}

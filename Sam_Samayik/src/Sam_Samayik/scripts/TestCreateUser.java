package Sam_Samayik.scripts;



import java.util.concurrent.TimeUnit;

import Sam_Samayik.generics.BaseTest;
import Sam_Samayik.generics.FWUtils;
import Sam_Samayik.pages.Create_accountPage;
import Sam_Samayik.pages.HomePage;
import Sam_Samayik.pages.LoginPage;

public class TestCreateUser extends BaseTest{

public static void main(String[] args) throws InterruptedException {
	
	openBrowser("chrome");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	FWUtils.verifyURL(driver, URL);
	
	HomePage home= new HomePage(driver);
	home.Sign_IN();
	

	LoginPage lp = new LoginPage(driver);
	Thread.sleep(1000);
	lp.clickOnCreateAccountBTN();
	
	Create_accountPage ca = new Create_accountPage(driver);
	
	
	ca.ClickOnContinueBTN();
	
	ca.enterUserName();
	ca.SizeOF_userNameTextBox();
	ca.ClickOnContinueBTN();
	
	ca.enterUserName();
	ca.enterMobileNumber();
	ca.SizeOF_MobileTextBox();
	ca.ClickOnContinueBTN();
	
	ca.enterUserName();
	ca.enterMobileNumber();
	ca.enterEmail();
	ca.SizeOF_emailTextBox();
	ca.ClickOnContinueBTN();
	
	ca.enterUserName();
	ca.enterMobileNumber();
	ca.enterPassword();
	ca.SizeOF_passwordTextBox();
	ca.ClickOnContinueBTN();
	
	ca.enterUserName();
	ca.enterMobileNumber();
	
	ca.enterPassword();
	ca.acceptTermandCondition();
	ca.SizeOF_continueBTN();
	ca.ClickOnContinueBTN();
	
	FWUtils.verifyURL(driver, URL);

	ca.clickOnMoileAlreadyExistPopUPs();
	
	
	
     System.out.println("Test case is Pass ");
     
    // driver.close();

}
	
}

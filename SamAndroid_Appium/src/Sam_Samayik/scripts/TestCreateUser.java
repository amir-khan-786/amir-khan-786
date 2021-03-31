package Sam_Samayik.scripts;



import java.util.concurrent.TimeUnit;

import Sam_Samayik.generics.BaseTest;
import Sam_Samayik.generics.FWUtils;
import Sam_Samayik.pages.Create_accountPage;
import Sam_Samayik.pages.HomePage;
import Sam_Samayik.pages.LoginPage;

public class TestCreateUser extends BaseTest{

public static void main(String[] args) {
	
	openBrowser("chrome");
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
FWUtils.verifyPageTitle(driver, "Sam Samayik: Ghatna Chakra");
	
	
	HomePage home= new HomePage(driver);
	home.Sign_IN();
	

	LoginPage lp = new LoginPage(driver);
	lp.clickOnCreateAccountBTN();
	
	Create_accountPage ca = new Create_accountPage(driver);
	ca.enterUserName();
	ca.enterMobileNumber();
	ca.enterEmail();
	ca.enterPassword();
	ca.acceptTermandCondition();
	ca.ClickOnContinueBTN();
	ca.clickOnMoileAlreadyExistPopUPs();
	
	
	FWUtils.verifyPageTitle(driver, "Sam Samayik: Ghatna Chakra");
	
     System.out.println("Test case is Pass ");
     
    // driver.close();

}
	
}

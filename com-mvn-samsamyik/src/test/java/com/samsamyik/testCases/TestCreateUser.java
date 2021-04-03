package com.samsamyik.testCases;

import java.util.concurrent.TimeUnit;

import com.samsamyik.generics.BaseTest;
import com.samsamyik.generics.FWUtils;
import com.samsamyik.pageObject.Create_accountPage;
import com.samsamyik.pageObject.HomePage;
import com.samsamyik.pageObject.LoginPage;

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

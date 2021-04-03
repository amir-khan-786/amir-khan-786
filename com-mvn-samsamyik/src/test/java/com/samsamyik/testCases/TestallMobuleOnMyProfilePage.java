package com.samsamyik.testCases;

import com.samsamyik.generics.BaseTest;
import com.samsamyik.generics.FWUtils;
import com.samsamyik.pageObject.HomePage;
import com.samsamyik.pageObject.LoginPage;
import com.samsamyik.pageObject.MyProfilePage;

public class TestallMobuleOnMyProfilePage extends BaseTest {

public static void main(String[] args) throws InterruptedException {
	

	openBrowser("chrome");
	FWUtils.verifyPageTitle(driver, "Sam Samayik: Ghatna Chakra");
	HomePage home= new HomePage(driver);
	home.Sign_IN();

	LoginPage lp = new LoginPage(driver);
	lp.EnteruserName("9971808064");
	lp.enterPassword("12345678");
	lp.clickOnContinueBTN();
	System.out.println("Title of Login Page ");
	FWUtils.verifyPageTitle(driver, "Sam Samayik: Ghatna Chakra");
	home.clickONGuestName();
		
	MyProfilePage my = new MyProfilePage(driver);
	my.myProfile();
	my.clear_All();
	my.enterUnTb("Amir");
	my.enterMobileNumber("9971808064");
	my.enterEmail("amir@gmail.com");
	Thread.sleep(1000);
	 my.clickOnUpdateBTN();
	 Thread.sleep(1000);
	 
	driver.switchTo().alert().accept();
	my.clickOnMembership();
	my.clickOnMYWishlist();
	my.clickONBookmark();
	my.clickOnMy_Oder();
	my.clickONMy_Purchage();
	my.clickOnEarnPoint();
	my.clickOnNotification();
	my.clickOnCustomerSupport();
	my.clickOnLogoutBTN();
	
	driver.close();
	
}
}


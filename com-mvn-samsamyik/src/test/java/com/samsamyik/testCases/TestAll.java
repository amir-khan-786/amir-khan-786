package com.samsamyik.testCases;

import com.samsamyik.generics.BaseTest;
import com.samsamyik.generics.FWUtils;
import com.samsamyik.pageObject.Create_accountPage;
import com.samsamyik.pageObject.HomePage;
import com.samsamyik.pageObject.LoginPage;
import com.samsamyik.pageObject.MyProfilePage;

public class TestAll extends BaseTest {
public static void main(String[] args) throws InterruptedException {
	//InvalidUserLogin
	
	  openBrowser("chrome"); 
	  FWUtils.verifyPageTitle(driver,"Sam Samayik: Ghatna Chakra"); 
	  HomePage home= new HomePage(driver);
	  home.Sign_IN();
	  
	  LoginPage lp = new LoginPage(driver); 
	  lp.EnteruserName("987180806");
	  lp.enterPassword("12345678"); 
	  lp.clickOnContinueBTN(); 
	  Thread.sleep(1000);
	  lp.clickONOKBTN();
	  lp.clearusernameandpassword();
	  System.out.println("Invalid username and id ");
	  
	  lp.EnteruserName("9871808064"); 
	  lp.enterPassword("123456789");
	  lp.clickOnContinueBTN(); 
	  Thread.sleep(1000);
	   lp.clickONOKBTN(); 
	  lp.clearusernameandpassword();
	  System.out.println("Invalid username and id ");
	  
	  lp.EnteruserName("997808064"); 
	  lp.enterPassword("12345678");
	  lp.clickOnContinueBTN(); 
	  Thread.sleep(1000);
	  lp.clickONOKBTN(); 
	  lp.clearusernameandpassword();
	  System.out.println("Invalid username and id ");
	  
	  lp.EnteruserName("Amir"); 
	  lp.enterPassword("12345678");
	  lp.clickOnContinueBTN(); 
	  Thread.sleep(1000);
	  lp.clickONOKBTN(); 
	  lp.clearusernameandpassword();
	  System.out.println("Invalid username and id ");
	  
	  lp.EnteruserName(" Amir"); 
	  lp.enterPassword(" Amir");
	  lp.clickOnContinueBTN();
	  Thread.sleep(1000);
	  lp.clickONOKBTN(); 
	  lp.clearusernameandpassword();
	  System.out.println("Invalid username and id ");
	  
	  lp.EnteruserName("12345678"); 
	  lp.enterPassword("9971808064");
	  lp.clickOnContinueBTN();
	  Thread.sleep(1000);
	  lp.clickONOKBTN(); 
	  lp.clearusernameandpassword();
	  System.out.println("Invalid username and id ");
	  
	  System.out.println("Title of Login Page "); 
	  FWUtils.verifyPageTitle(driver,"Sam Samayik: Ghatna Chakra");
	  System.out.println(" Invalid user Can not Login Test case is Pass ");
	  System.out.println("Please Create Account First "); 
	  driver.close();
	  
	  //Create account By user 
	  openBrowser("chrome");
	 FWUtils.verifyPageTitle(driver,"Sam Samayik: Ghatna Chakra");
	  HomePage home1= new HomePage(driver); 
	  home1.Sign_IN();
	  Thread.sleep(1000);
	  
	  LoginPage lp1 = new LoginPage(driver); 
	  lp1.clickOnCreateAccountBTN();
	  
	  Create_accountPage ca1 = new Create_accountPage(driver);
	  ca1.enterUserName();
	  ca1.enterMobileNumber(); 
	  ca1.enterEmail(); 
	  ca1.enterPassword();
	  ca1.ClickOnContinueBTN(); 
	  Thread.sleep(1000);
	  FWUtils.verifyPageTitle(driver, "Sam Samayik: Ghatna Chakra");
	  System.out.println(" Create Account Test case is Pass "); 
	  driver.close();
	  
	  //Valid Login User 
	  openBrowser("chrome");
	  Thread.sleep(1000);
	  FWUtils.verifyPageTitle(driver,"Sam Samayik: Ghatna Chakra");
	  HomePage home2= new HomePage(driver);
	  home2.Sign_IN();
	  
	  LoginPage lp2 = new LoginPage(driver); 
	  lp2.EnteruserName("9971808064");
	  lp2.enterPassword("12345678"); 
	  lp2.clickOnContinueBTN();
	  System.out.println("Title of Login Page "); 
	  FWUtils.verifyPageTitle(driver,
	  "Sam Samayik: Ghatna Chakra"); 
	  home2.clickONGuestName();
	  home2.clickOnLogoutBTN();
	  Thread.sleep(1000);
	  FWUtils.verifyPageTitle(driver,"Sam Samayik: Ghatna Chakra");
	  System.out.println(" Valid User Login Test Case is Pass "); 
	  closeBrowser();
	  
	  
	  
	  // My profile 
	  openBrowser("chrome");
	  Thread.sleep(1000);
	  FWUtils.verifyPageTitle(driver, "Sam Samayik: Ghatna Chakra"); 
	  HomePage home3= new HomePage(driver);
	  home3.Sign_IN();
	  
	  LoginPage lp3 = new LoginPage(driver); 
	  lp3.EnteruserName("9971808064");
	  lp3.enterPassword("12345678"); 
	  lp3.clickOnContinueBTN();
	  System.out.println("Title of Login Page ");
	  Thread.sleep(1000);
	  FWUtils.verifyPageTitle(driver,"Sam Samayik: Ghatna Chakra"); 
	  home3.clickONGuestName();
	  
	  MyProfilePage my = new MyProfilePage(driver); 
	  my.myProfile(); 
	  my.clear_All();
	  my.enterUnTb("Amir"); 
	  my.enterMobileNumber("9971808064");
	  my.enterEmail("amir@gmail.com");
	  my.clickOnUpdateBTN();
	  System.out.println("My profile Test Case is pass "); 
	  driver.close();
	 
	     
// My Profile Page 
	 	openBrowser("chrome");
	 	  Thread.sleep(1000);
	 	FWUtils.verifyPageTitle(driver, "Sam Samayik: Ghatna Chakra");
	 	HomePage home4= new HomePage(driver);
	 	home4.Sign_IN();
	 	Thread.sleep(1000);
	 	LoginPage lp4 = new LoginPage(driver);
	 	lp4.EnteruserName("9971808064");
	 	lp4.enterPassword("12345678");
	 	lp4.clickOnContinueBTN();
	 	System.out.println("Title of Login Page ");
	 	Thread.sleep(1000);
	 	FWUtils.verifyPageTitle(driver, "Sam Samayik: Ghatna Chakra");
	 	home4.clickONGuestName();
	 	Thread.sleep(1000);	
	 	MyProfilePage my4 = new MyProfilePage(driver);
	 	my4.myProfile();
	 	my4.clear_All();
	 	my4.enterUnTb("Amir");
	 	my4.enterMobileNumber("9971808064");
	 	my4.enterEmail("amir@gmail.com");
	 	Thread.sleep(1000);
	 	 my4.clickOnUpdateBTN();
	 	 Thread.sleep(1000);
	 	 
	 	driver.switchTo().alert().accept();
	 	Thread.sleep(1000);
	 	my4.clickOnMembership();
	 	my4.clickOnMYWishlist();
	 	my4.clickONBookmark();
	 	my4.clickOnMy_Oder();
	 	my4.clickONMy_Purchage();
	 	my4.clickOnEarnPoint();
	 	my4.clickOnNotification();
	 	my4.clickOnCustomerSupport();
	 	my4.clickOnLogoutBTN();
	 	
	 	driver.close();
		System.out.println("My Profile Test Case is pass ");
		
	}
}

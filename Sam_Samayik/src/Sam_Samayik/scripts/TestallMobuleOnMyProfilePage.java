package Sam_Samayik.scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Sam_Samayik.generics.BaseTest;
import Sam_Samayik.generics.FWUtils;
import Sam_Samayik.pages.HomePage;
import Sam_Samayik.pages.LoginPage;
import Sam_Samayik.pages.MyProfilePage;

public class TestallMobuleOnMyProfilePage extends BaseTest {

public static void main(String[] args) throws InterruptedException {
	

	openBrowser("chrome");
	
	HomePage home= new HomePage(driver);
	home.Sign_IN();

	LoginPage lp = new LoginPage(driver);
	lp.EnteruserName("9971808064");
	lp.enterPassword("12345678");
	lp.clickOnContinueBTN();
	System.out.println("Title of Login Page ");
	
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


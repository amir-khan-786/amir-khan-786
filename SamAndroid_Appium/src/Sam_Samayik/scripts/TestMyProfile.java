package Sam_Samayik.scripts;

import Sam_Samayik.generics.BaseTest;
import Sam_Samayik.generics.FWUtils;
import Sam_Samayik.pages.HomePage;
import Sam_Samayik.pages.LoginPage;
import Sam_Samayik.pages.MyProfilePage;

public class TestMyProfile extends BaseTest {
	
	
    public static void main(String[] args) {
	

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
	my.clickOnUpdateBTN();
	System.out.println("My profile Test Case is pass ");
     

}
}
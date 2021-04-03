package Sam_Samayik.scripts;

import Sam_Samayik.generics.BaseTest;
import Sam_Samayik.generics.FWUtils;
import Sam_Samayik.pages.HomePage;
import Sam_Samayik.pages.LoginPage;
import Sam_Samayik.pages.MyProfilePage;

public class TestMyProfile extends BaseTest {
	
	
    public static void main(String[] args) {
	

	openBrowser("chrome");
	
	HomePage home= new HomePage(driver);
	home.Sign_IN();

	LoginPage lp = new LoginPage(driver);
	lp.EnteruserName("9971808064");
	lp.enterPassword("12345678");
	lp.clickOnContinueBTN();
	System.out.println("URL of Login Page ");
	FWUtils.verifyURL(driver, URL);
	home.clickONGuestName();
		
	MyProfilePage my = new MyProfilePage(driver);
	my.myProfile();
	FWUtils.verifyURL(driver,"http://65.0.58.104:8777/index.php/web_new/home/profile/95");
	my.clear_All();
	my.enterUnTb("Amir");
	my.enterMobileNumber("9971808064");
	my.enterEmail("amir@gmail.com");
	my.clickOnUpdateBTN();
	System.out.println("My profile Test Case is pass ");
     

}
}
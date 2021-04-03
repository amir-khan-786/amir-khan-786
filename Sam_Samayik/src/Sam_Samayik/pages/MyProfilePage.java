package Sam_Samayik.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {

	@FindBy(xpath = "(//a[text()='My Profile'])[1]")
	private WebElement  My_Pofille;
	
	
	@FindBy(id = "fname")
	private WebElement UNTB;
	
	
	@FindBy(xpath = "//p[text()='Enter your name']")
	private WebElement UNTB_Error;
	
	
	@FindBy(id = "mobile")
	private WebElement  mobile;
	
	
	@FindBy(xpath = "//p[text()='Enter your mobile']")
	private WebElement  Mobile_Error;

	@FindBy(id = "email")
	private WebElement email;
	
	
	@FindBy(xpath = "//span[text()='Enter your  email id']")
	private WebElement email_Error;
	
	
	
	@FindBy(xpath = "//a[text()='Membership']")
	private WebElement membership;
	

	@FindBy(xpath = "//button[text()='Update']")
	private WebElement update;
	
	@FindBy(xpath = "//a[contains(text(),'Wishlist')]")
	private WebElement my_WishList;
	
	
	@FindBy(xpath = "//a[contains(text(),'Bookmark')]")
	private WebElement bookmark;
	
	
	

	@FindBy(xpath = "//a[contains(text(),'My Order')]")
	private WebElement my_oder;
	
	@FindBy(xpath = "//a[contains(text(),'My Purchase')]")
	private WebElement My_purchage;
		
	@FindBy(xpath = "(//a[contains(text(),'Earn Points')])[1]")
	private WebElement earnPoint;	
		
	@FindBy(xpath = "(//a[contains(text(),'Notification')])[1]")
	private WebElement Noti;
	
	
	
			
			
    @FindBy(xpath = "(//a[contains(text(),'Customer Support')])[1]")
	private WebElement Customer;
    
	
    @FindBy(xpath = "(//a[contains(text(),'Logout')])[2]")
	private WebElement logout; 
    
	
	public MyProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void myProfile() {
		My_Pofille.click();
	}
	
	
	public void enterUnTb(String un)
	{
		UNTB.sendKeys(un);
	}
	
	public void checkUnTbErrorMassage()
	{
		System.out.println(UNTB_Error);
	}
	
	public void enterMobileNumber(String mn)
	{
		mobile.sendKeys(mn);
	}
	
	
	public void checkMobileErrorMassage()
	{
		System.out.println(Mobile_Error);
	}
	
	
	
	public void enterEmail(String em)
	{
		email.sendKeys(em);
	}
	
	
	public void checkEmailErrorMassage()
	{
		System.out.println(email_Error);
	}
	
	public void clickOnUpdateBTN()
	{
		update.click();
	}
	
	public void  clear_Username()
	{
		UNTB.clear();
	}
	

	public void  clear_mobile()
	{
		mobile.clear();
	}
	

	public void  clear_email()
	{
		email.clear();
	}
	
	public void clear_All()
	{
		UNTB.clear();
		mobile.clear();
		email.clear();
	}
	
	
	public void clickOnMembership()
	{
		membership.click();
	}
	
	public void clickOnMYWishlist()
	{
		my_WishList.click();
	}
	
	public void clickONBookmark()
	{
		bookmark.click();
	}
	
	public void clickOnMy_Oder()
	{
		my_oder.click();
	}
	
	public void clickONMy_Purchage()
	{
		My_purchage.click();
	}
	
	public void clickOnEarnPoint()
	{
		earnPoint.click();
	}
	
	public void clickOnNotification()
	{
		Noti.click();
	}
	
	public void clickOnCustomerSupport()
	{
		Customer.click();
	}
	
	public void clickOnLogoutBTN()
	{
		logout.click();
	}
}

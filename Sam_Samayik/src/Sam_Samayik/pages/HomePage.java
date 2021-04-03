package Sam_Samayik.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="//div[contains(text(),' Hello, Sign in')]")
	private WebElement Sign_IN;
	
	

	@FindBy(className ="dropbtn")
	private WebElement GuestName;
	
	
	

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout;
	
	
	@FindBy(className = "fa fa-shopping-cart top-items")
	private WebElement ADD_TO_CART;
	
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Sign_IN()
	{
		Sign_IN.click();
	}
	public void clickOnADDTOCART()
	{
		ADD_TO_CART.click();
	}
	
	
	public void clickONGuestName()
	{
		GuestName.click();
	}
	
	public void clickOnLogoutBTN()
	{
		logout.click();
	}
}

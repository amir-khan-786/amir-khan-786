package Sam_Samayik.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_accountPage {

	@FindBy(name = "name")
	private WebElement nameText;
	
	@FindBy(xpath = "//span[text()='Enter your name']")
	private WebElement NameError;
	
	@FindBy(name = "mobile")
	private WebElement MobileText;
	
	@FindBy(xpath = "//span[text()='Enter your mobile']")
	private WebElement mobileError;
	
	@FindBy(id = "email")
	private WebElement emailText;
	
	@FindBy(name = "password")
	private WebElement passwordText;
	
	@FindBy(xpath = "//span[text()='Enter your password']")
	private WebElement passwordError;
	
	@FindBy(xpath = "//label[contains(text(),'Conditions')]")
	private WebElement  accept_Term_And_Condition;
	
	@FindBy(xpath = "accept term and condition")
	private WebElement acceptTerm_andCondition_Error;
	
	@FindBy(xpath = "(//button[contains(text(),'Continue')])[1]")
	private WebElement continueBTN;

	@FindBy(xpath = "(//strong[text()='Login,'])[1]")
	private WebElement LoginBTN;
	
	
	
	@FindBy(xpath = "//button[text()='OK']")
	private WebElement MobileAllreadyExist_Click;
	
	public Create_accountPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enterUserName()
	{
		nameText.sendKeys("Amir");
	}
	
	public void checkUserNameErrorMassage()
	{
		System.out.println(NameError);
	}
	public void enterMobileNumber()
	{
		MobileText.sendKeys("9971808064");
	}
	
	public void checkMobileErrorMassage()
	{
		System.out.println(mobileError);
	}
	
	public void enterEmail()
	{
		emailText.sendKeys("amir@gmail.com");
	}
	
	public void enterPassword()
	{
		passwordText.sendKeys("12345678");
	}	
	
	public void checkPasswordErrorMassage()
	{
		System.out.println(passwordError);
	}
	
	public void acceptTermandCondition()
	{
		accept_Term_And_Condition.click();
	}
	
	public void checkAcceptTerms_andCondition_ErrorMassage()
	{
		System.out.println(acceptTerm_andCondition_Error);
	}
	
	public void ClickOnContinueBTN()
	{
		continueBTN.click();
	}
	
	public void ClickOnLoginBTN()
	{
		LoginBTN.click();
	}
	
	public void clickOnMoileAlreadyExistPopUPs()
	{
		MobileAllreadyExist_Click.click();
	}
	
}
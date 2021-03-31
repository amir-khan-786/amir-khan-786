package Sam_Samayik.pages;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


	@FindBy(id ="com.google.android.gms:id/cancel")
	private WebElement cancelPhone;
	
	
	@FindBy(xpath = "com.ssgcp.app:id/on_home_register")
	private  WebElement Register;
	
	@FindBy(id = "com.ssgcp.app:id/login_number")
	private WebElement UNTB;
	
	@FindBy(xpath = "com.ssgcp.app:id/login_password")
	private WebElement PWTB;
	
	@FindBy(xpath="com.ssgcp.app:id/login_done")
	private WebElement ContinueBTN;
	

	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
 public void cancelPhone()
 {
	 cancelPhone.click();
 }
	
 public void Register()
 {
	 Register.click();
 }
 
  public void UsernameTB(String Un)
  {
	  UNTB.sendKeys(Un);
  }
  
  public void PasswordTB(String pw)
  {
	  PWTB.sendKeys(pw);
  }
  
  public void ClickContinueBTN()
  {
	  ContinueBTN.click();
	  
  }
}

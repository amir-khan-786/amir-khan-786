package com.samsamyik.pageObject;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


	@FindBy(id = "em")
	private WebElement UNTB;
	
	
	@FindBy(xpath = "//span[text()='Enter your mobile or email']")
	private  WebElement UNTbError;
	
	@FindBy(id = "pass")
	private WebElement PWTB;
	
	@FindBy(xpath = "//span[text()='Enter your password']")
	private WebElement PwTberror;
	
	@FindBy(xpath="(//button[text()='Continue'])[2]")
	private WebElement ContinueBTN;
	
	@FindBy(id = "cl")
	private WebElement Create_AccountBTN;
	
	@FindBy(xpath = "//button[text()='OK']")
	 private WebElement okBTN;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
 
	public void EnteruserName(String un)
	{
		UNTB.sendKeys(un);
	}
	
	public void checkUnTbErrorMassage()
	{
		System.out.println(UNTbError);
	}
	public void enterPassword(String pw)
	{
		
		PWTB.sendKeys(pw);
	}
	
	public void checkPWTbErrorMassage()
	{
		System.out.println(PwTberror);
	}
	
	public void clickOnContinueBTN()
	{
		ContinueBTN.click();
	}
	
	public void clickOnCreateAccountBTN()
	{
		Create_AccountBTN.click();
	}
	
	public void clickONOKBTN()
	{
		okBTN.click();
	}
	
	public void clearusernameandpassword()
	{
		UNTB.clear();
		
		PWTB.clear();    
	}
	
}

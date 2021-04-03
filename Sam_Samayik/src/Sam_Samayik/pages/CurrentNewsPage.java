package Sam_Samayik.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CurrentNewsPage {


	@FindBy(xpath="(//a[text()='View All'])[1]")
	private WebElement viewall;
	
	

	@FindBy(xpath = "//div[text()=' List view']")
	private WebElement ListView;
	
	@FindBy(xpath = "//div[text()=' Grid view']")
	private WebElement gridView;
	
	
	@FindBy(xpath = "//strong[text()='Electrical Current']")
	private WebElement ElectricCurrent;
	
	

	@FindBy(xpath = "//strong[text()='Realme X7 Pro']")
	private WebElement Realme_X7_Pro;
	
	

	@FindBy(xpath = "//strong[text()='ScienceDaily']")
	private WebElement ScienceDaily;
	
	
	

	@FindBy(xpath = "//strong[text()='मासिक पत्रिका जनवरी,2021 पी.डी.एफ']")
	private WebElement patrika;
	
	
	
	
	

	@FindBy(xpath = "//strong[text()='Current Live']")
	private WebElement currentLive;
	
	
	
	public CurrentNewsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnViewAll()
	{
		viewall.click();
	}
	public void clickOnListView()
	{
		ListView.click();
	}
	
	
	public void clickONGridView()
	{
		gridView.click();
	}
	
	public void clickOnElectricCurrent_Course()
	{
		ElectricCurrent.click();
	}
	
	public void clickOnRealmiX7Pro()
	{
		Realme_X7_Pro.click();
	}
	
	public void clickOnScienceDaily()
	{
		ScienceDaily.click();
	}
	
	public void  clickOnPatrika()
	{
		patrika.click();
	}
	
	 public void clickOnCurrentLive()
	 {
		 currentLive.click();
	 }
}

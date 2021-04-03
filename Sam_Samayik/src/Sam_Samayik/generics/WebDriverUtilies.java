package Sam_Samayik.generics;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * @author QSP
 *
 */
public class WebDriverUtilies {
	



	/**
	 * To Handle the mouseHover
	 * 
	 * @param driver
	 * @param ele
	 */

	public void mouseHover(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}

	/**
	 * To handle the double click
	 * 
	 * @param driver
	 * @param ele
	 */

	public void doubleClick(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}

	/**
	 * To handle the alert popup
	 * 
	 * @param driver
	 */

	public void alert(WebDriver driver) {
		
		driver.switchTo().alert().accept();
	
	}
	/**
	 * To verify 
	 * @param actual
	 * @param expected
	 * @param page
	 */
	
//	public void verify(String actual,String expected,String page) {
//		Assert.assertEquals(actual, expected);
//		Reporter.log(page +" Is dispalyed ",true);
//	}
	/**
	 * Switching frame
	 * @param driver
	 */
	
	public void switchFrame(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	
	/**
	 * Switching back to default page
	 * @param driver
	 */
	public void switchbackframe(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	/**
	 * switch the tabs
	 * @param driver
	 */
	public void switchtab(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for(String b:child)
		{
			driver.switchTo().window(b);
		}
	}

	public void fileupload(String path) throws IOException {
		Runtime.getRuntime().exec(path);
	}
	
	public void dropDown(WebElement ele,String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}

}

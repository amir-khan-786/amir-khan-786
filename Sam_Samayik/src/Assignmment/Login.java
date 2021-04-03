package Assignmment;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Sam_Samayik.pages.HomePage;
import Sam_Samayik.pages.LoginPage;

public class Login {

	static {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://65.0.58.104/index.php/web_new/home");
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    driver .findElement(By.xpath("//div[contains(text(),' Hello, Sign in')]")).click();
        int x = driver.findElement(By.id("em")).getLocation().getX();
        		System.out.println(x);
	}
}

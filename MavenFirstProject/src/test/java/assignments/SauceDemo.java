package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class SauceDemo {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.saucedemo.com/");

		WebDriverWait wait =new WebDriverWait(driver,20);
		//select src 
		String login_credentials=driver.findElement(By.id("login_credentials")).getText();
		String userNames[]=login_credentials.split("\n");
		
		String login_password=driver.findElement(By.className("login_password")).getText();
		String password[]=login_password.split("\n");
		
		System.out.println("entering username as: "+userNames[1]);
		System.out.println("entering password as: "+password[1]);
		
		driver.findElement(By.id("user-name")).sendKeys(userNames[1]);;
		driver.findElement(By.id("password")).sendKeys(password[1]);
	}

}

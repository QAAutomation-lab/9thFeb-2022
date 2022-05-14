package day9.mouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class MouseOp4 {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.facebook.com/");
		/* Instance of Action Class */
		Actions action=new Actions(driver);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement userNameInputField=driver.findElement(By.name("firstname"));
		userNameInputField.sendKeys("admin");
		//userNameInputField.sendKeys(Keys.chord(Keys.CONTROL,"a"));
				//or
		action.doubleClick(userNameInputField).perform();
		userNameInputField.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		
		driver.findElement(By.name("lastname")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
	}

}

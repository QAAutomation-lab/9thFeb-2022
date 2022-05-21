package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class HandlingCalender{

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement element=driver.findElement(By.cssSelector("input[name='lastname']"));
		System.out.println(element.isDisplayed());
		System.out.println(element.isEnabled());
	}

}

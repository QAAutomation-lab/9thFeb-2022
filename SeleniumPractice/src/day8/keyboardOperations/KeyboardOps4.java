package day8.keyboardOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class KeyboardOps4 {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "https://www.flipkart.com/");

		// using Escape of keyboard to avoid login popup
		WebElement element = driver.findElement(By.xpath("//body"));
		element.sendKeys(Keys.ESCAPE);
		
//		for (int i = 0; i < 10; i++) {
//			element.sendKeys(Keys.PAGE_DOWN);
//			Thread.sleep(1500);
//		}
	
		Thread.sleep(1500);
		//directly goto bottom of the page
		element.sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
		Thread.sleep(1500);
		//directly goto Top of the page
		element.sendKeys(Keys.chord(Keys.CONTROL,Keys.HOME));
	}

}

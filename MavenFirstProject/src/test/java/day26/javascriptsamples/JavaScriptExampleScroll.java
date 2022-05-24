package day26.javascriptsamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class JavaScriptExampleScroll extends SeleniumUtility{

	@Test
	public void testLoginWithoutClick() {
		driver=setUp("chrome", "https://www.flipkart.com/");
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		//Creating reference variable of JavascriptExecutor by casting from WebDriver interface
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//vertical 
		//js.executeScript("window.scrollBy(0,2000)");
		//till page end
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//close browser
		//driver.close();
	}
}

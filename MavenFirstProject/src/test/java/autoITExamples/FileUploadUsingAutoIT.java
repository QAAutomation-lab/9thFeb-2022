package autoITExamples;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class FileUploadUsingAutoIT extends SeleniumUtility{

	@Test
	public void testCase() throws IOException {
		WebDriver driver=setUp("chrome", "http://omayo.blogspot.com/");
		//in selenium we can't click on browse button/choose file button instead of you pass the required file name in sendKeys()
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.COMMAND, Keys.END));

		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//in selenium we can't click on browse button/choose file button instead of you pass the required file name in sendKeys()
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.COMMAND, Keys.END));
		WebElement button=driver.findElement(By.xpath("//div[h2[text()='UploadFile']]/div[1]/form/input"));
		System.out.println(button.isDisplayed());
		js.executeScript("arguments[0].click();", button);
		
		Runtime.getRuntime().exec("F:\\AuotItSample\\FileUpload2.exe");
	}
}

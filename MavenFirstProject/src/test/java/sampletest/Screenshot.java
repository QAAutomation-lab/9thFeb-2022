package sampletest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Screenshot extends SeleniumUtility {

	@Test
	public void testScreenShot() {
		WebDriver driver = setUp("chrome", "https://www.google.com");
		// downcast the driver to access TakesScreenshot method
		TakesScreenshot ts = (TakesScreenshot) driver;
		// capture screenshot as output type FILE
		File file = ts.getScreenshotAs(OutputType.FILE);
		try {
			// save the screenshot taken in destination path
			FileUtils.copyFile(file, new File(".\\src\\test\\resources\\ScreenShots\\GoogleSearchPage.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		cleanUp();
	}
	@Test
	public void testScreenShot2() {
		setUp("chrome", "https://www.google.com");
		String title=driver.getTitle();
		takeScreenShotOfThePage(".\\src\\test\\resources\\ScreenShots\\"+title+".jpg");
		cleanUp();
	}
}

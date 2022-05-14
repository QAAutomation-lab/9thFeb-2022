package day11.testngsamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Example7 {
	@Test
	public void loginLogoutInActitimeApplication() {

		SeleniumUtility utility = new SeleniumUtility();
		WebDriver driver = utility.setUp("chrome", "https://demo.actitime.com/login.do");
		System.out.println("Before login page title: " + driver.getTitle());
		
		// identify the required element from the UI and perform required action 0-30
		WebElement usernameInputField = driver.findElement(By.id("username"));
		usernameInputField.sendKeys("admin");
		// identify the required element from the UI and perform required action 0-30
		driver.findElement(By.name("pwd")).sendKeys("manager");
		// identify the required element from the UI and perform reqiored action
		driver.findElement(By.id("loginButton")).click(); // 0-30

		WebElement logoutBtn = driver.findElement(By.linkText("Logout"));
		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(logoutBtn));

		System.out.println("After login page title: " + driver.getTitle());

		logoutBtn.click();
		// validation using TestNG
		//Assert.assertEquals(driver.getTitle(), "actiTIME - Login"); //or
		Assert.assertEquals(driver.getTitle(), "actiTIME - Login", "Either logout is not done or login page title got changed");

		driver.close();
	}

}

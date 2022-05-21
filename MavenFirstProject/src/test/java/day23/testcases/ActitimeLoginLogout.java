package day23.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;


public class ActitimeLoginLogout extends SeleniumUtility {

	WebDriver driver;
	@BeforeTest
	public void precondition() {
		driver=setUp("chrome", "https://demo.actitime.com/user/submit_tt.do");
	}

	@Test
	public void testLoginFunctionality() {
		typeInput(driver.findElement(By.id("username")), "admin");
		typeInput(driver.findElement(By.name("pwd")), "manager");
		clickOnElement(driver.findElement(By.id("loginButton")));
		setSleepTime(1000);
		Assert.assertEquals(getCurrentTitleOfApplication(), "actiTIME - Enter Time-Track",
				"Either page title got changed or login was failed");
	}

	@Test
	public void testLogoutFunctionality() {
		clickOnElement(driver.findElement(By.id("logoutLink")));
		Assert.assertEquals(getCurrentTitleOfApplication(), "actiTIME - Login",
				"Either logout button is not functional or present");
	}
	
	@AfterTest
	public void postCondition() {
		cleanUp();
	}
}

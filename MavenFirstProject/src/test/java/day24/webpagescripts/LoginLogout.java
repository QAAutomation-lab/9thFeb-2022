package day24.webpagescripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import day24.webpages.HomePage;
import day24.webpages.LoginPage;
import utilities.SeleniumUtility;

public class LoginLogout extends SeleniumUtility {

	WebDriver driver=null;
	LoginPage getLoginPage=null;
	HomePage getHomePage=null;
	@BeforeTest
	public void precondition() {
		driver =setUp("chrome", "https://demo.actitime.com/user/submit_tt.do");
		getLoginPage=new LoginPage(driver);
		getHomePage=new HomePage(driver);
		getLoginPage.login("admin", "manager");
	}

	@Test
	public void testLoginFunctionality() {
		String actualHomePageTitle=getHomePage.getHomePageTitle();
		Assert.assertEquals(actualHomePageTitle, "actiTIME - Enter Time-Track",
				"Either page title got changed or login was failed");
	}
	
	@Test
	public void testLogoutFunctionality() {
		getHomePage.logoutFromApp();
		Assert.assertEquals(getCurrentTitleOfApplication(), "actiTIME - Login",
				"Either logout button is not functional or present");
	}
	
	@AfterTest
	public void postCondition() {
		cleanUp();
	}
}

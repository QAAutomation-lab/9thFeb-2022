package day24.webpagescripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import day24.webpages.VtigerLoginPage;
import utilities.SeleniumUtility;

public class TestVtigerLogin extends SeleniumUtility{
	WebDriver driver;
	VtigerLoginPage getVtigerLoginPage;
	@BeforeTest
	public void openBrower(){
		driver=setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		getVtigerLoginPage=new VtigerLoginPage(driver);
	}

	@Test
	public void testLogin() {
		getVtigerLoginPage.loginIntoVtiger("admin", "Test@123");
		String actualTtile=getVtigerLoginPage.getHomePageTitle();
		String expectedTitle="Dashboard";
		Assert.assertEquals(actualTtile, expectedTitle);
	}
	@AfterTest
	public void closeBrowser() {
		cleanUp();
	}
}

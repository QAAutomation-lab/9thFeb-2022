package day22.testngadvxml;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;


public class Parameterization extends SeleniumUtility {
	
	@Parameters({ "browser" })
	@Test(priority=1)
	public void testCaseOne(String browser) {
		System.out.println("browser passed as :- " + browser);
	}
	@Parameters({ "username", "password" })
	@Test(priority=2)
	public void testCaseTwo(String username, String password) {
		System.out.println("Parameter for User Name passed as :- " + username);
		System.out.println("Parameter for Password passed as :- " + password);
	}
	@Parameters({"browser", "username", "password" })
	@Test(priority=3)
	public void testCaseThree(String browser,String username, String password) {
		System.out.println("Browser name: "+browser);
		System.out.println("Parameter for User Name passed as :- " + username);
		System.out.println("Parameter for Password passed as :- " + password);
	}
	@Parameters({"browser", "username", "password" })
	@Test(priority=4)
	public void testLoginOfVtiger(String browser,String username, String password) {
		setUp(browser, "https://demo.vtiger.com/vtigercrm/index.php");
			
			driver.findElement(By.id("username")).clear();
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys(password,Keys.ENTER);
			cleanUp();
	}
}
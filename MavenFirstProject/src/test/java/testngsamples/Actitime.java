package testngsamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Actitime extends SeleniumUtility{
	static WebDriver driver;
	@Test
	public void a_openBrowserAndAppURL() {
		driver=setUp("chrome","https://demo.actitime.com/login.do");
	}
	@Test
	public void b_login() {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
	}
	@Test
	public void c_createTask() {
		System.out.println("i am signup...");
	}
	@Test
	public void d_logoutClose() {
		System.out.println("i am signup...");
	}
}

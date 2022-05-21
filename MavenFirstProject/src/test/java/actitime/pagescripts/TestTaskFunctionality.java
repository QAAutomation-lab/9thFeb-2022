package actitime.pagescripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import actitime.webpages.HomePage;
import actitime.webpages.LoginPage;
import actitime.webpages.TaskPage;
import utilities.SeleniumUtility;

public class TestTaskFunctionality extends SeleniumUtility{
	WebDriver driver;
	LoginPage getLoginPage;
	HomePage getHomePage;
	TaskPage getTaskPage;

	@BeforeTest
	public void test_start() {
		driver=setUp("chrome", "https://demo.actitime.com/login.do");
		getLoginPage=new LoginPage(driver);
		getHomePage=new HomePage(driver);
		getTaskPage=new TaskPage(driver);
		getLoginPage.loginIntoActitme("admin", "manager");
	}
	
	@Test
	public void testCreateTask() {
		getHomePage.clickOnTaskTab();
		getTaskPage.createTask("Testing");
		System.out.println(getTaskPage.checkNewlyCreatedTask());
		//TODO: validate using assert
	}
	@Test
	public void testDeleteTask() {
		getTaskPage.deleteNewlyCreatedTask();
		System.out.println(getTaskPage.checkNewlyCreatedTask());
		//TODO: validate using assert
	}
	
	@AfterTest
	public void test_end() {
		cleanUp();
	}
}

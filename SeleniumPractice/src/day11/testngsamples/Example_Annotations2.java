package day11.testngsamples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example_Annotations2 {
	@BeforeMethod
	public void openBrowser() {
		System.out.println("Chrome browser opened and app url is entered");
	}
	@Test(priority=1)
	public void verifyLogin() {
		System.out.println("Successfully login..");
	}	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Browser instance is closed");
	}
	@Test(priority=2)
	public void createTask() {
		System.out.println("Task created Successfully");
	}
}

/**
@BeforeMethod/@AfterMethod--> it gets executed for each and every @Test method
*/
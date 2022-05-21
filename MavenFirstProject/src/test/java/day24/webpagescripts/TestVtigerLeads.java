package day24.webpagescripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class TestVtigerLeads extends SeleniumUtility{
	@BeforeTest
	public void openBrower(){
		
	}
	@BeforeMethod
	public void login() {
		
	}

	@Test
	public void testCreateNewLead() {
		
	}
	@Test
	public void testNewLeadUpdation() {
		
	}
	@Test
	public void testNewLeadDeletion() {
		
	}
	
	@AfterMethod
	public void logout() {
		
	}
	@AfterTest
	public void closeBrowser() {
		cleanUp();
	}
}

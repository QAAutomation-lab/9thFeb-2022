package day24.webpagescripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import day24.webpages.GoogleSearchPage;
import utilities.SeleniumUtility;

public class GoogleSearchScript {

	@Test
	public void testCase() {
		SeleniumUtility util=new SeleniumUtility();
		WebDriver driver=util.setUp("chrome", "https://www.google.com");
		//with the help of PageFactory initialize required web page
		GoogleSearchPage getGoogleSearchPage=PageFactory.initElements(driver, GoogleSearchPage.class);
		getGoogleSearchPage.searchText("I am shailesh");
		Assert.assertEquals(driver.getTitle(), "I am shailesh - Google Search");
	}
}

package day24.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class HomePage extends SeleniumUtility {

	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	public void logoutFromApp() {
		clickOnElement(logoutLink);
	}
	
	public String getHomePageTitle() {
		waitForElementToBeClickable(logoutLink);
		return getCurrentTitleOfApplication();
	}
}

package actitime.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class LoginPage extends SeleniumUtility {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(name = "pwd")
	private WebElement pwd;

	@FindBy(css = "#keepLoggedInCheckBox")
	private WebElement checkbox;

	@FindBy(id = "loginButton")
	private WebElement loginbtn;

	public void loginIntoActitme(String userid,String password) {
		typeInput(username, userid);
		typeInput(pwd,password);
		clickOnElement(checkbox);
		clickOnElement(loginbtn);
	}
}

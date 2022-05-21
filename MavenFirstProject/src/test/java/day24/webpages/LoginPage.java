package day24.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class LoginPage extends SeleniumUtility{
	
	WebDriver driver;
	//Initialization of Login page 
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement usernameInputField;
	
	@FindBy(name="pwd")
	private WebElement passwordInputField;
	
	@FindBy(css="#loginButton")
	private WebElement logoutButton;

	public WebElement getUsernameInputField() {
		return usernameInputField;
	}

	public WebElement getPasswordInputField() {
		return passwordInputField;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}
	
	public void login(String username,String password) {
		typeInput(usernameInputField, username);
		typeInput(passwordInputField, password);
		clickOnElement(logoutButton);
	}
	
}

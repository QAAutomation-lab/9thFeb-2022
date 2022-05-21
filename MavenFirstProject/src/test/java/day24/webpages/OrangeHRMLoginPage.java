package day24.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class OrangeHRMLoginPage extends SeleniumUtility{
	
	public OrangeHRMLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="txtUsername")
	private WebElement usernameInputField;
	
	@FindBy(id="txtPassword")
	private WebElement pwdInputField;
	
	@FindBy(xpath="//input[@value='LOGIN']")
	private WebElement loginBtn;

	public WebElement getUsernameInputField() {
		return usernameInputField;
	}

	public WebElement getPwdInputField() {
		return pwdInputField;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public void loginIntoOrangeHRM(String username,String password) {
		typeInput(usernameInputField, username);
		typeInput(pwdInputField, password);
		clickOnElement(loginBtn);
	}
	public String getHomePageTitle() {
		return getCurrentTitleOfApplication();
	}
}

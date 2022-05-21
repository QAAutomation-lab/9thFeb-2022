package day24.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class GoogleSearchPage extends SeleniumUtility{
	
	@FindBy(name="q")
	private WebElement searchInputField;

	public void searchText(String text) {
		
		typeInput(searchInputField, text);
		getActiveElement().sendKeys(Keys.ENTER);
	}
}

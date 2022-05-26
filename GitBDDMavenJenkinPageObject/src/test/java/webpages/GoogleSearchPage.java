package webpages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class GoogleSearchPage extends SeleniumUtility{
	WebDriver driver;
	public GoogleSearchPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="q")
	private WebElement searchInputFild;
	
	public void searchText(String textToBeSearched) {
		typeInput(searchInputFild, textToBeSearched);
		getActiveElement().sendKeys(Keys.ENTER);
	}
	
	public String searchedResultPageTitle() {
		return getCurrentTitleOfApplication();
	}
}

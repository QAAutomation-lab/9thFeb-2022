package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class CricInfo {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.espncricinfo.com/");

		WebDriverWait wait =new WebDriverWait(driver,20);
 
		List<WebElement> names=driver.findElements(By.cssSelector(".ds-flex.ds-items-center.ds-justify-between.ds-flex-1>*:first-child>div>a"));
		
		for(WebElement element: names) {
			System.out.println(element.getText());
		}
	}

}

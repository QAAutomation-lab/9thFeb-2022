package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class GSMArenaPhoneNames {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.gsmarena.com/");

		WebDriverWait wait =new WebDriverWait(driver,20);
 
		List<WebElement> names=driver.findElements(By.cssSelector(".brandmenu-v2.light.l-box.clearfix>ul>li>a"));
		
		for(WebElement element: names) {
			System.out.println(element.getText());
		}
	}

}

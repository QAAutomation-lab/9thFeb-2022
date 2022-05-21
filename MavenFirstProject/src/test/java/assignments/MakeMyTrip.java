package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class MakeMyTrip {

	public static void main(String[] args) {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "https://www.makemytrip.com/");
		// close login popup
		driver.findElement(By.cssSelector("li[data-cy='account']")).click();
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.cssSelector("input[placeholder='From']")).sendKeys("Pune");
		WebElement element=driver.findElement(By.xpath("//p[text()='Pune, India']"));
		WebDriverWait wait=new WebDriverWait(driver,20);
		
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
}

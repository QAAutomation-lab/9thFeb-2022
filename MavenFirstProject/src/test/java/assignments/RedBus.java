package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class RedBus {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.redbus.in/");

		WebDriverWait wait =new WebDriverWait(driver,20);
		//select src 
		driver.findElement(By.id("src")).sendKeys("Pune");
		WebElement src=driver.findElement(By.cssSelector(".homeSearch>*:nth-child(2)"));
		wait.until(ExpectedConditions.elementToBeClickable(src));
		src.click();
		//select dest
		driver.findElement(By.id("dest")).sendKeys("Goa");
		WebElement dest=driver.findElement(By.cssSelector(".homeSearch>*:nth-child(4)"));
		wait.until(ExpectedConditions.elementToBeClickable(dest));
		dest.click();
		//select date
		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.cssSelector(".next>button")).click();
		driver.findElement(By.cssSelector(".rb-monthTable>tbody>*:nth-child(4)>*:nth-child(3)")).click();
		
		//click on search
		driver.findElement(By.id("search_btn")).click();
		
		//departure time
		driver.findElement(By.xpath("//div[div[text()='DEPARTURE TIME']]/ul[2]/li[4]/label[1]")).click();
		//bus type
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		WebElement bus=driver.findElement(By.cssSelector(".list-chkbox>li:nth-child(3)>label"));
		wait.until(ExpectedConditions.elementToBeClickable(bus));
		bus.click();
		//page down
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.chord(Keys.COMMAND,Keys.END));
		
		//get bus name and price list
		List<WebElement> busList=driver.findElements(By.cssSelector(".bus-item-details>div.row-one>div:nth-of-type(1)>*:first-child"));
		List<WebElement> busPrice=driver.findElements(By.cssSelector(".bus-item-details>div.row-one>div:nth-of-type(6)>div>div.fare>span"));
		//print bus name and price 
		for(int i=0;i<busList.size();i++) {
			
			System.out.println(busList.get(i).getText()+ ":--->"+busPrice.get(i).getText());
//			driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
//			busList=driver.findElements(By.cssSelector(".bus-item-details>div.row-one>div:nth-of-type(1)>*:first-child"));
		}
	}

}

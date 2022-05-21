package day7.webdrivermangersetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class HandlingCalender{

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.makemytrip.com/");
		//close login popup
		driver.findElement(By.cssSelector("li[data-cy='account']")).click();
		//identify departure date and click on it
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		//select any date from next month
		driver.findElement(By.cssSelector("div.DayPicker-Months>*:last-child>.DayPicker-Body>div:nth-of-type(2)>*:nth-child(2)>div>p")).click();

	}

}

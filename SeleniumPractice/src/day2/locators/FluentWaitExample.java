package day2.locators;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample {

	public static void main(String[] args) {
		
		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath);
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		Wait wait = new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(50))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);//5 10 15 20 25 30 35 40 45 50
		
		WebElement element =driver.findElement(By.id("username"));
		 wait.until(ExpectedConditions.elementToBeClickable(element));
		 
		 WebElement element1 =driver.findElement(By.id("username"));
		 wait.until(ExpectedConditions.elementToBeClickable(element1));
		 
		 WebElement element2 =driver.findElement(By.id("username"));
		 wait.until(ExpectedConditions.elementToBeClickable(element2));

	}
}

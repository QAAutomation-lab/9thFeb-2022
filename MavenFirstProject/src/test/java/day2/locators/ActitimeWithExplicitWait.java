package day2.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeWithExplicitWait {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath);
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("Before login page title: "+driver.getTitle());
		//identify the required element from the UI and perform required action 0-30
		driver.findElement(By.id("username")).sendKeys("admin");
		//identify the required element from the UI and perform required action 0-30
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//identify the required element from the UI and perform reqiored action
		driver.findElement(By.id("loginButton")).click(); //0-30
		
		WebElement logoutBtn=driver.findElement(By.linkText("Logout"));
		//Explicit wait
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(logoutBtn));

		System.out.println("After login page title: "+driver.getTitle());
	}
}

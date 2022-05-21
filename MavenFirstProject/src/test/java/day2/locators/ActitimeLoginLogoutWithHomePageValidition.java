package day2.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLoginLogoutWithHomePageValidition {

	public static void main(String[] args) {
		
		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath);
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		String expectedTitle="actiTIME - Login";
		String actualTitle=driver.getTitle();//0-30
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Login page opened sucessfully...");
		}else {
			System.out.println("Either login page not opened or page title got changed");
		}
		//identify the required element from the UI and perform reqiored action 0-30
		driver.findElement(By.id("username")).sendKeys("admin");
		//identify the required element from the UI and perform reqiored action 0-30
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//identify the required element from the UI and perform reqiored action
		driver.findElement(By.id("loginButton")).click(); //0-30
		
		WebElement logoutButton=driver.findElement(By.id("logoutLink"));
		//explicit wait
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
		
		String actaulHomePageTitle=driver.getTitle();//0-30
		System.out.println("Actuatl HomePage title: "+actaulHomePageTitle);
		String expectedHomePageTitle="actiTIME - Enter Time-Track";
		if(actaulHomePageTitle.equals(expectedHomePageTitle)) {
			System.out.println("Login is successfull and home page title is also varified..");
		}else {
			System.out.println("Either Login is failed or home page title is changed");
		}
		//driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.id("logoutLink")).click();
		//close browser
		//driver.close();
	}
}

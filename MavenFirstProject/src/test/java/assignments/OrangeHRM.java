package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath);
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String cred=driver.findElement(By.tagName("span")).getText();
		System.out.println(cred);
		
//		cred=cred.replace("( Username : ", "");
//		cred=cred.replace(" | Password : ", " ");
//		cred=cred.replace(" )", "");
//		System.out.println(cred);
//		String[] loginDetails=cred.split(" ");
//		driver.findElement(By.id("txtUsername")).sendKeys(loginDetails[0]);
//		driver.findElement(By.id("txtPassword")).sendKeys(loginDetails[1]);
		
		String []loginDetails=cred.split(" ");
		driver.findElement(By.id("txtUsername")).sendKeys(loginDetails[3]);
		driver.findElement(By.id("txtPassword")).sendKeys(loginDetails[7]);
		driver.findElement(By.id("btnLogin")).click();
		
	}

}

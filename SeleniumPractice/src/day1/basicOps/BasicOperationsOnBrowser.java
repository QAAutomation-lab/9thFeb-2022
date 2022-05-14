package day1.basicOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOperationsOnBrowser {

	public static void main(String[] args) {

				//or using System class
				String driverPath3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
				//Set the driver executable path using System.setProperty(String key,String value)
				System.setProperty("webdriver.chrome.driver", driverPath3);
				//create an instance of required browser class
				WebDriver driver=new ChromeDriver();
				
				//need to enter application URL in the opened browser
				driver.get("https://www.google.com");
				//get the entered URL from the opened browser
				String appCurrentUrl=driver.getCurrentUrl();
				String expectedUrl="https://www.google.com";
				System.out.println("Actaul URL:"+appCurrentUrl);
				System.out.println("Expected URL: "+expectedUrl);
				if(appCurrentUrl.contains(expectedUrl)) {
					System.out.println("Current URL validation is passed");
				}else {
					System.out.println("Current URL validation is Failed");
				}
				
				//verify that Google search page is opened or not using title
				String actualTitle=driver.getTitle();
				String expectedTitle="Google";
				System.out.println("ActualTitle:"+actualTitle);
				System.out.println("ExpectedTitle: "+expectedTitle);
				if(actualTitle.equals(expectedTitle)) {
					System.out.println("Title validation is passed");
				}else {
					System.out.println("Title validation is Failed");
				}
				//get the webpage source content
				String sourceContent=driver.getPageSource();
				System.out.println("Source content lenght:"+sourceContent.length());
				//close current browser
				driver.close();
				
	}
}
/**
 * Open Chrome browser
 * Enter google search page url
 * validate URL is entered properly or not
 * validate google search page is open or not
 * once all the validation are performed close the browser
 */ 

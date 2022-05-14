package day7.webdrivermangersetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WebDriverManagerSetupForChrome {

	public static void main(String[] args) {
//		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
//		//step1: set driver executable path by using System.setProperty(String key,String value)
//		System.setProperty("webdriver.chrome.driver", driverPath);
					
			//or Use WebDriverManager to manager chrome browser executable based on system requirement
		//use setup method of WebDriverManager
		WebDriverManager.chromedriver().setup();
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
	}

}

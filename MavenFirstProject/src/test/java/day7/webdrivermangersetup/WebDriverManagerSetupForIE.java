package day7.webdrivermangersetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerSetupForIE {

	public static void main(String[] args) {
//		String driverPath = System.getProperty("user.dir") + "\\executables\\IEDriverServer.exe";
//		//step1: set driver executable path by using System.setProperty(String key,String value)
//		System.setProperty("webdriver.ie.driver", driverPath);
					
			//or Use WebDriverManager to manager chrome browser executable based on system requirement
		//use setup method of WebDriverManager
		WebDriverManager.iedriver().setup();
		//step2: create an instance of Chrome Browser
		WebDriver driver = new InternetExplorerDriver();
		//maximize browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.close();
	}

}

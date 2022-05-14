package day1.basicOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxWithGenericWay {

	public static void main(String[] args) {
		//Absolute path
		String driverPath1="F:\\JavaWorkspace\\SeleniumPractice\\executables\\geckodriver.exe";
		//or Relative path --> '.' indicate current working dir
		String driverPath2=".\\executables\\geckodriver.exe";
		//or using System class
		String driverPath3=System.getProperty("user.dir")+"\\executables\\geckodriver.exe";
		//Set the driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.gecko.driver", driverPath3);
		//create an instance of required browser class
		WebDriver driver=new FirefoxDriver();
	}

}

package day1.basicOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeWithGenericWay {

	public static void main(String[] args) {
		//Absolute path
		String driverPath1="F:\\JavaWorkspace\\SeleniumPractice\\executables\\chromedriver.exe";
		//or Relative path --> '.' indicate current working dir
		String driverPath2=".\\executables\\chromedriver.exe";
		//or using System class
		String driverPath3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		//Set the driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath3);
		//create an instance of required browser class
		WebDriver driver=new ChromeDriver();
	}

}

package day1.basicOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenIEWithGenericWay {

	public static void main(String[] args) {
		//Absolute path
		String driverPath1="F:\\JavaWorkspace\\SeleniumPractice\\executables\\IEDriverServer.exe";
		//or Relative path --> '.' indicate current working dir
		String driverPath2=".\\executables\\IEDriverServer.exe";
		//or using System class
		String driverPath3=System.getProperty("user.dir")+"\\executables\\IEDriverServer.exe";
		//Set the driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.ie.driver", driverPath3);
		//create an instance of required browser class
		WebDriver driver=new InternetExplorerDriver();
	}

}

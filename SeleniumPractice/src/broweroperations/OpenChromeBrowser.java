package broweroperations;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
		
		String driverPath1 ="F:\\JavaWorkspace\\SeleniumPractice\\executables\\chromedriver.exe";
				//or
		String driverPath2=".\\executables\\chromedriver.exe";
				//or
		String driverPath3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		
		
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath3);
		//step2: create an instance of Chrome Browser
		ChromeDriver cdriver=new ChromeDriver();
	}

}

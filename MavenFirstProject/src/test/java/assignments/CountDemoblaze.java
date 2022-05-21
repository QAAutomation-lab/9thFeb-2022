package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountDemoblaze {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath);
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.demoblaze.com/");
		
//		List<WebElement> devices=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
//		System.out.println("Device count: "+devices.size());
//		for(int i=0;i<devices.size();i++) {
//			System.out.println(devices.get(i).getText());
//		}
	}

}

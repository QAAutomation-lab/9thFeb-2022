package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

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
		
		driver.get("https://www.amazon.in/");
		//Identify all the link from main menu using findElements(By)
		List<WebElement> allOptions=driver.findElements(By.cssSelector("#nav-xshop>a"));
		System.out.println("Total Identified Elements: "+allOptions.size());
		for(int i=0;i<allOptions.size();i++) {
			
			WebElement option=allOptions.get(i);
			String name=option.getText();
			System.out.println("Option Name: "+name);
			if(name.equals("Amazon Pay")) {
				option.click();
				break;
			}else {
				System.out.println("Not matched.....");
			}
		}
		
		driver.navigate().back();
	}

}

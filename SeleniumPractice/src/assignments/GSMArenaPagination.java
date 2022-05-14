package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GSMArenaPagination {

	public static void main(String[] args) throws InterruptedException {
		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath);
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,20);
		
		driver.get("https://www.gsmarena.com/samsung-phones-9.php");
		List<WebElement> paginationLinks=driver.findElements(By.xpath("//div[@class='nav-pages']/a"));
		System.out.println(paginationLinks.size());
		if(paginationLinks.size()>0) {
			System.out.println("Pagination exist...");
			for(int i=0;i<paginationLinks.size();i++) {
				wait.until(ExpectedConditions.elementToBeClickable(paginationLinks.get(i)));
				paginationLinks.get(i).click();
				System.out.println(driver.getCurrentUrl());
				Thread.sleep(2000);
				paginationLinks=driver.findElements(By.cssSelector(".nav-pages>a"));
			}
		}
	}
}

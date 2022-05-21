package day5.handlingmultipleelements;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoblazeCategoriesWithFindElements {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		// step1: set driver executable path by using System.setProperty(String
		// key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath);
		// step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		// maximize browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.demoblaze.com/");

		List<WebElement> categories = driver.findElements(By.cssSelector(".list-group>a"));
		System.out.println("Option count is: " + categories.size());
		//Creating expected result List
		List<String> expectedCat=new ArrayList<String>();
		expectedCat.add("CATEGORIES");
		expectedCat.add("Phones");
		expectedCat.add("Laptops");
		expectedCat.add("Monitors");
		//Logic to get one by one element from the list and performing validation on that
		for (int i = 0; i < categories.size(); i++) {
			WebElement cat = categories.get(i);
			System.out.println("********* Element of List is: " + cat.getText() + "*********");
			System.out.println(cat.isDisplayed());
			System.out.println(cat.isEnabled());
			System.out.println(cat.getText().equals(expectedCat.get(i)));
		}
	}
}
/**
 * findElements(By) ---> List<WebElement>
 * 					---> use to identify multiple elements or when you want to perform operation on multiple elements
 * 					---> we use findElements(By)
 * 					---> in order count the identified element you size()
 * 					---> in order get specific element from the list use get(int index) ---> return WebElement
 */ 

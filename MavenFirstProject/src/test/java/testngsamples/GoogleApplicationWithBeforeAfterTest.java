package testngsamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleApplicationWithBeforeAfterTest{
	
	WebDriver driver;
		@BeforeTest
		public void startUp(){
			  System.setProperty("webdriver.chrome.driver", 
						"E:\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();		
				driver.manage().window().maximize();		
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);				
				driver.get("https://www.google.com/");	
				System.out.println("Before test finished");
		}
	
	  @Test
	  public void testGoogleLandingPage() {		
			
			String expectedTitle="Google";
			String actualTitle=driver.getTitle();
			System.out.println(expectedTitle.equals(actualTitle));
			/*validation is pending*/
			System.out.println("TestGoogleLandingPage is finished");
	  }
	  @Test
	  public void testSearch(){
		  
			driver.switchTo().activeElement().sendKeys("SQL",Keys.ENTER);
			System.out.println(driver.getTitle());
			System.out.println("TestSearch is finished");
	  }
	  @AfterTest
	  public void cleanUp(){
		  driver.close();
		  System.out.println("CleanUp is done");
	  }
}

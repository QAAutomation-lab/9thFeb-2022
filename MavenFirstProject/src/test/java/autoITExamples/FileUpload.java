package autoITExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	@Test
	public void testCase() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		//in selenium we can't click on browse button/choose file button instead of you pass the required file name in sendKeys()
		driver.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\Asus\\Downloads\\jenkins.war");
	}
}

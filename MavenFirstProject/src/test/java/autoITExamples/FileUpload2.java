package autoITExamples;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload2 {

	@Test
	public void testCase() throws IOException, InterruptedException {
		WebDriverManager.chromedriver().version("101.0.4951.41").setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//in selenium we can't click on browse button/choose file button instead of you pass the required file name in sendKeys()
		//driver.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\Asus\\Downloads\\jenkins.war");
//		WebElement button=driver.findElement(By.cssSelector("input[type='file']"));
//		
//		System.out.println(button.isDisplayed());
		
		Thread.sleep(2000);
		js.executeScript("document.getElementById('imagesrc').click();");

		//js.executeScript("arguments[0].click();", button);
		
		Runtime.getRuntime().exec("F:\\AuotItSample\\FileUpload.exe");
	}
}

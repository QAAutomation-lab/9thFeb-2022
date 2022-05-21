package testngsamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class Actitime_Timeout {

	@Test(enabled=true,timeOut=200)
	public void openBrowserAndAppURL() throws InterruptedException {
		Thread.sleep(205);
		System.out.println("Open browser and enter app url");
	}
}
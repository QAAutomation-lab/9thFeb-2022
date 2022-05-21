package day26.javascriptsamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class JavaScriptExample1 extends SeleniumUtility{

	@Test
	public void testLoginWithoutClick() {
		driver=setUp("chrome", "https://demo.actitime.com/login.do");
		//Creating reference variable of JavascriptExecutor by casting from WebDriver interface
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//identify the required element from the UI and perform reqiored action 0-30
		//driver.findElement(By.id("username")).sendKeys("admin");
		js.executeScript("document.getElementById('username').value='admin';");
		//identify the required element from the UI and perform reqiored action 0-30
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//js.executeScript("document.getElementsByName('pwd').value='manager';");
		//identify the required element from the UI and perform reqiored action
		//driver.findElement(By.id("loginButton")).click(); //0-30
		js.executeScript("document.getElementById('loginButton').click();");
				//or
		//js.executeScript("document[0].click();", driver.findElement(By.id("loginButton")));
		//driver.findElement(By.linkText("Logout")).click(); //0-30
		WebElement logoutLink=driver.findElement(By.id("logoutLink"));
		
		waitForElementToBeClickable(logoutLink);
		js.executeScript("document.getElementById('logoutLink').click();");
				//or
		//js.executeScript("document[0].click();", logoutLink );
		//close browser
		driver.close();
	}
}
/**
js.executeScript("document.getElementById('enter element id').click();");
//or
js.executeScript("arguments[0].click();", webelement);


js.executeScript("document.getElementById(id').value='someValue';");
js.executeScript("document.getElementById('Email').value='SeleniumTesting.com';");

*/
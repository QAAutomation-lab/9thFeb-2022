package day7.webdrivermangersetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class CSSAtrributeValidation {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		
		WebElement signInButton=driver.findElement(By.cssSelector("button[type='submit']"));
		String fontSize=signInButton.getCssValue("font-size");
		String fontColor=signInButton.getCssValue("color");
		String fontBackgroundColor=signInButton.getCssValue("background-image");
		
		System.out.println("Font Size: "+fontSize);
		System.out.println("Font color: "+fontColor);
		System.out.println("Font Background Color: "+fontBackgroundColor);
		
		
		String forgotPasswordLinkColor=driver.findElement(By.cssSelector(".forgotPasswordLink")).getCssValue("color");
		System.out.println("forgotPasswordLink color: "+forgotPasswordLinkColor);
	}
}

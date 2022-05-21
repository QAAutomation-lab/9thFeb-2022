package day7.webdrivermangersetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HeadlessBrowser {

	public static void main(String[] args) {

		HtmlUnitDriver driver=new HtmlUnitDriver(BrowserVersion.CHROME);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}

}

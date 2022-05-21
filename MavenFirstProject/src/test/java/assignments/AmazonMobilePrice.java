package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class AmazonMobilePrice {
	public static void main(String[] args) {
		SeleniumUtility util=new SeleniumUtility();
		WebDriver driver=util.setUp("chrome", "https://www.amazon.in/s?bbn=1389401031&rh=n%3A1389401031%2Cp_89%3AOnePlus&dc&qid=1652232904&rnid=3837712031&ref=lp_1389401031_nr_p_89_1");
		
		String price=driver.findElement(By.xpath("//div[div[h2[a[span[text()='OnePlus Nord CE 2 5G (Bahamas Blue, 8GB RAM, 128GB Storage)']]]]]/div[3]/div[2]/a/span[@class='a-price']/span[2]/span[2]")).getText();
		System.out.println(price);
		System.out.println("Hello");
	}
}

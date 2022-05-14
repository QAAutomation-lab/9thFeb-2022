package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class MenuSubMenuRegistrationPage {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "http://demo.automationtesting.in/Register.html");
		Actions act=new Actions(driver);
		List<WebElement> mainMenu=driver.findElements(By.cssSelector(".navbar-nav>li>a"));
		
		for(int i=0;i<mainMenu.size();i++) {
			System.out.println("********* "+mainMenu.get(i).getText()+" ************");
			act.moveToElement(mainMenu.get(i)).perform();
			
			List<WebElement> subMenu=driver.findElements(By.cssSelector(".navbar-nav>li:nth-child("+(i+1)+")>ul>li>a"));
			if(subMenu.size()>0) {
				for(int j=0;j<subMenu.size();j++) {
				System.out.println("---"+subMenu.get(j).getText()+" -----");
				}
			}else {
				System.out.println("########## No Sub-Menus ##########");
			}
		}

	}

}

package broweroperations;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenIEBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", ".\\executables\\IEDriverServer.exe");
		InternetExplorerDriver idriver=new InternetExplorerDriver();
	}
}

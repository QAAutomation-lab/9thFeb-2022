package day11.testngsamples;

import org.testng.annotations.Test;

public class Example_Param2 {
	@Test(priority=1)
	public void login() {
		System.out.println("Hello, I am param1 from Example_Param1 class");
	}
	@Test(priority=2)
	public void sendEmail() {
		System.out.println("Hello, I am param3 from Example_Param1 class");
	}
	@Test(priority=3)
	public void logout() {
		System.out.println("Hello, I am param2 from Example_Param1 class");
	}
}
/**

By Default each @Test has priority as 0
lowest priority will get executed first
*/
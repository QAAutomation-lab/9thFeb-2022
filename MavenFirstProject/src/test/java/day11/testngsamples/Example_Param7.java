package day11.testngsamples;

import org.testng.annotations.Test;

public class Example_Param7 {
	@Test(description="Checking login functionality of Actitime application")
	public void login() {
		System.out.println("Hello, I am login from Example_Param1 class");
	}	
	@Test
	public void signin() {
		System.out.println("Hello, I am signin from Example_Param1 class");
	}	
}
/**
if testng class contains more dn one test method dn all the test method will be executed in
alphabetical order
*/
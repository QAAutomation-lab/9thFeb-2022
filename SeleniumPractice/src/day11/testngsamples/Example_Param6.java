package day11.testngsamples;

import org.testng.annotations.Test;

public class Example_Param6 {
	
	@Test(dependsOnMethods="signIn",enabled=true)
	public void login() {
		System.out.println("Hello, I am login from Example_Param1 class");
	}
	@Test(dependsOnMethods="login",enabled=true,timeOut=2000)
	public void checkNotification() {
		System.out.println("Hello, I am checkNotification from Example_Param1 class");
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test(enabled=true,expectedExceptions=ArithmeticException.class)
	public void signIn() {
		System.out.println("Hello, I am signIn from Example_Param1 class");
		int i=10/0;
	}
}
/**
*/
package day11.testngsamples;

import org.testng.annotations.Test;

public class Example_Param3 {
	@Test(enabled=true)
	public void param1() {
		System.out.println("Hello, I am param1 from Example_Param1 class");
	}
	@Test(enabled=true)
	public void param3() {
		System.out.println("Hello, I am param3 from Example_Param1 class");
	}
	@Test(enabled=false)
	public void param2() {
		System.out.println("Hello, I am param2 from Example_Param1 class");
	}
}
/**
By default for each @Test enabled will set as enabled=true
enabled=true---> consider for execution
enabled=false---> don;t consider for execution
*/
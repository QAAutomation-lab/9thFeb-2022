package day11.testngsamples;

import org.testng.annotations.Test;

public class Example5 {
	@Test
	public void testCase6() {
		System.out.println("Hello, I am TC6 from example5 class");
	}

	@Test
	public void testCase5() {
		System.out.println("Hello, I am TC5 from example5 class");
	}
}
/**
if testng class contains more dn one test method dn all the test method will be executed in
alphabetical order
*/
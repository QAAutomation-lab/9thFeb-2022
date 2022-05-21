package day22.testngadvxml;

import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class ParallelExecutionOfMethods extends SeleniumUtility{

	@Test
	public void testCaseOne() {
		setUp("chrome", "https://www.google.com");
		cleanUp();
	}

	@Test
	public void testCaseTwo() {
		setUp("firefox", "https://www.google.com");
		cleanUp();
	}
}
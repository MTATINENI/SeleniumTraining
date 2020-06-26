package testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	// Updated on 6/26/2020
	
	@BeforeSuite
	public void setUp() {
		
		System.out.println("Initializing Everything !!!");
	}
	
	@AfterSuite
	public void tearDown() {
		
		System.out.println("Quitting Everything !!!");
	}

}

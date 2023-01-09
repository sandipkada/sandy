package testNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGClass {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class is running");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method is running");
	}
	@Test
	public void test() {
		System.out.println("Test Method is running");
	}
	
	
	
}

package handleWebTablebySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlwebtable {
public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

	driver.findElements(By.xpath(""));
}
}

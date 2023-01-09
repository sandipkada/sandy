package seleniumWebelement;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class MutlipleScreenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.myntra.com");
	Thread.sleep(3000);
	for(int i=5;i>0;i--) {
		
	
	File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File Destination =new File("C:\\Users\\Admin\\Desktop\\Screenshot\\mintra02."+i+".jpeg");
	
	FileHandler.copy(screenshot, Destination);
	}
	}
	

}

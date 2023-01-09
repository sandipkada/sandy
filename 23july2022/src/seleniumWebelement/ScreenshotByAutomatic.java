package seleniumWebelement;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotByAutomatic {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		
	File src = ( (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//type cast 
	File destination= new File("C:\\Users\\Admin\\Desktop\\Screenshot\\facebooko1.jpeg");
	 org.openqa.selenium.io.FileHandler.copy(src, destination);
		
		//copy of that screenshot
	
	}
}

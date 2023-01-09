package seleniumWebelement;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class RandomScreenshot {
public static void main(String[] args) throws InterruptedException, IOException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/");
	Thread.sleep(3000);
	for(int i=5;i>1;i--) {
	File shot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 String random = RandomString.make(2);
	File Dimenstion= new File("C:\\Users\\Admin\\Desktop\\Screenshot\\instagram"+random+".jpeg");
	FileHandler.copy(shot, Dimenstion);
	
	}
}
}
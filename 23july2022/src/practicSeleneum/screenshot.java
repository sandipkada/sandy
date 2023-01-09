package practicSeleneum;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class screenshot {

	public static void main(String[] args) throws InterruptedException, IOException  {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe"); 
		  WebDriver driver= new ChromeDriver();
		  
		  driver.get("https://www.youtube.com");
		  Thread.sleep(3000);
		  
		File screen = ( (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File destination= new File("C:\\Users\\Admin\\Desktop\\Screenshot\\YOUTUB03.png");
		 
		  FileHandler.copy(screen, destination);
	}
}

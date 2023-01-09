package handleDropDownAction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScrollupDown {

	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.album.alexflueras.ro/index.php");
		
		
		JavascriptExecutor ab =(JavascriptExecutor)driver;// type cast we perform
		
		ab.executeScript("window.scrollBy(0,2000)");//scroll down
		Thread.sleep(3000);
		
		ab.executeScript("window.scrollBy(0,-2000)");//scroll up
		Thread.sleep(3000);
		
		ab.executeScript("window.scrollBy(5000,0)");//scroll left
		Thread.sleep(3000);
		
		ab.executeScript("window.scrollby(-5000,0) ");//scroll right
      	Thread.sleep(3000);
	}
}

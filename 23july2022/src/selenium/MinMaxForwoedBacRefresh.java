package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MinMaxForwoedBacRefresh {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		
		//driver get used to launch url and navigate to the page
		driver.get("https://www.facebook.com/\r\n");
		
		//driver.manage().window().maximize();// maximize page size
		driver.manage().window().minimize();// minimize
	//	Thread.sleep(3000);
		
		//driver.navigate().back();
	//	Thread.sleep(3000);
		
		//driver.navigate().forward();
	//	Thread.sleep(3000);
		
		//driver.navigate().refresh();
	}

}

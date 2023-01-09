package seleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kadamsandip21@gmail.com");
   Thread.sleep(2000);
   
   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
   Thread.sleep(2000);
   
   driver.findElement(By.xpath("//button[@value='1']")).click();
   
	}

}

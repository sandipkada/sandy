package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertGetText {

	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumacademy.com/cookbook/Alerts.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='simple']")).click();
		   String get = driver.switchTo().alert().getText();
		System.out.println(get);
		
	
	// driver.findElement(By.xpath("//button[@id='prompt']")).click();
       // Alert alert = driver.switchTo().alert();
       //  alert.sendKeys("sandip");
        // alert.accept();
	}

}

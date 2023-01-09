package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumacademy.com/cookbook/Alerts.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='simple']")).click();// x path for (show alert box)
		
		driver.switchTo().alert().accept();//syntax of alert popup and accept is method 
		
		//driver.findElement(By.xpath("//button[@id='confirm']")).click();//x path for( try it)
	//driver.switchTo().alert().dismiss();// dismiss method we used here.
		
		
	
	}
}

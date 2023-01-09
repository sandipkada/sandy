package seleniumWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(3000);
		 WebElement x = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
       String getAttribute = x.getAttribute("type");
       // in this method we find we take path is which element that we used .

   System.out.println(getAttribute);
	}

}
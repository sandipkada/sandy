package seleniumWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		WebElement x = driver.findElement(By.xpath("//button[@type='submit']"));
		boolean result = x.isEnabled();
		System.out.println(result);
		
		if(result==true) { 
			System.out.println("element is enable");
			
		}
		else {
			System.out.println("element is disable");
		}
			
	}

}

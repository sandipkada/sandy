package seleniumWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
	WebElement x = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
	boolean result = x.isDisplayed();
	System.out.println(result);
	
	if(result==true) {
		System.out.println("element is Displayed");
	}
	else {
		System.out.println("element is not Displyed");//that custom inser opetion is displyed or not
	}
	
	}
}

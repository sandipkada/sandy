package seleniumWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelecte {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		WebElement male = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		male.click();
		boolean result = male.isSelected();
		System.out.println("result");
		if(result==true) {
			System.out.println("element is selected");
		}
		else {
			System.out.println("element is not selected");
			
		}
		
		
	}

}

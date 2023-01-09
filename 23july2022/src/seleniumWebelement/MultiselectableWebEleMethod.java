package seleniumWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectableWebEleMethod {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/r.php");
	Thread.sleep(3000);
	
	WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
	Select ele =new Select(year);
	
	boolean result = ele.isMultiple();//multiple list is open or not show in this method
	System.out.println(result);
	
	if(result==true) {
		System.out.println("list of box is multiselectable");
	}
	else {
		System.out.println("list of box is not multiselectable");
		
	}
	
	}
}

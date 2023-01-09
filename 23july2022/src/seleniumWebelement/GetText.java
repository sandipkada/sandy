package seleniumWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/r.php");
	
	WebElement x = driver.findElement(By.xpath("//div[@class='_8fgl _9l2p']"));
String getText = x.getText();
System.out.println(getText);//show all text present on that page

}
}

package seleniumWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/FileUpload.html");
		
		driver.findElement(By.xpath("//input[contains(@type,'sub')]")).click();
	}
	
}

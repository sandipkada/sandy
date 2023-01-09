package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webelement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.xpath("//a[@class='_97w5']")).click();
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("sandip");
		driver.findElement(By.xpath("//input[contains(@name,'lastname')][1]")).sendKeys("kadam");
		driver.findElement(By.xpath("//input[contains(@name,'reg')]")).sendKeys("8605196867");
		 driver.findElement(By.xpath("//select[contains(@name,'birthday_day')]"));
	
	}

}

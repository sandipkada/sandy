package handleDropDownAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownaction {
	

	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		 
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		 Thread.sleep(3000);//cance button x path
		 
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		Actions a=new Actions(driver);//create the object of actions
		
		a.moveToElement(login).perform();//for move the mouse curser to login button then action will be perform
		
		WebElement orders = driver.findElement(By.xpath("//div[text()='Orders']"));//x path of orders
		//a.contextClick(orders).perform();
		a.click(orders).perform();// click on orders option
		
	}
}



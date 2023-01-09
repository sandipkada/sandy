package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class web1 {

	private static WebElement days;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.facebook.com/r.php");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sandip");
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kadam");
	Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8605196867");
	driver.findElement(By.xpath("//input[contains(@id,'passwo')]")).sendKeys("sandip@21");
	
	WebElement days = driver.findElement(By.xpath("//select[contains(@name,'bir')]"));
	Select wel=new Select(days);
wel.selectByIndex(20);
	
WebElement mont = driver.findElement(By.xpath("//select[@title='Month']"));
	Select ele =new Select(mont);
	ele.selectByIndex(4);
	WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	Select tel=new Select(year);
	tel.selectByIndex(25);//just give old
	
	 driver.findElement(By.xpath("//label[text()='Male']")).click();
	driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label")).click();
	//driver.findElement(By.xpath("//*[@id=\"u_0_s_dc\"]")).click();
	
	
	}

}

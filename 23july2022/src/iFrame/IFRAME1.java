package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFRAME1 {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

		driver.get("https://www.rediff.com/");
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='moneyiframe']"));
        driver.switchTo().frame(iframe);//change focus from main page to Iframe
      Thread.sleep(5000);
       
      WebElement nse = driver.findElement(By.xpath("//span[@id='nseindex']"));
      System.out.println(nse.getText());
     Thread.sleep(3000);
	
     driver.switchTo().defaultContent();
     
     Thread.sleep(3000);
	driver.findElement(By.linkText("SPORTS")).click();
	
	}
	
}
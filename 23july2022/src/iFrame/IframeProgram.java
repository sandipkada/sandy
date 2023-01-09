package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeProgram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");//URL heat
	
	//driver.switchTo().frame("iframeResult");// (1)way change focus from main page to iframe 
	                                       //with the help of id attribute and his value
	WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));//(2) way with the help of xpath we take 
	driver.switchTo().frame(iframe);//change focus from main page to iframe
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@type='button']")).click();//click on iframe button
	
	driver.switchTo().parentFrame();//change focus from iframe to main page
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[@id='tryhome']")).click();// click on main page
	}
}

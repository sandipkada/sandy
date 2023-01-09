package popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildORwindowPOPUP {
	
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting
		
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();//wetake x path its a child browser
		
		Set<String> ids = driver.getWindowHandles();// multiple window adderess save to here
		ArrayList<String> al= new ArrayList<String>(ids);// store in list formate

		String cwid = al.get(1);//get address of child window
		
		driver.switchTo().window(cwid);// focus is on child window
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		driver.switchTo().window(al.get(0));// focus is change to main window
		
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
	}
}

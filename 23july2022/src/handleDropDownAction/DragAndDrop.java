package handleDropDownAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement bank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
        
		WebElement place = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Actions a=new Actions(driver);//create of object of actions
		
		a.dragAndDrop(bank, place).perform();//methode 
		
		WebElement amn = driver.findElement(By.xpath("(//a[@style='color:#FFFFFF;'])[4]"));
		WebElement place1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	Actions b=new Actions(driver);//create of object of actions
	   
	b.dragAndDrop(amn, place1).perform();//methode 
	  
	WebElement sales = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
	   WebElement place2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
       Actions c=new Actions(driver);//create of object of actions
   
       c.dragAndDrop(sales, place2).perform();//methode 
	
	WebElement amn2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
   WebElement place3 = driver.findElement(By.xpath("//li[@class='placeholder']"));
	Actions d=new Actions(driver);//create of object of actions
	d.dragAndDrop(amn2, place3).perform();//methode 
   
	}

	}


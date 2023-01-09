package seleniumWebelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectYear {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(3000);
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select ele= new Select(year);
		List<WebElement> option = ele.getOptions();
		System.out.println(option);
		int size = option.size();
		System.out.println(size);//118
		
		System.out.println();
		
	}

}

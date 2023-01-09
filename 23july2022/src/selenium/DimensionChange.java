package selenium;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionChange {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcasting
		
		//driver get used to launch url and navigate to the page
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(3000);
		
		Dimension d= new Dimension(600, 300);//pixels
		driver.manage().window().setSize(d);
	}

}

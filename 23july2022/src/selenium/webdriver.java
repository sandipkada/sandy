package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdriver {

	public static void main(String[] args) throws InterruptedException {
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	//	WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
	//	drive.get(to launch url and navigate to thise page)
	       driver.get("https://www.facebook.com/r.php");
	       
	      Thread.sleep(3000);
	     String url= driver.getCurrentUrl();//url is ref variable getcurrent url
	       System.out.println(url);
	       String exurl="https://www.facebook.com/r.php";
	       
	       if(url.equalsIgnoreCase(exurl)) {
	   		System.out.println("Navigated to correct page");
	   	}
	   	else {
	   		System.out.println("Navigated to wrong page");
	   	}
	   		       
	       
	}

}

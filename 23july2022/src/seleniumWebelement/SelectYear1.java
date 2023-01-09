package seleniumWebelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.execution.instrumentation.tracing.TracingInstrumentation.Options;

public class SelectYear1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/r.php");
	Thread.sleep(3000);
	
	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	Select ele= new Select(year);
	List<WebElement> options = ele.getOptions();
	System.out.println(options);
	int size = options.size();//118
	System.out.println("list box size is:"+size);
	for(int i=0;i<options.size()-1;i++) {
		System.out.println(options.get(i).getText());
	}
}

}

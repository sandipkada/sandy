package handleWebTablebySelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpagehandle {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://sqengineer.com/practice-sites/practice-tables-selenium/");
	
	List<WebElement> noofrows = driver.findElements(By.xpath("//table[@id='table2']//tr"));
	System.out.println("no of rows present"+noofrows.size());
	
	for(int i=1;i<noofrows.size();i++) {
		List<WebElement> noofcells = driver.findElements(By.xpath("//table[@id='table2']//tr["+(i+1)+"]//td"));
		System.out.println(noofcells.size());
		
		for(int cell=0;cell<noofcells.size();cell++){
			System.out.print(noofcells.get(cell).getText()+" ;");
		}
		System.out.println();
	}
	
}
}

package handleWebTablebySelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTableData {

	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> noofrow = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(noofrow.size());
	//total number of rows present in table print in consol
		
		for(int i=1;i<noofrow.size();i++) {
			List<WebElement> noofcells = driver.findElements(By.xpath("//table[@id='customers']//tr["+(i+1)+"]//td"));
		
		System.out.println(noofcells.size());
		
		for(int cell=0;cell<noofcells.size();cell++) {
			System.out.print(noofcells.get(cell).getText()+" ;");
		}
		System.out.println();
		}
	
	
	
	}
}

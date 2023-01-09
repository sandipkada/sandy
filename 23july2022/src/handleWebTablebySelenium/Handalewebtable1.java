package handleWebTablebySelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handalewebtable1 {

	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://km.aifb.kit.edu/sites/webdatacommons/webtables/index.html");
		
		List<WebElement> noofrows = driver.findElements(By.xpath("//table[@border='1']//tr"));
		//total number of rows present in table
		System.out.println("number of row present"+noofrows.size());

		for(int i=1;i<noofrows.size();i++) {
			List<WebElement> noofcells = driver.findElements(By.xpath("//table[@border='1']//tr["+(i+1)+"]//td"));
		
		System.out.println("number of cells present"+noofcells.size());
		
		for(int cell=0;cell<noofcells.size();cell++) {
			System.out.print(noofcells.get(cell).getText()+" :");		
		}
		System.out.println();
		}
	}
}

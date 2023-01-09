package practicSeleneum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumpract {

	public static void main(String[] args) throws InterruptedException {
		
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe"); 
		  WebDriver driver= new ChromeDriver();
		  
		  driver.get("https://www.facebook.com/r.php");
		  Thread.sleep(3000);
		  
		//  driver.close();
		 // driver.quit();
		  
		  String title=driver.getTitle();//print page name
		  System.out.println(title);
		  
		  String wetitel="Sign up for Facebook | Facebook";//we want check is correct or not with
		  //the help of if else condition
		  
		  
		  
		  
		if(title.equalsIgnoreCase(wetitel)) {
			System.out.println("Navigate to correct page");
		}
		else {
			System.out.println("Navigate to wrong page");
		}
	
		
	}

}

package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {
	
	private Object windowType;

	public static void main(String[] args) throws InterruptedException{
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			//drive.get(to launch url and navigate to thise page)
		       driver.get("https://www.facebook.com/r.php");
		       
		       //Thread.sleep(3000);
		   //  driver.close();//close singal tab
		     //  driver.quit();//cosed whole browser
		       
		      String title =driver.getTitle();
		       System.out.println(title);//actual title
		       
		       String extitle=" up for Facebook | Facebook";
		       
		       
			driver.switchTo().newWindow(WindowType.TAB);// we open new window
			 driver.get("https://www.instagram.com/r.php");//for instagram
		       
		       driver.close();//i close only one window/tab
		       driver.quit();//all window are closed
	if(title.equalsIgnoreCase(extitle)) {
		System.out.println("Navigated to correct page");
	}
	else {
		System.out.println("Navigated to wrong page");
	}
		       
	
	}

	}

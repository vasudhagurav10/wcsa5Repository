package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolounchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	//upcast into WebDriver	(I)
	WebDriver driver=new ChromeDriver();//launch Chrome Browser
	
	//maximize the browser
       driver.manage().window().maximize();
       
       
	//provid the dalay of 2 sec
	Thread.sleep(2000);
	
	
	//to close browser
	driver.close();
		

	}

}

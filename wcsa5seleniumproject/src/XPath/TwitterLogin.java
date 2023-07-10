package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwitterLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		driver.get("https://twitter.com/i/flow/login");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='text']")).sendKeys("guravvasudha970@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		
	}

}























//https://twitter.com/i/flow/login

////div[@class='css-1dbjc4n r-18u37iz r-16y2uox r-1wbh5a2 r-1wzrnnt r-1udh08x r-xd6kpl r-1pn2ns4 r-ttdzmv'] phone or email
////span[text()='Next']   next button
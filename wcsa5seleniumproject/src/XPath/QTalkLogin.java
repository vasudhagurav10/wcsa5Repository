package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QTalkLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://chat.qspiders.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='number']")).sendKeys("7774904457");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("gura4457");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='rs-btn rs-btn-default']")).click();
		Thread.sleep(2000);
}
}

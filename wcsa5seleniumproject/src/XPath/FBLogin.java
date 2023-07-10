package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("7774904457");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("gura4457");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		Thread.sleep(2000);
}
}
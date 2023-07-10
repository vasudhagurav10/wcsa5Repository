package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zee5Login {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.zee5.com/signin");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter email or mobile number']")).sendKeys("guravvasudha970@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//input[@name='age']")).sendKeys("22");
		Thread.sleep(2000);
}
}
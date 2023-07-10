package assingnmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageAssingment1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("email")).sendKeys("guravvasudha970@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("pass")).sendKeys("vasudhagurav");
		Thread.sleep(2000);
		
		driver.findElement(By.className("_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy")).click();
	}

}

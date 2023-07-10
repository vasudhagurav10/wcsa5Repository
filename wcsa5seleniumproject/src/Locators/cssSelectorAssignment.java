package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorAssignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-1alah1n/login.do");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name$='e']")).sendKeys("admin");
		Thread.sleep(2000);
		
	    driver.findElement(By.cssSelector("input[name*='wd']")).sendKeys("manager");
		Thread.sleep(2000);
		
	//	driver.findElement(By.cssSelector("input[id^='e']")).sendKeys("guravvasudha970@gmail.com");
		//Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
	
}
}
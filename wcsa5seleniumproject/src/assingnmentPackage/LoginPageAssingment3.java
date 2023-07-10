package assingnmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageAssingment3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.shoppersstack.com/user-signin");
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("Email")).sendKeys("vgurav1028@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("Password")).sendKeys("vasudhagurav");
		Thread.sleep(2000);
		
		driver.findElement(By.className("MuiButton-label")).click();
	    
	    
	}

}

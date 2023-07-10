package assingnmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageAssingment4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zee5.com/signin");
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("textField")).sendKeys("guravvasudha970@gmail.com");
		Thread.sleep(2000);
		
		//driver.findElement(By.id("id_password")).sendKeys("vasudhagurav");
		//Thread.sleep(2000);
		
		driver.findElement(By.className("Login")).click();

}
}

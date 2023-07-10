package assingnmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLoginPagemultipleXPath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.netflix.com/in/login");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='userLoginId' or(@id='id_userLoginId')]")).sendKeys("guravvasudha970@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='password' or(@type='password')]")).sendKeys("Vasu1028@");
		Thread.sleep(2000);
	}

}
























//input[@name='userLoginId' or(@id='id_userLoginId')]
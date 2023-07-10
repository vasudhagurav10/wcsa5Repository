package assingnmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageAssingment2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/InteractiveLogin/identifier?ifkv=Af_xneE4uKHlAfxoQLT97006z_FWHkODZ2a6zQ9BLiQ0eSjiOYLzVg3cfoR6YTklMGTvvsMnTHak&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("identifierId")).sendKeys("guravvasudha970@gmail.com");
		Thread.sleep(2000);
		
		//driver.findElement(By.id("pass")).sendKeys("vasudhagurav");
	//	Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("span[class='VfPpkd-vQzf8d']")).click();
	}

}

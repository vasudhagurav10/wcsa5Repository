package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
	    
	    driver.findElement(By.xpath("//input[@type='number']")).sendKeys("8787878787");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Vasundhara1028@");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//div[@data-testid='login-submit-btn']")).click();
	    Thread.sleep(2000);
	    

}
}
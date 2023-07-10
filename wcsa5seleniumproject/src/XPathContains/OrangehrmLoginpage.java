package XPathContains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangehrmLoginpage {
     public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[contains(@name,'use')] ")).sendKeys("admin");
	    Thread.sleep(2000); 
	    
	    driver.findElement(By.xpath("//input[contains(@name,'p')]")).sendKeys("admin123");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//button[contains(@class,'oxd')]")).click();
		
		
	}
}

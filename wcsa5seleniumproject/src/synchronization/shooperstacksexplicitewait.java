package synchronization;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class shooperstacksexplicitewait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.get("https://www.shoppersstack.com/");
		
		//driver.findElement(By.xpath("//img[@alt='men']")).click();
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='HOODIES']")));
		
		driver.findElement(By.xpath("//img[@alt='HOODIES']")).click();
		
		driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("411033");
		
		
		
		
		
		
		
		
	}

}






//img[@alt='men']
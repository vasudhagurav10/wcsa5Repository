package frameWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlueStone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launch the browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//launch the blue stone
		driver.get("https://www.bluestone.com/");
		
		//handle hidden division pop up
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		//identify frame by using xpath -->method3
       WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		
		
		
		//handle the frame by switch the controls by using index value -->method1
		//driver.switchTo().frame(5);
		
		//handle the frame by switch the control by using string  -->method2
		//driver.switchTo().frame("fc_widget");   //handle frame by using name or ID
        
       
       driver.switchTo().frame(frameElement);
	   WebElement chatBox = driver.findElement(By.id("chat-icon"));
	   chatBox.click();
	   
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("chat-icon"))).click();
        
	  
	   //switch the control again back to main web-page
	   driver.switchTo().defaultContent();
	   Thread.sleep(2000);
	   driver.findElement(By.id("chat-fc-name")).sendKeys("vasudha");
	   driver.findElement(By.id("chat-fc-email")).sendKeys("vasudha@123");
	   driver.findElement(By.id("chat-fc-phone")).sendKeys("9876543210");
	   
	   
	}

}

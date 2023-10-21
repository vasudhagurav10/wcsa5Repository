package finalmock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone {
   public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.bluestone.com/");
	driver.findElement(By.id("denyBtn")).click();
	WebElement frameelement = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
	driver.switchTo().frame(frameelement);
	WebElement element = driver.findElement(By.id("chat-icon"));
	element.click();
	
	
}

}

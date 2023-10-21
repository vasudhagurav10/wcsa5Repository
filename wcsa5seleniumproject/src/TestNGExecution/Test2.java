package TestNGExecution;

import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test2 {
  @Test
  public void test2Method() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.google.com");
		 Thread.sleep(2000);
		 driver.switchTo().activeElement().sendKeys("SQL",Keys.ENTER);
		 driver.quit();
		 
  }
}

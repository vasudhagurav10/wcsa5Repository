package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assingment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		
		//handle the popup
		driver.findElement(By.id("denyBtn")).click();
		
		Thread.sleep(2000);
	    WebElement target = driver.findElement(By.xpath("//a[text()='Coins ']"));
	    
	    //to perform mouse action on webelement
	    Actions act = new Actions(driver);
	    
	    //to perform mouseHover Action
	    act.moveToElement(target).build().perform();
	    driver.findElement(By.xpath("//span[text()='1 gram' and (@data-p='gold-coins-weight-1gms,m')]")).click();
	    WebElement coin = driver.findElement(By.id("5920"));
	    if(coin.isDisplayed())
	    {
	    	Thread.sleep(2000);
	    	driver.quit();
	    	
	    }
	    else
	    {
	    	System.out.println("Exception.....");
	    }
	}

}

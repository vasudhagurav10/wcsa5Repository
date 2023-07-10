package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement source1 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement source3 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement source2= driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement source4 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		
		
		
		WebElement target1 = driver.findElement(By.xpath("//ol[@id='amt8']//descendant::li"));
		WebElement target2 = driver.findElement(By.xpath("//ol[@id='loan']//descendant::li"));
		WebElement target3 = driver.findElement(By.xpath("//ol[@id='amt7']//descendant::li"));
		WebElement target4 = driver.findElement(By.xpath("//ol[@id='bank']//descendant::li"));
		
		//for drag and drop 
		Actions act = new Actions(driver);
		act.dragAndDrop(source1, target2).perform();
		Thread.sleep(2000);
		act.dragAndDrop(source2, target1).perform();
		Thread.sleep(2000);
		act.dragAndDrop(source3, target4).perform();
		Thread.sleep(2000);
		act.dragAndDrop(source4, target3).perform();
		
		if(driver.findElement(By.xpath("//a[text()='Perfect!']")).isDisplayed())
		{
			System.out.println("drag and drop");
			Thread.sleep(2000);
			driver.quit();
			
		}
		else
		{
			System.out.println("Exception");
		}

	}
}
		



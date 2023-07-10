package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		//click on link for the child browser
		driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		
		Thread.sleep(4000);
		
		//close parent as well as child browser
		driver.quit();
	
	}

}
